package SanMigLight_MedicalService;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class Confirm implements Initializable {

    @FXML private Button btnProceed3;
    @FXML private Button btnCancel;
    @FXML private ImageView iconConfirm;
    public static boolean nxtproceed;



    public void initialize(URL url, ResourceBundle resourceBundle) {
        File logo = new File("Images/logo.png");
        Image logoimage = new Image(logo.toURI().toString());
        iconConfirm.setImage(logoimage);
        nxtproceed = false;
    }



    public void Cancel(ActionEvent e) throws IOException {
        Stage stage = (Stage) btnCancel.getScene().getWindow();
        stage.close();
        nxtproceed = false;


    }

    public void Proceed(ActionEvent e) {
        Stage stage = (Stage) btnCancel.getScene().getWindow();
        stage.close();
        nxtproceed = true;



    }
}
