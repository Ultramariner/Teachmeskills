package lesson18;

import java.util.Timer;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Main {

    public static void main(String[] args) throws InterruptedException {

        Lock lock = new ReentrantLock();
        Storage storage = new Storage();
        StorageLock storage2 = new StorageLock(lock);

        MySynchronizedThread thread1Update = new MySynchronizedThread(storage); //...(storage2);
        MySynchronizedThread thread2Update = new MySynchronizedThread(storage); //...(storage2);
        MySynchronizedThread thread3Update = new MySynchronizedThread(storage); //...(storage2);
        MySynchronizedThread thread4Get = new MySynchronizedThread(storage); //...(storage2);
        MySynchronizedThread thread5Get = new MySynchronizedThread(storage); //...(storage2);
        MySynchronizedThread thread6Get = new MySynchronizedThread(storage); //...(storage2);

        thread1Update.start();
        thread2Update.start();
        thread3Update.start();
        thread4Get.start();
        thread5Get.start();
        thread6Get.start();

        long time = System.currentTimeMillis();
        while (System.currentTimeMillis() - time < 3000) {
            System.out.println(thread1Update.update());
            System.out.println(thread2Update.update());
            System.out.println(thread3Update.update());
            System.out.println(thread4Get.getElement());
            System.out.println(thread5Get.getElement());
            System.out.println(thread6Get.getElement());
        }

        thread1Update.interrupt();
        thread2Update.interrupt();
        thread3Update.interrupt();
        thread4Get.interrupt();
        thread5Get.interrupt();
        thread6Get.interrupt();
    }
}
