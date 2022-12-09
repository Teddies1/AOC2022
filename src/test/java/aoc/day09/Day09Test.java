package aoc.day09;

import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class Day09Test {

    @Test
    public void testPart1(){
        // Given
        List<String> input = List.of(
                "R 4","U 4","L 3","D 1","R 4","D 1","L 5","R 2");


        // When
        String result = new Day09().part1(input);

        // Then
        assertEquals("13", result);
    }

    @Test
    public void testPart2(){
        // Given
        List<String> input = List.of(
                "R 4","U 4","L 3","D 1","R 4","D 1","L 5","R 2");

        // When
        String result = new Day09().part2(input);

        // Then
        assertEquals("12", result);
    }
}