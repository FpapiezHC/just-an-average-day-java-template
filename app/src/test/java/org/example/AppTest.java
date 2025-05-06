package org.example;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class AppTest {
    LoopMetrics loop = new LoopMetrics();
    StreamMetrics stream = new StreamMetrics();
    ExtraTransforms extras = new ExtraTransforms();

    int[] sample = {3, 5, 1, 8, 2};

    @Test
    public void testMaxWithLoop() {
        assertEquals(8, loop.maxWithLoop(sample));
    }

    @Test
    public void testMinWithLoop() {
        assertEquals(1, loop.minWithLoop(sample));
    }

    @Test
    public void testTotalWithLoop() {
        assertEquals(19, loop.totalWithLoop(sample));
    }

    @Test
    public void testAverageWithLoop() {
        assertEquals(3, loop.averageWithLoop(sample));
    }

    @Test
    public void testMaxWithStream() {
        assertEquals(8, stream.maxWithStream(sample));
    }

    @Test
    public void testMinWithStream() {
        assertEquals(1, stream.minWithStream(sample));
    }

    @Test
    public void testTotalWithStream() {
        assertEquals(19, stream.totalWithStream(sample));
    }

    @Test
    public void testAverageWithStream() {
        assertEquals(3, stream.averageWithStream(sample));
    }

    @Test
    public void testGetEvens() {
        List<Integer> result = extras.getEvens(sample);
        assertEquals(List.of(8, 2), result);
    }

    @Test
    public void testGetOdds() {
        List<Integer> result = extras.getOdds(sample);
        assertEquals(List.of(3, 5, 1), result);
    }

    @Test
    public void testAddFiveToEach() {
        List<Integer> result = extras.addFiveToEach(sample);
        assertEquals(List.of(8, 10, 6, 13, 7), result);
    }

    @Test
    public void testSquareEach() {
        List<Integer> result = extras.squareEach(sample);
        assertEquals(List.of(9, 25, 1, 64, 4), result);
    }
}
