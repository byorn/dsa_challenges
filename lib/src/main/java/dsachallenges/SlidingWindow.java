package dsachallenges;

import java.util.HashSet;
import java.util.Map;

public class SlidingWindow {

/*
  https://leetcode.com/problems/longest-substring-without-repeating-characters/description/?envType=study-plan-v2&envId=top-interview-150
 */
public static int lengthOfLongestSubstringWithoutRepeatingChars(String s) {
//to be attempted another time
    return 0;
}


public static Integer getSmallestSubArrayHavingSum(int[] arr, int sum){
    int currentSubArraySum = 0;
    int windowStart = 0;
    int minSubArrayLength = Integer.MAX_VALUE;
    for (int windowEnd =0; windowEnd < arr.length; windowEnd++) {
           currentSubArraySum += arr[windowEnd];
           while (currentSubArraySum >= sum) {
               minSubArrayLength = Math.min(minSubArrayLength, windowEnd -windowStart + 1) ;
               currentSubArraySum -= arr[windowStart];
               windowStart++;
            }
    }

    return minSubArrayLength;


}

/*
arr: integer array
k: sub array length
 */
public static Integer getMaxSumSubArray(int[] arr, int k) {

    int maxSum = Integer.MIN_VALUE;
    int currentSum = 0;

    for (int i = 0; i < k; i++) {
        currentSum += arr[i];
    }

    maxSum = currentSum;

    for (int i = k; i < arr.length; i++) {
  
        currentSum = currentSum - arr[i-k] + arr[i];
        maxSum = Math.max(currentSum, maxSum);
    }
    return maxSum;
}

}
