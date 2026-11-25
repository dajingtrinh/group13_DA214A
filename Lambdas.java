public class Lambdas {
    public static void main(String[] args) {
        // Lambda Expression.
        Runnable thread = () -> System.out.println
            ("The created thread is active and currently running.");

        // Thread implements Runnable.
        Thread createThread = new Thread(thread);

        createThread.start();

    }
}