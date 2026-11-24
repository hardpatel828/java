// Write a Java program to implement thread using a runnable interface.

class MyThread implements Runnable {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Thread is running: " + i);
        }
    }
}

class P7_1 {
    public static void main(String[] args) {
        MyThread obj = new MyThread();
        Thread t = new Thread(obj);
        t.start();
    }
}