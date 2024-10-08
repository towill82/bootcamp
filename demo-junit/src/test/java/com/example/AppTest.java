package com.example;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNotSame;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTimeout;
import static org.junit.jupiter.api.Assertions.assertTrue;
import java.time.Duration;
import org.junit.jupiter.api.Test;


public class AppTest {

    @Test
    void testSum() {
        assertEquals(5, App.sum(3, 2));
        assertEquals(-2, App.sum(-2, 0));
        assertEquals(0, App.sum(0, 0));
        assertEquals(5, App.sum(3, 2)); // !!!!

    }
    @Test
    void testSubtract() {
        assertEquals(5, App.subtract(7, 2));
        assertEquals(-5, App.subtract(-7, -2));
        assertEquals(0, App.subtract(0, 0));
        assertEquals(8, App.subtract(10, 2)); // OK
        assertEquals(8, App.subtract(11, 3)); // OK
        // ... 
    }

    // (x>= 10 && y >= 3)
    @Test
    void testCombine(){
        // Scenario 1: x >= 10 and y >= 3 -> subtract()
        assertEquals(7, App.combine(10, 3));
        // Scenario 2: x < 10 and y >= 3 -> sum()
        assertEquals(12, App.combine(9, 3));
        // Scenario 3: x >= 10 and y <3 -> sum()
        assertEquals(12, App.combine(10, 2));
        // Scenario 4: x < 10 and y < 3 -> sum()
        assertEquals(11, App.combine(9, 2));

        assertEquals(8, App.combine(11, 3)); // !!! meaningless
        // !!! because this test case is testing the same thing with Scenario 1
    }

    @Test
    void testAssert() {
        String s1 = new String("abc");
        String s2 = new String("abc");
        assertNotSame(s1, s2);

        String s3 = s2;
        assertSame(s2, s3);

        String s4 = null;
        assertNull(s4);
        assertNotNull(s3);
    }

    @Test
    void testThrow() {
        assertThrows(ArithmeticException.class, () -> {
            App.divide(10, 0);
        });

        assertDoesNotThrow(() -> {
            App.divide(10, 1);
        });
    }

    @Test
    void testArray() {
        int[] arr = new int[] {1, 2, 3};
        int[] arr2 = new int[] {1, 2, 3};
        assertArrayEquals(arr, arr2); // check both ordering & element
    }


    @Test
    void testAssertAll() {
        assertAll(
            () -> assertTrue(App.sum(3, 2) == 5),
            () -> assertEquals(8, App.subtract(10, 2))
        );
    }

    // Non-funcational Requirement
    @Test
    void testTimeout(){
        assertTimeout(Duration.ofMillis(100), () -> {
        // Normally, you write the logic here to test ..
            App.sum(5, 6);
            Thread.sleep(90);
        });

        // assertTimeout(Duration.ofMillis(100), () -> {
        //     // Normally, you write the logic here to test ..
        //     Thread.sleep(110);
        // });
    }
}
