import java.util.Arrays;

public class ConcatArrays_Horah {

    public static void concatArrays(int [] arr1, int[] arr2) {


        int lenA= arr1.length;
        int lenB = arr2.length;
        int[] result = new int[lenA+ lenB];
/*
        System.arraycopy(arr1, 0, result, 0, lenA);
        System.arraycopy(arr2, 0, result, lenA, lenB);


 */

        for (int i = 0; i < lenA; i++) {

            result[i]= arr1[i];

        }

        for (int i = lenA, j = 0; i < result.length; i++, j++) {

            result[i]= arr2[j];

        }
        System.out.println(Arrays.toString(result));
    }

    public static void main(String[] args) {
        int[] array1 = {1, 2, 3};
        int[] array2 = {4, 5, 6};

        concatArrays(array1,array2);
    }



}
