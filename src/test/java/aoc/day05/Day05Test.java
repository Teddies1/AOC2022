package aoc.day05;

import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class Day05Test {

    @Test
    public void testPart1(){
        // Given
        List<String> input = List.of(
                "A Y", "B X","C Z");


        // When
        String result = new Day05().part1(input);

        // Then
        assertEquals("15", result);
    }

    @Test
    public void testPart2(){
        // Given
        List<String> input = List.of(
                "A Y", "B X","C Z");

        // When
        String result = new Day05().part2(input);

        // Then
        assertEquals("12", result);
    }
}