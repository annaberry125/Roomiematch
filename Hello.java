/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hello;

import java.io.IOException;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Orientation;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;


/**
 *
 * @author lmber
 */
public class Hello extends Application {
        Scene scene; 
        Scene editingScene;
        
 
    @Override
    public void start(Stage primaryStage) throws IOException {
//        //creating First scene elements
//        Label lbl = new Label(" Welcome to Rinder! \n The Roomate Finding app!");
//        lbl.setFont(Font.font("COURIER", 30));
//        Button btn = new Button("Click to Get Started");
//        btn.setStyle("-fx-border-color: red");
//        btn.setOnAction(e -> primaryStage.setScene(editingScene));
//        
//        //adding first scene elements
//        VBox layout1 = new VBox(20);
//        layout1.getChildren().addAll(lbl, btn);
//        scene = new Scene(layout1, 500, 350);
//        
//        //creating second scene elements
//        Label fnameLabel = new Label("First Name: ");
//        TextField fnameTxt = new TextField();
//        Label lnameLabel = new Label("Last Name: ");
//        TextField lnameTxt = new TextField();
//        Label college = new Label("College: ");
//        TextField collegeTxt = new TextField();
//        Label bio = new Label("Tell us a bit about yourself! \n (Hobbies, favorite foods, favorite songs, etc)");
//        TextArea bioTxt = new TextArea();
//        Button nextButton = new Button("Next");
//      
//        //adding first scene elements
//        FlowPane layout2 = new FlowPane(Orientation.VERTICAL);
//        layout2.setAlignment(Pos.CENTER);
//        layout2.getChildren().addAll(fnameLabel, fnameTxt, lnameLabel, lnameTxt);
//        layout2.getChildren().addAll(college, collegeTxt);
//        layout2.getChildren().addAll(bio, bioTxt, nextButton);
//        
//        editingScene = new Scene(layout2, 900, 750);
//       
//           
//        
//       
//        
//        
//        //To change body of generated methods, choose Tools | Templates.
//    
//        
//      
//        
//        
//        
//        primaryStage.setTitle("Rinder");
//        primaryStage.setScene(scene);
//        primaryStage.show();
//        
        
       Parent root = FXMLLoader.load(getClass().getResource("WelcomeView.fxml")); 
      Scene scene = new Scene(root);
      primaryStage.setScene(scene);
      primaryStage.show();
        
    }
    
       /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
