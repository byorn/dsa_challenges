package dsachallenges;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SlidingWindowTest {

    @Test
    void shouldReturnMaximumSubArrayOfK() {
        var numbers = new int[]{3, 2, 1, 6, 3, 2, 5, 100, 1, 23, 1};
        var answer = SlidingWindow.getMaxSumSubArray(numbers, 3);
        Assertions.assertEquals(124, answer);
    }

    @Test
    void shouldReturnMinimumSizeOfSubArrayHavingSum() {
        var numbers = new int[]{4, 2, 2, 7,8, 1, 2, 8, 10};
        var answer = SlidingWindow.getSmallestSubArrayHavingSum(numbers, 18);
        Assertions.assertEquals(2, answer);
    }

    @Test
    void shouldGetLongestSubArrayWithNonRepeatingChars() {
        String s = "abcabcdbb";
        int result = SlidingWindow.lengthOfLongestSubstringWithoutRepeatingChars(s);

        Assertions.assertEquals(3, result);
    }

}