package com.oop.practicearea_2220972.complexnooperation_night_01;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

public class ComplexNoOperationSceneController {

    @FXML
    private TextField imgOf1stCnoTextField;

    @FXML
    private TextField imgOf2ndCnoTextField;

    @FXML
    private TextField realOf1stCnoTextField;

    @FXML
    private TextField realOf2ndCnoTextField;

    @FXML
    private Label resultLabel;

    ComplexNo c1,c2,c3;

    @FXML
    void addComplexNosbuttonMoAction(ActionEvent event) {
        c1 = new ComplexNo(
                Integer.parseInt(realOf1stCnoTextField.getText()),
                Integer.parseInt(imgOf1stCnoTextField.getText()),

        );

        c2 = new ComplexNo(
                Integer.parseInt(realOf2ndCnoTextField.getText()),
                Integer.parseInt(imgOf2ndCnoTextField.getText()),

                );

        c3 = c1.add(c2);
        resultLabel.setText(c3.toString());





    }

    @FXML
    void addComplexNosbuttonOnMouseClicked(MouseEvent event) {
        c1 = new ComplexNo(
                Integer.parseInt(realOf1stCnoTextField.getText()),
                Integer.parseInt(imgOf1stCnoTextField.getText()),

                );

        c2 = new ComplexNo(
                Integer.parseInt(realOf2ndCnoTextField.getText()),
                Integer.parseInt(imgOf2ndCnoTextField.getText()),

                );



        c3 = c1.subtract(c2);
        resultLabel.setText(c3.toString());

    }

}
