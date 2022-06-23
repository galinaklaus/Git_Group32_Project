import java.util.Arrays;

public class Ascending_DescendingSortInArray {

/*
 Array - Sort Ascending and Descending
Write a return method that can sort an int array in Ascending and Descending order without using the sort method of the Arrays class
Ex:
            int[] arr = {10, 9, 8, 7};
             arr = Sort(arr);         ==>{ 7, 8, 9, 10};

 */

    public class SortAscendingInArray {
        public static void main(String[] args) {
            int[] nums = {2, 4, 7, 1, 6, 9};
            System.out.println(Arrays.toString(sortAscending(nums)));
            System.out.println(Arrays.toString(sortDescending(nums)));
        }

        public static int[] sortAscending(int[] nums) {
            int max = 0;
            for (int i = 0; i < nums.length; i++) {
                for (int j = i + 1; j < nums.length; j++) {
                    if (nums[i] > nums[j]) {
                        max = nums[i];
                        nums[i] = nums[j];
                        nums[j] = max;
                    }
                }
            }
            return nums;
        }


        public static int[] sortDescending(int[] nums) {
            int min = 0;
            for (int i = 0; i < nums.length; i++) {
                for (int j = i + 1; j < nums.length; j++) {
                    if (nums[i] < nums[j]) {
                        min = nums[i];
                        nums[i] = nums[j];
                        nums[j] = min;
                    }
                }

            }
            return nums;
        }
    }
}
