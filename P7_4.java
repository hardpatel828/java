// Write a Java program to display all running threads.

class P7_4 {
    public static void main(String[] args) {
        Thread t1 = new Thread(() -> {
            System.out.println("Thread 1 is running");
        });

        Thread t2 = new Thread(() -> {
            System.out.println("Thread 2 is running");
        });

        t1.start();
        t2.start();

        Thread current = Thread.currentThread();

        System.out.println("Running Threads:");

        for (Thread t : Thread.getAllStackTraces().keySet()) {
            System.out.println(t.getName());
        }
    }
}