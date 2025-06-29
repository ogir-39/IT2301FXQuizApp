/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package com.tpv.quizgamev2;

import com.tpv.project.Category;
import com.tpv.service.CategoryService;
import com.tpv.utils.JdbcConnection;
import java.net.URL;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ResourceBundle;
import javafx.fxml.Initializable;

/**
 * FXML Controller class
 *
 * @author admin
 */
public class QuestionsController implements Initializable {
    @FXML private ComboBox<Category> cbCates;
    private static CategoryService cateService = new CategoryService();
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        try {
            List<Category> cates =  cateService.getCates();
            this.cbCates.setItems(FXCollections.observableList(cates))
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        
    }    
    
}
