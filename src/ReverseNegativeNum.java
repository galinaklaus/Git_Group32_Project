import java.util.Scanner;

public class ReverseNegativeNum {
    //Write a return method that can reverse negative number and return it as int


    public static void main(String[] args) {

        int num = new Scanner(System.in).nextInt();
        System.out.println("Reverse "+num);
        System.out.println("Result is " + reverseNegative(num));
    }


    public static int reverseNegative(int num){

            int reversed= 0;
            int lastDigit =0;

        while(num <0 && num!=0) {
            lastDigit = num % 10;
            reversed = reversed * 10 +  lastDigit;
            num /= 10;
        }

        return  reversed;

    }

}
