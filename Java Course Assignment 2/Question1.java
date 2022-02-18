import java.util.*;

public class Question1 {
    public static void main(String[] args){
        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7);

        Collections.shuffle(list);
        System.out.println("******Method 1******");
        list.stream().forEach(num->{
            System.out.println(num);
        });

        System.out.println("\n******Method 2******");
        for(int num : list){
            System.out.println(num);
        }
    }    
}
