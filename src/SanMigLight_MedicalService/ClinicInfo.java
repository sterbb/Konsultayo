package SanMigLight_MedicalService;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

import java.io.File;
import java.net.URL;
import java.util.ResourceBundle;

public class ClinicInfo implements Initializable {

    @FXML
    private Label clinicDoctor, clinicContact, clinicAddress, Clinic;
    @FXML
    private ImageView iconCI;
    @FXML
    Button btnBack;

    public void initialize(URL url, ResourceBundle resourceBundle){
        File logo = new File("Images/logo.png");
        Image CIimage = new Image(logo.toURI().toString());
        iconCI.setImage(CIimage);

        ClinicChoice clinicChoice = new ClinicChoice();

        if(MedicalChoice.medicalChoice.equals("Dental")){
            if (ClinicChoice.selectedClinic == "Dante' Care Center"){
                Clinic.setText(clinicChoice.dentalvenuelist[0]);
                clinicDoctor.setText(clinicChoice.dentist[0]);
                clinicContact.setText(clinicChoice.medicalcontactnum[0][0]);
                clinicAddress.setText(clinicChoice.dentaladdress[0]);
            }else if(ClinicChoice.selectedClinic == "City Smiles Clinic"){
                Clinic.setText(clinicChoice.dentalvenuelist[1]);
                clinicDoctor.setText(clinicChoice.dentist[1]);
                clinicContact.setText(clinicChoice.medicalcontactnum[0][1]);
                clinicAddress.setText(clinicChoice.dentaladdress[1]);
            }else{
                Clinic.setText(clinicChoice.dentalvenuelist[2]);
                clinicDoctor.setText(clinicChoice.dentist[2]);
                clinicContact.setText(clinicChoice.medicalcontactnum[0][2]);
                clinicAddress.setText(clinicChoice.dentaladdress[2]);
            }
        }else{
            switch (ClinicChoice.selectedClinic){
                case "Bacolod City Mental Health Care Center" -> {
                    Clinic.setText(clinicChoice.mentalvenuelist[0]);
                    clinicDoctor.setText(clinicChoice.mentaldoctors[0]);
                    clinicContact.setText(clinicChoice.medicalcontactnum[1][0]);
                    clinicAddress.setText(clinicChoice.mentaladdress[0]);
                }
                case "Bacolod Our Lady of Mercy Hospital" -> {
                    Clinic.setText(clinicChoice.mentalvenuelist[1]);
                    clinicDoctor.setText(clinicChoice.mentaldoctors[1]);
                    clinicContact.setText(clinicChoice.medicalcontactnum[1][1]);
                    clinicAddress.setText(clinicChoice.mentaladdress[1]);
                }
                case "Talking Turns Therapy Clinic" -> {
                    Clinic.setText(clinicChoice.mentalvenuelist[2]);
                    clinicDoctor.setText(clinicChoice.mentaldoctors[2]);
                    clinicContact.setText(clinicChoice.medicalcontactnum[1][2]);
                    clinicAddress.setText(clinicChoice.mentaladdress[2]);
                }
            }
        }
    }

    public void goBack(){
        Stage stage = (Stage) btnBack.getScene().getWindow();
        stage.close();
    }

}
