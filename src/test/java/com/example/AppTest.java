package com.example;

import org.junit.Test;
import static org.junit.Assert.*;

public class AppTest {

    @Test
    public void testSquare() {
        App app = new App();
        
        int result = app.square(4);
        
        // This will print in Jenkins Console Output
        System.out.println("Square is: " + result);

        assertEquals(16, result);
    }
}