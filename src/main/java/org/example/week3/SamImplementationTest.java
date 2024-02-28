package org.example.week3;


import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SamImplementationTest {

    SamImplementation samImplementation = new SamImplementation();

    @Test
    public void testAddition(){
       assertEquals(samImplementation.addition(10,5), 15.0, 0);
    }

    @Test
    public void testSubtraction(){
        assertEquals(samImplementation.subtraction(10,5), 5.0, 0);
    }

    @Test
    public void testMultiplication(){
        assertEquals(samImplementation.multiplication(10,5), 50.0, 0);
    }

    @Test
    public void testDivision(){
        assertEquals(samImplementation.division(10,5), 2.0, 0);
    }
}