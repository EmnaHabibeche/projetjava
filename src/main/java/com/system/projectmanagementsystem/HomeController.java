package com.system.projectmanagementsystem;

import Entity.Project;
import Util.Navigation;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

public class HomeController {




    @FXML
    private Button projectBtn;




    @FXML
    private void goToProjectPage() {
        try {
            // Load the FXML file of the target page
            FXMLLoader loader = new FXMLLoader(getClass().getResource("Project.fxml"));
            Parent root = loader.load();

            // Get the controller for the new scene if needed


            // Get the current stage
            Stage currentStage = (Stage) projectBtn.getScene().getWindow();

            // Set the new scene in the current stage
            currentStage.setScene(new Scene(root));
            currentStage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }








    }

