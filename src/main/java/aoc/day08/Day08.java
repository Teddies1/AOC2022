package aoc.day08;

import aoc.Day;

import java.util.Arrays;
import java.util.List;

public class Day08 implements Day {


    public boolean up(int[][] arr, int row, int col){
        int tree = arr[row][col];
        for(int i = row-1; i >= 0; i--){
            if (tree <= arr[i][col]){
                return false;
            }
        }
        return true;
    }
    public boolean down(int[][] arr, int row, int col){
        int tree = arr[row][col];
        for(int i = row+1; i < arr.length; i++){
            if (tree <= arr[i][col]){
                return false;
            }
        }
        return true;
    }
    public boolean left(int[][] arr, int row, int col){
        int tree = arr[row][col];
        for(int i = col-1; i >= 0; i--){
            if (tree <= arr[row][i]){
                return false;
            }
        }
        return true;
    }
    public boolean right(int[][] arr, int row, int col){
        int tree = arr[row][col];
        for(int i = col+1; i < arr[0].length; i++){
            if (tree <= arr[row][i]){
                return false;
            }
        }
        return true;
    }
    @Override
    public String part1(List<String> input) {
        int[][] arr = new int[input.size()][input.get(0).length()];
        for (int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr[0].length; j++){
                arr[i][j] = Integer.parseInt(String.valueOf(input.get(i).charAt(j)));
            }
        }
        int count = (2 * arr.length) + (2 * arr[0].length) - 4;
        for (int i = 1; i < arr.length-1; i++){
            for (int j = 1; j < arr[0].length-1; j++){
                if ((up(arr, i, j) || down(arr, i, j) || left(arr, i , j) || right(arr, i, j))){
                    count++;
                }
            }
        }
        return String.valueOf(count);
    }
    public int up2(int[][] arr, int row, int col){
        int res = 0;
        int tree = arr[row][col];
        for(int i = row-1; i >= 0; i--){
            if (tree > arr[i][col]){
                res++;
            }
            else{
                res++;
                break;
            }

        }
        return res;
    }
    public int down2(int[][] arr, int row, int col){
        int res = 0;
        int tree = arr[row][col];
        for(int i = row+1; i < arr.length; i++){
            if (tree > arr[i][col]){
                res++;
            }
            else{
                res++;
                break;
            }
        }
        return res;
    }
    public int left2(int[][] arr, int row, int col){
        int tree = arr[row][col];
        int res = 0;
        for(int i = col-1; i >= 0; i--){
            if (tree > arr[row][i]){
                res++;
            }
            else{
                res++;
                break;
            }
        }
        return res;
    }
    public int right2(int[][] arr, int row, int col){
        int res = 0;
        int tree = arr[row][col];
        for(int i = col+1; i < arr[0].length; i++){
            if (tree > arr[row][i]){
                res++;
            }
            else{
                res++;
                break;
            }
        }
        return res;
    }
    @Override
    public String part2(List<String> input) {
        int[][] arr = new int[input.size()][input.get(0).length()];
        for (int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr[0].length; j++){
                arr[i][j] = Integer.parseInt(String.valueOf(input.get(i).charAt(j)));
            }
        }
        int max = -1;
        for (int i = 1; i < arr.length-1; i++){
            for (int j = 1; j < arr[0].length-1; j++){
                max = Math.max(max, up2(arr, i, j) * down2(arr, i, j) * left2(arr, i , j) * right2(arr, i, j));
            }
        }
        return String.valueOf(max);
    }
}
