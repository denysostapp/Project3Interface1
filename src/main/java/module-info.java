module com.example.project3interface {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.project3interface to javafx.fxml;
    exports com.example.project3interface;
    exports com.example.project3interface.part1_2;
    exports com.example.project3interface.part3 to javafx.graphics;
    opens com.example.project3interface.part1_2 to javafx.fxml;
}