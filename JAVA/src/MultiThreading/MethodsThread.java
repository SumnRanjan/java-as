package MultiThreading;

public class MethodsThread extends Thread {
    // run start join sleep setPriority interrupt yield setDaemon
    MethodsThread(String name){
        super(name);
    }
    @Override
    public void run() {
        for (int i = 0; i < 50000000; i++) {
//            System.out.println(Thread.currentThread().getName() + " - Priority " + Thread.currentThread().getPriority() + " -count " + i);
            System.out.println(Thread.currentThread().getName() + " is running");
//            Thread.yield();
        }

//        try{
//            Thread.sleep(5000);
//            System.out.println();
//        }catch (InterruptedException e) {
//            System.out.println(Thread.currentThread().getName() + " was interrupted");
//        }
    }

        public static void main(String[] args) throws InterruptedException {
            MethodsThread t1 = new MethodsThread("Low Priority Thread");
            MethodsThread t2 = new MethodsThread("Medium Priority Thread");
            MethodsThread t3 = new MethodsThread("High Priority Thread");

//            t1.start();
//            t1.join();
            t1.setPriority(Thread.MIN_PRIORITY);
//            t2.setPriority(Thread.NORM_PRIORITY);
//            t3.setPriority(Thread.MAX_PRIORITY);

//            t1.start();
//            t2.start();
//            t3.start();
//            t1.interrupt();

//            t2.start();
            t1.setDaemon(true);
            t1.start();
            System.out.println("Hello");

        }
}
