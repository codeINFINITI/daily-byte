package com.dailybyte.strings;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Strings2Test {
    Strings2 strings2=new Strings2();
    @Test
    public void test1(){
        assertTrue(strings2.isValidPalindrome("level"));
    }
    @Test
    public void test2(){
        assertFalse(strings2.isValidPalindrome("algorithm"));
    }
    @Test
    public void test3(){
        assertTrue(strings2.isValidPalindrome("A man, a plan, a canal: Panama."));
    }
}