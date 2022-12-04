package aoc.day04;

import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class Day04Test {

    @Test
    public void testPart1(){
        // Given
        List<String> input = List.of("2-4,6-8","2-3,4-5","5-7,7-9","2-8,3-7","6-6,4-6","2-6,4-8");


        // When
        String result = new Day04().part1(input);

        // Then
        assertEquals("2", result);
    }

    @Test
    public void testPart2(){
        // Given
        List<String> input = List.of("2-4,6-8","2-3,4-5","5-7,7-9","2-8,3-7","6-6,4-6","2-6,4-8");

        // When
        String result = new Day04().part2(input);

        // Then
        assertEquals("4", result);
    }
}