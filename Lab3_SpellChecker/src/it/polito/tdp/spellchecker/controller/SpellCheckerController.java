package it.polito.tdp.spellchecker.controller;




	import java.awt.Button;
import java.net.URL;
	import java.util.ResourceBundle;

import it.polito.tdp.spellchecker.model.Dictionary;
import javafx.event.ActionEvent;
	import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
	import javafx.scene.text.Text;

	
	public class SpellCheckerController {
		private Dictionary model;
	    @FXML // ResourceBundle that was given to the FXMLLoader
	    private ResourceBundle resources;

	    @FXML // URL location of the FXML file that was given to the FXMLLoader
	    private URL location;
	    
	   /* @FXML // fx:id="spell"
	    private Button spell; // Value injected by FXMLLoader*/
	    
	    /*@FXML // fx:id="clear"
	    private Button clear; // Value injected by FXMLLoader*/



	    @FXML // fx:id="testoInserito"
	    private TextField testoInserito; // Value injected by FXMLLoader

	    @FXML // fx:id="risultato"
	    private TextField risultato; // Value injected by FXMLLoader

	    @FXML // fx:id="errors"
	    private Text errors; // Value injected by FXMLLoader

	    @FXML // fx:id="time"
	    private Text time; // Value injected by FXMLLoader
	    
	    @FXML // fx:id="comboBox"
	    private ComboBox<String> comboBox; // Value injected by FXMLLoader

	    @FXML
	    void doClearText(ActionEvent event) {

	    }

	    @FXML
	    void doSpellCheck(ActionEvent event) {
	    	
	    	

	    }

	    @FXML // This method is called by the FXMLLoader when initialization is complete
	    void initialize() {
	    	assert comboBox != null : "fx:id=\"comboBox\" was not injected: check your FXML file 'SpellChecker.fxml'.";
	        assert testoInserito != null : "fx:id=\"testoInserito\" was not injected: check your FXML file 'SpellChecker.fxml'.";
	        assert risultato != null : "fx:id=\"risultato\" was not injected: check your FXML file 'SpellChecker.fxml'.";
	        assert errors != null : "fx:id=\"errors\" was not injected: check your FXML file 'SpellChecker.fxml'.";
	        assert time != null : "fx:id=\"time\" was not injected: check your FXML file 'SpellChecker.fxml'.";
	        /*assert spell != null : "fx:id=\"spell\" was not injected: check your FXML file 'SpellChecker.fxml'.";
	        assert clear != null : "fx:id=\"clear\" was not injected: check your FXML file 'SpellChecker.fxml'.";*/

	    }

		public void setModel(Dictionary model) {
			this.model=model;
			comboBox.getItems().addAll("english", "italian");
			
			
		}
	}

	

