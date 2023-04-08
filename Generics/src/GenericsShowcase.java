import java.util.ArrayList;
import java.util.List;

public class GenericsShowcase {

    public static void main(String[] args) {
        GenericClass<Integer> intClass = new GenericClass<>(10);

        ArrayList <Integer> intList = new ArrayList<>();
        intList.add(10);
        intList.add(20);




        GenericClass.printStatic(100);


        printList(intList);





    }

    public static void printList(List<?> list) {
        for (Object element : list) {
            System.out.println(element);

        }
    }

    // List<String> != List<Object>




}
