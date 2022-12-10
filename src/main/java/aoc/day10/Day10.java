package aoc.day10;

import aoc.Day;

import java.util.Arrays;
import java.util.List;

public class Day10 implements Day {
    int res = 0;
    public int check(int cyc, int x){
        switch(cyc){
            case 20:
                return 20 * x;
            case 60:
                return 60 * x;
            case 100:
                return 100 * x;
            case 140:
                return 140 * x;
            case 180:
                return 180 * x;
            case 220:
                return 220 * x;
            default:
                return 0;
        }
    }
    @Override
    public String part1(List<String> input) {
        int x = 1;
        int cycle = 0;
        int res = 0;
        for (String in: input){
            String[] arr = in.split(" ");
            if (arr[0].equals("addx")){
                cycle++;
                res += check(cycle, x);
                cycle++;
                res += check(cycle, x);
                x += Integer.parseInt(arr[1]);
            }
            else{
                cycle++;
                res += check(cycle, x);
            }
        }
        return String.valueOf(res);
    }
    public char check2(int cycle, int x){
        if (cycle == x || cycle == x+1 || cycle == x-1){
            return '#';
        }
        return '.';
    }
    @Override
    public String part2(List<String> input) {
        int cycle = 0;
        int x = 1;
        char[][] array = new char[6][40];

        for (String in: input){
            String[] arr = in.split(" ");
            if (arr[0].equals("addx")){
                cycle++;
                array[(cycle-1)/40][(cycle-1)%40] = check2((cycle-1)%40, x);
                cycle++;
                array[(cycle-1)/40][(cycle-1)%40] += check2((cycle-1)%40, x);
                x += Integer.parseInt(arr[1]);
            }
            else{
                cycle++;
                array[(cycle-1)/40][(cycle-1)%40] += check2((cycle-1)%40, x);
            }
        }
        return Arrays.deepToString(array);
    }
//    [[#, #, #, ., ., #, #, #, ., ., ., ., #, #, ., ., #, #, ., ., #, #, #, #, ., ., #, #, ., ., ., #, #, ., ., #, #, #, ., .],
//     [#, ., ., #, ., #, ., ., #, ., ., ., ., #, ., #, ., ., #, ., ., ., ., #, ., #, ., ., #, ., #, ., ., #, ., #, ., ., #, .],
//     [#, #, #, ., ., #, ., ., #, ., ., ., ., #, ., #, ., ., #, ., ., ., #, ., ., #, ., ., ., ., #, ., ., #, ., #, ., ., #, .],
//     [#, ., ., #, ., #, #, #, ., ., ., ., ., #, ., #, #, #, #, ., ., #, ., ., ., #, ., #, #, ., #, #, #, #, ., #, #, #, ., .],
//     [#, ., ., #, ., #, ., ., ., ., #, ., ., #, ., #, ., ., #, ., #, ., ., ., ., #, ., ., #, ., #, ., ., #, ., #, ., ., ., .],
//     [#, #, #, ., ., #, ., ., ., ., ., #, #, ., ., #, ., ., #, ., #, #, #, #, ., ., #, #, #, ., #, ., ., #, ., #, ., ., ., .]]

}
