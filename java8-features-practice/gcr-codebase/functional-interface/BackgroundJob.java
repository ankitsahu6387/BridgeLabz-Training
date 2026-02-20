public class BackgroundJob {

    public static void main(String[] args) {

        // Runnable task (background job)
        Runnable job = () -> {
            System.out.println("Background job started...");
            try {
                Thread.sleep(2000); // simulate long task
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Background job completed!");
        };

        // Execute task asynchronously
        Thread thread = new Thread(job);
        thread.start();

        // Main thread continues
        System.out.println("Main thread is free to do other work...");
    }
}