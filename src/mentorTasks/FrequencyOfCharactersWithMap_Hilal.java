package mentorTasks;

import java.util.LinkedHashMap;
import java.util.Map;

public class FrequencyOfCharactersWithMap_Hilal {
    public static void frequencyOfCharactersWithMap(String word){
        Map<Character,Integer>countChars=new LinkedHashMap<>();
        for (int i = 0; i <word.length() ; i++) {
            char key=word.charAt(i);
            if (countChars.containsKey(key)){
                countChars.put(key,countChars.get(key)+1);
            }else{
                countChars.put(key,1);
            }
        }
        System.out.println(countChars);
    }
    public static void main(String[] args) {
        frequencyOfCharactersWithMap("topcuoglu");
    }
}
