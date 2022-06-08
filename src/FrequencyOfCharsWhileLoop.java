import java.util.Scanner;

public class FrequencyOfCharsWhileLoop {

    /*
    Write a return method that can a find the frequencyt of characters. FreqOfChars("AAABBCDD")-> A3B2C1D2
     */

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String s = input.nextLine();
        String d = FrequencyOfChars(s);
        System.out.println(d);
        System.out.println(FrequencyOfChars(s));
    }


    public static String FrequencyOfChars(String s){

        String result = "";
        int a=0;


        while(a< s.length()){

            int count = 0;
            for(int i=0; i<s.length(); i++){
                if(s.charAt(i) == s.charAt(a)){
                    count++;
                }
            }
            result += s.charAt(a)+""+count;
            s = s.replace(""+s.charAt(a), "");

        }

        return result;



    }





}
