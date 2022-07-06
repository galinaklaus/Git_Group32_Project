import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class ReverseStringArrList {


    public static void main(String[] args) {

        ReverseStringArrList("I love java");

    }



    public static void ReverseStringArrList(String str){

        List<Character> arrList= new ArrayList<>();


        for(char ch: str.toCharArray()){

            arrList.add(ch);
        }

        Collections.reverse(arrList);

        //System.out.println(arrList);

        Object [] arr2 = arrList.toArray();
        String reverse="";

        for (int i = 0; i < arr2.length; i++) {

            reverse+=arr2[i];


        }

        System.out.println(reverse);

    }





}
