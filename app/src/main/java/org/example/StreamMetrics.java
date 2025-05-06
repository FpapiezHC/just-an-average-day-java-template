package org.example;

import java.util.Arrays;

public class StreamMetrics {
    public int maxWithStream(int[] nums) {
        return Arrays.stream(nums).max().orElse(Integer.MIN_VALUE);
    }

    public int minWithStream(int[] nums) {
        return Arrays.stream(nums).min().orElse(Integer.MAX_VALUE);
    }

    public int totalWithStream(int[] nums) {
        return Arrays.stream(nums).sum();
    }

    public int averageWithStream(int[] nums) {
        return (int) Arrays.stream(nums).average().orElse(0);
    }
}