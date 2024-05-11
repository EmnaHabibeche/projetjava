package Util;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Navigation {



    public static void goToPage(String fxmlPath, Stage currentStage) {
        try {
            // Load the FXML file of the target page
            FXMLLoader loader = new FXMLLoader(Navigation.class.getResource(fxmlPath));
            Parent root = loader.load();

            // Get the controller for the new scene if needed


            // Get the current stage


            // Set the new scene in the current stage
            currentStage.setScene(new Scene(root));
            currentStage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
