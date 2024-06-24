package leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
//https://leetcode.com/problems/roman-to-integer/description/


public class RomanToIntegerTest {

    @Test
    public void givenConvertSimpleRomanToInteger(){
        RomanToInteger romanToInteger = new RomanToInteger();
        Assertions.assertEquals(3, romanToInteger.romanToInt("III"));
        Assertions.assertEquals(58, romanToInteger.romanToInt("LVIII"));
        Assertions.assertEquals(1994, romanToInteger.romanToInt("MCMXCIV"));

    }

}
