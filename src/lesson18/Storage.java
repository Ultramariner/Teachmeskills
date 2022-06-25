package lesson18;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Storage {

    List<Integer> list = new ArrayList<>();

    Integer update() {
        int i = (int) (Math.random() * 10);
        list.add(i);
        return i;
    }

    Integer getElement() {
        return list.get((int) (Math.random() * list.size()));
    }
}
