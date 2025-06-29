module com.tpv.quizgamev2 {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.base;
    requires java.sql;
    requires lombok;

    opens com.tpv.quizgamev2 to javafx.fxml;
    exports com.tpv.quizgamev2;
}
