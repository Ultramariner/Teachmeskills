package lesson20;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) throws SQLException {

        Connection connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/TMS?currentSchema=TMS_lessons", "postgres", "password");
        Statement statement = connection.createStatement();
        statement.execute("set SCHEMA 'TMS_lessons'");
        statement.execute("create table users (pid SERIAL primary key, f_name varchar);");
        statement.execute("insert into users (f_name) values ('User1'), ('User2'), ('User3');");
        ResultSet resultSet = statement.executeQuery("select * from users;");
        getResult(resultSet);

        PreparedStatement preparedStatement1 = connection.prepareStatement("select * from users where f_name = ?;");
        preparedStatement1.setString(1, "User3");
        resultSet = preparedStatement1.executeQuery();
        resultSet.next();
        User user1 = new User(resultSet.getInt("pid"), resultSet.getString("f_name"));
        System.out.println(user1.toString());

        PreparedStatement preparedStatement2 = connection.prepareStatement("select * from users where pid = ? and f_name = ?;"); //как правильно задавать set для IN?
        preparedStatement2.setInt(1, 1);
        preparedStatement2.setString(2, "User1");
        resultSet = preparedStatement2.executeQuery();
        getResult(resultSet);
    }

    public static void getResult(ResultSet resultSet) throws SQLException {
        List<String> list = new ArrayList<>();
        while(resultSet.next()) {
            list.add(resultSet.getString("f_name"));
        }
        System.out.println(list.toString());
    }
}
