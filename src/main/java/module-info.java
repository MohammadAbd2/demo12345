module dk.easv.demo12345 {
    requires javafx.controls;
    requires javafx.fxml;


    opens dk.easv.demo12345 to javafx.fxml;
    exports dk.easv.demo12345;
}