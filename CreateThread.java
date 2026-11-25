public class CreateThread {
    public static void main(String[] args) {
        // Lambda Expression.
        Runnable runnable = () -> System.out.println
            ("The created thread is active and currently running.");

        // Thread implements Runnable.
        Thread createThread = new Thread(runnable);

        createThread.start();

    }
}