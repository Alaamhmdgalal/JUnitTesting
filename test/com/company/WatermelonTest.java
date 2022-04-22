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
    @Test
    public void test5(){
        Watermelon tester = new Watermelon();
        assertEquals("Invalid input", tester.isEven(-6));
    }
    @Test
    public void test6(){
        Watermelon tester = new Watermelon();
        assertEquals("Invalid input", tester.isEven(-3));
    }
    @Test
    public void test7(){
        Watermelon tester = new Watermelon();
        assertEquals("Invalid input", tester.isEven(101));
    }
    @Test
    public void test8(){
        Watermelon tester = new Watermelon();
        assertEquals("Invalid input", tester.isEven(102));
    }
}