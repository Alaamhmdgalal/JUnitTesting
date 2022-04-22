package com.company;

import org.junit.Test;

import static org.junit.Assert.*;

public class WatermelonTest {

    @Test
    public void test1() {
        Watermelon tester = new Watermelon();
        assertEquals("YES",tester.isEven(8));
    }
    @Test
    public void test2() {
        Watermelon tester = new Watermelon();
        assertEquals("NO", tester.isEven(7));
    }
    @Test
    public void test3() {
        Watermelon tester = new Watermelon();
        assertEquals("NO", tester.isEven(2));
    }
    @Test
    public void test4(){
        Watermelon tester = new Watermelon();
        assertEquals("NO", tester.isEven(0));
    }

}