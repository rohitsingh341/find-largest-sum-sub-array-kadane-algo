package com.rohit.dsa;

public class FindLargestSumOfSubArrayKadaneAlgo {
    public static void main(String[] args) {
        //int [] nums = {4,-1,2,-7,3,4};

        int [] nums = {-2,-3,4,-1,-2,1,5,-3};
        int largestSum = kadenAlgo(nums);
        System.out.println("Largest sum of sub array> " + largestSum);
    }

    //TimeComplexity O(n)
    static int kadenAlgo(int[] nums) {
        int maxSum = nums[0];
        int curSum = 0;

        for (int n: nums) {
            curSum = Math.max(curSum, 0);
            curSum += n;
            maxSum = Math.max(maxSum, curSum);
        }
        return maxSum;
    }
}
