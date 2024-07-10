package SanMigLight_MedicalService;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;

import javafx.scene.control.ButtonType;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.WindowEvent;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class Confirmation implements Initializable {
    @FXML private Label txtname, txtage,txtgender,txtstatus,
            txtreligion,txtbirth,txtcitizenship,txtcontactnumber,txtemail;
    @FXML private Label txtDoctor, txtClinic, txtContactNum, txtAddress, txtService, txtPrice;
    @FXML private Button btnProceed, btnEdit;
    @FXML private ImageView iconConfirmation;
    @FXML public  Label serviceAvailed;


    @FXML
    public void initialize(URL url, ResourceBundle resourceBundle) {
        File logo = new File("Images/logo.png");
        Image logoimage = new Image(logo.toURI().toString());
        iconConfirmation.setImage(logoimage);

        txtname.setText("Name: " + SignInController.name);
        txtage.setText("Age: " + SignInController.age);
        txtbirth.setText("Date of Birth:" + SignInController.birthDate);
        txtreligion.setText("Religion: " + SignInController.religion);
        txtcitizenship.setText("Citizenship: " + SignInController.citizenship);
        txtemail.setText("Email: " + SignInController.email);
        txtstatus.setText("Civil Status: " + SignInController.status);
        txtgender.setText("Gender: " + SignInController.gender);
        txtcontactnumber.setText("Contact Number: " + SignInController.contactNum);


        txtDoctor.setText(ClinicChoice.selectedDoctor);
        txtClinic.setText("Clinic: " + ClinicChoice.selectedClinic);
        txtContactNum.setText("Contact Number: " + ClinicChoice.selectedContactNum);
        txtAddress.setText("Location: " + ClinicChoice.selectedAddress);
        txtService.setText("Service: " + ServiceChoice.selectedService);
        txtPrice.setText("Estimated Price: " + ServiceChoice.selectedPrice);
    }



    public void editInfo(ActionEvent e) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("EditInfo.fxml"));
        Parent root = loader.load();
        EditInfo editInfo= loader.getController();
        editInfo.setData(SignInController.lastName,SignInController.firstName,SignInController.middleName,SignInController.age,SignInController.religion,SignInController.citizenship,SignInController.email,SignInController.status,SignInController.gender,SignInController.birthDate,SignInController.contactNum);
        Stage stage = (Stage)((Node) e.getSource()).getScene().getWindow();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();

    }

    public void Proceed(ActionEvent e) throws IOException {

        Parent root = FXMLLoader.load(getClass().getResource("PrintService.fxml"));
        Stage stage = new Stage();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.initModality(Modality.APPLICATION_MODAL);
        stage.show();

    }

    public void clickBack(ActionEvent e) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("ServiceChoice.fxml"));
        Parent root = loader.load();
        ServiceChoice serviceChoice = loader.getController();
        serviceChoice.setServiceTxt(ClinicChoice.selectedClinic);
        Stage stage = (Stage)((Node) e.getSource()).getScene().getWindow();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    public void exitProgram(ActionEvent e){
        Platform.exit();
    }






}
