public class SumOfDigits {

    //String -- sum of digits in a string
    //Write a method that can return the sum of the digits in a string

    public static void main(String[] args) {

        String s = "123";

        System.out.println("sumOfDigits = " + sumOfDigitsMethod(s));
    }

    public static int sumOfDigitsMethod(String s){

        int number = Integer.parseInt(s);

        int sum = 0;

        while(number > 0){

            sum+=number%10; //adds the last digit

            number=number/10;//removes the last digit

        }
        return sum;
    }






}
