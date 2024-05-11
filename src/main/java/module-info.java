module com.system.projectmanagementsystem {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;

    opens com.system.projectmanagementsystem to javafx.fxml;
    exports com.system.projectmanagementsystem;
}