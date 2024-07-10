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
import javafx.stage.Stage;


import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;


public class MedicalChoice implements Initializable{


    @FXML private Button btnProceed1;
    @FXML private Button btnDental;
    @FXML private  Button btnMental;
    @FXML private ImageView iconMC;


    public static String medicalChoice;

    public void initialize(URL url, ResourceBundle resourceBundle){
        File logo = new File("Images/logo.png");
        Image logoimage = new Image(logo.toURI().toString());
        iconMC.setImage(logoimage);

        Image img1 = new Image(getClass().getResourceAsStream("Images/dental.png"));
        ImageView view = new ImageView(img1);
        btnDental.setGraphic(view);

        Image img2 = new Image(getClass().getResourceAsStream("Images/mental.png"));
        ImageView view2 = new ImageView(img2);
        btnMental.setGraphic(view2);

    }


    public void Proceed(ActionEvent e) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("ClinicChoice.fxml"));
        Parent root = loader.load();
        ClinicChoice clinicChoice = loader.getController();
        clinicChoice.setClinicTxt(medicalChoice);
        Stage stage = (Stage)((Node) e.getSource()).getScene().getWindow();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();

        btnProceed1.setDisable(true);
    }

    public void selectDental(ActionEvent e){
        btnMental.setStyle("-fx-opacity: 0.5;");

        btnDental.setStyle("-fx-opacity: 1;" + "-fx-border-color: black;"+"-fx-background-color:  #68b0ab;"+"-fx-background-radius: 30;" + "-fx-border-radius: 20;" + "-fx-border-width: 5;" + "-fx-border-color: white");
        medicalChoice = "Dental";

        btnProceed1.setDisable(false);

    }

    public void selectMental(){
        btnMental.setStyle("-fx-opacity: 1;" + "-fx-border-color: black;"+"-fx-background-color:  #68b0ab;"+"-fx-background-radius: 30;" + "-fx-border-radius: 20;" + "-fx-border-width: 5;" + "-fx-border-color: white");


        btnDental.setStyle("-fx-opacity: 0.5");
        medicalChoice = "Mental";

        btnProceed1.setDisable(false);

    }

    public void clickBack(ActionEvent e) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("SignInPage.fxml"));
        Parent root = loader.load();
        Stage stage = (Stage) ((Node) e.getSource()).getScene().getWindow();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }


}
