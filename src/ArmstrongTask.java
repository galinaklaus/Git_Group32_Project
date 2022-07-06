import java.util.Scanner;

public class ArmstrongTask {
    //Write a method that can check if a number is Armstrong  number

//Armstrong number is a number that is equal to the sum of cubes of its digits. For example 0, 1, 153, 370, 371 and 407 are the Armstrong numbers.


    public static void main(String[] args) {

        System.out.println("This number is Armstrong number");

        int num = new Scanner(System.in).nextInt();

        System.out.println(isArmstrong(num));
    }


    public static boolean isArmstrong(int num){

        int lastDigit=0;
        int totalDigits =0;
        int originalNumber = num;

        while ( num >0){

            lastDigit= num % 10; //153--->3, 15%10 --->5;
            // System.out.println("last digit "+ lastDigit);--3 --5---1

            num/=10;//updating the number -->15; 15/10-->1

            totalDigits +=lastDigit*lastDigit*lastDigit;//power of three


        }

        if(totalDigits == originalNumber){

           return true;
        }else{
            return false;
        }








    }







}
