import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CalculatorTest {
    private Calculator calculator;

    @BeforeEach
    void setup()
    {
        calculator =new Calculator();
    }

    @Test
    void shouldPrintFiveWhenFourIsAddedToOne()
    {
        assertThat(calculator.add(4,1),is(5));
    }

    @Test
    void shouldPrintSumOfTwoInput()
    {
        assertThat(calculator.add(5,6),is(11));
    }

    @Test
    void shouldPrintSubtractionOfTwoInput()
    {
        assertThat(calculator.subtraction(7,6),is(1));
    }
    
    @Test
    void shouldPrintNegativeAnswerWhenLargerInputIsNegative()
    {
        assertThat(calculator.subtraction(5,6),is(-1));
    }

    @Test
    void shouldPrintMultiplicationOfTwoInput()
    {
        assertThat(calculator.multiply(5,6),is(30));
    }

    @Test
    void shouldPrintNegativeAnswerWhenOneOfTheInputIsNegative()
    {
        assertThat(calculator.multiply(6,-7),is(-42));
    }

    @Test
    void shouldPrintPositiveAnswerWhenBothInputIsNegative()
    {
        assertThat(calculator.multiply(-6,-5),is(30));
    }

    @Test
    void shouldPrintOneWhenOneOfTheInputIsOne()
    {
        assertThat(calculator.multiply(4,1),is(4));
    }

    @Test
    void shouldPrintZeroWhenOneOfTheInputIsZero()
    {
        assertThat(calculator.multiply(5,0),is(0));
    }

    @Test
    void shouldPrintDivisionOfTwoInput()
    {
        assertThat(calculator.division(6,3),is(2));
    }

    @Test
    void shouldPrintZeroWhenDivisorIsGreaterThanDividend()
    {
        assertThat(calculator.division(6,-7),is(0));
    }

    @Test
    void shouldPrintExceptionWhenAnyInputIsDividedByZero()
    {
        assertThrows(IllegalArgumentException.class,()-> calculator.division(6,0));
    }

    @Test
    void shouldPrintNegativeQuotientWhenAnyInputIsNegative()
    {
        assertThat(calculator.division(6,-3),is(-2));
    }

}
