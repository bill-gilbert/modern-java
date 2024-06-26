package modernjavainaction.chap02;

public class MyThreadRunner {
    public static void main(String[] args) {
        Thread thread = new Thread(()->System.out.println("Hello World"));
        thread.start();
    }
}
