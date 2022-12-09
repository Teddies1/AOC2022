package aoc.day08;

import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class Day08Test {

    @Test
    public void testPart1(){
        // Given
        List<String> input = List.of(
                "30373","25512","65332","33549","35390");



        // When
        String result = new Day08().part1(input);

        // Then
        assertEquals("21", result);
    }

    @Test
    public void testPart2(){
        // Given
        List<String> input = List.of(
                "30373","25512","65332","33549","35390");

        // When
        String result = new Day08().part2(input);

        // Then
        assertEquals("8", result);
    }
}