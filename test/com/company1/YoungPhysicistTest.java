package com.company1;

import org.junit.Test;

import static org.junit.Assert.*;

public class YoungPhysicistTest {
    @Test
    public void test1(){
        int array2D [][]= {{4,1,7},{-2,4,-1},{1,-5,-3}};
        YoungPhysicist tester = new YoungPhysicist();
        assertEquals("NO", tester.isEquilibrium(array2D,3));
    }
    @Test
    public void test2(){
        int array2D [][]= {{3,-1,7},{-5,2,-4},{2,-1,-3}};
        YoungPhysicist tester = new YoungPhysicist();
        assertEquals("YES", tester.isEquilibrium(array2D,3));
    }
    @Test
    public void test3(){
        int array2D [][] = {{}};
        YoungPhysicist tester = new YoungPhysicist();
        assertEquals("NO", tester.isEquilibrium(array2D, 0));
    }
    @Test
    public void test4(){
        int array2D [][] = {{-101, 0, 4}, {101, 0, -4}};
        YoungPhysicist tester = new YoungPhysicist();
        assertEquals("NO", tester.isEquilibrium(array2D, 2));
    }
    @Test
    public void test5(){
        int array2D [][] = {{4,1,7},{-2,4,-1},{1,-5,-3}};
        YoungPhysicist tester = new YoungPhysicist();
        assertEquals("NO", tester.isEquilibrium(array2D, 101));
    }
    @Test
    public void test6(){
        int array2D [][] = {{4,1,7},{-2,4,-1},{1,-5,-3}};
        YoungPhysicist tester = new YoungPhysicist();
        assertEquals("NO", tester.isEquilibrium(array2D, -1));
    }
}