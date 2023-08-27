package com.collections;

import java.util.HashMap;
import java.util.Map;

public class Solution {public static int[] twoSum(int[] nums, int target) {
    Map<Integer, Integer> numToIndexMap = new HashMap<>();

    for (int i = 0; i < nums.length; i++) {
        int complement = target - nums[i];
        if (numToIndexMap.containsKey(complement)) {
            return new int[] { numToIndexMap.get(complement), i };
        }
        numToIndexMap.put(nums[i], i);
    }

    throw new IllegalArgumentException("No solution found.");
}
    public static void main(String[] args) {
        int[] nums = { 2, 7, 11, 15 };
        int target = 9;
        int[] result = twoSum(nums, target);
        System.out.println("Indices of the two numbers: [" + result[0] + ", " + result[1] + "]");
    }
}
