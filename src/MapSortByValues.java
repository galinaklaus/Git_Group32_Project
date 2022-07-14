import java.util.*;

public class MapSortByValues {


    public static void main(String[] args) {

        Map<String, String> map = new LinkedHashMap<String,String>();//new LinkedHashMap to keep insertion order

        map.put("3", "gamma");
        map.put("1", "alpha");
        map.put("2", "delta");

        System.out.println("Original map = " + map);
        System.out.println("------------------------------------------------------");

        sortMapValuesWithList(map);

        System.out.println("------------------------------------------------------");
        System.out.println("sorting_map_to_treeMap(map) = " + sorting_map_to_treeMap(map));

        Map<String, Integer> unsortedMap = new HashMap<>();
        unsortedMap.put("alex", 1);
        unsortedMap.put("david", 2);
        unsortedMap.put("elle", 3);
        unsortedMap.put("charles", 4);
        unsortedMap.put("brian", 5);
        System.out.println("------------------------------------------------------");
        sortByValueWithStream(unsortedMap);
    }





    public static void sortMapValuesWithList(Map<String,String>map){


        List<String> list = new ArrayList();

        for(String eachValue:map.values()){
            list.add(eachValue);
        }
        Collections.sort(list);


        System.out.println("Sorted map values as a list "+list);

    }


    public static Map<String,String> sorting_map_to_treeMap(Map<String,String>map){

       Map<String,String>treemap = new TreeMap<String, String>();

       for(Map.Entry<String,String> eachEntry: map.entrySet()){
           treemap.put(eachEntry.getKey(),eachEntry.getValue());
       }
       return treemap;
    }



    public static void sortByValueWithStream(Map<String,Integer>unSortedMap){


        System.out.println("Unsorted Map : " + unSortedMap);

        LinkedHashMap<String, Integer> sortedMap = new LinkedHashMap<>();//to preserve entry order

        //comparingByValue() method to help in sorting by values. This method returns a Comparator that compares Map.Entry in natural order on values.
        unSortedMap.entrySet().stream().sorted(Map.Entry.comparingByValue())
                .forEachOrdered(x -> sortedMap.put(x.getKey(), x.getValue()));

        System.out.println("Sorted Map using Stream  : " + sortedMap);

    }

}









