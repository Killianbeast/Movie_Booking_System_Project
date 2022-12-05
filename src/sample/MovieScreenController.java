package sample;
import java.io.File;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import javafx.scene.control.TextField;

public class MovieScreenController {
    
    @FXML private TextField SearchBar;
    

    @FXML
    private void onEditClicked() {

    }
    
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
            searchfor.substring(searchfor.indexOf('.'));
            onViewClicked(actionevent, searchfor);
        }
        //grab the uhhhhhh thing you just searched for and check to see if the name exists in the image file and then go directly to that purchase screen
    }
    
    private void onViewClicked(javafx.event.ActionEvent actionevent, String MovieTitle) throws IOException {
        
        Parent currScene = FXMLLoader.load(getClass().getResource("fxml/InfoScreen.fxml"));
        Stage currStage = Main.getStage();
        currStage.setTitle(MovieTitle);
        currStage.setScene(new Scene(currScene, 600, 400));
        currStage.show();
        
    }
    


}
