package MultiThreading;

public class MyThread extends Thread{
//    @Override
//    public void run() {
//        System.out.println("RUNNING");
//        try {
//            Thread.sleep(200);
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }
//    }

//    public static void main(String[] args) throws InterruptedException {
//        MyThread t1 = new MyThread();
//        System.out.println(t1.getState());
//        t1.start();
//        System.out.println(t1.getState());
//        System.out.println(Thread.currentThread().getState());
//
//        Thread.sleep(100);
//        System.out.println(t1.getState());
//        t1.join();
//        System.out.println(t1.getState());
//    }

    //Synchronization
    private Counter counter;

    public MyThread (Counter counter){
        this.counter = counter;
    }

    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            counter.increment();
        }
    }

}
