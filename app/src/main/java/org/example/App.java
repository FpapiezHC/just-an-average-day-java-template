package org.example;

public class App {
    public static void main(String[] args) {
        int[] test = {1, -2, 3, 7, 0};

        LoopMetrics loop = new LoopMetrics();
        StreamMetrics stream = new StreamMetrics();
        ExtraTransforms extras = new ExtraTransforms();
        //loop
        System.out.println("--- For Loop Methods ---");
        System.out.println("Max: " + loop.maxWithLoop(test));
        System.out.println("Min: " + loop.minWithLoop(test));
        System.out.println("Sum: " + loop.totalWithLoop(test));
        //streammethods
        System.out.printf("Average: %.1f\n", (double) loop.totalWithLoop(test) / test.length);
        System.out.println("\n--- Stream Methods ---");
        System.out.println("Max: " + stream.maxWithStream(test));
        System.out.println("Min: " + stream.minWithStream(test));
        System.out.println("Sum: " + stream.totalWithStream(test));
        System.out.printf("Average: %.1f\n", stream.averageWithStream(test) * 1.0);
        //addons
        System.out.println("\n--- Add-Ons ---");
        System.out.println("Evens: " + extras.getEvens(test));
        System.out.println("Odds: " + extras.getOdds(test));
        System.out.println("Add Five: " + extras.addFiveToEach(test));
        System.out.println("Squares: " + extras.squareEach(test));
    }
}
