package aoc.day03;

import aoc.Day;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;

public class Day03 implements Day {

    @Override
    public String part1(List<String> input) {
        int res = 0;
        String s1;
        String s2;
        int[] array1 = new int[52];
        int[] array2 = new int[52];

        for (String in: input){
            s1 = in.substring(0,(in.length())/2);
            s2 = in.substring((in.length())/2);
            for (int i = 0; i < s1.length(); i++){
                if (s1.charAt(i) - 'a' < 0){
                    array1[(s1.charAt(i) - 'a') + 58]++;
                }
                else{
                    array1[s1.charAt(i) - 'a']++;
                }

            }
            for (int i = 0; i < s2.length(); i++){
                if (s2.charAt(i) - 'a' < 0){
                    array2[(s2.charAt(i) - 'a') + 58]++;
                }
                else{
                    array2[s2.charAt(i) - 'a']++;
                }

            }
            for (int i = 0; i < 52; i++){
                if (array1[i] != 0 && array2[i] != 0){
                    res += i + 1;
                }
            }
            Arrays.fill(array1, 0);
            Arrays.fill(array2, 0);
        }
        return String.valueOf(res);
    }

    @Override
    public String part2(List<String> input) {
        int[] array1 = new int[52];
        int[] array2 = new int[52];
        int[] array3 = new int[52];
        int res2 = 0;
        String s1,s2,s3;
        for (int j = 0; j < input.size(); j += 3){
            s1 = input.get(j);
            s2 = input.get(j+1);
            s3 = input.get(j+2);
            for (int i = 0; i < s1.length(); i++){
                if (s1.charAt(i) - 'a' < 0){
                    array1[(s1.charAt(i) - 'a') + 58]++;
                }
                else{
                    array1[s1.charAt(i) - 'a']++;
                }

            }
            for (int i = 0; i < s2.length(); i++){
                if (s2.charAt(i) - 'a' < 0){
                    array2[(s2.charAt(i) - 'a') + 58]++;
                }
                else{
                    array2[s2.charAt(i) - 'a']++;
                }

            }
            for (int i = 0; i < s3.length(); i++){
                if (s3.charAt(i) - 'a' < 0){
                    array3[(s3.charAt(i) - 'a') + 58]++;
                }
                else{
                    array3[s3.charAt(i) - 'a']++;
                }

            }
            for (int i = 0; i < 52; i++){
                if (array1[i] != 0 && array2[i] != 0 && array3[i] != 0){
                    res2 += i + 1;
                }
            }
            Arrays.fill(array1, 0);
            Arrays.fill(array2, 0);
            Arrays.fill(array3, 0);
        }
        return String.valueOf(res2);
    }

}
