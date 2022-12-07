package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.FileReader;
import java.util.Iterator;
import java.util.Map;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.*;


import javafx.scene.control.TextField;

import java.io.File;
import java.io.IOException;
import java.util.Objects;

public class MovieScreenController {
    
    @FXML private TextField SearchBar;
    @FXML private Button Movie0;
    @FXML private Button Movie1;
    @FXML private Button Movie2;
    @FXML private Button Movie3;
    @FXML private Button Movie4;
    @FXML private Button Movie5;
    @FXML private Button UpMovie0;
    @FXML private Button UpMovie1;
    @FXML private Button UpMovie2;
    @FXML private Button UpMovie3;
    @FXML private Button UpMovie4;
    @FXML private Button UpMovie5;
    @FXML private Button PurrMovie0;
    @FXML private Button PurrMovie1;
    @FXML private Button PurrMovie2;
    @FXML private Button PurrMovie3;
    @FXML private Button PurrMovie4;
    @FXML private Button PurrMovie5;

    static String movTitle;
    static String movInt;
    
    @FXML
    private void onSearchClicked(javafx.event.ActionEvent actionEvent) throws IOException {
        
        String searchfor = SearchBar.getText();
        
        searchfor += ".png"; 
        String imageDirectory = System.getProperty("src/sample/img");
        File workingFile = new File(imageDirectory);
        File testfile = new File(workingFile, searchfor);
        
        if(!testfile.exists()){
            System.out.println("Movie Not Found.");
        }
        else{
            searchfor.substring(0, searchfor.indexOf('.'));
            //onViewClicked(actionEvent);
        }
        //grab the uhhhhhh thing you just searched for and check to see if the name exists in the image file and then go directly to that purchase screen
    }

    @FXML
    private void onViewClicked(javafx.event.ActionEvent actionevent) throws IOException, ParseException {

        String movTitle = ((Node) actionevent.getSource()).getId();
        movInt = movTitle.replace("Movie", "");

        Parent currScene = FXMLLoader.load(getClass().getResource("fxml/InfoScreen.fxml"));
        Stage currStage = Main.getStage();
        currStage.setTitle(movTitle);
        currStage.setScene(new Scene(currScene, 600, 400));
        currStage.show();
    }

    @FXML
    private void onUpcomingViewClicked(javafx.event.ActionEvent actionevent) throws IOException {
        String movTitle = ((Node) actionevent.getSource()).getId();
        movInt = movTitle.replace("Movie", "");

        Parent currScene = FXMLLoader.load(getClass().getResource("fxml/InfoScreen.fxml"));
        Stage currStage = Main.getStage();
        currStage.setTitle(movTitle);
        currStage.setScene(new Scene(currScene, 600, 400));
        currStage.show();
    }

    @FXML
    private void onPurchaseTicketClicked(javafx.event.ActionEvent actionevent) throws IOException {
        String movTitle = ((Node) actionevent.getSource()).getId();
        movInt = movTitle.replace("PurrMovie", "");

        Parent currScene = FXMLLoader.load(getClass().getResource("fxml/TimesScreen.fxml"));
        Stage currStage = Main.getStage();
        currStage.setTitle("Purchase Ticket");
        currStage.setScene(new Scene(currScene, 600, 400));
        currStage.show();
    }

    @FXML
    private void onLogOutClicked() throws IOException {
        Parent currScene = FXMLLoader.load(getClass().getResource("fxml/LogInScreen.fxml"));
        Stage currStage = Main.getStage();
        currStage.setTitle("Purchase Ticket");
        currStage.setScene(new Scene(currScene, 600, 400));
        currStage.show();
    }

    public static String getMovie() {
        return movInt;
    }

}
