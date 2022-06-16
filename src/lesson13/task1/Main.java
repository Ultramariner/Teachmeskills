package lesson13.task1;

import java.util.ArrayList;
import java.util.HashSet;

public class Main {

    public static void main(String[] args) {

        ArrayList<User> userList = new ArrayList<>();
        HashSet<User> userSet = new HashSet<>();

        userList.add(new User("F", true, 10));
        userList.add(new User("E", true, 15));
        userList.add(new User("A", false, 10));
        userList.add(new User("C", false, 5));
        userList.add(new User("A", true, 11));

        userSet.add(new User("A", true, 10));
        userSet.add(new User("E", true, 15));
        userSet.add(new User("F", false, 10));
        userSet.add(new User("C", false, 5));
        userSet.add(new User("A", true, 11));

        System.out.println(UserUtility.searchUser(userList, "A"));
        System.out.println(UserUtility.searchUser(userList, false));
        System.out.println(UserUtility.sortUserList(userList));

        System.out.println(UserUtility.searchUser(userSet, "A"));
        System.out.println(UserUtility.searchUser(userSet, false));
        System.out.println(UserUtility.sortUserList(userSet));
    }
}
