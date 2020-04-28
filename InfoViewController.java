/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hello;

/**
 * Sample Skeleton for 'InfoView.fxml' Controller Class
 */

/**
 * Sample Skeleton for 'InfoView.fxml' Controller Class
 */

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class InfoViewController {

    @FXML // ResourceBundle that was given to the FXMLLoader
    private ResourceBundle resources;

    @FXML // URL location of the FXML file that was given to the FXMLLoader
    private URL location;

    @FXML // fx:id="fnameText"
    private TextField fnameText; // Value injected by FXMLLoader

    @FXML // fx:id="lnameText"
    private TextField lnameText; // Value injected by FXMLLoader

    @FXML // fx:id="collegeText"
    private TextField collegeText; // Value injected by FXMLLoader

    @FXML // fx:id="bioText"
    private TextArea bioText; // Value injected by FXMLLoader

    @FXML // fx:id="nextButton"
    private Button nextButton; // Value injected by FXMLLoader

    @FXML
    void NextButton(ActionEvent event) throws IOException {

        FXMLLoader loader = new FXMLLoader(getClass().getResource("ScrollScreenView.fxml"));
        // load the ui elements

        Parent ScrollScreenView = loader.load();

        // load the scene
        Scene tableViewScene = new Scene(ScrollScreenView);

        //access the controller and call a method
        ScrollScreenController controller = loader.getController();


        Stage window1 = (Stage) ((Node) event.getSource()).getScene().getWindow();

        window1.setScene(tableViewScene);

        window1.show();
    }

    @FXML // This method is called by the FXMLLoader when initialization is complete
    void initialize() {
        assert fnameText != null : "fx:id=\"fnameText\" was not injected: check your FXML file 'InfoView.fxml'.";
        assert lnameText != null : "fx:id=\"lnameText\" was not injected: check your FXML file 'InfoView.fxml'.";
        assert collegeText != null : "fx:id=\"collegeText\" was not injected: check your FXML file 'InfoView.fxml'.";
        assert bioText != null : "fx:id=\"bioText\" was not injected: check your FXML file 'InfoView.fxml'.";
        assert nextButton != null : "fx:id=\"nextButton\" was not injected: check your FXML file 'InfoView.fxml'.";

    }
}

