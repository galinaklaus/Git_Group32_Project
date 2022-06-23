package mentorTasks;

public class SwapNumbers {
    /*
      4) Numbers - Swap Numbers
  Swap two variable' values without using a third variable
       */
//    public static String swap(int a,int b){
//        String s="";
//        String t="";
//        s+=a+" "+b;
//        t+=b+" "+a;
//        return s+"\n"+t;
//    }
    public static String swapNums(int x, int y){
        System.out.println("Before swapping:"+x+" "+y);
        x=x+y;
        y=x-y;
        x=x-y;

        return "After swapping: "+ x +" "+y;
    }

    public static void main(String[] args) {
        //System.out.println(swap(12,18));
        System.out.println(swapNums(13,15));
    }
}
