package lesson18;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.locks.Lock;

public class StorageLock extends Storage {

    Lock lock;

    public StorageLock(Lock lock) {
        this.lock = lock;
    }

    @Override
    Integer update() {
        lock.lock();
        int i = (int) (Math.random() * 10);
        list.add(i);
        lock.unlock();
        return i;
    }

    @Override
    Integer getElement() {
        lock.lock();
        int i = (int) (Math.random() * list.size());
        lock.unlock();
        return list.get(i);
    }
}
