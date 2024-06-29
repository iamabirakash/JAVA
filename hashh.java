import java.util.*;
public class hashh {
    public static void main(String[] args) {
        // <key, value>
        HashMap<String, Integer> map = new HashMap<>();

        //insertion
        map.put("India",120);
        map.put("US", 30);
        map.put("China",150);

        System.out.println(map);

        map.put("China", 180);
        System.out.println(map);

        //map.put() has two functions update and newadd
        //if key is already in the map then any value with the existing key will get updated to the new value
        //if key doesn't exist then new key and value will get added to the map

        //search
        if(map.containsKey("India")) {
            System.out.println("Key is present in the map");
        } else {
            System.out.println("Key is not present in the map");
        }
        
        System.out.println(map.get("India")); //key exits
        System.out.println(map.get("Indonesia")); //key doesn't exist //output as null

        //iteration
        //int arr[] = {12,15,18};
        //for(int i=0; i<3; i++) {
        //    System.out.println(arr[i]+" ");
        //}
        //System.out.println();

        //for(int val : arr) {
        //    System.out.println(val + " ");
        //}
        //System.out.println();

        for(Map.Entry<String, Integer> e : map.entrySet()) { //e has both key and value
            System.out.println(e.getKey());
            System.out.println(e.getValue());
        }
        //or
        Set<String> keys = map.keySet();
        for(String key : keys) {
            System.out.println(key+ " " + map.get(key));
        }

        //remove
        map.remove("China");
        System.out.println(map);
    }
}

