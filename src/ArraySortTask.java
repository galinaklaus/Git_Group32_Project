import java.util.Arrays;

public class ArraySortTask {

    //use Array sort
    //Write a return method that check if a string is build out of the same letters as
    //another string.
    //String g="abc";
    //String h="cab";
    //Ex: same("abc", "cab"); -> true
    //same("abc", "abb"); -> false:


    public static void main(String[] args) {

        String g="abc";
        String h="cab";

        System.out.println(same(g,h));



    }

    public static boolean same(String s1, String s2){

        char [] ch1 = s1.toCharArray();
        char [] ch2 = s2.toCharArray();


       Arrays.sort(ch1);
       Arrays.sort(ch2);

    //   String a1= Arrays.toString(ch1);
    //   String a2 = Arrays.toString(ch2); //return a1.equals(a2)

       return Arrays.equals(ch1,ch2);



    }






}
