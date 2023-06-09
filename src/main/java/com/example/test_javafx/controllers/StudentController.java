package com.example.test_javafx.controllers;

import com.example.test_javafx.Navigation;
import com.example.test_javafx.models.DataModel;
import com.example.test_javafx.models.Student;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.VBox;

import java.net.URL;
import java.util.ResourceBundle;

public class StudentController implements Initializable {
    DataModel model = new DataModel();
    Navigation navigation = new Navigation();
    @FXML
    private AnchorPane rootPane;
    @FXML
    private TextField name;
    @FXML
    private TextField gpa;
    @FXML
    private TextField id;
    @FXML
    private TextField phone;
    @FXML
    private TextField address;


    public void onAdd() {
        model.addStudent(new Student(name.getText(),id.getText(),phone.getText(),address.getText(),Float.parseFloat(gpa.getText())));
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setHeaderText("The student has been added successfully");
        alert.setTitle("Done");
        alert.setContentText("Name: " + name.getText() + ", GPA: " + gpa.getText());
        alert.showAndWait();
    }

    public void onBack() {
        navigation.navigateTo(rootPane, navigation.TEACHER_FXML);
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        //set TextFiled to accept Numbers Only
        gpa.textProperty().addListener((observable, oldValue, newValue) -> {
            if (newValue != null && !newValue.matches("\\d*")) {
                gpa.setText(newValue.replaceAll("[^\\d]", ""));
            }
        });
    }

    public void onDeleat(ActionEvent actionEvent) {
        model.deleteStudentByName(name.getText());
    }
    public void onShowStudents() {
        navigation.navigateTo(rootPane, navigation.SHOW_STUDENTS_FXML);
    }
}
