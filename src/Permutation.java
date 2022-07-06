public class Permutation {


    public static void main(String[] args) {

        int [] intArr = {1, 2, 3};// permutation - all possible scenarios with el in diff positions - n! - 1*2*3=6

        permute(intArr, 0);

    }

    public static void permute(int[] intArray, int start) {


        for(int i = start; i < intArray.length; i++){
            int temp = intArray[start];
            intArray[start] = intArray[i];
            intArray[i] = temp;
            permute(intArray, start + 1);
            intArray[i] = intArray[start];
            intArray[start] = temp;
        }
        if (start == intArray.length - 1) {
            System.out.println(java.util.Arrays.toString(intArray));
        }
    }





}
