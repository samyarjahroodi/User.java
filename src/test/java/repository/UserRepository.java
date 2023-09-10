package repository;

import connection.JdbcConncetion;
import model.User;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UserRepository {
    JdbcConncetion jdbcConncetion = new JdbcConncetion();
    Connection connection = jdbcConncetion.getConnection();

    public UserRepository() throws SQLException {
    }

    public int save(User user) throws SQLException {
        String add = "INSERT INTO users(firstName,lastName,password,userName)VALUES(?,?,?,?)";
        PreparedStatement preparedStatement = connection.prepareStatement(add);
        preparedStatement.setString(1, user.getFirstName());
        preparedStatement.setString(2, user.getLastName());
        preparedStatement.setString(3, user.getPassword());
        preparedStatement.setString(4, user.getUserName());
        int result=preparedStatement.executeUpdate();
        return result;
    }

}
