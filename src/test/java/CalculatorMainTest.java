import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class CalculatorMainTest {

    @Nested
    class Divide
    {
        @Test
        void dividePositive()
        {

        }
        @Test
        void divideNegative()
        {

        }
    }


    @Nested
    class Multiply
    {
        @Test
        void multiplyPositive()
        {
            Assertions.assertAll(
                    ()->{
                        Assertions.assertEquals(0, CalculatorMain.subtract(1,0));
                        Assertions.assertEquals(0, CalculatorMain.subtract(0,0));
                        Assertions.assertEquals(11, CalculatorMain.subtract(1,11));
                    }
            );
        }
        @Test
        void multiplyNegative()
        {
            Assertions.assertAll(
                    ()->{
                        Assertions.assertEquals(0, CalculatorMain.subtract(-1,0));
                        Assertions.assertEquals(0, CalculatorMain.subtract(0,0));
                        Assertions.assertEquals(-11, CalculatorMain.subtract(1,-11));
                        Assertions.assertEquals(11, CalculatorMain.subtract(-1,-11));
                        Assertions.assertEquals(-11, CalculatorMain.subtract(-1,11));
                    }
            );
        }
    }

    @Nested
    class Subtract
    {
        @Test
        void subtractPositive()
        {
            Assertions.assertAll(
                    ()->{
                        Assertions.assertEquals(1, CalculatorMain.subtract(1,0));
                        Assertions.assertEquals(-1, CalculatorMain.subtract(0,1));
                        Assertions.assertEquals(-10, CalculatorMain.subtract(1,11));
                        Assertions.assertEquals(10, CalculatorMain.subtract(11,1));
                    }
            );
        }
        @Test
        void subtractNegative()
        {

            Assertions.assertAll(
                    ()->{
                        Assertions.assertEquals(-1, CalculatorMain.subtract(-1,0));
                        Assertions.assertEquals(1, CalculatorMain.subtract(0,-1));
                        Assertions.assertEquals(10, CalculatorMain.subtract(-1,-11));
                        Assertions.assertEquals(12, CalculatorMain.subtract(1,-11));

                    }
            );

        }

    }


    @Nested
    class Add
    {
        @Test
        void addPositive()
        {
            Assertions.assertAll(
                    () -> {
                        Assertions.assertEquals(1, CalculatorMain.add(1,0));
                        Assertions.assertEquals(1, CalculatorMain.add(0,1));
                        Assertions.assertEquals(12, CalculatorMain.add(1,11));
                    }
            );
        }
        @Test
        void addNegative()
        {
            Assertions.assertAll(
                    () -> {
                        Assertions.assertEquals(0, CalculatorMain.add(-1,1));
                        Assertions.assertEquals(-19, CalculatorMain.add(-9,-10));
                        Assertions.assertEquals(10, CalculatorMain.add(-1,11));
                        Assertions.assertEquals(9, CalculatorMain.add(-1,10));
                    }
            );
        }
    }


}
