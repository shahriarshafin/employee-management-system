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
public class FXML6Controller implements Initializable {

    @FXML
    private Button discard;   //button
    @FXML
    private TextField name6;
    @FXML
    private TextField id6;

    @FXML
    private TextField designation6;
    @FXML
    private Button salaried6;   //sub menu
    @FXML
    private Button hourly6;      //sub menu
    @FXML
    private TextField sale6;
    @FXML
    private TextField commission6;
    @FXML
    private Button submit6;
    @FXML
    private Button salaryinfo6;
    @FXML
    private Button increase6;
    @FXML
    private Button search6;
    @FXML
    private Button all6;

    @FXML
    private void salaried6Action(ActionEvent event) throws IOException {

        Parent root = FXMLLoader.load(getClass().getResource("FXML4.fxml"));
        Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
        Scene scene = new Scene(root);
        window.setScene(scene);
        window.show();
    }

    @FXML
    private void hourly6Action(ActionEvent event) throws IOException {

        Parent root = FXMLLoader.load(getClass().getResource("FXML5.fxml"));
        Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
        Scene scene = new Scene(root);
        window.setScene(scene);
        window.show();
    }

    @FXML
    void discardAction(ActionEvent event) throws IOException {

        Parent root = FXMLLoader.load(getClass().getResource("FXML3.fxml"));
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
    private void submit6Action(ActionEvent event) {

        if (name6.getText().equals("") || id6.getText().equals("") || designation6.getText().equals("") || commission6.getText().equals("") || sale6.getText().equals("")) {

            //  showErrorAlert();
        } else {
            try {
                String name = name6.getText();
                String id = id6.getText();
                String des = designation6.getText();
                String comsionRate = commission6.getText();
                String comisionSale = sale6.getText();
                double comrateToDouble = Double.parseDouble(comsionRate);
                double comSaleToDouble = Double.parseDouble(comsionRate);
                // showSuccesAlert();
                connect c = new connect();
                c.commission(name, id, des, comSaleToDouble, comSaleToDouble);

            } catch (NumberFormatException e) {
                //  showWarningAlert();
            }
        }

    }

     @FXML
    private void salaryinfo2Action(ActionEvent event) throws IOException {

        Parent root = FXMLLoader.load(getClass().getResource("FXML7.fxml"));
        Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
        Scene scene = new Scene(root);
        window.setScene(scene);
        window.show();
    }

    @FXML
    private void increase2Action(ActionEvent event)  throws IOException {

        Parent root = FXMLLoader.load(getClass().getResource("FXML8.fxml"));
        Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
        Scene scene = new Scene(root);
        window.setScene(scene);
        window.show();}

    @FXML
    private void search2Action(ActionEvent event) throws IOException {

        Parent root = FXMLLoader.load(getClass().getResource("FXML9.fxml"));
        Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
        Scene scene = new Scene(root);
        window.setScene(scene);
        window.show();
    }

    @FXML
    private void all2Action(ActionEvent event) throws IOException {

        Parent root = FXMLLoader.load(getClass().getResource("FXML10.fxml"));
        Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
        Scene scene = new Scene(root);
        window.setScene(scene);
        window.show();
    }

}
