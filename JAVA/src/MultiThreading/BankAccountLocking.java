package MultiThreading;

//intrinsic lock
//public class BankAccountLocking {
//    private int balance = 100;
//
//    public synchronized void withdraw(int amount){
//        System.out.println(Thread.currentThread().getName() + " attempting to withdraw " + amount);
//        if(balance >= amount){
//            System.out.println(Thread.currentThread().getName() + " proceeding withdrawal");
//            try {
//                Thread.sleep(3000);
//            } catch (InterruptedException e) {
//                throw new RuntimeException(e);
//            }
//            balance -= amount;
//            System.out.println(Thread.currentThread().getName() + " completed withdrawal. Remaining balance " + balance);
//        }else {
//            System.out.println(Thread.currentThread().getName() + " insufficient back balance");
//        }
//    }
//}

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

// Explicit Lock
public class BankAccountLocking {
    private int balance = 100;

    private  final Lock lock = new ReentrantLock();

    public  void withdraw(int amount){
        System.out.println(Thread.currentThread().getName() + " attempting to withdraw " + amount);
        try{
            if(lock.tryLock(1000 , TimeUnit.MILLISECONDS)){
                if(balance >= amount){
                    try{
                        System.out.println(Thread.currentThread().getName() + " proceeding withdrawal");
                        Thread.sleep(3000);
                        balance -= amount;
                        System.out.println(Thread.currentThread().getName() + " completed withdrawal. Remaining balance " + balance);
                    } catch (Exception e) {
                        Thread.currentThread().interrupt();
                    }finally {
                        lock.unlock();
                    }
                }else {
                    System.out.println(Thread.currentThread().getName() + " insufficient back balance");
                }
            }else {
                System.out.println(Thread.currentThread().getName() + " cound not acquire the lock , will try later");
            }
        }catch (Exception e){
            Thread.currentThread().interrupt();
        }
    }
}