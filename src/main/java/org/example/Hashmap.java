package org.example;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Hashmap
{
    public static void main( String[] args )
    {
        Logger l =  Logger.getLogger("hashmap");
        HashMap<Integer, String> languages = new HashMap<>();

        languages.put(1, "Java");
        languages.put(2, "Python");
        languages.put(3, "JavaScript");
        l.info("HashMap: " + languages);

        // return set view of keys
        l.log(Level.INFO,()->"Keys: " + languages.keySet());

        // return set view of values
        l.log(Level.INFO,()->"Values: " + languages.values());

        // return set view of key/value pairs
        l.log(Level.INFO,()->"Key/Value mappings: " + languages.entrySet());


        // remove element associated with key
        String value = languages.remove(2);
        l.log(Level.INFO,()->"Removed value: " + value);

        l.log(Level.INFO,()->"Updated HashMap: " + languages);


        // iterate through keys only
        l.info("Keys: ");
        for (Integer key : languages.keySet()) {
            l.info("The key:"+key);
        }

        // iterate through values only
        l.info("\nValues: ");
        for (String values : languages.values()) {
            l.info(values);
        }

        // iterate through key/value entries
        l.info("\nEntries: ");
        for (Entry<Integer, String> entry : languages.entrySet()) {
            l.info("key/value"+entry);

        }
    }
}