import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OddsCalculatorTest {

    OddsCalculator calculator = new OddsCalculator();

    @Test
    void twoTwentyFiveCase() {
        //given
        String decimalOdd = "2.25";

        //when
        String actual = calculator.calculateFractional(decimalOdd);

        //then
        String expected = "5/4";
        assertEquals(expected, actual);
    }

    @Test
    void twoEightySixCase() {
        //given
        String decimalOdd = "2.86";

        //when
        String actual = calculator.calculateFractional(decimalOdd);

        //then
        String expected = "93/50";
        assertEquals(expected, actual);
    }

    @Test
    void OneNinetyNineCase() {
        //given
        String decimalOdd = "1.99";

        //when
        String actual = calculator.calculateFractional(decimalOdd);

        //then
        String expected = "99/100";
        assertEquals(expected, actual);
    }

    @Test
    void OneToOneCase() {
        //given
        String oddDown = "1";
        String oddUp = "1";

        //when
        String actual = calculator.calculateDecimal(oddUp, oddDown);

        //then
        String expected = "2";
        assertEquals(expected, actual);
    }

    @Test
    void ThirtyThreeToOneHundredCase() {
        //given
        String oddDown = "100";
        String oddUp = "33";

        //when
        String actual = calculator.calculateDecimal(oddUp, oddDown);

        //then
        String expected = "1.33";
        assertEquals(expected, actual);
    }

    @Test
    void OneHundredToOneCase() {
        //given
        String oddDown = "1";
        String oddUp = "100";

        //when
        String actual = calculator.calculateDecimal(oddUp, oddDown);

        //then
        String expected = "101";
        assertEquals(expected, actual);
    }
}