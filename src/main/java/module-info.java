module com.example.fxmemorygame {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.fxmemorygame to javafx.fxml;
    exports com.example.fxmemorygame;
}