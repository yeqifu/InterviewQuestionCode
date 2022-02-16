package com.yeqifu.two;

/**
 * 给定两个排序后的数组 A 和 B，其中 A 的末端有足够的缓冲空间容纳 B。 编写一个方法，将 B 合并入 A 并排序。
 *
 * 初始化 A 和 B 的元素数量分别为 m 和 n
 *
 * 输入:
 *      A = [1,2,3,0,0,0]    m = 3
 *      B = [2,5,6]          n = 3
 *
 * 输出: [1,2,2,3,5,6]
 * @Author: 落亦-
 * @Date: 2020/3/29 15:49
 */
public class MergeSortArray {
    public static void main(String[] args) {
        int[] A = {1,2,3,0,0,0};
        int[] B = {2,5,6};
        int m = 3;
        int n = 3;
        merge(A,m,B,n);
    }
    public static void merge(int[] A,int m,int[] B,int n) {
        int[] C = new int[m+n];
        for(int i = 0; i < m ; i++ ){
            C[i] = A[i];
        }
        for(int i = 0; i < n ; i++){
            C[m+i] = B[i];
        }
        for (int i = 0; i < C.length-1; i++) {
            for (int j = 0; j < C.length-i-1; j++) {
                if (C[j]>C[j+1]){
                    int temp;
                    temp = C[j];
                    C[j] = C[j+1];
                    C[j+1] = temp;
                }
            }
        }
        for(int i = 0;i<m+n;i++){
            A[i]=C[i];
        }
    }

}
