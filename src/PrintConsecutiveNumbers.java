public class PrintConsecutiveNumbers {
    public static void main(String[] args) {

        int n = 30;


        for (int i = 1; i <= n; i++) {
            String s = "";

            if (i % 2 == 0) {
                s += "Codility";
            }
            if (i % 3 == 0) {
                s += "Test";
            }
            if (i % 5 == 0) {
                s += "Coder";
            }
//            if (i % 2 == 0 && i % 3 == 0) {
//                System.out.println(s += "CodilityTest");
//            }
//            if (i % 2 == 0 && i % 5 == 0){
//                System.out.println(s += "CodilityCoders");
//            }if (i % 3 == 0 && i % 5 == 0){
//                System.out.println(s+= "TestCoders");
//           }
        else {
                System.out.println(s);
            }
        }
    }
}
