package com.dailybyte.strings;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class Strings3Test {


    @Test
    void isRobotReachedOrigin() {
        Strings3 strings3=new Strings3("LR");
        assertTrue(strings3.isRobotReachedOrigin());


    }
    @Test
    void isRobotReachedOrigin1() {


        Strings3 strings3_1=new Strings3("URURD");
        assertFalse(strings3_1.isRobotReachedOrigin());


    }
    @Test
    void isRobotReachedOrigin2() {

        Strings3 strings3_2=new Strings3("RUULLDRD");
        assertTrue(strings3_2.isRobotReachedOrigin());

    }
}