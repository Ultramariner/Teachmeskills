package lesson13.task1;

import java.util.*;

public class UserUtility {

    public static <T extends Collection<User>> T searchUser(T userList, String name) {
        T resultList;
        if (userList instanceof ArrayList) {     //замена T resultList = new T<>();, как правиленее было сделать?
            resultList = (T) new ArrayList<User>();
        } else {
            resultList = (T) new HashSet<User>();
        }
        Iterator<User> iterator = userList.iterator();
        while (iterator.hasNext()) {
            User user = iterator.next();
            if (user.equals(new User(name))) {
                resultList.add(user);
            }
        }
        return resultList;
    }

    public static <T extends Collection<User>> T searchUser(T userList, boolean sex) {
        T resultList;
        if (userList instanceof ArrayList) {
            resultList = (T) new ArrayList<User>();
        } else {
            resultList = (T) new HashSet<User>();
        }
        Iterator<User> iterator = userList.iterator();
        while (iterator.hasNext()) {
            User user = iterator.next();
            if (user.getSex() == sex) {
                resultList.add(user);
            }
        }
        return resultList;
    }

    public static <T extends Collection<User>> T sortUserList(T userList) {
        if (userList instanceof ArrayList) {
            Collections.sort((List) userList);
            return userList;
        } else {
            return (T) new TreeSet<User>(userList);
        }
    }
}
