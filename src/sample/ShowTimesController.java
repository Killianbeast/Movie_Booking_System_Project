package sample;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ListView;
import javafx.stage.Stage;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileReader;
import java.io.IOException;
import java.util.Set;

public class ShowTimesController {

    @FXML private ListView<String> MovieTimes;
    int index;


    public void initialize() throws IOException, ParseException {

        JSONParser parser = new JSONParser();
        JSONObject obj = (JSONObject) parser.parse(new FileReader("src/sample/movieDetails.json"));
        JSONArray current = (JSONArray) obj.get("Current");
        JSONObject currentMovie = (JSONObject) current.get(index);
        JSONArray showtimes = (JSONArray) currentMovie.get("Showtimes");

        MovieTimes.getItems().add((String) showtimes.get(0));
        MovieTimes.getItems().add((String) showtimes.get(1));
        MovieTimes.getItems().add((String) showtimes.get(2));

    }

    @FXML private void onReturnClicked() throws IOException {
        Parent currScene = FXMLLoader.load(getClass().getResource("fxml/CustomerScreen.fxml"));
        Stage currStage = Main.getStage();
        currStage.setTitle("Movies");
        currStage.setScene(new Scene(currScene, 600, 400));
        currStage.show();
    }

    @FXML private void onPayClicked() throws IOException {
        Parent currScene = FXMLLoader.load(getClass().getResource("fxml/PaymentController.fxml"));
        Stage currStage = Main.getStage();
        currStage.setTitle("Purchase Ticket");
        currStage.setScene(new Scene(currScene, 600, 400));
        currStage.show();
    }

}
