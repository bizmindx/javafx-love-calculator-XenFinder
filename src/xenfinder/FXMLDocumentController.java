/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package xenfinder;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.Random;
import java.util.ResourceBundle;

/**
 *
 * @author JOE
 */
public class FXMLDocumentController implements Initializable {
    
    @FXML
    TextField txtname, txtxenname;   
    @FXML
    Label lbHeader;
    @FXML
    TextArea txtresult;
    String f_name;
    String z_name;
    
 @Override
   public void initialize(URL location, ResourceBundle resources) {
//      lbHeader.setText("Xen FInder");
        // TODO
    }  
    
    public void calculate(ActionEvent event) {
        f_name = txtname.getText();
        z_name = txtxenname.getText();
        if (f_name.equals("") || z_name.equals("")) {
            System.out.println("No empty fields");
        } else
            randomNumber();
        txtname.setText("");
        txtxenname.setText("");
    }
    
   
    private void randomNumber(){
        f_name = txtname.getText();
        z_name = txtxenname.getText();
        Random rd = new Random();
        int randnum = rd.nextInt(10)+1;
        if (randnum <= 10 && randnum >= 9) {
            txtresult.setText(randnum+"\nPossibility of a Zeng between\n"+f_name+" and "+z_name+" is 100%");
        } else if (randnum < 9 && randnum >= 7){
            txtresult.setText(randnum+"\nPossibility of a Zeng between\n"+f_name+" and "+z_name+" is 80%");
        } else if (randnum < 7 && randnum >= 5){
            txtresult.setText(randnum+"\nPossibility of a Zeng between\n"+f_name+" and "+z_name+" is 60%");
        } else if (randnum < 5 && randnum >= 3){
            txtresult.setText(randnum+"\nPossibility of a Zeng between\n"+f_name+" and "+z_name+" is 40%");
        } else if (randnum < 3 && randnum >= 2){
            txtresult.setText(randnum+"\nPossibility of a Zeng between\n"+f_name+" and "+z_name+" is 20%");
        } else {
            txtresult.setText(randnum+"\nPossibility of a Zeng between\n"+f_name+" and "+z_name+" is Not possible");
        }
    }

    public void ClearResult(ActionEvent event) {
       txtname.setText("");
       txtxenname.setText("");
       txtresult.setText("");
    }
}
