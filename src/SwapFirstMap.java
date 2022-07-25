import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class SwapFirstMap {

    /**
     We'll say that 2 strings "match" if they are non-empty and their first chars are the same. Loop over and then return the given array of non-empty strings as follows: if a string matches an earlier string in the array, swap the 2 strings in the array. A particular first char can only cause 1 swap, so once a char has caused a swap, its later swaps are disabled. Using a map, this can be solved making just one pass over the array. More difficult than it looks.

     Examples:
     firstSwap(["ax", "bx", "cx", "cy", "by", "ay", "aaa", "azz"]) → ["ay", "by", "cy", "cx", "bx", "ax", "aaa", "azz"]
     firstSwap(["ax", "bx", "ay", "by", "ai", "aj", "bx", "by"]) → ["ay", "by", "ax", "bx", "ai", "aj", "bx", "by"]
     */


    public static void main(String[] args) {
        String [] arr ={"ab", "ac"};

        System.out.println(Arrays.toString(firstSwap(arr)));
    }

    public static String[] firstSwap(String[] strings) {
//1.declaring new hash map
        Map<String,Integer> map= new HashMap();
//2. looping through the elements of the given array
        for(int i = 0; i<strings.length;i++){
            //3. creating str to store first lette of each array element
            String str= strings[i].substring(0,1);
            //4. if else condition to check map contains the same first letter
            if(map.containsKey(str)){
                //5. assigning value of the map's key as position
                int position = map.get(str);
                //6. checking non valid position then skip it
                if(  position == -1)
                    continue;

                //7. assign temp string to the element of array with same first char
                String temp= strings[position];
                //8. swap elements
                strings[position]=strings[i];
                strings[i]= temp;
                //9. value updated to -1 for that key
                map.put(str,-1);
                //10.else condition to check map not containing the same first letter
            }else{
                //11.adding the new entry to the map where key is first char of the current string
                //of the array and the value is  index of that string
                map.put(str,i);

            }
        }
        //12. retuning updated array
        return strings;
    }
}
