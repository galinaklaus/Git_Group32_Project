public class ArmstrongNumber {

    public static void main(String[] args) {

        System.out.println(isArmstrong(371));

    }




    public static boolean isArmstrong ( int num){

        int result = 0;
        int ourNum = num;

        while(num !=0){
            int remainder = num % 10;
            result = result + remainder * remainder * remainder;
            num = num / 10;
        }
        if(ourNum == result){
            return true;
        }
        return false;
    }

}







