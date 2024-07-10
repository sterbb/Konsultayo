package SanMigLight_MedicalService;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class ServiceChoice implements Initializable {

    @FXML public Button btnService1, btnService2, btnService3, btnService4, btnService5;
    @FXML private Label txtTitle;
    @FXML private ImageView iconService;


    private String [][] dentalservices= {{"Cosmetics","Dental Implants","Endodontics","Orthodontics","Periodontal"},
            {"General Dentistry", "Preventive Dentistry", "Cosmetic Dentistry", "Restorative Dentistry", "Dentistry for Children"},
            {"General Dentistry", "Orthodontics", "Dental Implants", "Cosmetic Dentistry", "Prosthodontics"}};
    private String[][] dentalprices  = {{"Php 11,000","Php 51,000","Php 7000","Php 4,000 to Php 40,000", "Price varies"},
            {"Php 4,000 to Php 20,000","Php 3,500","Php 45,000 to Php 120,000","Php 3,500 to Php 7,500","Php 35,000"},
            {"Php 4,000 to Php 20,000","Php 4,000","Php 40,000 to Php 95,000","Php 15,000 to Php 60,000","Php 30,000"}};

    private String[][] mentalservices = {{"Psychotherapy", "Family/ Couples Therapy", "Stress & Anxiety Management", "Depression & Psychiatric Management", "Annulment Case"},
            {"Psychotherapy", "Medication", "Hospitalization", "Support Group", "Complementary & Alternative Medicine"},
            {"Counseling and Psychotherapy", "Pediatric Speech and Language Therapy", "Neuropsychological Evaluation", "Pediatric Speech and Language Evaluation", "Training Courses and Workshops"}};
    private String [][] mentalprices = {{"Php 8,000","Php 5,000","Php 3,000 to Php 5,000","Php 3,500 to Php 7,000","Php 2,000"},
            {"Php 7,500","Php 3,000","Php 500 to Php 1,000","Php 1,500","Php 2,000"},
            {"Php 9,000","Php 7,500","Php 10,000","Php 8,500","Php 5,000"}};

    public static String selectedService, selectedPrice;


    public void initialize(URL url, ResourceBundle resourceBundle){
        File logo = new File("Images/logo.png");
        Image logoimage = new Image(logo.toURI().toString());
        iconService.setImage(logoimage);

        if (MedicalChoice.medicalChoice == "Dental") {

            Image dental = new Image(getClass().getResourceAsStream("Images/dental.png"));
            ImageView view = new ImageView(dental);
            btnService1.setGraphic(view);

            Image dental2 = new Image(getClass().getResourceAsStream("Images/dental.png"));
            ImageView view2 = new ImageView(dental2);
            btnService2.setGraphic(view2);

            Image dental3 = new Image(getClass().getResourceAsStream("Images/dental.png"));
            ImageView view3 = new ImageView(dental3);
            btnService3.setGraphic(view3);

            Image dental4 = new Image(getClass().getResourceAsStream("Images/dental.png"));
            ImageView view4 = new ImageView(dental4);
            btnService4.setGraphic(view4);

            Image dental5 = new Image(getClass().getResourceAsStream("Images/dental.png"));
            ImageView view5 = new ImageView(dental5);
            btnService5.setGraphic(view5);
        }else {
            Image mental = new Image(getClass().getResourceAsStream("Images/mental.png"));
            ImageView view = new ImageView(mental);
            btnService1.setGraphic(view);

            Image mental2 = new Image(getClass().getResourceAsStream("Images/mental.png"));
            ImageView view2 = new ImageView(mental2);
            btnService2.setGraphic(view2);

            Image mental3 = new Image(getClass().getResourceAsStream("Images/mental.png"));
            ImageView view3 = new ImageView(mental3);
            btnService3.setGraphic(view3);

            Image mental4 = new Image(getClass().getResourceAsStream("Images/mental.png"));
            ImageView view4 = new ImageView(mental4);
            btnService4.setGraphic(view4);

            Image mental5 = new Image(getClass().getResourceAsStream("Images/mental.png"));
            ImageView view5 = new ImageView(mental5);
            btnService5.setGraphic(view5);
        }
    }




    public void setServiceTxt(String service){
        if (service == "Dante' Care Center"){
            btnService1.setText(dentalservices[0][0]);
            btnService2.setText(dentalservices[0][1]);
            btnService3.setText(dentalservices[0][2]);
            btnService4.setText(dentalservices[0][3]);
            btnService5.setText(dentalservices[0][4]);
        }else if(service == "City Smiles Clinic"){
            btnService1.setText(dentalservices[1][0]);
            btnService2.setText(dentalservices[1][1]);
            btnService3.setText(dentalservices[1][2]);
            btnService4.setText(dentalservices[1][3]);
            btnService5.setText(dentalservices[1][4]);
        }else if(service == "Smile Avenue Dental Clinic"){
            btnService1.setText(dentalservices[2][0]);
            btnService2.setText(dentalservices[2][1]);
            btnService3.setText(dentalservices[2][2]);
            btnService4.setText(dentalservices[2][3]);
            btnService5.setText(dentalservices[2][4]);
        }else if(service == "Bacolod City Mental Health Care Center"){
            btnService1.setText(mentalservices[0][0]);
            btnService2.setText(mentalservices[0][1]);
            btnService3.setText(mentalservices[0][2]);
            btnService4.setText(mentalservices[0][3]);
            btnService5.setText(mentalservices[0][4]);
            txtTitle.setText("Available Mental Health Services");
        }else if(service == "Bacolod Our Lady of Mercy Hospital"){
            btnService1.setText(mentalservices[1][0]);
            btnService2.setText(mentalservices[1][1]);
            btnService3.setText(mentalservices[1][2]);
            btnService4.setText(mentalservices[1][3]);
            btnService5.setText(mentalservices[1][4]);
            txtTitle.setText("Available Mental Health Services");
        }else{
            btnService1.setText(mentalservices[2][0]);
            btnService2.setText(mentalservices[2][1]);
            btnService3.setText(mentalservices[2][2]);
            btnService4.setText(mentalservices[2][3]);
            btnService5.setText(mentalservices[2][4]);
            txtTitle.setText("Available Mental Health Services");
        }
    }

    public void goBack(ActionEvent e) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("ClinicChoice.fxml"));
        Parent root = loader.load();
        ClinicChoice clinicChoice = loader.getController();
        clinicChoice.setClinicTxt(MedicalChoice.medicalChoice);
        Stage stage = (Stage) ((Node) e.getSource()).getScene().getWindow();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }




    public void ServiceProceed1(ActionEvent e) throws IOException {
        if(ClinicChoice.selectedClinic == "Dante' Care Center"){
            selectedPrice = dentalprices[0][0];
        }else if(ClinicChoice.selectedClinic == "City Smiles Clinic"){
            selectedPrice = dentalprices[1][0];
        }else if(ClinicChoice.selectedClinic == "Smile Avenue Dental Clinic"){
            selectedPrice = dentalprices[2][0];
        }else if(ClinicChoice.selectedClinic == "Bacolod City Mental Health Care Center"){
            selectedPrice = mentalprices[0][0];
        }else if(ClinicChoice.selectedClinic == "Bacolod Our Lady of Mercy Hospital"){
            selectedPrice = mentalprices[1][0];
        }else{
            selectedPrice = mentalprices[2][0];
        }
        selectedService = btnService1.getText();

        Parent root = FXMLLoader.load(getClass().getResource("Confirm.fxml"));
        Stage stage = new Stage();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.initModality(Modality.APPLICATION_MODAL);
        stage.showAndWait();

        if(Confirm.nxtproceed == true){

            FXMLLoader loader = new FXMLLoader(getClass().getResource("Confirmation.fxml"));
            Parent proot = loader.load();
            Confirmation confirmation = loader.getController();

            if(MedicalChoice.medicalChoice == "Mental"){
                confirmation.serviceAvailed.setText("Mental Service Availed");
            }
            Stage pstage = (Stage) ((Node) e.getSource()).getScene().getWindow();
            Scene pscene = new Scene(proot);
            pstage.setScene(pscene);
            pstage.show();
        }


    }

    public void ServiceProceed2(ActionEvent e) throws IOException {
        if(ClinicChoice.selectedClinic == "Dante' Care Center"){
            selectedPrice = dentalprices[0][1];
        }else if(ClinicChoice.selectedClinic == "City Smiles Clinic"){
            selectedPrice = dentalprices[1][1];
        }else if(ClinicChoice.selectedClinic == "Smile Avenue Dental Clinic"){
            selectedPrice = dentalprices[2][1];
        }else if(ClinicChoice.selectedClinic == "Bacolod City Mental Health Care Center"){
            selectedPrice = mentalprices[0][1];
        }else if(ClinicChoice.selectedClinic == "Bacolod Our Lady of Mercy Hospital"){
            selectedPrice = mentalprices[1][1];
        }else{
            selectedPrice = mentalprices[2][1];
        }
        selectedService = btnService2.getText();
        Parent root = FXMLLoader.load(getClass().getResource("Confirm.fxml"));
        Stage stage = new Stage();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.initModality(Modality.APPLICATION_MODAL);
        stage.showAndWait();

        if(Confirm.nxtproceed == true){

            FXMLLoader loader = new FXMLLoader(getClass().getResource("Confirmation.fxml"));
            Parent proot = loader.load();
            Confirmation confirmation = loader.getController();

            if(MedicalChoice.medicalChoice == "Mental"){
                confirmation.serviceAvailed.setText("Mental Service Availed");
            }
            Stage pstage = (Stage) ((Node) e.getSource()).getScene().getWindow();
            Scene pscene = new Scene(proot);
            pstage.setScene(pscene);
            pstage.show();
        }
    }

    public void ServiceProceed3(ActionEvent e) throws IOException {
        if(ClinicChoice.selectedClinic == "Dante' Care Center"){
            selectedPrice = dentalprices[0][2];
        }else if(ClinicChoice.selectedClinic == "City Smiles Clinic"){
            selectedPrice = dentalprices[1][2];
        }else if(ClinicChoice.selectedClinic == "Smile Avenue Dental Clinic"){
            selectedPrice = dentalprices[2][2];
        }else if(ClinicChoice.selectedClinic == "Bacolod City Mental Health Care Center"){
            selectedPrice = mentalprices[0][2];
        }else if(ClinicChoice.selectedClinic == "Bacolod Our Lady of Mercy Hospital"){
            selectedPrice = mentalprices[1][2];
        }else{
            selectedPrice = mentalprices[2][2];
        }
        selectedService = btnService3.getText();
        Parent root = FXMLLoader.load(getClass().getResource("Confirm.fxml"));
        Stage stage = new Stage();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.initModality(Modality.APPLICATION_MODAL);
        stage.showAndWait();

        if(Confirm.nxtproceed == true){

            FXMLLoader loader = new FXMLLoader(getClass().getResource("Confirmation.fxml"));
            Parent proot = loader.load();
            Confirmation confirmation = loader.getController();

            if(MedicalChoice.medicalChoice == "Mental"){
                confirmation.serviceAvailed.setText("Mental Service Availed");
            }
            Stage pstage = (Stage) ((Node) e.getSource()).getScene().getWindow();
            Scene pscene = new Scene(proot);
            pstage.setScene(pscene);
            pstage.show();
        }
    }

    public void ServiceProceed4(ActionEvent e) throws IOException {
        if(ClinicChoice.selectedClinic == "Dante' Care Center"){
            selectedPrice = dentalprices[0][3];
        }else if(ClinicChoice.selectedClinic == "City Smiles Clinic"){
            selectedPrice = dentalprices[1][3];
        }else if(ClinicChoice.selectedClinic == "Smile Avenue Dental Clinic"){
            selectedPrice = dentalprices[2][3];
        }else if(ClinicChoice.selectedClinic == "Bacolod City Mental Health Care Center"){
            selectedPrice = mentalprices[0][3];
        }else if(ClinicChoice.selectedClinic == "Bacolod Our Lady of Mercy Hospital"){
            selectedPrice = mentalprices[1][3];
        }else{
            selectedPrice = mentalprices[2][3];
        }
        selectedService = btnService4.getText();
        Parent root = FXMLLoader.load(getClass().getResource("Confirm.fxml"));
        Stage stage = new Stage();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.initModality(Modality.APPLICATION_MODAL);
        stage.showAndWait();

        if(Confirm.nxtproceed == true){

            FXMLLoader loader = new FXMLLoader(getClass().getResource("Confirmation.fxml"));
            Parent proot = loader.load();
            Confirmation confirmation = loader.getController();

            if(MedicalChoice.medicalChoice == "Mental"){
                confirmation.serviceAvailed.setText("Mental Service Availed");
            }
            Stage pstage = (Stage) ((Node) e.getSource()).getScene().getWindow();
            Scene pscene = new Scene(proot);
            pstage.setScene(pscene);
            pstage.show();
        }
    }

    public void ServiceProceed5(ActionEvent e) throws IOException {
        if(ClinicChoice.selectedClinic == "Dante' Care Center"){
            selectedPrice = dentalprices[0][4];
        }else if(ClinicChoice.selectedClinic == "City Smiles Clinic"){
            selectedPrice = dentalprices[1][4];
        }else if(ClinicChoice.selectedClinic == "Smile Avenue Dental Clinic"){
            selectedPrice = dentalprices[2][4];
        }else if(ClinicChoice.selectedClinic == "Bacolod City Mental Health Care Center"){
            selectedPrice = mentalprices[0][4];
        }else if(ClinicChoice.selectedClinic == "Bacolod Our Lady of Mercy Hospital"){
            selectedPrice = mentalprices[1][4];
        }else{
            selectedPrice = mentalprices[2][4];
        }
        selectedService = btnService5.getText();
        Parent root = FXMLLoader.load(getClass().getResource("Confirm.fxml"));
        Stage stage = new Stage();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.initModality(Modality.APPLICATION_MODAL);
        stage.showAndWait();

        if(Confirm.nxtproceed == true){

            FXMLLoader loader = new FXMLLoader(getClass().getResource("Confirmation.fxml"));
            Parent proot = loader.load();
            Confirmation confirmation = loader.getController();

            if(MedicalChoice.medicalChoice == "Mental"){
                confirmation.serviceAvailed.setText("Mental Service Availed");
            }
            Stage pstage = (Stage) ((Node) e.getSource()).getScene().getWindow();
            Scene pscene = new Scene(proot);
            pstage.setScene(pscene);
            pstage.show();
        }
    }
}
