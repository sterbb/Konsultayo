package SanMigLight_MedicalService;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

import javax.swing.*;
import java.io.*;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ResourceBundle;

import static java.nio.file.StandardOpenOption.CREATE;


public class PrintService implements Initializable {
    @FXML private Button btnPrint;
    @FXML private Button btnCancel;
    @FXML private ImageView iconPrint;

    public void initialize(URL url, ResourceBundle resourceBundle) {
        File logo = new File("Images/logo.png");
        Image logoimage = new Image(logo.toURI().toString());
        iconPrint.setImage(logoimage);
    }


    private static String[] printServiceAvailed = {MedicalChoice.medicalChoice+" Service Information",
            ClinicChoice.selectedDoctor,
            "Clinic: " + ClinicChoice.selectedClinic,
            "Contact Number: " + ClinicChoice.selectedContactNum,
            "Location: " + ClinicChoice.selectedAddress,
            "Service: " + ServiceChoice.selectedService,
            "Estimated Price: " + ServiceChoice.selectedPrice,
            "\n\n",

            "Patient Information",
            "Name: "+ SignInController.name,
            "Age: " + SignInController.age,
            "Date of Birth:" + SignInController.birthDate,
            "Religion: " + SignInController.religion,
            "Citizenship: " + SignInController.citizenship,
            "Email: " + SignInController.email,
            "Civil Status: " + SignInController.status,
            "Gender: " + SignInController.gender,
            "Contact Number: " + SignInController.contactNum,
            "\n\n\n",
            "Created "+LocalDate.now()+"  "+LocalTime.now()
            };


    public void printService(ActionEvent e) throws IOException {
        Path path = Paths.get("Admission Slip/"+SignInController.name+"_"+SignInController.birthDate+".txt");
        if(Files.exists(path)){
            JOptionPane.showMessageDialog(null, "File already exists", "File existing", JOptionPane.INFORMATION_MESSAGE);

        }else {

            OutputStream outputStream = new BufferedOutputStream(Files.newOutputStream(path, CREATE));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(outputStream));

            for (String data :printServiceAvailed) {
                bw.write(data);
                bw.write("\n");


            }
            bw.flush();
            bw.close();
            JOptionPane.showMessageDialog(null, "File successfully created", "File existing", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    public void cancelPrint(ActionEvent e){
        Stage stage = (Stage) btnCancel.getScene().getWindow();
        stage.close();
    }
}
