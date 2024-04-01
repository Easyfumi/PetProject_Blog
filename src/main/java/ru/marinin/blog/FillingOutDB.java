package ru.marinin.blog;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import ru.marinin.blog.repo.PostRepository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

// заполнение бд для H2

public class FillingOutDB {
    public static void insertTestPosts() {
        try (Connection con = DriverManager.getConnection("jdbc:h2:mem:test", "sa", "")) {
            Statement stm = con.createStatement();
            stm.executeUpdate(" INSERT INTO Post VALUES(1, 1 , 1, 1, 0) " );

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

}
