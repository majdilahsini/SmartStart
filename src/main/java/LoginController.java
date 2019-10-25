/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXPasswordField;
import com.jfoenix.controls.JFXTextField;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.animation.RotateTransition;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyEvent;
import javafx.stage.Stage;
import javafx.util.Duration;

/**
 * FXML Controller class
 *
 * @author p
 */
public class LoginController implements Initializable {

    private Button loginButton;
    private Button signupC;
    @FXML
    private Hyperlink fgtPwdLink;
    @FXML
    private JFXTextField loginField;
    @FXML
    private JFXPasswordField pwdField;
    @FXML
    private Label error;
    @FXML
    private ImageView verifIcon;
    @FXML
    private JFXButton loginbtn;
    
    
    /*
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    private void loginAction(ActionEvent event) throws IOException {
        
        Stage stage;
        Parent signUpPage = FXMLLoader.load(getClass().getResource("/fxml/MainWindowUtilisateur.fxml"));
        Scene scene = new Scene(signUpPage);
        stage = (Stage)loginButton.getScene().getWindow();
        stage.hide();
        stage.setScene(scene);
        stage.show();
        
    }

    private void signupCAction(ActionEvent event) throws IOException {
        
        Stage stage;
        Parent signUpPage = FXMLLoader.load(getClass().getResource("/fxml/Signup.fxml"));
        Scene scene = new Scene(signUpPage);
        stage = (Stage)signupC.getScene().getWindow();
        stage.setScene(scene);
        //
        
    }

    @FXML
    private void verifentry(KeyEvent event) {
        
              
    }

    @FXML
    private void checkentry(KeyEvent event) {

                  
    }

    @FXML
    private void loginbtnAction(ActionEvent event) {
    }
 
    
}
