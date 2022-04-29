import java.math.BigDecimal;

public class OddsCalculator {
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
