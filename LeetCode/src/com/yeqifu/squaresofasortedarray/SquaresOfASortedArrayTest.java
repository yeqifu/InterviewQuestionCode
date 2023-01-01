package com.yeqifu.squaresofasortedarray;

/**
 * @author: yeqifu
 * @date: 2023/1/1 23:52
 */
public class SquaresOfASortedArrayTest {

    public static void main(String[] args) {
        int[] nums = new int[]{-4,-1,0,3,10};
        int[] result = sortedSquares(nums);
        for (int i : result) {
            System.out.print(i + " ");
        }
    }

    public static int[] sortedSquares(int[] nums) {
        // 双指针，left和right分别指向数组的两端，然后比较两个数的绝对值的大小，大的就先放到新数组最大下标的位置，小的往前排，以此类推
        int[] newArray = new int[nums.length];
        for (int left = 0, right = nums.length - 1; left < right; left++, right--) {
            int leftNum = nums[left] * nums[left];
            int rightNum = nums[right] * nums[right];
            if (leftNum >= rightNum) {
                newArray[right] = leftNum;
                newArray[right - 1] = rightNum;
            } else if (rightNum > leftNum) {
                newArray[right] = rightNum;
                newArray[right - 1] = leftNum;
            }
            if (left == right) {
                newArray[0] = nums[left] * nums[left];
            }
        }
        return newArray;
    }
}
