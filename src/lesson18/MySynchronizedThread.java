package lesson18;

public class MySynchronizedThread<T extends Storage> extends Thread {

    T storage;
//    boolean isRun = true;
    int operation;

    public MySynchronizedThread(T storage, int operation) {
        this.storage = storage;
        this.operation = operation;
    }

    @Override
    public void run() {
        System.out.println(this.getName() + " run");
        while (!this.isInterrupted()) {
            try {
                if (storage instanceof StorageLock) {
                        if (operation == 1) {
                            System.out.println(update());
                        } else {
                            System.out.println(getElement());
                        }
                }
                else {
                    synchronized (storage) {
                        if (operation == 1) {
                            System.out.println(update());
                        } else {
                            System.out.println(getElement());
                        }
                    }
                }
            }
            catch (InterruptedException e) {
//                e.printStackTrace();
                this.interrupt();
            }
        }
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
