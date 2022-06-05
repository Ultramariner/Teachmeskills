package lesson15.task2;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        List<Family> list = Arrays.asList(
                new Family("First", "adress1", 123, Arrays.asList(
                    new Children("Name1", 5, true),
                    new Children("Name2", 8, false)
                )),
                new Family("Second", "adress2", 456, Arrays.asList(
                        new Children("Name3", 5, true),
                        new Children("Name4", 8, true)
                )),
                new Family("Third", "adress3", 789, Arrays.asList(
                        new Children("Name5", 5, false),
                        new Children("Name6", 8, false)
                ))
        );

        Map<String, Integer> stream = list.stream()
                .collect(Collectors.toMap(Family::getLastName, Family::getSalary));
        System.out.println(stream);

        long streamCountBoys = list.stream()
                .flatMap(family -> family.getChildren().stream())
                .filter(Children::isSex)
                .count();
        System.out.println(streamCountBoys);

        List<Children> streamSex = list.stream()
                .flatMap(family -> family.getChildren().stream())
                .filter(child -> {return !child.isSex();})
                .collect(Collectors.toList());
        System.out.println(streamSex);

        Map<String, Integer> streamCountChildren = list.stream()
                .collect(Collectors.toMap(Family::getLastName, size -> size.getChildren().size()));
        System.out.println(streamCountChildren);

        boolean streamPresent = list.stream()
                .flatMap(family -> family.getChildren().stream())
                .map(Children::getFirstName)
                .anyMatch(name -> name.equals("Name11"));
        System.out.println(streamPresent);
    }
}
