import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.swing.JOptionPane;

public class Moskovojs_pica {
	
	public static String sveiciens(){
		String sveicien = "Sveicinati labakaja picerija!";
		return sveicien;
	}

  
    
      
	public static void main(String[] args) {
		String izvele;
		String darbibas[] = {"Nopirkt picu", "Pasutit picu", "Aiziet", "Apturet"};
		
		String vards= "";
		String adrese = "Uz vietas";
		
		double izmersCena = 0;
		double merceCena = 0;
		double siersCena = 0;
		double piedevasCena = 0;
		double summa = 0;
		
		
		String izmers = "";
		int izmeri;
		String merce = "";
		String merces[] = {"kecupa", "kiploku", "pesto"};
		String piedevas = "";
		String piedevasM[] = {};
		
		
		String siers = "";
		List<String> atlautieSieri = Arrays.asList("mocarella", "cedara", "provolone");
		
		
		
		
		
		boolean majas = false;
		
		JOptionPane.showMessageDialog(null, sveiciens(), "Picerija", JOptionPane.INFORMATION_MESSAGE);
		do{
			izvele =(String)JOptionPane.showInputDialog(null, "Darbibas izvele", null, JOptionPane.QUESTION_MESSAGE, null, darbibas, darbibas[0]);
			switch(izvele){
			case "Nopirkt picu":
				
				if(majas==false) {
				
				 vards =(String)JOptionPane.showInputDialog(null, "Ievadi savu vardu", null, JOptionPane.QUESTION_MESSAGE);
				 izmeri = JOptionPane.showOptionDialog(null, "Cik lielu picu velies?", null, JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE,
						 null, new String[] {"20cm", "30cm", "50cm"}, null);
				 switch(izmeri){
		   			case 0:
		   				izmers = "20cm";
		                izmersCena = 5.99;
		                break;
		            case 1:
		                izmers = "30cm";
		                izmersCena = 6.99;
		                break;
		            case 2:
		                izmers = "50cm";
		                izmersCena = 8.99;
		                break;
		        }
				
				 merce = (String)JOptionPane.showInputDialog(null, "Kadu merci velies?", null, JOptionPane.QUESTION_MESSAGE, null, merces, merces[0]);
				 
				 
				 do {
					
				 siers = (String)JOptionPane.showInputDialog(null, "Ieraksti picas sieru", "mocarella; cedara; provolone",  JOptionPane.QUESTION_MESSAGE); 
				 if (!atlautieSieri.contains(siers)) {
		               JOptionPane.showMessageDialog(null, "Tads siers neeksiste", null, JOptionPane.ERROR_MESSAGE);
		            }
				 }while(!atlautieSieri.contains(siers));
				 
				 piedevas = (String)JOptionPane.showInputDialog(null, "Kadas piedevas picai?(Ar komatu atdali)", null, JOptionPane.QUESTION_MESSAGE);
			     piedevasM = piedevas.split(",");

				 
			      
			     if(siers == "mocarella") {
			    	 siersCena = 2;
			     }else if(siers == "cedara") {
			    	 siersCena = 2.50;
			     }else {
			    	 siersCena = 3; }
			     piedevasCena = piedevasM.length * 1;
			     
			     if(merce == merces[0]) {
			    	 merceCena = 1;
			     }else if(merce == merces[1]) {
			    	 merceCena = 1.50;
			     }else {
			    	 merceCena = 2; }
			     
			     
			     
			     summa = izmersCena + merceCena + piedevasCena + siersCena;
			     Rihards_pica pica = new Rihards_pica(vards, adrese, izmers, merce, piedevas, siers, summa);
			  
			     JOptionPane.showMessageDialog(null, pica.izvadit(), "Pica nopirkta", JOptionPane.INFORMATION_MESSAGE);
			     try {
					 FileWriter writer = new FileWriter("picas.txt", true);
				 	 writer.write(pica.toString()+"\n");
				 	 writer.close();
				 	 JOptionPane.showMessageDialog(null, "Pica ievietota txt faila", null, JOptionPane.INFORMATION_MESSAGE);
				 }catch(Exception e) {
					 JOptionPane.showMessageDialog(null, "Kluda", "error", JOptionPane.ERROR_MESSAGE);
				 }
				}else	JOptionPane.showMessageDialog(null, "Jus neesiet uz vietas picerija, pameginiet pasutit picu", "error", JOptionPane.ERROR_MESSAGE);
				break;
				
			case "Pasutit picu":
				if(majas==true){
					 vards =(String)JOptionPane.showInputDialog(null, "Ievadi savu vardu", null, JOptionPane.QUESTION_MESSAGE);
					 adrese =(String)JOptionPane.showInputDialog(null, "Ievadi savu adresi", null, JOptionPane.QUESTION_MESSAGE);
					 izmeri = JOptionPane.showOptionDialog(null, "Cik lielu picu velies?", null, JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE,
							 null, new String[] {"20cm", "30cm", "50cm"}, null);
					 switch(izmeri){
			   			case 0:
			   				izmers = "20cm";
			                izmersCena = 5.99;
			                break;
			            case 1:
			                izmers = "30cm";
			                izmersCena = 6.99;
			                break;
			            case 2:
			                izmers = "50cm";
			                izmersCena = 8.99;
			                break;
			        }
					 merce = (String)JOptionPane.showInputDialog(null, "Kadu merci velies?", null, JOptionPane.QUESTION_MESSAGE, null, merces, merces[0]);
					 do {
							
						 siers = (String)JOptionPane.showInputDialog(null, "Ieraksti picas sieru", "mocarella; cedara; provolone",  JOptionPane.QUESTION_MESSAGE); 
						 if (!atlautieSieri.contains(siers)) {
				               JOptionPane.showMessageDialog(null, "Tads siers neeksiste", null, JOptionPane.ERROR_MESSAGE);
				            }
						 }while(!atlautieSieri.contains(siers));
					 
					 piedevas = (String)JOptionPane.showInputDialog(null, "Kadas piedevas picai?(Ar komatu atdali)", null, JOptionPane.QUESTION_MESSAGE);
				     piedevasM = piedevas.split(",");
				      
				    
				     if(siers == "mocarella") {
				    	 siersCena = 2;
				     }else if(siers == "cedara") {
				    	 siersCena = 2.50;
				     }else {
				    	 siersCena = 3; }
				     piedevasCena = piedevasM.length * 1;
				     
				     if(merce == merces[0]) {
				    	 merceCena = 1;
				     }else if(merce == merces[1]) {
				    	 merceCena = 1.50;
				     }else {
				    	 merceCena = 2; }
				     summa = izmersCena + merceCena + piedevasCena+ siersCena;
				       
				     Rihards_pica pica = new Rihards_pica(vards, adrese, izmers, merce, piedevas,siers, summa);
					 JOptionPane.showMessageDialog(null, pica.izvadit(), "Veiksmigi pasutita", JOptionPane.INFORMATION_MESSAGE);
					 
					 try {
						 FileWriter writer = new FileWriter("picas.txt", true);
					 	 writer.write(pica.toString()+"\n");
					 	 writer.close();
					 	 JOptionPane.showMessageDialog(null, "Pica ievietota txt faila", null, JOptionPane.INFORMATION_MESSAGE);
					 }catch(Exception e) {
						 JOptionPane.showMessageDialog(null, "Kluda", "error", JOptionPane.ERROR_MESSAGE);
					 }
					 
				}else 	JOptionPane.showMessageDialog(null, "Jus neesiet majas, pameginiet nopirkt picu", "error", JOptionPane.ERROR_MESSAGE);

				break;
				
			case "Aiziet":
				if(majas==false){
					majas = true;
					JOptionPane.showMessageDialog(null, "Jus aizgajat majas", null, JOptionPane.INFORMATION_MESSAGE);
				}else{
					majas = false;
					JOptionPane.showMessageDialog(null, "Jus aizgajat uz piceriju", null, JOptionPane.INFORMATION_MESSAGE);
					JOptionPane.showMessageDialog(null, sveiciens(), "Picerija", JOptionPane.INFORMATION_MESSAGE);
				}
				break;
				
			
			}
		}while(!izvele.equalsIgnoreCase("Apturet"));
	}

}
