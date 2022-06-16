import java.util.*;

public class ReverseStringWithCollections {

    //String -- Reverse
    //Write a return method that can reverse  String
    //
    //Ex: Reverse("ABCD"); ==> DCBA


    public static void main(String[] args) {

        String s= "ABCD";

        System.out.println(reverse1(s));

        System.out.println(reverse2(s));
    }
    public static String reverse1(String str){

        List<String> list = new ArrayList<>(Arrays.asList(str.split("")));

        String reversed = "";

        Collections.reverse(list);

        reversed = list.toString().replace("[","").replace(", ","").replace("]","");

        return reversed;

    }

    public static String reverse2(String str){

        String reversed = "";


        Stack<String> stack = new Stack<>();

        stack.addAll(Arrays.asList(str.split("")));

        //pop() -> deletes the last elements and returns too

        for (int i = 0; i < str.length(); i++) {

            reversed += stack.pop();
        }

        return reversed;
    }

















}
