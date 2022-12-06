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
  @FXML private TextField CardholderName;
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
    
    Parent currScene = FXMLLoader.load(getClass().getResource("")); 
    Stage currStage = Main.getStage();

    currStage.setTitle("");
    currStage.setScene((new Scene(currScene, 600, 400)));
    currStage.show();

  }
  
  private void onCardDetailsViewed(javafx.event.ActionEvent actionEvent) throws IOException {
    
    // Confirmation details by displaying movie, time, and payment (last 4 digits of the card)
    
     //  Card
   String CardholderNameText = CardholderName.getText();
   String CardNoText = CardNo.getText();
   String ExpDateText = ExpDate.getText();
   String SecCodeText = SecCode.getText();
    
   //check if credit detials work
   
   if (CardNoText.length() != 16 or ExpDateText.length() != 5 or ExpDateText.length() != 7 or SecCodeText.length != 3) {
    System.out.println("Invalid Card Details."); 
   }
   else {
    Parent currScene = FXMLLoader.load(getClass().getResource("")); 
    Stage currStage = Main.getStage();

    currStage.setTitle("");
    currStage.setScene((new Scene(currScene, 600, 400)));
    currStage.show();
   }
         
  }
  
  private void onCheckDetailsViewed(javafx.event.ActionEvent actionEvent) throws IOException {
    
     // Confirmation details by displaying movie, time, and payment (Which of Paypal/Venmo was used)

     //  Paypal
     String payEmailText = payEmail.getText();
     String payPassText = payPass.getText();

     //  Venmo 
     String venEmailText = venEmail.getText();
     String venPassText = venPass.getText();

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
  
  
  
}

