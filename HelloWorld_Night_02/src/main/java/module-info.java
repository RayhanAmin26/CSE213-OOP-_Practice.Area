module com.oop.practicearea_2220972.helloworld_night_02 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.oop.practicearea_2220972.helloworld_night_02 to javafx.fxml;
    exports com.oop.practicearea_2220972.helloworld_night_02;
}