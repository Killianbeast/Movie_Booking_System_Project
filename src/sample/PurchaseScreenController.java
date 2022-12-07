package sample;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import java.io.IOException;
import java.util.Random;
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
  private void onCardPurchasePressed(javafx.event.ActionEvent actionEvent) throws IOException {
    
    // Confirmation details by displaying movie, time, and payment (last 4 digits of the card)
      //  Card
   String CardholderNameText = CardholderName.getText();
   String CardNoText = CardNo.getText();
   String ExpDateText = ExpDate.getText();
   String SecCodeText = SecCode.getText();
   Random rand = new Random();
   int ticketNum = rand.nextInt(5000);
    
   //check if credit detials work

   if (CardNoText.length() != 16 || SecCodeText.length() != 3) {
    System.out.println("Invalid Card Details.");
   }
   else {
    System.out.println("Purchase successful! Here is your ticket number: " + ticketNum);
   }

  }
  
  @FXML
  private void onCheckPurchaseClicked(javafx.event.ActionEvent actionEvent) throws IOException {
    
     // Confirmation details by displaying movie, time, and payment (Which of Paypal/Venmo was used)

      /* This was supposed to get the information but we could not finish it in time
     //  Paypal
     String payEmailText = payEmail.getText();
     String payPassText = payPass.getText();

     //  Venmo 
     String venEmailText = venEmail.getText();
     String venPassText = venPass.getText();

       */
     Random rand = new Random();
     int ticketNum = rand.nextInt(5000);

     System.out.println("Purchase successfull! Here is your ticket: " + ticketNum);
   }

   @FXML
   private void onReturnClicked(javafx.event.ActionEvent actionEvent) throws IOException {

      Parent currScene = FXMLLoader.load(getClass().getResource("fxml/CustomerScreen.fxml"));
      Stage currStage = Main.getStage();
      currStage.setTitle("Movies");
      currStage.setScene(new Scene(currScene, 600, 400));
      currStage.show();

  }
  
  
  
}

