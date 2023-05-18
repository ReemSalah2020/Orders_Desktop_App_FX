/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package controller;

import Database.DBConnection;
import Database.User;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.MenuItem;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author HP
 */
public class SignupController implements Initializable {

    @FXML
    private Button goToLoginBtn;
    @FXML
    private TextField txtFirstName;
    @FXML
    private TextField txtLastName;
    @FXML
    private TextField txtUserName;
    @FXML
    private PasswordField txtPassword;
    @FXML
    private Button signUpBtn;
    @FXML
    private Button Reset;
    @FXML
    private Button Upload;
    @FXML
    private Label errorSingUp;

    /**
     * Initializes the controller class.
     */
    @Override

    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        try {
            // TODO
            DBConnection.get_connection();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(LoginController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @FXML
    private void goToLoginHandle(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("login.fxml"));
        Parent root = (Parent) loader.load();
        LoginController con = loader.getController();

        Stage stage = new Stage();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.setTitle("Login");
    }

    @FXML
    private void signUp(ActionEvent event) throws ClassNotFoundException {
        if (!txtFirstName.getText().isEmpty()
                && !txtLastName.getText().isEmpty()
                && !txtUserName.getText().isEmpty()
                && !txtPassword.getText().isEmpty()) {

            String fName_su = txtFirstName.getText();
            String lName_su = txtLastName.getText();
            String userNmae_su = txtUserName.getText();
            String pass_su = txtPassword.getText();

            User user = new User(fName_su, lName_su, userNmae_su, pass_su);
            DBConnection.singUp(user);
        } else {
            errorSingUp.setVisible(true);

        }
    }//END;

    @FXML
    private void ResetHandle(ActionEvent event) {
        txtFirstName.setText("");
        txtLastName.setText("");
        txtUserName.setText("");
        txtPassword.setText("");
    }

    @FXML
    private void UploadHan(ActionEvent event) {
    }

}
