import PatternAAA.Calculator;
import org.junit.Assert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PatternAAATest {

    @Test
    public void calculate_sum_test() {

        Calculator calculator = new Calculator();
        double first = 10;
        double second = 20;

        double result = calculator.calculateSum(first, second);

        Assertions.assertEquals(30,result);
    }

}
