package lesson18;

import java.util.Timer;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Main {

    public static void main(String[] args) throws InterruptedException {

        Lock lock = new ReentrantLock();
        Storage storage = new Storage();
        StorageLock storage2 = new StorageLock(lock);
        long time = System.currentTimeMillis();

        MySynchronizedThread thread1Update = new MySynchronizedThread(storage, 1); //...(storage2);
        MySynchronizedThread thread2Update = new MySynchronizedThread(storage, 1); //...(storage2);
        MySynchronizedThread thread3Update = new MySynchronizedThread(storage, 1); //...(storage2);
        MySynchronizedThread thread4Get = new MySynchronizedThread(storage, 2); //...(storage2);
        MySynchronizedThread thread5Get = new MySynchronizedThread(storage, 2); //...(storage2);
        MySynchronizedThread thread6Get = new MySynchronizedThread(storage, 2); //...(storage2);

        thread1Update.start();
        thread2Update.start();
        thread3Update.start();
        thread4Get.start();
        thread5Get.start();
        thread6Get.start();

        Thread.sleep(3000);

        thread1Update.interrupt();
        thread2Update.interrupt();
        thread3Update.interrupt();
        thread4Get.interrupt();
        thread5Get.interrupt();
        thread6Get.interrupt();
    }
}
