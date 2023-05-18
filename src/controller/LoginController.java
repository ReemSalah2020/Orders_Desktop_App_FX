/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package controller;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author HP
 */
public class LoginController implements Initializable {

    @FXML
    private TextField txtUserName;
    @FXML
    private PasswordField txtPassword;
    @FXML
    private Label lblLogin;
    @FXML
    private Button loginBtn;
    @FXML
    private Button Reset;
    @FXML
    private Button signUpBtn;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void txtUserNameHandle(ActionEvent event) {
    }

    @FXML
    private void txtPasswordHandle(ActionEvent event) {
    }

    @FXML
    private void loginHandle(ActionEvent event) {
    }

    @FXML
    private void ResetHandle(ActionEvent event) {
    }

    @FXML
    private void signUpBtnHandle(ActionEvent event) {
    }
    
}
