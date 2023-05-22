package com.example.test_javafx.controllers;

import com.example.test_javafx.Navigation;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

public class CreatLectuerController {

    @FXML
    private AnchorPane rootPane;
    @FXML
    TextField titel;
    @FXML
    TextField room;
    @FXML
    TextField lectuerId ;
    @FXML
    TextField courseId;

    Navigation navigation = new Navigation();
    public void back(ActionEvent actionEvent) {
        navigation.navigateTo(rootPane,navigation.TEACHER_FXML);

    }

    public void creatLectuer(ActionEvent actionEvent) {

    }
}
