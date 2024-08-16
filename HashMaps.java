import java.util.HashMap;

public class HashMaps {
    public static void main(String[] args) {
        HashMap<String, Integer> m = new HashMap<String, Integer>();
        m.put("Name1", 22);
        m.put("Name2", 23);
        m.put("Name3", 24);

        System.out.println(m.toString()); // this will print the hashmap in random order
        System.out.println(m.get("Name2")); // prints the value of a particular key 


        m.putIfAbsent("Name2", 32); // checks the hashmap and inserts if the value is not preset
        // in this case, since Name2 already has a value associated, hence it will do nothing 

        m.putIfAbsent("Name5", 45); // this will insert a new entry with given key value pair  


        m.replace("Name3", 37); // replaces the value of the key with provided value


        System.out.println(m.getOrDefault("Name23", -1)); // checks if the key is present, then return its value, otherwise return the default value provided

        System.out.println(m.containsKey("Name1")); // returns true if the key is present in the hash map
        System.out.println(m.containsValue(35)); // returns true if any key has this particular value, otherwise false


        // for each 
        m.forEach((name, age) -> {
            System.out.println(name + " is " + age + " years old");
            m.replace(name, age + 1); // replaces the age for all the keys with currAge + 1
         });

         System.out.println(m.toString());
    }
}
