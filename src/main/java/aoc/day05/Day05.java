package aoc.day05;

import aoc.Day;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class Day05 implements Day {
    public ArrayList<Stack<Character>> test = new ArrayList<>(3);
    public ArrayList<Stack<Character>> array = new ArrayList<>(9);

    public void fillstack(){
        for(int i = 0; i < 3; i++){
            this.test.add(new Stack<>());
        }
        test.get(0).push('Z');
        test.get(0).push('N');
        test.get(1).push('M');
        test.get(1).push('C');
        test.get(1).push('D');
        test.get(2).push('P');
        for(int i = 0; i < 9; i++){
            this.array.add(new Stack<>());
        }
        array.get(0).push('G');
        array.get(0).push('F');
        array.get(0).push('V');
        array.get(0).push('H');
        array.get(0).push('P');
        array.get(0).push('S');

        array.get(1).push('G');
        array.get(1).push('J');
        array.get(1).push('F');
        array.get(1).push('B');
        array.get(1).push('V');
        array.get(1).push('D');
        array.get(1).push('Z');
        array.get(1).push('M');

        array.get(2).push('G');
        array.get(2).push('M');
        array.get(2).push('L');
        array.get(2).push('J');
        array.get(2).push('N');

        array.get(3).push('N');
        array.get(3).push('G');
        array.get(3).push('Z');
        array.get(3).push('V');
        array.get(3).push('D');
        array.get(3).push('W');
        array.get(3).push('P');

        array.get(4).push('V');
        array.get(4).push('R');
        array.get(4).push('C');
        array.get(4).push('B');

        array.get(5).push('V');
        array.get(5).push('R');
        array.get(5).push('S');
        array.get(5).push('M');
        array.get(5).push('P');
        array.get(5).push('W');
        array.get(5).push('L');
        array.get(5).push('Z');

        array.get(6).push('T');
        array.get(6).push('H');
        array.get(6).push('P');

        array.get(7).push('Q');
        array.get(7).push('R');
        array.get(7).push('S');
        array.get(7).push('N');
        array.get(7).push('C');
        array.get(7).push('H');
        array.get(7).push('Z');
        array.get(7).push('V');

        array.get(8).push('F');
        array.get(8).push('L');
        array.get(8).push('G');
        array.get(8).push('P');
        array.get(8).push('V');
        array.get(8).push('Q');
        array.get(8).push('J');

    }
    @Override
    public String part1(List<String> input) {
        fillstack();
        for (String in: input){
            String[] arr = in.split(" ");
            Stack<Character> temp = new Stack<>();
            int times = Integer.parseInt(arr[1]);
            int source = Integer.parseInt(arr[3]);
            int dest = Integer.parseInt(arr[5]);
            for(int i = 0; i < Integer.parseInt(arr[1]); i++){
                test.get(dest-1).push(test.get(source-1).pop());
            }

        }
        StringBuilder res = new StringBuilder();
        for (int i = 0; i < test.size(); i++){
            res.append(test.get(i).peek());
        }
        return res.toString();
    }

    @Override
    public String part2(List<String> input) {
        fillstack();
        for (String in: input){
            String[] arr = in.split(" ");
            Stack<Character> temp = new Stack<>();
            int times = Integer.parseInt(arr[1]);
            int source = Integer.parseInt(arr[3]);
            int dest = Integer.parseInt(arr[5]);
            if (times > 1){
                for(int i = 0; i < Integer.parseInt(arr[1]); i++){
                    temp.push(test.get(source-1).pop());
                }
                for(int i = 0; i < Integer.parseInt(arr[1]); i++){
                    test.get(dest-1).push(temp.pop());
                }

            }
            else{
                test.get(dest-1).push(test.get(source-1).pop());
            }
        }
        StringBuilder res = new StringBuilder();
        for (int i = 0; i < test.size(); i++){
            res.append(test.get(i).peek());
        }
        return res.toString();
    }
}

