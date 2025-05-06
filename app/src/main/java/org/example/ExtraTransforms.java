package org.example;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ExtraTransforms {
    public List<Integer> getEvens(int[] nums) {
        return Arrays.stream(nums).filter(n -> n % 2 == 0).boxed().collect(Collectors.toList());
    }

    public List<Integer> getOdds(int[] nums) {
        return Arrays.stream(nums).filter(n -> n % 2 != 0).boxed().collect(Collectors.toList());
    }

    public List<Integer> addFiveToEach(int[] nums) {
        return Arrays.stream(nums).map(n -> n + 5).boxed().collect(Collectors.toList());
    }

    public List<Integer> squareEach(int[] nums) {
        return Arrays.stream(nums).map(n -> n * n).boxed().collect(Collectors.toList());
    }
}
