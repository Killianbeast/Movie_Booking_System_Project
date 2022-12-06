package sample;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.SQLException;

import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class LogInSignUpController {

    // Log-In Screen Elements
    @FXML private TextField userName;
    @FXML private PasswordField userPass;

    // Sign-Up Screen Elements
    @FXML private TextField suName;
    @FXML private TextField suEmail;
    @FXML private TextField suAddress;
    @FXML private TextField suPhone;
    @FXML private PasswordField suPass;

    @FXML
    private void onLoginPressed(/*javafx.event.ActionEvent actionEvent*/) throws IOException {

        String username = userName.getText();
        String userpass = userPass.getText();

        System.out.println(username);
        System.out.println(userpass);

        if (!dbConnection.checkLogin(username, userpass)) {
            System.out.println("Login Failed");
        } else {
            if (dbConnection.checkIsAdmin(username)) {
                Parent currScene = FXMLLoader.load(getClass().getResource("fxml/AdminScreen.fxml"));
                Stage currStage = Main.getStage();
                currStage.setTitle("Movies");
                currStage.setScene(new Scene(currScene, 600, 400));
                currStage.show();
            } else {
                Parent currScene = FXMLLoader.load(getClass().getResource("fxml/CustomerScreen.fxml"));
                Stage currStage = Main.getStage();
                currStage.setTitle("Movies");
                currStage.setScene(new Scene(currScene, 600, 400));
                currStage.show();
            }
        }
    }

    @FXML
    private void onSignUpPressed(javafx.event.ActionEvent actionEvent) throws IOException {
        //FXMLLoader sceneLoader = new FXMLLoader();
        Parent currScene = FXMLLoader.load(getClass().getResource("fxml/SignUpScreen.fxml"));
        Stage currStage = Main.getStage();

        currStage.setTitle("Sign-Up");
        currStage.setScene(new Scene(currScene, 600, 400));
        currStage.show();
    }

    @FXML private void onReturnPressed(javafx.event.ActionEvent actionEvent) throws IOException {
        // Return to the log-in window
        Parent currScene = FXMLLoader.load(getClass().getResource("fxml/LogInScreen.fxml"));
        Stage currStage = Main.getStage();

        currStage.setTitle("Log-In");
        currStage.setScene((new Scene(currScene, 600, 400)));
        currStage.show();
    }

    @FXML private void onRegisterPressed() {
        String suNameText = suName.getText();
        String suEmailText = suEmail.getText();
        String suAddressText = suAddress.getText();
        String suPhoneText = suPhone.getText();
        String suPassText = suPass.getText();

            if (!dbConnection.checkEmailExists(suEmailText)) {
                String sqlQuery = String.format("INSERT INTO Users VALUES ('%s', '%s', '%s', '%s', '%s', 0)",
                        suNameText, suEmailText, suAddressText, suPhoneText, suPassText);
                dbConnection.dbQuery(sqlQuery);
            } else {
                System.out.println("Email already in use");
            }
    }
}
