package lesson15.task1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(12, 14, 9, 4, 5, 6, 7, 10, 9, 8);

        List<Integer> stream = list.stream()
                .distinct()
                .filter(element -> {return element % 2 == 0 && element > 7 && element < 17;})
                .map(element -> {return element *= 2;})
                .sorted()
                .limit(4)
                .collect(Collectors.toList());

        long streamCount = list.stream()
                .count();

        long streamSum = list.stream()
                .mapToInt(element -> element)
                .sum();

        System.out.println(stream);
        System.out.println(streamCount);
        System.out.println(streamSum);
    }
}
