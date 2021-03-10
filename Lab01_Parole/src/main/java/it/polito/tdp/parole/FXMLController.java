package it.polito.tdp.parole;


import it.polito.tdp.parole.model.ParoleLinkedList;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class FXMLController {
	
	ParoleLinkedList elencolinkedlist ;
	
	String parola;

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField txtParola;

    @FXML
    private Button btnInserisci;

    @FXML
    private TextArea txtResult;

    @FXML
    private Button btnReset;

    @FXML
    void doInsert(ActionEvent event) {
    parola= this.txtParola.getText();
    elencolinkedlist.addParola(parola);
   
    this.txtResult.setText(elencolinkedlist.toString());
    txtParola.setText("");
    }

    @FXML
    void doReset(ActionEvent event) {
    elencolinkedlist.reset();
  
    txtResult.setText(elencolinkedlist.toString());
    }
    
    @FXML
    void doCancella(ActionEvent event)
    { String s= txtResult.getSelectedText();
      elencolinkedlist.cancella(s);
      txtResult.setText(elencolinkedlist.toString());
    }
    
    
    @FXML
    void initialize() {
        assert txtParola != null : "fx:id=\"txtParola\" was not injected: check your FXML file 'Scene.fxml'.";
        assert btnInserisci != null : "fx:id=\"btnInserisci\" was not injected: check your FXML file 'Scene.fxml'.";
        assert txtResult != null : "fx:id=\"txtResult\" was not injected: check your FXML file 'Scene.fxml'.";
        assert btnReset != null : "fx:id=\"btnReset\" was not injected: check your FXML file 'Scene.fxml'.";

        elencolinkedlist = new ParoleLinkedList() ;
        
    }
}
