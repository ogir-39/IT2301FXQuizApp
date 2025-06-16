/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package com.tpv.quizgamev2;

import java.net.URL;
import java.sql.Driver;
import java.sql.DriverManager;
import java.util.ResourceBundle;
import javafx.fxml.Initializable;

/**
 * FXML Controller class
 *
 * @author admin
 */
public class QuestionsController implements Initializable {

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        try {
            // Nạp driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            // Thiết lập kết nối
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/quizdb", "root", "root");
        // Xử lý truy vấn
        Statement stm = conn.createStatement();
        stm.excuteQuery("SELECT * FROM category");
        // Đóng kết nối
        conn.close();
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        }
        
    }    
    
}
