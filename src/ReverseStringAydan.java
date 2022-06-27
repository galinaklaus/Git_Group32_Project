public class ReverseStringAydan {
    public static void main(String[] args) {

        System.out.println(Reverse("ABCD"));


    }

    public static String Reverse (String str){

        String a ="";

        for (int i = str.length()-1; i >=0 ; i--) {

            a += str.charAt(i);


        }return a;



    }
}
