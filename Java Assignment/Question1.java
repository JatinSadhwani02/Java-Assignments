import java.security.KeyStore.Entry;
import java.util.*;

public class Question1{
    public static void main(String[] args){
        Map<Integer, String> languages = new HashMap<Integer, String>();
        languages.put(1, "Java");
        languages.put(2, "Nodejs");
        languages.put(3, "Ruby");
        languages.put(4, "Python");
        languages.put(5, "C++");

        // Iterate using for loop
        System.out.println("Iterate using for loop");
        for(Map.Entry<Integer,String> data : languages.entrySet()){
            System.out.println("Key = " + data.getKey() + ", Value = "+ data.getValue());
        }

        // Iterate using forEach loop
        System.out.println("\nIterate using forEach loop");
        languages.forEach((key, value)->{
            System.out.println("Key = " + key + ", Value = "+ value);
        });

        // Iterate using while loop
        System.out.println("\nIterate using While loop");
        Iterator <Integer> itr = languages.keySet().iterator();        while(itr.hasNext()){
            int key = (int)itr.next();
            System.out.println("Key = " + key + ", Value = "+ languages.get(key));

        }
    }
}