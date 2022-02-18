import java.util.*;

public class Question3 {
    public static void TrimList( List<String> strs ){
        ListIterator <String> itr = strs.listIterator();
        while(itr.hasNext()){
            itr.set(itr.next().trim());
        }
    }

    public static void main(String[] args) {
        List<String> list = Arrays.asList(" apple ", " mango ", " orange ", " papaya ");
        TrimList(list);
        for (String s : list) {
            System.out.format("\"%s\"%n", s);
        }
    }

}
