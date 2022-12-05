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
  
  @FXML
  private void onPurchaseClicked(javafx.event.ActionEvent actionEvent) throws IOException {
    
    Parent currScene = FXMLLoader.load(getClass().getResource("")); // View Times
    Stage currStage = Main.getStage();

    currStage.setTitle("Available Times");
    currStage.setScene((new Scene(currScene, 600, 400)));
    currStage.show();

  }
  
  @FXML
  private void onTimeClicked(javafx.event.ActionEvent actionEvent) throws IOException {
    
    Parent currScene = FXMLLoader.load(getClass().getResource("")); // View and Enter Payment Details
    Stage currStage = Main.getStage();

    currStage.setTitle("");
    currStage.setScene((new Scene(currScene, 600, 400)));
    currStage.show();

  }
  
  private void onReviewClicked(javafx.event.ActionEvent actionEvent) throws IOException {
    
    //this can be done last if need be
    
  }
  
  
}

