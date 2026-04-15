package com.example;

import org.junit.Test;
import static org.junit.Assert.*;

public class AppTest {

    @Test
    public void testFactorial() {
        App app = new App();

        int result = app.factorial(5);

        // This will print in Jenkins Console Output
        System.out.println("Factorial is: " + result);

        assertEquals(120, result);
    }
}