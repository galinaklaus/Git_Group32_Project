package mentorTasks;

public class SumOfDigitsInString {
    public static void main(String[] args) {

        String s = "12asFg46NU&U*9";
        // String str = "234thr12kj5gfd7";
        System.out.println(sumOfDigits(s));
        System.out.println(sumOfDigits1(s));

    }

    public static int sumOfDigits(String s) {

        String digits = "";
        int sum = 0;
        for (int i = 0; i < s.length(); i++) {
            if (Character.isDigit(s.charAt(i))) {
                digits += s.charAt(i);
            }
        }
        for (int i = 0; i < digits.length(); i++) {
            sum+=Integer.parseInt(digits.charAt(i)+"");
            //  sum += Character.getNumericValue(digits.charAt(i));
        }
        return sum;

    }

    public static int sumOfDigits1(String s){
        String digits1="";
        int sum1=0;
        for (int i = 0; i <s.length() ; i++) {
            if(Character.isDigit(s.charAt(i))){
                digits1+=s.charAt(i);
            }else{
                sum1+=Integer.parseInt(digits1);
                digits1="0";
            }
        }
        return sum1+Integer.parseInt(digits1);
    }
}
