import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static java.util.Arrays.*;

public class PermutationsTask_Galina {

    //4.Array -- permutation combinations
    //Given an array of 3 characters print all permutation combinations from the given characters

    public static void main(String[] args) {

        int [] arr ={3,4,6,2,1};
       permuteArray(arr, 0);


    }


    public static void permuteArray(int [] arr, int k){

        List<Integer> list = new ArrayList<>(arr.length);

        for (int i : arr) {
            list.add(i);
        }

        for(int i = k; i < list.size(); i++){
            Collections.swap(list, i, k);
           permuteArray(arr, k+1);
           Collections.swap(list, k, i);
            }
             if (k == list.size() -1){
                 System.out.println(Arrays.toString(list.toArray()));
             }
            }



        //
        //    public static void main(String[] args){
        //        Permute.permute(java.util.Arrays.asList(3,4,6,2,1), 0);
        //    }
    }




