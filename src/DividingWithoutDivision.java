import java.util.Scanner;

public class DividingWithoutDivision {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        int result = 0;

        while (num1 >= num2) {
            num1 = num1 - num2;
            result++;
        }
        System.out.println(result);
    }

}
