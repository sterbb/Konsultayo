package SanMigLight_MedicalService;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;


import javax.swing.*;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class SignInController implements Initializable {

    @FXML private TextField txtLastname;
    @FXML private TextField txtFirstname;
    @FXML private TextField txtMiddlename;
    @FXML private TextField txtAge;
    @FXML private TextField txtReligion;
    @FXML private TextField txtCitizenship;
    @FXML private TextField txtEmail;
    @FXML private TextField txtContactNum;
    @FXML private ChoiceBox choiceStatus;
    @FXML private ChoiceBox choiceGender;
    @FXML private DatePicker dateBirth;
    @FXML private Button btnProceed;

    public static String  lastName, firstName, middleName, name , age , contactNum, religion, citizenship, email, status, gender, birthDate;
    ObservableList<String> civilStatusList = FXCollections.observableArrayList("Single","Married","Widowed","Divorced");
    ObservableList<String> genderList = FXCollections.observableArrayList("Male","Female");

    private boolean proceed;

    @FXML private ImageView loginview, loginicon;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle){
        File loginpage = new File("Images/LoginPage.png");
        Image loginimage = new Image(loginpage.toURI().toString());
        loginview.setImage(loginimage);

        File  imageicon = new File("Images/personalicon.png");
        Image iconimage = new Image(imageicon.toURI().toString());
        loginicon.setImage(iconimage);

        choiceStatus.setItems(civilStatusList);
        choiceGender.setItems(genderList);

    }



    public void userInfo(String lastname,String firstname,String middlename, String Age, String Religion, String Citizenship, String Email, String Status, String Gender, String BirthDate,String Contactnum){
        name = lastname+", "+ firstname+ " "+ middlename;
        age =String.valueOf(Age);
        religion=Religion;
        citizenship = Citizenship;
        email=Email;
        status = Status;
        gender = Gender;
        birthDate=BirthDate;
        contactNum=Contactnum;
        lastName = lastname;
        firstName = firstname;
        middleName = middlename;

    }

    public void userInfo(String lastname,String firstname,String middlename, String Age, String Religion, String Citizenship, String Status, String Gender, String BirthDate,String Contactnum){
        name = lastname+", "+ firstname+ " "+ middlename;
        age =String.valueOf(Age);
        religion=Religion;
        citizenship = Citizenship;
        email="N/A";
        status = Status;
        gender = Gender;
        birthDate=BirthDate;
        contactNum=Contactnum;
        lastName = txtLastname.getText();
        firstName = txtFirstname.getText();
        middleName = txtMiddlename.getText();

    }

    public void Proceed(ActionEvent e) throws IOException {

        proceed = true;

        try{
        userInfo(txtLastname.getText(), txtFirstname.getText(), txtMiddlename.getText(), txtAge.getText(), txtReligion.getText(),
                txtCitizenship.getText(), txtEmail.getText(), choiceStatus.getValue().toString(), choiceGender.getValue().toString(), dateBirth.getValue().toString(),txtContactNum.getText());

            if(txtLastname.getText().trim().isEmpty() || txtFirstname.getText().trim().isEmpty() || txtMiddlename.getText().trim().isEmpty() ||
                    txtAge.getText().trim().isEmpty() || txtReligion.getText().trim().isEmpty() || txtCitizenship.getText().trim().isEmpty() ||
                    txtContactNum.getText().trim().isEmpty()){
                JOptionPane.showMessageDialog(null,"Sorry, incomplete data!","ERROR",JOptionPane.WARNING_MESSAGE);
            }else if(txtEmail.getText().trim().isEmpty()){


                userInfo(txtLastname.getText(), txtFirstname.getText(), txtMiddlename.getText(), txtAge.getText(), txtReligion.getText(),
                        txtCitizenship.getText(),choiceStatus.getValue().toString(), choiceGender.getValue().toString(), dateBirth.getValue().toString(),txtContactNum.getText());

                String lName = txtLastname.getText().toLowerCase().trim();
                String chlName = lName.replaceAll("\\s", "");
                char[] charArray = chlName.toCharArray();
                String fName = txtFirstname.getText().toLowerCase().trim();
                String chfName = fName.replaceAll("\\s", "");
                char[] charArray1 = chfName.toCharArray();
                String mName = txtMiddlename.getText().toLowerCase().trim();
                String chmName = mName.replaceAll("\\s", "");
                char[] charArray2 = chmName.toCharArray();
                String citizenship = txtCitizenship.getText().toLowerCase().trim();
                String chcitizenship = citizenship.replaceAll("\\s", "");
                char[] charArray3 = chcitizenship.toCharArray();
                String religion = txtReligion.getText().toLowerCase().trim();
                String chreligion= religion.replaceAll("\\s", "");
                char[] charArray4 = chreligion.toCharArray();


                for (int i = 0; i < charArray.length; i++) {
                    char ch = charArray[i];

                    if (!(ch >= 'a' && ch <= 'z')) {
                        proceed = false;
                        break;
                    }
                }
                for (int i = 0; i < charArray1.length; i++) {
                    char ch1 = charArray1[i];

                    if (!(ch1 >= 'a' && ch1 <= 'z')) {
                        proceed = false;
                        break;
                    }
                }

                for (int i = 0; i < charArray2.length; i++) {

                    char ch2 = charArray2[i];


                    if (!(ch2 >= 'a' && ch2 <= 'z')) {
                        proceed = false;
                        break;
                    }
                }

                for (int i = 0; i < charArray3.length; i++) {
                    char ch3 = charArray3[i];

                    if (!(ch3 >= 'a' && ch3 <= 'z')) {
                        proceed = false;
                        break;
                    }
                }

                for (int i = 0; i < charArray4.length; i++) {
                    char ch4 = charArray4[i];
                    if (!(ch4 >= 'a' && ch4 <= 'z')) {
                        proceed = false;
                        break;
                    }
                }

                if (!proceed) {
                    JOptionPane.showMessageDialog(null, "Invalid input", "ERROR", JOptionPane.WARNING_MESSAGE);
                } else{

                    try {
                        int intage = Integer.parseInt(txtAge.getText());
                        double doublecontact = Double.parseDouble(txtContactNum.getText());

                        FXMLLoader loader = new FXMLLoader(getClass().getResource("MedicalChoice.fxml"));
                        Parent root = loader.load();
                        MedicalChoice medicalChoice = loader.getController();
                        Stage stage = (Stage) ((Node) e.getSource()).getScene().getWindow();
                        Scene scene = new Scene(root);
                        stage.setScene(scene);
                        stage.show();
                    } catch (Exception exception) {
                        JOptionPane.showMessageDialog(null, "Invalid input", "ERROR", JOptionPane.WARNING_MESSAGE);
                    }

                }
            }


            else {

                String lName = txtLastname.getText().toLowerCase().trim();
                String chlName = lName.replaceAll("\\s", "");
                char[] charArray = chlName.toCharArray();
                String fName = txtFirstname.getText().toLowerCase().trim();
                String chfName = fName.replaceAll("\\s", "");
                char[] charArray1 = chfName.toCharArray();
                String mName = txtMiddlename.getText().toLowerCase().trim();
                String chmName = mName.replaceAll("\\s", "");
                char[] charArray2 = chmName.toCharArray();
                String citizenship = txtCitizenship.getText().toLowerCase().trim();
                String chcitizenship = citizenship.replaceAll("\\s", "");
                char[] charArray3 = chcitizenship.toCharArray();
                String religion = txtReligion.getText().toLowerCase().trim();
                String chreligion= religion.replaceAll("\\s", "");
                char[] charArray4 = chreligion.toCharArray();


                for (int i = 0; i < charArray.length; i++) {
                    char ch = charArray[i];

                    if (!((ch >= 'a' && ch <= 'z'))) {
                        proceed = false;
                        break;
                    }
                }
                for (int i = 0; i < charArray1.length; i++) {
                    char ch1 = charArray1[i];

                    if (!(ch1 >= 'a' && ch1 <= 'z')) {
                        proceed = false;
                        break;
                    }
                }

                for (int i = 0; i < charArray2.length; i++) {

                    char ch2 = charArray2[i];


                    if (!(ch2 >= 'a' && ch2 <= 'z')) {
                        proceed = false;
                        break;
                    }
                }

                for (int i = 0; i < charArray3.length; i++) {
                    char ch3 = charArray3[i];

                    if (!(ch3 >= 'a' && ch3 <= 'z')) {
                        proceed = false;
                        break;
                    }
                }

                for (int i = 0; i < charArray4.length; i++) {
                    char ch4 = charArray4[i];
                    if (!(ch4 >= 'a' && ch4 <= 'z')) {
                        proceed = false;
                        break;
                    }
                }

                if (!proceed) {
                    JOptionPane.showMessageDialog(null, "Invalid input", "ERROR", JOptionPane.WARNING_MESSAGE);
                } else{

                    try {
                        int intage = Integer.parseInt(txtAge.getText());
                        double doublecontact = Double.parseDouble(txtContactNum.getText());

                        FXMLLoader loader = new FXMLLoader(getClass().getResource("MedicalChoice.fxml"));
                        Parent root = loader.load();
                        MedicalChoice medicalChoice = loader.getController();
                        Stage stage = (Stage) ((Node) e.getSource()).getScene().getWindow();
                        Scene scene = new Scene(root);
                        stage.setScene(scene);
                        stage.show();
                    } catch (Exception exception) {
                        JOptionPane.showMessageDialog(null, "Invalid input", "ERROR", JOptionPane.WARNING_MESSAGE);
                    }

                }
            }

        }catch (NullPointerException exception){
            JOptionPane.showMessageDialog(null,"No choice selected in dropdown inputs.","ERROR",JOptionPane.WARNING_MESSAGE);
        }




    }

    public void clickCancelBtn(){
        System.exit(0);
    }

}
