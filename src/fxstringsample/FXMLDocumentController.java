/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fxstringsample;

import java.awt.*;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;

/**
 *
 * @author o231056s
 */
public class FXMLDocumentController implements Initializable {
    
    @FXML
    private TextField input;

    @FXML
    private TextArea output;
    
    @FXML
    private void handleButtonAction(ActionEvent event) {
        String line = input.getText();
        output.setText("nyuuryoku:" + line + "\n");
        output.appendText("mojisuu:"+line.length()+"\n");
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
