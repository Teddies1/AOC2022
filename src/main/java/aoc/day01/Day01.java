package aoc.day01;

import aoc.Day;

import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;

public class Day01 implements Day {

    @Override
    public String part1(List<String> input) {
        int max = -1;
        Integer sum = 0;
        int i = 0;
        for (String in: input){
            if (in.equals("")) {
                max = Math.max(max, sum);
                sum = 0;
            }else{
                sum += Integer.parseInt(in);
            }


        }
        return String.valueOf(max);
    }

    @Override
    public String part2(List<String> input) {
        int max = 0;
        Integer sum = 0;
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for (String in: input){
            if (in.equals("")) {
                pq.add(sum);
                sum = 0;
            }else{
                sum += Integer.parseInt(in);
            }
        }
        pq.add(sum);
        for (int i = 0; i < 3; i++){
            max += pq.poll();
        }
        return String.valueOf(max);
    }

}
