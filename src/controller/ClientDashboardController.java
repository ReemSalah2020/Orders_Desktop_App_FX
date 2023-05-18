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
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;

/**
 * FXML Controller class
 *
 * @author HP
 */
public class ClientDashboardController implements Initializable {

    @FXML
    private MenuItem Exit;
    @FXML
    private MenuItem size1;
    @FXML
    private MenuItem size2;
    @FXML
    private MenuItem size3;
    @FXML
    private MenuItem Arial;
    @FXML
    private MenuItem Times;
    @FXML
    private MenuItem Calibri;
    @FXML
    private MenuItem red;
    @FXML
    private MenuItem Blue;
    @FXML
    private MenuItem Green;
    @FXML
    private MenuItem about;
    @FXML
    private Button Back;
    @FXML
    private Button Reset;
    @FXML
    private TableView<?> tableView;
    @FXML
    private TextField order_idTF;
    @FXML
    private Button Search_invoice;
    @FXML
    private Button Generate_Invoices;
    @FXML
    private Button View_Invoices;
    @FXML
    private Button Delete_Invoice;
    @FXML
    private TableColumn<?, ?> idCol;
    @FXML
    private TableColumn<?, ?> order_idCol;
    @FXML
    private TableColumn<?, ?> quantityCol;
    @FXML
    private TableColumn<?, ?> priceCol;
    @FXML
    private TableColumn<?, ?> quantity_priceCol;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void ExitHandle(ActionEvent event) {
    }

    @FXML
    private void size1Handle(ActionEvent event) {
    }

    @FXML
    private void size2Handle(ActionEvent event) {
    }

    @FXML
    private void size3Handle(ActionEvent event) {
    }

    @FXML
    private void ArialHandle(ActionEvent event) {
    }

    @FXML
    private void TimesHandle(ActionEvent event) {
    }

    @FXML
    private void CalibriHandle(ActionEvent event) {
    }

    @FXML
    private void redHandle(ActionEvent event) {
    }

    @FXML
    private void BlueHandle(ActionEvent event) {
    }

    @FXML
    private void GreenHandle(ActionEvent event) {
    }

    @FXML
    private void aboutHandle(ActionEvent event) {
    }



    @FXML
    private void Backhandle(ActionEvent event) {
    }

    @FXML
    private void Resethandle(ActionEvent event) {
    }

    @FXML
    private void Search_invoicehandle(ActionEvent event) {
    }

    @FXML
    private void Generate_Invoiceshandle(ActionEvent event) {
    }

    @FXML
    private void View_Invoiceshandle(ActionEvent event) {
    }

    @FXML
    private void Delete_Invoicehandle(ActionEvent event) {
    }





    
}
