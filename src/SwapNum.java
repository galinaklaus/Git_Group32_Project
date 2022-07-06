import java.util.Scanner;

public class SwapNum {
    //Swap two variable' values without using a third variable


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Before swapping");
        System.out.println("Enter first variable");
        int num1 = input.nextInt();
        System.out.println("Enter second variable");
        int num2 = input.nextInt();
//int num1=3; int num2=4
        swap(num1, num2);//swap(6,7)

    }

    public static void swap(int num1, int num2){//3 4

        num1 += num2;//3 + 4 =7

        num2 = num1 - num2;//7-4=3

        num1 -= num2;//7-3=4

        System.out.println("After swapping");
        System.out.println("First variable: "+num1);//4
        System.out.println("Second variable: "+num2);//3

    }



}
