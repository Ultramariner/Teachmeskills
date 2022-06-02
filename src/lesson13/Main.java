package lesson13;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {

    public static void main(String[] args) {

        List<User> userList = new ArrayList<User>();
        Set<User> userSet = new HashSet<>();

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

        System.out.println(UserUtility.<List<User>>searchUser(userList, "A"));
        System.out.println(UserUtility.<List<User>>searchUser(userList, false));
        System.out.println(UserUtility.<List<User>>sortUserList(userList));

//        System.out.println(UserUtility.<Set<User>>searchUser(userSet, "A"));
//        System.out.println(UserUtility.searchUser(userSet, false));
//        System.out.println(UserUtility.sortUserList(userSet));
    }
}
