import java.io.FileWriter;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import javax.swing.JOptionPane;

public class Moskovojs_pica {
	
	public static String sveiciens(){
		String sveicien = "Sveicinati labakaja picerija!";
		return sveicien;
	}
	
	public static void main(String[] args) {
		
		String izvele;
		String darbibas[] = {"Nopirkt picu", "Pasutit picu", "Aiziet", "Apskatit jau izveidotas picas", "Apturet"};
		
		String vards= "";
		String adrese = "Uz vietas";
		
		double izmersCena = 0;
		double merceCena = 0;
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
		Queue<Rihards_pica> picas = new LinkedList<Rihards_pica>();
		
		
		
		
		boolean majas = false;
		
		JOptionPane.showMessageDialog(null, sveiciens(), "Picerija", JOptionPane.INFORMATION_MESSAGE);
		do{
			izvele =(String)JOptionPane.showInputDialog(null, "Darbibas izvele", null, JOptionPane.QUESTION_MESSAGE, null, darbibas, darbibas[0]);
			switch(izvele){
			case "Nopirkt picu":
				
				if(majas==false) {
				do {
				 vards =(String)JOptionPane.showInputDialog(null, "Ievadi savu vardu", null, JOptionPane.QUESTION_MESSAGE);
				}while(vards.isBlank());
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
				 
				 do {
				 piedevas = (String)JOptionPane.showInputDialog(null, "Kadas piedevas picai?(Ar komatu atdali)", null, JOptionPane.QUESTION_MESSAGE);
				}while(piedevas.isBlank());
			     piedevasM = piedevas.split(",");
	     
			     
			     piedevasCena = piedevasM.length * 1;
			     
			     if(merce == merces[0]) {
			    	 merceCena = 1;
			     }else if(merce == merces[1]) {
			    	 merceCena = 1.50;
			     }else {
			    	 merceCena = 2; }
			     
			     
			    
			     summa = izmersCena + merceCena + piedevasCena; 
			     
			     Rihards_pica pica = new Rihards_pica(vards, adrese, izmers, merce, piedevas, siers, summa);
			     picas.add(pica);
			     JOptionPane.showMessageDialog(null, pica.ceks(), "Pica nopirkta", JOptionPane.INFORMATION_MESSAGE);
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
					do {
					 vards =(String)JOptionPane.showInputDialog(null, "Ievadi savu vardu", null, JOptionPane.QUESTION_MESSAGE);
				}while(vards.isBlank());
					do {
					 adrese =(String)JOptionPane.showInputDialog(null, "Ievadi savu adresi", null, JOptionPane.QUESTION_MESSAGE);
					}while(adrese.isBlank());
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
					 do {
					 piedevas = (String)JOptionPane.showInputDialog(null, "Kadas piedevas picai?(Ar komatu atdali)", null, JOptionPane.QUESTION_MESSAGE);
					}while(piedevas.isBlank());
				     piedevasM = piedevas.split(",");
				      
				    
				     piedevasCena = piedevasM.length * 1;
				     
				     if(merce == merces[0]) {
				    	 merceCena = 1;
				     }else if(merce == merces[1]) {
				    	 merceCena = 1.50;
				     }else {
				    	 merceCena = 2; }		
				     
				     
				    
					    JOptionPane.showMessageDialog(null, "Par piegadi samaksajat 3 eiro");
					    	 //Piegade 3 eiro
					     summa = izmersCena + merceCena + piedevasCena+3; 
					     
				     Rihards_pica pica = new Rihards_pica(vards, adrese, izmers, merce, piedevas, siers, summa);
					 JOptionPane.showMessageDialog(null, pica.ceks(), "Veiksmigi pasutita", JOptionPane.INFORMATION_MESSAGE);
					 
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
				
			case "Apskatit jau izveidotas picas":
				if(!picas.isEmpty()) {
	
		        	Iterator<Rihards_pica> apskatit = picas.iterator();
		        	String str = "Picas:\n";
		        	while(apskatit.hasNext()){
					str += apskatit.next().izvadit();
		        	}
		        	JOptionPane.showMessageDialog(null, str, "Pasutijumi", JOptionPane.INFORMATION_MESSAGE);
		 
				}else{
					JOptionPane.showMessageDialog(null, "Nav vel veikti pasutijumi", null, JOptionPane.WARNING_MESSAGE);
				}
				
			
			}
		}while(!izvele.equalsIgnoreCase("Apturet"));
	}

}
