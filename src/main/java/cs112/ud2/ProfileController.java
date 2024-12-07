package cs112.ud2;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.io.IOException;

public class ProfileController {

    @FXML
    protected void onProfileButtonClick1() throws IOException {
        //System.out.println("Profile 1 info.");
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(HelloApplication.class.getResource("profile-info.fxml"));
        Parent eventViewParent = loader.load();

        Stage popupStage = new Stage();

        popupStage.initModality(Modality.APPLICATION_MODAL); //locks screen to current popup window

        popupStage.setScene(new Scene(eventViewParent));

        popupStage.show();
    }

    @FXML
    protected void onProfileButtonClick2() throws IOException {
        //System.out.println("Profile 2 info.");
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(HelloApplication.class.getResource("profile-info.fxml"));
        Parent eventViewParent = loader.load();

        Stage popupStage = new Stage();

        popupStage.initModality(Modality.APPLICATION_MODAL); //locks screen to current popup window

        popupStage.setScene(new Scene(eventViewParent));

        popupStage.show();
    }
}

