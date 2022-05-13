import java.util.Scanner;

public class DividingWithoutDivision {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        int result = 0;

        while (a >= b){
            a = a-b;
            result++;
        }
        System.out.println(result);
    }

}
