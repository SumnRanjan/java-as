package MultiThreading;

public class Test {

    // using Thread
//    public static void main(String[] args) {
//        World word = new World();
//        word.start();
//        for(int i = 0 ; i < 10 ; i++){
//            System.out.println(Thread.currentThread().getName());
//        }
//    }


    // using Runnable
    public static void main(String[] args) {
//        World world = new World();
//        Thread t1 = new Thread(world);
//        t1.start();
//        for(int i = 0 ; i < 10 ; i++){
//            System.out.println(Thread.currentThread().getName());
//        }
        Counter counter = new Counter();
        MyThread t1 = new MyThread(counter);
        MyThread t2 = new MyThread(counter);

        t1.start();
        t2.start();

        try{
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println(counter.getCount());
    }
}
