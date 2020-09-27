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
 * @author Shahriar Shafin
 */
public class FXML9Controller implements Initializable {

    @FXML
    private Button add9;
    @FXML
    private Button increase9;
    @FXML
    private Button salaryinfo9;

    @FXML
    private Button all9;
    @FXML
    private TextField id9;
    @FXML
    private TextField details9;
    @FXML
    private Button searchin9;

    @FXML
    void all9Action(ActionEvent event) throws IOException {

        Parent root = FXMLLoader.load(getClass().getResource("FXML10.fxml"));
        Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
        Scene scene = new Scene(root);
        window.setScene(scene);
        window.show();
    }

    @FXML
    void add9Action(ActionEvent event) throws IOException {

        Parent root = FXMLLoader.load(getClass().getResource("FXML2.fxml"));
        Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
        Scene scene = new Scene(root);
        window.setScene(scene);
        window.show();
    }

    @FXML
    void increase9Action(ActionEvent event) throws IOException {

        Parent root = FXMLLoader.load(getClass().getResource("FXML8.fxml"));
        Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
        Scene scene = new Scene(root);
        window.setScene(scene);
        window.show();
    }

    @FXML
    void salaryinfo9Action(ActionEvent event) throws IOException {

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

    @FXML
    private void searchin9Action(ActionEvent event) {

        try {
            String id = id9.getText();
            connect c = new connect();
            c.searchId = id;
            String searchOut = c.searchID();
            details9.setText(searchOut);
        } catch (Exception e) {
            // showWarningAlert();

        }

        //System.out.println(""+searchOut);
    }

}
