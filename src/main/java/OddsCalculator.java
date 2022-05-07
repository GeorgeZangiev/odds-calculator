import java.math.BigDecimal;
import java.text.DecimalFormat;

public class OddsCalculator {

    public void calculateDecimal(String slashOdd){
        String[] odds = slashOdd.split("/");
        calculateDecimal(odds[0], odds[1]);
    }

    public String formatOdd(String unformattedOdd){
        DecimalFormat decimalFormat = new DecimalFormat("###.##");
        return decimalFormat.format(unformattedOdd);
    }

    public String calculateDecimal(String oddUp, String oddDown) {
        try {
            Double numerator = Double.valueOf(oddUp);
            Double denominator = Double.valueOf(oddDown);
            Double decimalOdd = (numerator / denominator) + 1;
            return formatOdd(decimalOdd.toString());
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
            return "0";
        }
    }

    public String calculateFractional(String odd){
        BigDecimal bigDecimalOdd = new BigDecimal(odd);
        BigDecimal diff = bigDecimalOdd.subtract(BigDecimal.valueOf(1));
        double decimalOdd = diff.doubleValue();
        int divisor = 1;
        int multiplier = 1;
        while(decimalOdd%1 != 0.0){
            if ((decimalOdd * multiplier) %1 == 0.0){
                decimalOdd *= multiplier;
                divisor *= multiplier;
            }
            else multiplier++;
        }
        int dividend = (int) decimalOdd;
        return dividend + "/" + divisor;
    }
}
