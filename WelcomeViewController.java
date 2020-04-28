/**
 * Sample Skeleton for 'WelcomeView.fxml' Controller Class
 */
package hello;

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
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class WelcomeViewController {

    @FXML // ResourceBundle that was given to the FXMLLoader
    private ResourceBundle resources;

    @FXML // URL location of the FXML file that was given to the FXMLLoader
    private URL location;

    @FXML // fx:id="WelcomeViewController"
    private AnchorPane WelcomeView; // Value injected by FXMLLoader

    @FXML // fx:id="StartButton"
    private Button StartButton; // Value injected by FXMLLoader

    @FXML
    void startButtonAction(ActionEvent event) throws IOException {
        // fxml loader
        //Parent root = FXMLLoader.load(getClass().getResource("InfoView.fxml"));
        FXMLLoader loader = new FXMLLoader(getClass().getResource("InfoView.fxml"));
        // load the ui elements

        Parent InfoView = loader.load();

        // load the scene
        Scene tableViewScene = new Scene(InfoView);

        //access the controller and call a method
        InfoViewController controller = loader.getController();

        // pass currently selected model
        //controller.initData(modelTable.getSelectionModel().getSelectedItem());
//        if (checkboxNewWinddow.isSelected()) {
//
//            // create a new state
//
//            Stage stage = new Stage();
//
//            stage.setScene(tableViewScene);
//
//            stage.show();
//
//
//
//        } 
//else {
        // pass current scene to return
        // controller.setPreviousScene(((Node) event.getSource()).getScene());
        //This line gets the Stage information
        Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();

        window.setScene(tableViewScene);

        window.show();

    }

    @FXML // This method is called by the FXMLLoader when initialization is complete
    void initialize() {
        assert WelcomeView != null : "fx:id=\"WelcomeView\" was not injected: check your FXML file 'WelcomeView.fxml'.";
        assert StartButton != null : "fx:id=\"StartButton\" was not injected: check your FXML file 'WelcomeView.fxml'.";

    }
}
