package day_25;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //int[] array = {1, 23, 4, 15, 96};
        //changeArray(array);
        int[] nums = {1, 4, 1, 4};
        int[] nums1 = {1, 4, 2, 4};
        int[] nums2 = {1, 1 };
        System.out.println(only14(nums));
        System.out.println(only14(nums1));
        System.out.println(only14(nums2));
    }
    public static void changeArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 10) {
                array[i] = 0;
            }
        }
        System.out.println(Arrays.toString(array));
    }
    public static boolean only14(int[] nums) {
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != 4 && nums[i] != 1) {
                return false;
            }
        }
        return true;
    }
}

