// Write a Java program to set priorities of thread.

class MyThread extends Thread {
    MyThread(String name) {
        super(name);
    }

    public void run() {
        System.out.println(getName() + " is running");
    }
}

class P7_3 {
    public static void main(String[] args) {
        MyThread t1 = new MyThread("Thread 1");
        MyThread t2 = new MyThread("Thread 2");
        MyThread t3 = new MyThread("Thread 3");

        t1.setPriority(Thread.MIN_PRIORITY);
        t2.setPriority(Thread.NORM_PRIORITY);
        t3.setPriority(Thread.MAX_PRIORITY);

        System.out.println("Priority of Thread 1: " + t1.getPriority());
        System.out.println("Priority of Thread 2: " + t2.getPriority());
        System.out.println("Priority of Thread 3: " + t3.getPriority());

        t1.start();
        t2.start();
        t3.start();
    }
}