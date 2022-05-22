package lesson12.task1;

import java.io.*;

public class Main {

    public static void main(String[] args) {

        User user = new User("User", 25, true);
        Object userGet;
        try {
            serialize(user, "D:/test.txt");
            userGet = deserialize("D:/test.txt");
            System.out.println(userGet);
        } catch (IOException | ClassNotFoundException exception) {
            System.out.println(exception);
        }
    }

    public static void serialize(User user, String destination) throws IOException {
        ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(destination));
        out.writeObject(user);
        out.close();
    }

    public static Object deserialize(String destination) throws ClassNotFoundException, IOException {
        ObjectInputStream in = new ObjectInputStream(new FileInputStream("D:/test.txt"));
        return in.readObject();
    }
}
