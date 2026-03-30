package com.example.engg1420.model;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class usertoDB {

    public static void insertUser(Connection conn, User user) throws Exception {
        String sql = "INSERT INTO users (userid, name, email, usertype) VALUES (?, ?, ?, ?)";

        PreparedStatement stmt = conn.prepareStatement(sql);

        stmt.setString(1, user.getId());
        stmt.setString(2, user.getName());
        stmt.setString(3, user.getEmail());
        stmt.setString(4, user.getUserType());

        stmt.executeUpdate();
        stmt.close();
    }
}