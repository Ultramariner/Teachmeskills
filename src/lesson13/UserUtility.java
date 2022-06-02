package lesson13;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class UserUtility {

    public static <T> List<User> searchUser(T userList, String name) {
        List<User> resultList = new ArrayList<>();
        Iterator<User> iterator = userList.listIterator();
        while (iterator.hasNext()) {
            User user = iterator.next();
            if (user.equals(new User(name))) {
                resultList.add(user);
            }
        }
        return resultList;
    }

    public static List<User> searchUser(List<User> userList, boolean sex) {
        List<User> resultList = new ArrayList<>();
        Iterator<User> iterator = userList.listIterator();
        while (iterator.hasNext()) {
            User user = iterator.next();
            if (user.getSex() == sex) {
                resultList.add(user);
            }
        }
        return resultList;
    }

    public static List<User> sortUserList(List<User> userList) {
        Collections.sort(userList);
        return userList;
    }
}
