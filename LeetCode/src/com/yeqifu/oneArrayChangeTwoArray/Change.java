package com.yeqifu.oneArrayChangeTwoArray;

/**
 * @Author: 落亦-
 * @Date: 2022/1/2 20:45
 */
public class Change {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] original = new int[]{1,2,3,4};
        int m = 2;
        int n = 2;
        int[][] ints = solution.construct2DArray(original, m, n);
        for (int[] anInt : ints) {
            for (int i : anInt) {
                System.out.println(i);
            }
        }
    }
}
class Solution {
    public int[][] construct2DArray(int[] original, int m, int n) {
        int[][] result2 = new int[][]{};
        if(original.length != m*n){
            return result2;
        }
        int[][] result = new int[m][n];
        for(int i =0; i < n; i++){
            result[0][i] = original[i];
        }
        int k = n;
        for(int j = 0; j < 2*n-2; j++){
            result[1][j] = original[k];
            k++;
        }
        return result;
    }
}