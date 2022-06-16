package lesson18;

public class MySynchronizedThread<T extends Storage> extends Thread {

    T storage;

    public MySynchronizedThread(T storage) {
        this.storage = storage;
    }

    @Override
    public void run() {
        System.out.println(this.getName() + " run");
    }

    Integer update() throws InterruptedException {
        System.out.println("update before sleep " + this.getName());
        Thread.sleep(100);
        System.out.println("update after sleep " + this.getName());
        return storage.update();
    }

    Integer getElement() throws InterruptedException {
        System.out.println("get before sleep " + this.getName());
        Thread.sleep(100);
        System.out.println("get after sleep " + this.getName());
        return storage.getElement();
    }
}
