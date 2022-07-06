import java.util.Arrays;

public class AscendingArray_Ella {

    public static void main(String[] args) {
        int [] arr = {2,4,3,1,5};

        System.out.println(ascendingArray(arr));
    }

    public static String ascendingArray(int[] arr) {

        int[] arr1 = new int[arr.length];
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {


                if (arr[i] > arr[j]) {
                    count++;
                }
            }
            arr1[count] = arr[i];
            count = 0;
        }
        return Arrays.toString(arr1);
    }
}
