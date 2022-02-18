import java.util.*;

public class Question3 {
    public static void main(String[] args){
        ArrayList <String> al = new ArrayList<String>();
        al.add("Python");
        al.add("Java");
        al.add("C++");
        al.add("Nodejs");
        al.add("Ruby");
        al.add("C");

        System.out.println("Iterate using advanced for loop");
        al.forEach((lang)->{
            System.out.println(lang);
        });

        System.out.println("\nIterate using while loop");
        Iterator itr = al.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }

        System.out.println("\nIterate using for loop");
        for(String lang:al){
            System.out.println(lang);
        }

    }
}
