package aoc.day06;

import aoc.Day;

import java.util.Arrays;
import java.util.List;

public class Day06 implements Day {
    @Override
    public String part1(List<String> input) {
        int[] arr = new int[26];
        int a,b,c,d,pre = 0;
        int res = 0;
        boolean flag = false;
        for(int i = 0; i < input.get(0).length()-4; i++){
            for(int j = i; j < i + 4; j++){
                arr[input.get(0).charAt(j) - 'a']++;
            }
            for(int j = 0; j < 26; j++){
                if (arr[j] > 1) {
                    flag = true;
                    break;
                }
            }
            System.out.println(flag);
            Arrays.fill(arr, 0);
            if (flag){
                flag = false;
            }
            else{
                res = i;
                break;
            }


        }
        return String.valueOf(res+4);
    }

    @Override
    public String part2(List<String> input) {
        int[] arr = new int[26];
        int a,b,c,d,pre = 0;
        int res = 0;
        boolean flag = false;
        for(int i = 0; i < input.get(0).length()-14; i++){
            for(int j = i; j < i + 14; j++){
                arr[input.get(0).charAt(j) - 'a']++;
            }
            for(int j = 0; j < 26; j++){
                if (arr[j] > 1) {
                    flag = true;
                    break;
                }
            }
            System.out.println(flag);
            Arrays.fill(arr, 0);
            if (flag){
                flag = false;
            }
            else{
                res = i;
                break;
            }


        }
        return String.valueOf(res+14);
    }
}
