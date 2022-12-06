package sample;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.EventObject;

public class InfoScreenController {

    @FXML private Label movTitle;
    @FXML private Label movRelease;
    @FXML private Label movSumm;
    @FXML private Button returnBttn;

    public void initialize() throws IOException, ParseException {

        String MovieTitle = MovieScreenController.getMovie();
        int index;
        System.out.println(MovieTitle);

        if (!MovieTitle.contains("Up")) {

            index = Integer.parseInt(MovieTitle);
            JSONParser parser = new JSONParser();
            JSONObject obj = (JSONObject) parser.parse(new FileReader("src/sample/movieDetails.json"));
            JSONArray current = (JSONArray) obj.get("Current");
            JSONObject currentMovie = (JSONObject) current.get(index);


            String movieTitle = (String) currentMovie.get("Title");
            String movieRelease = (String) currentMovie.get("Release Year");
            String movieSummary = (String) currentMovie.get("Summary");

            movTitle.setText(movieTitle);
            movRelease.setText(movieRelease);
            movSumm.setText(movieSummary);
        } else {
            index = Integer.parseInt(MovieTitle.replace("Up",""));
            JSONParser parser = new JSONParser();
            JSONObject obj = (JSONObject) parser.parse(new FileReader("src/sample/movieDetails.json"));
            JSONArray current = (JSONArray) obj.get("Upcoming");
            JSONObject currentMovie = (JSONObject) current.get(index);


            String movieTitle = (String) currentMovie.get("Title");
            String movieRelease = (String) currentMovie.get("Release Year");
            String movieSummary = (String) currentMovie.get("Summary");

            movTitle.setText(movieTitle);
            movRelease.setText(movieRelease);
            movSumm.setText(movieSummary);
        }
    }

    @FXML private void onReturnClicked() throws IOException {
        Parent currScene = FXMLLoader.load(getClass().getResource("fxml/CustomerScreen.fxml"));
        Stage currStage = Main.getStage();
        currStage.setTitle("Movies");
        currStage.setScene(new Scene(currScene, 600, 400));
        currStage.show();
    }
}
