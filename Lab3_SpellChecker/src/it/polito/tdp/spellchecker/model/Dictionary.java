package it.polito.tdp.spellchecker.model;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class Dictionary {
	private LinkedList <String> dizionario=new LinkedList <String>();
	
	public void loadDictionary(String language) {
		if(language.toLowerCase().compareTo("italian")==0) {
			try {
				FileReader fr=new FileReader("rsc/Italian.txt");
				BufferedReader br=new BufferedReader(fr);
				String word;
				while((word=br.readLine()) != null) {
					dizionario.add(word);
					
				}
				br.close();
				
			} catch (IOException e) {
				System.out.println("Errore nella lettura del file");
			}
		}
		
		if(language.toLowerCase().compareTo("english")==0) {
			try {
				FileReader fr=new FileReader("rsc/English.txt");
				BufferedReader br=new BufferedReader(fr);
				String word;
				while((word=br.readLine()) != null) {
					dizionario.add(word);
					
				}
				br.close();
				
			} catch (IOException e) {
				System.out.println("Errore nella lettura del file");
			}
		}
	}
	
	public List <RichWord> spellCheckText(List <String> inputTextList){
		List <RichWord> parole=new LinkedList <RichWord>();
		for(String s:inputTextList) {
			
			if(dizionario.contains(s)) {
				RichWord temp=new RichWord(s, true);
				parole.add(temp);
			}
			if(dizionario.contains(s)==false) {
				RichWord temp=new RichWord(s, false);
				parole.add(temp);
			}
		}
		return parole;
	}

}
