/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NewEmployee;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author shafi
 */
public class FXML10Controller implements Initializable {

    @FXML
    private Button add10;
    @FXML
    private Button increase10;
    @FXML
    private Button salaryinfo10;
    @FXML
    private Button search10;
    @FXML
    private Button details10;
    @FXML
    private ListView<String> detailsbar10;
    
    
    
     @FXML
    private void details10Action(ActionEvent event) {
         
      connect b= new connect();
      ArrayList<Employee> em=b.showres();
      for(int i=0;i<em.size();i++)
      {
          Employee e=em.get(i);
          String ob= e.display();
          detailsbar10.getItems().add(ob);
          
      }

       
    }
    
    

    @FXML
    void search10Action(ActionEvent event) throws IOException {

        Parent root = FXMLLoader.load(getClass().getResource("FXML9.fxml"));
        Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
        Scene scene = new Scene(root);
        window.setScene(scene);
        window.show();
    }

    @FXML
    void add10Action(ActionEvent event) throws IOException {

        Parent root = FXMLLoader.load(getClass().getResource("FXML2.fxml"));
        Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
        Scene scene = new Scene(root);
        window.setScene(scene);
        window.show();
    }

    @FXML
    void increase10Action(ActionEvent event) throws IOException {

        Parent root = FXMLLoader.load(getClass().getResource("FXML8.fxml"));
        Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
        Scene scene = new Scene(root);
        window.setScene(scene);
        window.show();
    }

    @FXML
    void salaryinfo10Action(ActionEvent event) throws IOException {

        Parent root = FXMLLoader.load(getClass().getResource("FXML7.fxml"));
        Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
        Scene scene = new Scene(root);
        window.setScene(scene);
        window.show();
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

   

}
