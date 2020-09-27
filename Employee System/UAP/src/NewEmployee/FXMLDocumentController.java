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
import javafx.stage.Stage;

public class FXMLDocumentController implements Initializable {

//      @FXML
//    private Button next;
//
//    @FXML
//    void handleButtonAction(ActionEvent event) throws IOException {
//        
//         Parent root = FXMLLoader.load(getClass().getResource("FXML2.fxml"));
//         Stage window = (Stage) ((Node)event.getSource()).getScene().getWindow();
//         Scene scene=new Scene(root);
//         window.setScene(scene);
//         window.show();
//
//    }
    @FXML
    private Button next;

    @FXML
    void nextGo(ActionEvent event) throws IOException {

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

}
