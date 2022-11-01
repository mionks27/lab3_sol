module lab3.lab3_sol {
    requires javafx.controls;
    requires javafx.fxml;


    opens lab3.lab3_sol to javafx.fxml;
    exports lab3.lab3_sol;
}