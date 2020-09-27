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
public class FXML4Controller implements Initializable {

    @FXML
    private Button discard;
    @FXML
    private TextField name4;
    @FXML
    private TextField id4;
    @FXML
    private TextField salary4;
    @FXML
    private TextField designation4;
    @FXML
    private Button save4;
    @FXML
    private Button hourly4;
    @FXML
    private Button commission4;
    @FXML
    private Button salaryinfo4;
    @FXML
    private Button increase4;
    @FXML
    private Button search4;
    @FXML
    private Button all4;
   
 

    @FXML
    private void save4Action(ActionEvent event) {           

        {
            if (name4.getText().equals("") || id4.getText().equals("") || salary4.getText().equals("") || designation4.getText().equals(""))
            {

               
            }
            else {
                try {
                    String name = name4.getText();
                    
                    String id = id4.getText();
                    String salary = salary4.getText();
                    String des = designation4.getText();
                    double salaryToDouble = Double.parseDouble(salary);
                    //showSuccesAlert();
                    connect c = new connect();
                    c.salaried(name, id, des, salaryToDouble);
                    
                  
                    

                } catch (NumberFormatException e) {
                    // showWarningAlert();
                }
            }

        }

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
    private void hourly1(ActionEvent event) throws IOException {

        Parent root = FXMLLoader.load(getClass().getResource("FXML5.fxml"));
        Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
        Scene scene = new Scene(root);
        window.setScene(scene);
        window.show();
    }

    @FXML
    private void commission4Action(ActionEvent event) throws IOException {

        Parent root = FXMLLoader.load(getClass().getResource("FXML6.fxml"));
        Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
        Scene scene = new Scene(root);
        window.setScene(scene);
        window.show();
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
