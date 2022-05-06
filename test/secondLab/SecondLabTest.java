package secondLab;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;


class SecondLabTest {
    SecondLab secondLab;
    @BeforeEach
    public void init(){
        secondLab = new SecondLab();
    }

    @Nested
    @DisplayName("Test Odd or Even number")
    class CheckEvenOdd{
        @Test
        public void test8EvenNumber(){
            assertEquals("Even", secondLab.oddOrEven(8));
        }
        @Test
        public void test7OddNumber(){
            assertEquals("Odd", secondLab.oddOrEven(7));
        }
        @Test
        public void test0OddNumber(){
            assertEquals("Even", secondLab.oddOrEven(0));
        }
        @Test
        public void testNegative2OddNumber(){
            assertEquals("Even", secondLab.oddOrEven(-2));
        }
        @Test
        public void testNegative3OddNumber(){
            assertEquals("Odd", secondLab.oddOrEven(-3));
        }
    }

    @Nested
    @DisplayName("Test Min and Max value of array")
    class MinMax{
        @Test
        public void test1(){
            int [] a = {8, 5, 17, 6, 15, 30};
            int [] expected = {5, 30};
            assertArrayEquals(expected, secondLab.checkMinMax(a));
        }
        @Test
        public void test2(){
            int [] a = {8, -50, 17, 6, -15, 30};
            int [] expected = {-50, 30};
            assertArrayEquals(expected, secondLab.checkMinMax(a));
        }
        @Test
        public void test3(){
            int [] a = {8, 5, 170, 666, 15, 30};
            int [] expected = {5, 666};
            assertArrayEquals(expected, secondLab.checkMinMax(a));
        }
    }

    @AfterEach
    public void cleanUp(){
        secondLab = null;
    }
}