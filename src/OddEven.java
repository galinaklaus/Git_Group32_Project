public class OddEven {

      /*1) Numbers - odd & even
Write  a method which can identifies given number is even or odd
EX:
identify(5) ->  "Odd"
identify(6) ->  "Even"*/

    public static String identify(int num){
        if(num % 2 == 0){
            return "Even";
        }
        return "Odd";
    }

    public static void main(String[] args) {
        String str = OddEven.identify(11);
        System.out.println(str);
    }



}
