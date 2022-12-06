package sample;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import java.io.IOException;
import java.io.File;

public class PurchaseScreenController {
  
  //Payment Details
  @FXML private Textfield CardholderName;
  @FXML private TextField CardNo;
  @FXML private TextField ExpDate;
  @FXML private PasswordField SecCode;
  @FXML private TextField payEmail;
  @FXML private PasswordField payPass;
  @FXML private TextField venEmail;
  @FXML private PasswordField venPass;
  
  // @FXML private TextField userReview;
  
  
  
  @FXML
  private void onPurchasePressed(javafx.event.ActionEvent actionEvent) throws IOException {
    
    Parent currScene = FXMLLoader.load(getClass().getResource("")); // View Times
    Stage currStage = Main.getStage();

    currStage.setTitle("Available Times");
    currStage.setScene((new Scene(currScene, 600, 400)));
    currStage.show();

  }
  
  @FXML
  private void onTimePressed(javafx.event.ActionEvent actionEvent) throws IOException {
    
    //  Card
   String CardholderNameText = CardholderName.getText();
   String CardNoText = CardNo.getText();
   String ExpDateText = ExpDate.getText();
   String SecCodeText = SecCode.getText();
    
   //  Paypal
   String payEmailText = payEmail.getText();
   String payPassText = payPass.getText();
    
   //  Venmo (If we want a second check method)
   String venEmailText = venEmail.getText();
   String venPassText = venPass.getText();
    
    // Tab through which payment method the user wishes to use (Card/Check) and enter details
  
    Parent currScene = FXMLLoader.load(getClass().getResource("")); 
    Stage currStage = Main.getStage();

    currStage.setTitle("");
    currStage.setScene((new Scene(currScene, 600, 400)));
    currStage.show();

  }
  
  private void onDetailsViewed(javafx.event.ActionEvent actionEvent) throws IOException {
    
    // Confirm details by displaying movie, time, and payment (last 4 digits of the card or name of check)
  
    Parent currScene = FXMLLoader.load(getClass().getResource("")); 
    Stage currStage = Main.getStage();

    currStage.setTitle("");
    currStage.setScene((new Scene(currScene, 600, 400)));
    currStage.show();

  }
  
  private void onReturnClicked(javafx.event.ActionEvent actionEvent) throws IOException {
    
    // Successful Purchase Screen that displays ticket (Random Serial No.)
  
    Parent currScene = FXMLLoader.load(getClass().getResource("")); 
    Stage currStage = Main.getStage();

    currStage.setTitle("");
    currStage.setScene((new Scene(currScene, 600, 400)));
    currStage.show();

  }
  
  private void onReviewClicked(javafx.event.ActionEvent actionEvent) throws IOException {
    
    //this can be done last if need be
    
  }
  
  
}

