package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RoundTest {
    @Test
    void test1(){
        int expected = 0;
        int actual = RoundZero.RoundDown(0.5f);

        Assertions.assertEquals(expected,actual);
    }
    @Test
    void test2(){
        int expected = 1;
        int actual = RoundZero.RoundUp(0.3f);

        Assertions.assertEquals(expected,actual);
    }
    @Test
    void test3(){
        int expected = 0;
        int actual = RoundZero.Round(0.4321f);

        Assertions.assertEquals(expected,actual);
    }
    @Test
    void test4(){
        int expected = -1;
        int actual = RoundZero.RoundDown(4.4f);

        Assertions.assertEquals(expected,actual);
    }

}
