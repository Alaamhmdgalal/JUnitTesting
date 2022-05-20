package thirdLab;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ATMTest{
    ATM Atm;
    @BeforeEach
    public void init(){
        Atm = new ATM();
    }

    @Test
    @DisplayName("Test Function First")
    public void test_settlement_first(){
        assertEquals(0, Atm.settlement());
    }
    @Test
    @DisplayName("Test Integrated Function")
    public void test_settlement(){
        Atm.deposit(12);
        Atm.draw(-8);
        Atm.deposit(10);
        assertEquals(14, Atm.settlement());
    }
    @Test
    @DisplayName("Test Screen")
    public void test_screen1(){
        assertEquals(16, Atm.screen(0, 8));
    }
    @Test
    @DisplayName("Test Screen 2")
    public void test_screen2(){
        Atm.deposit(12);
        assertEquals(4, Atm.screen(1, -8));
    }

    @AfterEach
    public void clear(){
        Atm = null;
    }
}
