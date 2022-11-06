package test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class LeapYearTest {

    @Test
    void testLeapYear1512() {
        // if year is 1512, it's a leap year


        if (1512 % 400 == 0 || 1512 % 4 == 0 && 1512 % 100 != 0) {
            boolean value = true;
            Assertions.assertTrue(value);
        }
    }


    @Test
    void testLeapYear1600() {
        //if year is 1600, it's a leap year
        int year = 1600;

        //when
        if (year % 400 == 0 || year % 4 == 0 && year % 100 != 0) {
            boolean value = true;
            Assertions.assertTrue(value);
        }
    }

    @Test
    void testLeapYear1700() {
        // if year is 1512, it's a leap year
        int year = 1700;

        if (year % 400 == 0 || year % 4 == 0 && year % 100 != 0) {
            boolean value = false;
            Assertions.assertFalse(value);
        }
    }
}




