/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package controller;

import Database.DBConnection;
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
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

/**
 * FXML Controller class
 *
 * @author 1M.T
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
    @FXML
    private Label errorLogIn;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        try {
            // TODO
            DBConnection.get_connection();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(LoginController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @FXML
    private void loginHandle(MouseEvent event) throws IOException, ClassNotFoundException {
        String userName_si = txtUserName.getText();
        String pass_si = txtPassword.getText();
//        int status = (doctor.isSelected()) ? 1 : 0;
        boolean check = DBConnection.singInCheck(userName_si, pass_si);
        if (check) {
            //---
            FXMLLoader loader = new FXMLLoader(getClass().getResource("client dashboard.fxml"));
            Parent root = (Parent) loader.load();
            ClientDashboardController con = loader.getController();

            Stage stage = new Stage();
            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.getIcons().add(new Image("invoice.png"));
            stage.setTitle("Client Dashboard");

        } else {
            errorLogIn.setVisible(true);
        }
    }

    @FXML
    private void ResetHandle(ActionEvent event
    ) {
        txtUserName.setText("");
        txtPassword.setText("");
    }

    @FXML
    private void signUpBtnHandle(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("registration.fxml"));
        Parent root = (Parent) loader.load();
        SignupController con = loader.getController();

        Stage stage = new Stage();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.setTitle("Registration");

    }

}
