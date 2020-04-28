/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hello;

/**
 *
 * @author lmber
 */
/**
 * Sample Skeleton for 'ScrollScreenView.fxml' Controller Class
 */

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.scene.text.Text;

public class ScrollScreenController {

    @FXML // ResourceBundle that was given to the FXMLLoader
    private ResourceBundle resources;

    @FXML // URL location of the FXML file that was given to the FXMLLoader
    private URL location;

    @FXML // fx:id="picture1"
    private ImageView picture1; // Value injected by FXMLLoader

    @FXML // fx:id="Name1"
    private Text Name1; // Value injected by FXMLLoader

    @FXML // fx:id="College1"
    private Text College1; // Value injected by FXMLLoader

    @FXML // fx:id="match1"
    private Button match1; // Value injected by FXMLLoader

    @FXML // fx:id="DontMatch1"
    private Button DontMatch1; // Value injected by FXMLLoader

    @FXML // fx:id="bio1"
    private Text bio1; // Value injected by FXMLLoader

    @FXML // This method is called by the FXMLLoader when initialization is complete
    void initialize() {
        assert picture1 != null : "fx:id=\"picture1\" was not injected: check your FXML file 'ScrollScreenView.fxml'.";
        assert Name1 != null : "fx:id=\"Name1\" was not injected: check your FXML file 'ScrollScreenView.fxml'.";
        assert College1 != null : "fx:id=\"College1\" was not injected: check your FXML file 'ScrollScreenView.fxml'.";
        assert match1 != null : "fx:id=\"match1\" was not injected: check your FXML file 'ScrollScreenView.fxml'.";
        assert DontMatch1 != null : "fx:id=\"DontMatch1\" was not injected: check your FXML file 'ScrollScreenView.fxml'.";
        assert bio1 != null : "fx:id=\"bio1\" was not injected: check your FXML file 'ScrollScreenView.fxml'.";

    }
}

