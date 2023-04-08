public class Boxing {

    public static int foo(Integer i){

        return 1;

    }

    public static String hello(int i){
        return "Hello";
    }


    public static void main(String[] args) {

        System.out.println(foo(Integer.valueOf(1))); // Boxing (manuell)
        System.out.println(foo(10));                // Autoboxing

        System.out.println(hello(Integer.valueOf(10))); //Autounboxing
        System.out.println(hello(0));


    }
}
