package com.stackroute.lambdaexpression;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CustomFunctionalInterfaceImplementationTests {
    public static final String MESSAGE_ONE = "Lambda function should change the case of the given string input";
    public static final String MESSAGE_TWO = "Lambda function should return the cube of the given number";
    public static final String MESSAGE_THREE = "Lambda function should throw exception if the input string is null";


    @Test
    public void givenStringInLowerCaseThenReturnStringInUpperCase() {
        String expected = "CHANGE TO UPPERCASE";
        String actual = CustomFunctionalInterfaceImplementation.changeCase.doJob("change to uppercase");
        assertEquals(expected, actual, MESSAGE_ONE);
    }

    @Test
    public void givenStringInUpperCaseThenReturnStringInLowerCase() {
        String expected = "change to lowercase";
        String actual = CustomFunctionalInterfaceImplementation.changeCase.doJob("CHANGE TO LOWERCASE");
        assertEquals(expected, actual, MESSAGE_ONE);
    }

    @Test
    public void givenStringInMixedCaseThenReturnStringInChangedCase() {
        String expected = "cHANGE";
        String actual = CustomFunctionalInterfaceImplementation.changeCase.doJob("Change");
        assertEquals(expected, actual, MESSAGE_ONE);
    }

    @Test
    public void givenEmptyStringThenReturnEmptyString() {
        String expected = "";
        String actual = CustomFunctionalInterfaceImplementation.changeCase.doJob("");
        assertEquals(expected, actual, MESSAGE_ONE);
    }

    @Test
    public void givenStringAsNullThenReturnEmptyString() {
        assertThrows(NullPointerException.class, () ->
                CustomFunctionalInterfaceImplementation.changeCase.doJob(null), MESSAGE_THREE);
    }

    @Test
    public void givenPositiveIntegerThenReturnCube() {
        int cubeResult = CustomFunctionalInterfaceImplementation.cube.doJob(7);
        assertEquals(343, cubeResult, MESSAGE_TWO);
    }

    @Test
    public void givenNegativeIntegerThenReturnCube() {
        int cubeResult = CustomFunctionalInterfaceImplementation.cube.doJob(-7);
        assertEquals(-343, cubeResult, MESSAGE_TWO);
    }

    @Test
    public void givenZeroThenReturnZero() {
        int cubeResult = CustomFunctionalInterfaceImplementation.cube.doJob(0);
        assertEquals(0, cubeResult, MESSAGE_TWO);
    }
}
