package thirdLab;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

class CoffeeMachineTest {
    CoffeeMachine cm;

    @BeforeEach
    public void init(){
        cm = new CoffeeMachine();
    }

    @Nested
    @DisplayName("Order a coffee")
    class testSequence1{
        @Test
        public void test_busy_function(){
            assertEquals("Get your coffee", cm.busy());
        }
        @Test
        public void test_integrated_busy_function(){
            cm.start(1);
            assertEquals("Preparing Coffee", cm.busy());
        }
        @Test
        public void test_isBusy_function(){
            cm.start(1);
            assertFalse(cm.isBusy());  //the user clicked in coffee once so the machine was not busy before him
        }
        @Test
        public void test_integrated_money_function(){
            cm.start(1);
            assertEquals("Empty", cm.money());
        }
    }

    @Nested
    @DisplayName("User clicked coffee twice")
    class testSequence2{
        @Test
        public void test_integrated_busy_function(){
            cm.start(2);
            assertEquals("Busy", cm.busy());
        }
        @Test
        public void test_isBusy_function2(){
            cm.start(2);
            assertTrue(cm.isBusy());
        }
        @Test
        public void test_money_function(){
            cm.start(2);
            assertEquals("Not empty", cm.money());
        }
    }
}
