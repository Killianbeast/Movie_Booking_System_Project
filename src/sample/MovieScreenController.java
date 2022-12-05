package sample;
import java.io.File;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;

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
            //Go to respective purchase purchase screen
        }
        
        
         
        //grab the uhhhhhh thing you just searched for and check to see if the name exists in the image file and then go directly to that purchase screen
           
     
    
    }
    


}
