package dev.simonverhoeven.pitestdemo;

import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class MainTest {


    @Test
    void case1() {
        Main.calculateSize(false, 100, false, false, 5, 5);
    }

    @Test
    void case2() {
        Main.calculateSize(true, 100, true, true, 5, 5);
    }

    @Test
    void case3() {
        Main.calculateSize(true, 100, false, false, 5, 5);
    }

//    @Test
//    void decays() {
//        int initialSize = 100;
//        int result = Main.calculateSize(false, 100, true, true, 5, 5);
//        assertTrue(initialSize > result);
//    }

//    @Test
//    void decays() {
//        int initialSize = 100;
//        int years = 5;
//        int expected = initialSize - years * Main.decay_per_year;
//
//        int result = Main.calculateSize(false, 100, true, true, 5, years);
//        assertEquals(expected, result, "The expected size, and resulting size should be equal!");
//    }

}
