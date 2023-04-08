package counting;

public class MainThread {
    public static void main(String[] args) {

        RunnableClass rc = new RunnableClass();
        ThreadClass tc = new ThreadClass();

        Thread t1 = new Thread(rc);
        t1.start();
        tc.start();

    }
}
