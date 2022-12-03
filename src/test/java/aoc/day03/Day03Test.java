package aoc.day03;

import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class Day03Test {

    @Test
    public void testPart1(){
        // Given
        List<String> input = List.of(
                "vJrwpWtwJgWrhcsFMMfFFhFp", "jqHRNqRjqzjGDLGLrsFMfFZSrLrFZsSL","PmmdzqPrVvPwwTWBwg"
                ,"wMqvLMZHhHMvwLHjbvcjnnSBnvTQFn", "ttgJtRGJQctTZtZT", "CrZsJsPPZsGzwwsLwLmpwMDw");


        // When
        String result = new Day03().part1(input);

        // Then
        assertEquals("157", result);
    }

    @Test
    public void testPart2(){
        // Given
        List<String> input = List.of(
                "vJrwpWtwJgWrhcsFMMfFFhFp", "jqHRNqRjqzjGDLGLrsFMfFZSrLrFZsSL","PmmdzqPrVvPwwTWBwg"
                ,"wMqvLMZHhHMvwLHjbvcjnnSBnvTQFn", "ttgJtRGJQctTZtZT", "CrZsJsPPZsGzwwsLwLmpwMDw");

        // When
        String result = new Day03().part2(input);

        // Then
        assertEquals("70", result);
    }
}