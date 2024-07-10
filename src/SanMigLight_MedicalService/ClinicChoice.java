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

public class ClinicChoice implements Initializable {

    @FXML private Button btnProceed2, btnClinic1, btnClinic2,btnClinic3;
    @FXML private Label txtTitle;
    @FXML private ImageView iconClinic;

    public String[][] medicalcontactnum = {{"(034) 435 6293","0908 894 3569","(034) 435 2548"}, {"(043) 446 0474", "(033) 434 1031","0938 265 4639"}};

    public String[] dentalvenuelist={"Dante' Care Center","City Smiles Clinic","Smile Avenue Dental Clinic"};
    public String[] dentist={"Dentist: Dr. Jan Michael D. Dacles","Dentist: Dr.Paul Brian S. Mendez","Dentist: Dr. Regina Lao-Hidalgo"};
    public String[] dentaladdress = {"Capitol Shopping Center, 60 Narra Ave, Barangay Villa Monte, Bacolod, 6100 Negros Occidental",
            "Central City Walk, Robinsons Place, Bacolod City, Negros Occidental", "Burgos St. Cor San Juan St., Bacolod, 6100"};


    public String[] mentalvenuelist = {"Bacolod City Mental Health Care Center", "Bacolod Our Lady of Mercy Hospital", "Talking Turns Therapy Clinic"};
    public String[] mentaldoctors = {"Doctor: Marilou T. Villanueva", "Doctor: Dr. Mae Linda Ruiz De Luzuriaga", "Doctor: Raegan Joseph T. Villanueva"};
    public String[]mentaladdress = {"Paglaum Street, Bacolod City, Negros Occidental","Bacolod Our Lady of Mercy Specialty Hospital, Erocero, Mandalagan, Bacolod City",
            "JDI bldg., Galo St, Bacolod, 6100 Negros Occidental"};

    public static String selectedClinic, selectedDoctor, selectedAddress, selectedContactNum;


    public void initialize(URL url, ResourceBundle resourceBundle){
        File logo = new File("Images/logo.png");
        Image logoimage = new Image(logo.toURI().toString());
        iconClinic.setImage(logoimage);

        Image img1 = new Image(getClass().getResourceAsStream("Images/hospital1.png"));
        ImageView view = new ImageView(img1);
        btnClinic1.setGraphic(view);

        Image img2 = new Image(getClass().getResourceAsStream("Images/hospital3.png"));
        ImageView view2 = new ImageView(img2);
        btnClinic2.setGraphic(view2);

        Image img3 = new Image(getClass().getResourceAsStream("Images/hospital4.png"));
        ImageView view3 = new ImageView(img3);
        btnClinic3.setGraphic(view3);

    }

    public void selectClinic1(ActionEvent e)throws IOException{
        if (MedicalChoice.medicalChoice == "Dental"){
            selectedDoctor = dentist[0];
            selectedAddress = dentaladdress[0];
            selectedContactNum = medicalcontactnum [0][0];
            selectedClinic = btnClinic1.getText();
            Parent root = FXMLLoader.load(getClass().getResource("ClinicInfo.fxml"));
            Stage stage = new Stage();
            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.initModality(Modality.APPLICATION_MODAL);
            stage.show();
        }else{
            selectedDoctor = mentaldoctors[0];
            selectedAddress = mentaladdress[0];
            selectedContactNum = medicalcontactnum [1][0];
            selectedClinic = btnClinic1.getText();
            Parent root = FXMLLoader.load(getClass().getResource("ClinicInfo.fxml"));
            Stage stage = new Stage();
            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.initModality(Modality.APPLICATION_MODAL);
            stage.show();
        }
        btnClinic1.setStyle("-fx-opacity: 1;" + "-fx-border-color: black;"+"-fx-background-color:  #68b0ab;"+"-fx-background-radius: 30;" + "-fx-border-radius: 20;" + "-fx-border-width: 5;" + "-fx-border-color: white");
        btnClinic2.setStyle("-fx-opacity: 0.5;");
        btnClinic3.setStyle("-fx-opacity: 0.5;");
        btnProceed2.setDisable(false);
    }
    public void selectClinic2(ActionEvent e)throws IOException{
        if (MedicalChoice.medicalChoice == "Dental"){
            selectedDoctor = dentist[1];
            selectedAddress = dentaladdress[1];
            selectedContactNum = medicalcontactnum [0][1];
            selectedClinic = btnClinic2.getText();
            Parent root = FXMLLoader.load(getClass().getResource("ClinicInfo.fxml"));
            Stage stage = new Stage();
            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.initModality(Modality.APPLICATION_MODAL);
            stage.show();
        }else{
            selectedDoctor = mentaldoctors[1];
            selectedAddress = mentaladdress[1];
            selectedContactNum = medicalcontactnum [1][1];
            selectedClinic = btnClinic2.getText();
            Parent root = FXMLLoader.load(getClass().getResource("ClinicInfo.fxml"));
            Stage stage = new Stage();
            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.initModality(Modality.APPLICATION_MODAL);
            stage.show();
        }
        btnClinic1.setStyle("-fx-opacity: 0.5;");
        btnClinic2.setStyle("-fx-opacity: 1;" + "-fx-border-color: black;"+"-fx-background-color:  #68b0ab;"+"-fx-background-radius: 30;" + "-fx-border-radius: 20;" + "-fx-border-width: 5;" + "-fx-border-color: white");
        btnClinic3.setStyle("-fx-opacity: 0.5;");
        btnProceed2.setDisable(false);
    }
    public void selectClinic3(ActionEvent e)throws IOException{
        if (MedicalChoice.medicalChoice == "Dental"){
            selectedDoctor = dentist[2];
            selectedAddress = dentaladdress[2];
            selectedContactNum = medicalcontactnum [0][2];
            selectedClinic = btnClinic3.getText();
            Parent root = FXMLLoader.load(getClass().getResource("ClinicInfo.fxml"));
            Stage stage = new Stage();
            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.initModality(Modality.APPLICATION_MODAL);
            stage.show();
        }else{
            selectedDoctor = mentaldoctors[2];
            selectedAddress = mentaladdress[2];
            selectedContactNum = medicalcontactnum [1][2];
            selectedClinic = btnClinic3.getText();
            Parent root = FXMLLoader.load(getClass().getResource("ClinicInfo.fxml"));
            Stage stage = new Stage();
            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.initModality(Modality.APPLICATION_MODAL);
            stage.show();
        }
        btnClinic1.setStyle("-fx-opacity: 0.5;");
        btnClinic2.setStyle("-fx-opacity: 0.5;");
        btnClinic3.setStyle("-fx-opacity: 1;" + "-fx-border-color: black;"+"-fx-background-color:  #68b0ab;"+"-fx-background-radius: 30;" + "-fx-border-radius: 20;" + "-fx-border-width: 5;" + "-fx-border-color: white");
        btnProceed2.setDisable(false);
    }

    public void setClinicTxt(String clinic){
        if(clinic == "Dental"){
            btnClinic1.setText(dentalvenuelist[0]);
            btnClinic2.setText(dentalvenuelist[1]);
            btnClinic3.setText(dentalvenuelist[2]);

        }else{
            btnClinic1.setText(mentalvenuelist[0]);
            btnClinic2.setText(mentalvenuelist[1]);
            btnClinic3.setText(mentalvenuelist[2]);
            txtTitle.setText("Available Mental Health Clinics");

        }
    }




    public void goBack(ActionEvent e) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("MedicalChoice.fxml"));
        Parent root = loader.load();
        Stage stage = (Stage) ((Node) e.getSource()).getScene().getWindow();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();

    }

    public void Proceed(ActionEvent e) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("ServiceChoice.fxml"));
        Parent root = loader.load();
        ServiceChoice serviceChoice = loader.getController();
        serviceChoice.setServiceTxt(selectedClinic);
        Stage stage = (Stage)((Node) e.getSource()).getScene().getWindow();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();

    }
}
