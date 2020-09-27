/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NewEmployee;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author shafi
 */
public class FXML8Controller implements Initializable {

    @FXML
    private Button add8;

    @FXML
    private Button salaryinfo8;
    @FXML
    private Button search8;

    @FXML
    private Button all8;
    @FXML
    private TextField id8;
    @FXML
    private TextField amount8;
    @FXML
    private Button update8;

    @FXML
    void all8Action(ActionEvent event) throws IOException {

        Parent root = FXMLLoader.load(getClass().getResource("FXML10.fxml"));
        Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
        Scene scene = new Scene(root);
        window.setScene(scene);
        window.show();
    }

    @FXML
    void search8Action(ActionEvent event) throws IOException {

        Parent root = FXMLLoader.load(getClass().getResource("FXML9.fxml"));
        Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
        Scene scene = new Scene(root);
        window.setScene(scene);
        window.show();
    }

    @FXML
    void salaryinfo8Action(ActionEvent event) throws IOException {

        Parent root = FXMLLoader.load(getClass().getResource("FXML7.fxml"));
        Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
        Scene scene = new Scene(root);
        window.setScene(scene);
        window.show();
    }

    @FXML
    void addAction(ActionEvent event) throws IOException {

        Parent root = FXMLLoader.load(getClass().getResource("FXML2.fxml"));
        Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
        Scene scene = new Scene(root);
        window.setScene(scene);
        window.show();
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

    @FXML
    private void update8Action(ActionEvent event){
        try {
        String id= id8.getText();
        String am= amount8.getText();
        double amt= Double.parseDouble(am);
        connect c= new  connect();
        c.searchId=id;
        c.amt=amt;
        String s=c.updateSalary();
        
        if("Yes".equals(s))
        {
          //  showSuccesAlert();
        }
        else{
            
           // showWarningAlert();
        }
        } 
        catch (NumberFormatException e) 
        {
           // showWarningAlert();
        }
   
            
    }

}
