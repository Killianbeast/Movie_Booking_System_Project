package sample;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;

public class AdminScreenController {
    @FXML private Button editMovie0;
    @FXML private Button editMovie1;
    @FXML private Button editMovie2;
    @FXML private Button editMovie3;
    @FXML private Button editMovie4;
    @FXML private Button editMovie5;
    @FXML private Button editUpMovie0;
    @FXML private Button editUpMovie1;
    @FXML private Button editUpMovie2;
    @FXML private Button editUpMovie3;
    @FXML private Button editUpMovie4;
    @FXML private Button editUpMovie5;

    static String movInt;

    @FXML
    private void onEditClicked(javafx.event.ActionEvent actionevent) throws IOException {
        String movTitle = ((Node) actionevent.getSource()).getId();
        movInt = movTitle.replace("Movie", "");

        Parent currScene = FXMLLoader.load(getClass().getResource("fxml/EditScreen.fxml"));
        Stage currStage = Main.getStage();
        currStage.setTitle(movTitle);
        currStage.setScene(new Scene(currScene, 600, 400));
        currStage.show();
    }

}
