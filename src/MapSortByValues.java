import java.util.*;

public class MapSortByValues {


    public static void main(String[] args) {

        Map<String, String> map = new LinkedHashMap<String,String>();//new LinkedHashMap to keep insertion order

        map.put("3", "gamma");
        map.put("1", "alpha");
        map.put("2", "delta");

        System.out.println("map = " + map);

        sortMapValues(map);

        System.out.println("sorting_map_to_treeMap(map) = " + sorting_map_to_treeMap(map));

    }





    public static void sortMapValues(Map<String,String>map){


        List<String> list = new ArrayList(map.keySet());
        Collections.sort(list);

        for (String s:list){
            System.out.println(map.get(s));
        }

    }


    public static Map<String,String> sorting_map_to_treeMap(Map<String,String>map){

       Map<String,String>treemap = new TreeMap<String, String>();

       for(Map.Entry<String,String> eachEntry: map.entrySet()){
           treemap.put(eachEntry.getKey(),eachEntry.getValue());
       }
       return treemap;
    }
    }









