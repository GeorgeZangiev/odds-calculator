import java.math.BigDecimal;
import java.text.DecimalFormat;

public class OddsCalculator {

    public String calculateDecimal(String oddUp, String oddDown) {
        try {
            Double numerator = Double.valueOf(oddUp);
            Double denominator = Double.valueOf(oddDown);
            Double decimalOdd = (numerator / denominator) + 1;
            DecimalFormat decimalFormat = new DecimalFormat("###.##");
            return decimalFormat.format(decimalOdd);
        } catch (NumberFormatException e) {
            e.printStackTrace();
            return "0";
        }
    }

    public String calculateFractional(double decimalOdd){
        BigDecimal bigDecimalOdd = new BigDecimal(Double.toString(decimalOdd));
        BigDecimal diff = bigDecimalOdd.subtract(BigDecimal.valueOf(1));
        decimalOdd = diff.doubleValue();
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
