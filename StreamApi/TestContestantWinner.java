package StreamApi;

import java.util.ArrayList;
import java.util.Collections;
import java.util.stream.Collectors;

public class TestContestantWinner {

    public static void main(String[] args) {

        ArrayList<Contestant> list = new ArrayList<Contestant>();

        list.add(new Contestant("Ram", "7875896985"));
        list.add(new Contestant("Shyam", "6985878589"));
        list.add(new Contestant("Ajay", "6985878589"));
        list.add(new Contestant("Vijay", "7876856985"));
        list.add(new Contestant("Jay", "7875836985"));
        list.add(new Contestant("Pappu", "6585898587"));
        list.add(new Contestant("invalidNo", "78858"));

        // Get all phone numbers
        list.stream()
            .map(e -> e.phoneNo)
            .forEach(System.out::println);

        System.out.println("--------------");

        // Get valid phone numbers
        list.stream()
            .map(e -> e.phoneNo)
            .filter(e -> e.length() == 10)
            .forEach(System.out::println);

        System.out.println("--------------");

        // Remove duplicate phone numbers
        list.stream()
            .map(e -> e.phoneNo)
            .filter(e -> e.length() == 10)
            .distinct()
            .forEach(System.out::println);

        System.out.println("--------------");

        // Shuffle phone numbers and get 3 winners
        list.stream()
            .map(e -> e.phoneNo)
            .filter(e -> e.length() == 10)
            .distinct()
            .collect(Collectors.collectingAndThen(
                Collectors.toList(),
                e -> {
                    Collections.shuffle(e);
                    return e;
                }
            ))
            .stream()
            .limit(3)
            .forEach(System.out::println);
    }
}
