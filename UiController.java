/**
 * Sample Skeleton for 'Untitled' Controller Class
 */

package hello;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;

public class UiController {

    @FXML // ResourceBundle that was given to the FXMLLoader
    private ResourceBundle resources;

    @FXML // URL location of the FXML file that was given to the FXMLLoader
    private URL location;

    @FXML // fx:id="test"
    private AnchorPane test; // Value injected by FXMLLoader

    @FXML // fx:id="testb"
    private Button testb; // Value injected by FXMLLoader

    @FXML
    void testbAction(ActionEvent event) {
        System.out.println("enter");
    }
    
      @FXML // fx:id="image"
    private ImageView image; // Value injected by FXMLLoader

    @FXML // This method is called by the FXMLLoader when initialization is complete
    void initialize() {
        assert test != null : "fx:id=\"test\" was not injected: check your FXML file 'Untitled'.";
        assert testb != null : "fx:id=\"testb\" was not injected: check your FXML file 'Untitled'.";

    }
}
