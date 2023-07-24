package dev.simonverhoeven.pitestdemo;

import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

public class MainTest {

    @Nested
    class set1 {
        @Test
        void case1() {
            Main.calculate(false,false, false, 0, 0);
        }

        @Test
        void case2() {
            Main.calculate(true,true, true, 0, 0);
        }

        @Test
        void case3() {
            Main.calculate(true,false, false, 0, 0);
        }
    }

}
