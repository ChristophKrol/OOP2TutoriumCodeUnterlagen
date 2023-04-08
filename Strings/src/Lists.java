import java.util.*;

public class Lists {

    public static void main(String[] args) {
        List<String> list  = new ArrayList<>();

        LinkedList<Integer> llist = new LinkedList<>();

        llist.add(100);
        llist.add(Integer.valueOf(101));
        System.out.println(llist.toString());
        llist.remove(Integer.valueOf(101));
        System.out.println(llist.toString());




    }
}
