import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OddsCalculatorTest {

    OddsCalculator calculator = new OddsCalculator();

    @Test
    void twoTwentyFiveCase() {
        //given
        double decimalOdd = 2.25;

        //when
        String actual = calculator.calculateFractional(decimalOdd);

        //then
        String expected = "5/4";
        assertEquals(expected, actual);
    }

    @Test
    void simpleNumberCase() {
        //given
        double decimalOdd = 2.86;

        //when
        String actual = calculator.calculateFractional(decimalOdd);

        //then
        String expected = "2/3";
        assertEquals(expected, actual);
    }

    @Test
    void OneNinetyNineCase() {
        //given
        double decimalOdd = 1.99;

        //when
        String actual = calculator.calculateFractional(decimalOdd);

        //then
        String expected = "99/100";
        assertEquals(expected, actual);
    }
}