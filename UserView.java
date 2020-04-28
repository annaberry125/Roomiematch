/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hello;

import static javafx.application.Application.launch;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 *
 * @author lmber
 */
public class UserView extends Stage {

    public void start(Stage stage) {
        Button btn2 = new Button();
        VBox y = new VBox();
        btn2.setText("Testing");
          //To change body of generated methods, choose Tools | Templates.
    
        StackPane root2 = new StackPane();
        Scene scene2 = new Scene(root2, 900, 750);
        root2.getChildren().add(btn2);
        
    
        stage.setTitle("Create an account");
        stage.setScene(scene2);
        stage.show();
    
    }
   
    
    
    
}
