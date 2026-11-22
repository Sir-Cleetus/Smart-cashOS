module cash.sample {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;
    requires mysql.connector.j;


    opens cash.sample to javafx.fxml;
    exports cash.sample;
}