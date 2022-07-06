import java.util.ArrayList;
import java.util.Arrays;

public class ArrayList_RemoveGreaterThan100 {

    //ArrayList -- Remove some values
    //Given a list of Integers 1, 2, 3, 4, 5, 6 ....etc. remove all values greater than 100.

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,123,45,67,9000,23));

        System.out.println("Removed values greater than 100 and returned updated list "+removeValuesGreaterThan100(list));

        System.out.println("Removed values greater than 100 with lambda and returned updated list "+removeValuesWithLambda(list));



    }


    public static ArrayList<Integer> removeValuesGreaterThan100(ArrayList<Integer>list){


        for (int i = 0; i < list.size(); i++) {

            if(list.get(i)>100){
                list.remove(i);
            }

        }
        return list;

    }

    public static ArrayList<Integer> removeValuesWithLambda(ArrayList<Integer>list){

        list.removeIf(n -> (n>100));

        return list;
    }



}
