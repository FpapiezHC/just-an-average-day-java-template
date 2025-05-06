package org.example;

public class LoopMetrics {
    public int maxWithLoop(int[] nums) {
        int max = nums[0];
        for (int num : nums) {
            if (num > max) max = num;
        }
        return max;
    }

    public int minWithLoop(int[] nums) {
        int min = nums[0];
        for (int num : nums) {
            if (num < min) min = num;
        }
        return min;
    }

    public int totalWithLoop(int[] nums) {
        int sum = 0;
        for (int num : nums) sum += num;
        return sum;
    }

    public int averageWithLoop(int[] nums) {
        return nums.length == 0 ? 0 : totalWithLoop(nums) / nums.length;
    }
}