module com.example.keeptoo {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.keeptoo to javafx.fxml;
    exports com.example.keeptoo;
}