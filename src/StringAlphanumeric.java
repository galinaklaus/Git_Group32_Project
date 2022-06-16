import java.util.Arrays;

public class StringAlphanumeric {

    //String -- Sort Letters and Numbers from alphanumeric String
    //Given alphanumeric String, we need to split the string into substrings of consecutive letters or numbers, sort the individual string and append them back together
    //Ex:
    //Input:  "DC501GCCCA098911"
    //OutPut: "CD015ACCCG011899"

    public static void main(String[] args) {

        String s = "DC501GCCCA098911";

        System.out.println(sortedString(s));

    }



    public static String sortedString(String s){

        String result="";

        for(int i=0;i<s.length()-1;i++) {

            if (Character.isLetter(s.charAt(i))) {
                result+= s.charAt(i);
            }
            if (Character.isDigit(s.charAt(i))) {
                result += s.charAt(i);
            }
            if(Character.isDigit(s.charAt(i))&&Character.isAlphabetic(s.charAt(i+1))){
                result+=" ";
            }
            if(Character.isLetter(s.charAt(i))&&Character.isDigit(s.charAt(i+1))){
                result+=" ";
            }
        }
        result+=s.charAt(s.length()-1);

        String[] arr = result.split(" ");

        String sortedString="";

        for(String each: arr) {
            char[] chars=each.toCharArray();
            Arrays.sort(chars);

            for(char eachChar: chars){
                sortedString +=""+eachChar;
            }
        }

        return sortedString;

    }






}
