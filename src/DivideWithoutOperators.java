import java.util.Scanner;

public class DivideWithoutOperators {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your dividend:");
         int dividend = input.nextInt();
        System.out.println("Enter your divisor:");
         int divisor = input.nextInt();

        System.out.println(divideWithoutOperator(dividend, divisor));

    }


        // write a method that can divide two numbers without using division operators

        public static int divideWithoutOperator(int dividend, int divisor){

            int result = 1;
            int divisorFirst = divisor;//10

            while(dividend>divisor){//30 10 (20)30

                divisor+=divisorFirst;//10+10+10
                result++;//1->2->3
            }
            return result;
        }


    }


