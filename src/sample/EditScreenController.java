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
}
