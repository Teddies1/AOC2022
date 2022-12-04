package aoc.day04;

import aoc.Day;

import java.util.List;

public class Day04 implements Day {
    @Override
    public String part1(List<String> input) {
        int res = 0;
        for (String in: input){
            String[] arr = in.split("[,-]");
            int a = Integer.parseInt(arr[0]);
            int b = Integer.parseInt(arr[1]);
            int c = Integer.parseInt(arr[2]);
            int d = Integer.parseInt(arr[3]);

            if((a <= c && b >= d )|| (a >= c && b <= d)){
                res++;
            }
        }
        return String.valueOf(res);
    }

    @Override
    public String part2(List<String> input) {
        int res = 0;
        for (String in: input){
            String[] arr = in.split("[,-]");
            int a = Integer.parseInt(arr[0]);
            int b = Integer.parseInt(arr[1]);
            int c = Integer.parseInt(arr[2]);
            int d = Integer.parseInt(arr[3]);

            if((c > b)|| (a > d)){
                res++;
            }
        }
        return String.valueOf(input.size()-res);
    }
}
