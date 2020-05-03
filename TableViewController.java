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


import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class TableViewController {

    @FXML // ResourceBundle that was given to the FXMLLoader
    private ResourceBundle resources;

    @FXML // URL location of the FXML file that was given to the FXMLLoader
    private URL location;

    @FXML // fx:id="matchList"
    private AnchorPane matchList; // Value injected by FXMLLoader

    @FXML // fx:id="matchListV"
    private VBox matchListV; // Value injected by FXMLLoader


    @FXML // fx:id="bigHBox"
    private HBox bigHBox; // Value injected by FXMLLoader

    @FXML // fx:id="tablePane"
    private AnchorPane tablePane; // Value injected by FXMLLoader

    @FXML // fx:id="tableViewView"
    private TableView<Matches> tableViewView; // Value injected by FXMLLoader

    @FXML // fx:id="dataID"
    private TableColumn<Matches, String> dataID; // Value injected by FXMLLoader

    @FXML // fx:id="dataName"
    private TableColumn<Matches, String> dataName; // Value injected by FXMLLoader

   
    
    EntityManager manager;
    
     private void loadData() {
        Query query = manager.createNamedQuery("Matches.findAll");
        List<Matches> data = query.getResultList();

        //ObservableList<Candidates> odata = FXCollections.observableArrayList();

        for (Matches d : data) {
            //...   
//            System.out.println(d.getId());
//            odata.add(d);
        }

        //Candidates.setItems(odata);; //To change body of generated methods, choose Tools | Templates.
    }

    @FXML // This method is called by the FXMLLoader when initialization is complete
    void initialize() {
        assert matchList != null : "fx:id=\"matchList\" was not injected: check your FXML file 'TableView.fxml'.";
        assert matchListV != null : "fx:id=\"matchListV\" was not injected: check your FXML file 'TableView.fxml'.";
        assert bigHBox != null : "fx:id=\"bigHBox\" was not injected: check your FXML file 'TableView.fxml'.";
        assert tablePane != null : "fx:id=\"tablePane\" was not injected: check your FXML file 'TableView.fxml'.";
        assert tableViewView != null : "fx:id=\"tableViewView\" was not injected: check your FXML file 'TableView.fxml'.";
        assert dataID != null : "fx:id=\"dataID\" was not injected: check your FXML file 'TableView.fxml'.";
        assert dataName != null : "fx:id=\"dataName\" was not injected: check your FXML file 'TableView.fxml'.";
       

                //set up the columns in the table
        //dataID.setCellValueFactory(new PropertyValueFactory<>("id")); //should match with attribute Id (e.g., getId/setId methods) in SimpleModel
        //dataName.setCellValueFactory(new PropertyValueFactory<>("name")); //should match with attribute Value (e.g., getValue/setValue methods) in SimpleModel

        // loading data from database
        //database reference: "HelloPU"
        manager = (EntityManager) Persistence.createEntityManagerFactory("RoomieMatchPU").createEntityManager();

        //loading data
        loadData();
    
    
    
    
    }

   
}
