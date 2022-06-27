public class ReverseString {

    public static void main(String[] args) {
        System.out.println(reversed("ABCD"));

    }





    public static String reversed(String str) {




        String reverse = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            reverse += str.charAt(i);
        }
        return reverse;
    }}











