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
            assertEquals("Order your coffee", cm.busy());
        }
        @Test
        public void test_integrated_busy_function(){
            cm.start(1);
            assertEquals("Preparing Coffee", cm.busy());
        }
        @Test
        public void test_type_function(){
            cm.start(1);
            assertEquals("Coffee", cm.type(0));
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
        public void test_prep_function(){
            cm.start(2);
            assertEquals("Error", cm.prep());
        }
        @Test
        public void test_type_function(){
            cm.start(2);
            assertEquals("Error", cm.type(1));
        }
    }
}
