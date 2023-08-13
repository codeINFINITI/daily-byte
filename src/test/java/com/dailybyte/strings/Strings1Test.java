package com.dailybyte.strings;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Strings1Test {
    Strings1 strings1=new Strings1();
    @Test
    public void test1(){
        assertEquals("taC",strings1.getReversedString("Cat"));

    }
    @Test
    public void test2(){

        assertEquals("etyB yliaD ehT",strings1.getReversedString("The Daily Byte"));

    }
    @Test
    public void test3(){

        assertEquals("civic",strings1.getReversedString("civic"));
    }

}