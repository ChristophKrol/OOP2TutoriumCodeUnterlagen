import java.util.List;

public class GenericClass <T extends Number>{

    T element;

    public GenericClass(T element) {
        this.element = element;
    }

    // keine statische Methode
    public void printElement( ){
        System.out.println(this.element);
    }

    public T getElement(){
        return this.element;
    }

    public static <T> void printStatic(T element) {
        System.out.println(element);
    }



}
