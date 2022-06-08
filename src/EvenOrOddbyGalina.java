import java.util.Scanner;

public class EvenOrOddbyGalina {

    //Write  a method which can identify if given number is even or odd
    //EX:
    //identify(5) ->  "Odd"
    //identify(6) ->  "Even"

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number");

        int num = input.nextInt();

        EvenOrOdd(num);
    }


    public static void EvenOrOdd( int num){

        if(num%2 == 0){
            System.out.println("Even");
        }else{
            System.out.println("Odd");
        }


    }

}
