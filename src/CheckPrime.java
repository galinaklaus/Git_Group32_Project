import java.util.Scanner;

public class CheckPrime {

    //Write a method that can check if a number is prime or not.


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = input.nextInt();

        checkPrime(num);

    }

    public static void checkPrime(int num) {


        int count=0;

        if(num==0||num==1){//num<=1
             System.out.println("This number is not prime");
        }else{
            for(int i=2;i<num;i++){
                if(num%i==0){

                   count++;
                }
            }
            if(count==0)  {
               System.out.println("This number is prime");}
            else{//count>0
                System.out.println("This number is not prime");
            }
        }

/*
public static boolean primeNumber(int num) {

    if(num <= 1){
        return false;
    }

    for(int i = 2; i < num; i++) {
        if(num % i == 0) {
            return false;
        }
    }

    return true;

}
 */



    }}
