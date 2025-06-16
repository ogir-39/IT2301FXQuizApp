package com.tpv.quizgamev2;

import com.tpv.utils.MyAlert;
import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class PrimaryController {

    public void handleQuestionManagement(ActionEvent event) throws IOException {
        Scene scene = new Scene(new FXMLLoader(App.class.getResource("questions.fxml")).load());
        
        Stage stage = new Stage();
        stage.setScene(scene);
        stage.setTitle("Quizz App");
        stage.show();
    }
    
    public void handlePractice(ActionEvent event) {
        MyAlert.getInstance().showMsg("Practice: Coming soon...");
    }
    
    public void handleDo(ActionEvent event) {
        MyAlert.getInstance().showMsg("Do: Coming soon...");
    }
    
    public void handleSignIn(ActionEvent event) {
        MyAlert.getInstance().showMsg("SignIn: Coming soon...");
    }
    
    public void handleSignUp(ActionEvent event) {
        MyAlert.getInstance().showMsg("SignUp: Coming soon...");
    }
}
