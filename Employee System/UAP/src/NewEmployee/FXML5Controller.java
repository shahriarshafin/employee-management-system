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
public class FXML5Controller implements Initializable {

    @FXML
    private Button discard;
    @FXML
    private TextField name5;
    @FXML
    private TextField id5;
    @FXML
    private TextField designation5;
    @FXML
    private Button salaried5;
    @FXML
    private Button commission5;
    @FXML
    private TextField hourlyrate5;
    @FXML
    private Button submit5;
    @FXML
    private TextField hourworked5;
    @FXML
    private Button salaryinfo5;
    @FXML
    private Button increase5;
    @FXML
    private Button search5;
    @FXML
    private Button all5;

    @FXML
    private void salaried5Action(ActionEvent event) throws IOException {

        Parent root = FXMLLoader.load(getClass().getResource("FXML4.fxml"));
        Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
        Scene scene = new Scene(root);
        window.setScene(scene);
        window.show();
    }

    @FXML
    private void commission5Action(ActionEvent event) throws IOException {

        Parent root = FXMLLoader.load(getClass().getResource("FXML6.fxml"));
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
    private void submit5Action(ActionEvent event) {

        if (name5.getText().equals("") || id5.getText().equals("") || designation5.getText().equals("") || hourworked5.getText().equals("") || hourlyrate5.getText().equals("")) {

            // showWarningAlert();
        } else {
            try {
                String name = name5.getText();
                String id = id5.getText();
                String des = designation5.getText();
                String hourwork = hourworked5.getText();
                String hourRate = hourlyrate5.getText();
                int hw = Integer.parseInt(hourwork);
                double hr = Double.parseDouble(hourRate);

                //showSuccesAlert();
                connect c = new connect();
                c.hourly(name, id, des, hr, hw);

            } catch (NumberFormatException e) {
                // showWarningAlert();
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
