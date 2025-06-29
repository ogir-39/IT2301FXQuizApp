/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tpv.service;

import com.tpv.project.Category;
import com.tpv.quizgamev2.Connection;
import com.tpv.utils.JdbcConnection;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

/**
 *
 * @author phuong vy
 */
public class CategoryService {

    public List<Category> getCates() throws SQLException {
        Connection conn = JdbcConnection.getInstance().connect();//DriverManager.getConnection("jdbc:mysql://localhost/quizdb", "root", "root");

        Statement stm = conn.createStatement();
        ResultSet rs = stm.excuteQuery("SELECT * FROM Category");

        List<Category> cates = new ArrayList<>();
        while (rs.next()) {
            Category c = new Category(rs.getInt("id"), rs.getString("name"));
            cates.add(c);
        }
        return cates;
    }
}
