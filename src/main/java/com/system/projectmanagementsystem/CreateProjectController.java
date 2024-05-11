package com.system.projectmanagementsystem;

import Entity.Project;
import Util.Navigation;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.io.IOException;

public class CreateProjectController {



    @FXML
    private Button home_btn;
    @FXML
    private Button add_project;

    @FXML
    private TextField projectNameTextField;

    @FXML
    private void goToHomePage() {
        try {
            // Load the FXML file of the target page
            FXMLLoader loader = new FXMLLoader(getClass().getResource("home.fxml"));
            Parent root = loader.load();

            // Get the controller for the new scene if needed


            // Get the current stage
            Stage currentStage = (Stage) home_btn.getScene().getWindow();

            // Set the new scene in the current stage
            currentStage.setScene(new Scene(root));
            currentStage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    @FXML
    public void showProjectCreationDialog() {
        try {
            // Load the FXML file for the project creation dialog
            FXMLLoader loader = new FXMLLoader(getClass().getResource("CreateProject.fxml"));
            DialogPane dialogRoot = loader.load();

            // Create a new stage for the dialog
            Stage dialogStage = new Stage();
            dialogStage.setTitle("Create Project");
            dialogStage.initModality(Modality.WINDOW_MODAL);
            dialogStage.initOwner(add_project.getScene().getWindow());
            Scene scene = new Scene(dialogRoot);
            dialogStage.setScene(scene);

            // Show the dialog
            dialogStage.showAndWait();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    @FXML
    public void saveProject() {
        // Retrieve data from dialog fields
        String projectName = projectNameTextField.getText();


        // Create Project object
        Project project = new Project();
        project.setName(projectName);

        // Save the project to the database
        DatabaseAccessLayer.saveProject(project);

        // Optionally, close the dialog or show a confirmation message
        closeDialog(); // Implement this method to close the dialog
    }

}
