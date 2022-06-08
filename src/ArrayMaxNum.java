import java.util.Arrays;

public class ArrayMaxNum {

    //Array -- Find Maximum
    //Write a method that can find the maximum number from an int Array

    public static void main(String[] args) {

        int [] arr = {1,89, 5,100,23};

        System.out.println("max num of array = " + maxNumOfArray1(arr));
        System.out.println("max num of array = " + maxNumOfArray2(arr));


    }

    public static int maxNumOfArray1(int [] arr){

        Arrays.sort(arr);

        return arr[arr.length-1];
    }

    public static int maxNumOfArray2(int [] arr){

        int max = arr[0];//int min = arr[0]

        for (int i = 0; i < arr.length; i++) {

            if(arr[i] > max){//arr[i]< min

                max = arr[i];//min = arr[i]
            }
        }

        return max;


    }


}
