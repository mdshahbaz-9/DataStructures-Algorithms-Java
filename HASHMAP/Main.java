import java.util.*;
public class Main {

    static void HashMapMethods() {
        // Syntax
        Map<String, Integer> mp = new HashMap<>();

        // Adding Elements
        mp.put("Akash", 10);
        mp.put("Yash", 20);
        mp.put("Rohan", 30);
        mp.put("Mohan", 22);
        mp.put("Sohan", 23);
        mp.put("Jony", 46);
        mp.put("Tony", 90);

        // Getting Value of a Key from the HashMap
        System.out.println("Value for 'Yash': " + mp.get("Yash")); // Existing key
        System.out.println("Value for 'Rahul': " + mp.get("Rahul")); // Non-existing key

        // Changing / Updating value of a key in the HashMap
        mp.put("Akash", 84);
        System.out.println("Updated value for 'Akash': " + mp.get("Akash"));

        // Removing a pair from the HashMap
        mp.remove("Sohan");
        System.out.println("After removing 'Sohan': " + mp);

        // Checking if a key exists in the HashMap
        System.out.println("Contains key 'Mohan': " + mp.containsKey("Mohan"));
        System.out.println("Contains key 'Sohan': " + mp.containsKey("Sohan")); // remove⬆️

        // Checking if a value exists in the HashMap
        System.out.println("Contains value 20: " + mp.containsValue(20));
        System.out.println("Contains value 100: " + mp.containsValue(100));

        // Add a new entry only if the key doesn't exist already
        mp.putIfAbsent("Rohan", 100); // Key already exists
        mp.putIfAbsent("Rahul", 50); // Key does not exist
        System.out.println("After putIfAbsent: " + mp);

        // Get all keys in the HashMap
        Set<String> keys = mp.keySet();
        System.out.println("All keys: " + keys);

        // Get all values in the HashMap
        Collection<Integer> values = mp.values();
        System.out.println("All values: " + values);

        // Get all entries in the HashMap
        Set<Map.Entry<String, Integer>> entries = mp.entrySet();
        System.out.println("All entries: " + entries);

        // Traversing all entries of HashMap - Multiple methods
        System.out.println("Traverse using for-each loop:");
        for (Map.Entry<String, Integer> entry : mp.entrySet()) {
            System.out.println("Key:" + entry.getKey() + ", Value: " + entry.getValue());
        }

        System.out.println("Traverse using keySet:");
        for (String key : mp.keySet()) {
            System.out.println("Key: " + key + ", Value: " + mp.get(key));
        }

        System.out.println("Traverse using forEach:");
        mp.forEach((key, value) -> System.out.println("Key: " + key + ", Value: " + value));
    }

    public static void main(String[] args) {
        HashMapMethods();
    }
    
}
