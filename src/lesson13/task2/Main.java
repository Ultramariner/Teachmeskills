package lesson13.task2;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        ArrayList<Integer> array = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,2,1,4,5,1,3,1,7));
        Map<Integer, Integer> map = new HashMap<>();
        fillMap(map, array);
        System.out.println(getMaxValue(map));
    }

    public static void fillMap (Map<Integer, Integer> map, ArrayList<Integer> array) {
        Iterator<Integer> iterator = array.iterator();
        while (iterator.hasNext()) {
            Integer i = iterator.next();
            if (map.containsKey(i)) {
                map.put(i, map.get(i) + 1);
            } else {
                map.put(i, 1);
            }
        }
    }

    public static <K, V extends Integer> Map<K, V> getMaxValue (Map<K, V> map) {
        Map<K, V> max = new HashMap<>();
        K key = null;
        Iterator<Map.Entry<K, V>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<K, V> temp = iterator.next();
            if (max.isEmpty()) {
                max.put(temp.getKey(), temp.getValue());
                key = temp.getKey();
            }
            if (temp.getValue().compareTo(max.get(key)) > 0) {
                max.clear();
                max.put(temp.getKey(), temp.getValue());
                key = temp.getKey();
            }
        }
        return max;
    }
}
