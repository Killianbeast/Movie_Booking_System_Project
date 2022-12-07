package sample;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileReader;
import java.io.IOException;

public class EditScreenController {
    
    static int movInt;

    @FXML private Button returnBttn;
    @FXML private TextField editTitle;
    @FXML private TextField editRelease;
    @FXML private TextField editSumm;

    @FXML private void onReturnClicked() throws IOException {
        Parent currScene = FXMLLoader.load(getClass().getResource("fxml/AdminScreen.fxml"));
        Stage currStage = Main.getStage();
        currStage.setTitle("Movies");
        currStage.setScene(new Scene(currScene, 600, 400));
        currStage.show();
    }
    
    /*
    @FXML private void onEditClicked() throws IOException {

        int index = Integer.parseInt(MovieTitle.replace("Up",""));
        JSONParser parser = new JSONParser();
        JSONObject obj = (JSONObject) parser.parse(new FileReader("src/sample/movieDetails.json"));
        JSONArray current = (JSONArray) obj.get("Upcoming");
        JSONObject currentMovie = (JSONObject) current.get(index);

        String editTitleText = editTitle.getText();
        String editReleaseText = editRelease.getText();
        String editSummText = editSumm.getText();


        editTitle.setText(editTitleText);
        editRelease.setText(editReleaseText);
        editSumm.setText(editSummText);
        
    }
     */
    
}
