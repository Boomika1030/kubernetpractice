package com.example;

import org.junit.Test;
import static org.junit.Assert.*;

public class AppTest {

    @Test
    public void testAdd() {
        App app = new App();
        
        int result = app.add(2, 3);
        
        System.out.println("Result is: " + result);

        assertEquals(5, result);
    }
}
