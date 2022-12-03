package aoc.day02;

import aoc.Day;

import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;
public class Day02 implements Day {
    public String part1(List<String> input){
        int points = 0;
        for (String in: input){
            if (in.charAt(0) == 'A'){
                switch(in.charAt(2)){
                    case 'X':
                        points += 4;
                        break;
                    case 'Y':
                        points += 8;
                        break;
                    case 'Z':
                        points += 3;
                        break;
                }
            }
            else if (in.charAt(0) == 'B'){
                switch(in.charAt(2)){
                    case 'X':
                        points += 1;
                        break;
                    case 'Y':
                        points += 5;
                        break;
                    case 'Z':
                        points += 9;
                        break;
                }
            }
            else{
                switch(in.charAt(2)){
                    case 'X':
                        points += 7;
                        break;
                    case 'Y':
                        points += 2;
                        break;
                    case 'Z':
                        points += 6;
                        break;
                }
            }
        }
        System.out.println(points);
        return String.valueOf(points);
    }

    public String part2(List<String> input){
        int points = 0;
        for (String in: input){
            if (in.charAt(0) == 'A'){
                switch(in.charAt(2)){
                    case 'X':
                        points += 3;
                        break;
                    case 'Y':
                        points += 4;
                        break;
                    case 'Z':
                        points += 8;
                        break;
                }
            }
            else if (in.charAt(0) == 'B'){
                switch(in.charAt(2)){
                    case 'X':
                        points += 1;
                        break;
                    case 'Y':
                        points += 5;
                        break;
                    case 'Z':
                        points += 9;
                        break;
                }
            }
            else{
                switch(in.charAt(2)){
                    case 'X':
                        points += 2;
                        break;
                    case 'Y':
                        points += 6;
                        break;
                    case 'Z':
                        points += 7;
                        break;
                }
            }
        }
        return String.valueOf(points);
    }
}
