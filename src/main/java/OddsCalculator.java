import java.math.BigDecimal;

public class OddsCalculator {
    public String calculateFractional(double decimalOdd){
        BigDecimal subtractor = new BigDecimal(1.0);
        BigDecimal bigDecimalOdd = new BigDecimal(Double.toString(decimalOdd));
        BigDecimal diff = bigDecimalOdd.subtract(subtractor);
        decimalOdd = diff.doubleValue();
        int divisor = 1;
        while(decimalOdd%1 != 0.0){
            decimalOdd *= 10;
            divisor *= 10;
        }
        int dividend = (int) decimalOdd;
        return simplifyFraction(dividend, divisor);
    }

    private String simplifyFraction(int dividend, int divisor){
        int initialDivisor;
        if (dividend < divisor) initialDivisor = dividend;
        else initialDivisor = divisor;
        while (initialDivisor != 1){
            if (dividend % initialDivisor == 0 && divisor % initialDivisor == 0){
                dividend /= initialDivisor;
                divisor /= initialDivisor;
            }
            initialDivisor--;
        }
        return dividend + "/" + divisor;
    }
}
