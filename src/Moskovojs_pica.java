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
		
		String merces[] = {"Kecupa", "Kiploku", "Pesto"};
		String izmers = "";
		int izmeri;
		String merce = "";
		String mercee[] = {};
		String piedevas = "";
		String piedevasM[] = {};
		
		
		String siers = "";
		String sieers[] = {};
		List<String> atlautieSieri = Arrays.asList("mocarella", "cedara", "provolone");
		
		int izvele2;
		
		 String[] options = {"Pepperoni", "Mushrooms", "Onions", "Sausage", "Bacon"};
		
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
				 List<String> merceM = new ArrayList<String>(Arrays.asList(mercee));
				 merceM.add(merce);
				 List<String> siersM = new ArrayList<String>(Arrays.asList(sieers));
				 do {
					
				 siers = (String)JOptionPane.showInputDialog(null, "Ieraksti picas sieru", "mocarella; cedara; provolone",  JOptionPane.QUESTION_MESSAGE); 
				 if (!atlautieSieri.contains(siers)) {
		               JOptionPane.showMessageDialog(null, "Tads siers neeksiste", null, JOptionPane.ERROR_MESSAGE);
		            }
				 }while(!atlautieSieri.contains(siers));
				 siersM.add(siers);
				 piedevas = (String)JOptionPane.showInputDialog(null, "Kadas piedevas picai?(Ar komatu atdali)", null, JOptionPane.QUESTION_MESSAGE);
			     piedevasM = piedevas.split(",");
//OTRS VARIANTS PIEDEVAM
//			     boolean turpinat = false;
//				 do {
//					 piedevas = (String)JOptionPane.showInputDialog(null, "Kadas piedevas picai?(Ar komatu atdali)", null, JOptionPane.QUESTION_MESSAGE);
//				     piedevasM = piedevas.split(",");
//
//			            if (!atlautasP.contains(piedevas)) {
//			               JOptionPane.showMessageDialog(null, "Tadas piedavas neeksiste", null, JOptionPane.ERROR_MESSAGE);
//			            }
//			           
//			          izvele2 =  JOptionPane.showOptionDialog(null, "Vel kaadu piedeva velies?", null, JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null,
//			        		  new String[] {"Ja", "Ne"}, null);
//			          switch(izvele2){
//			   			case 0:
//			   				turpinat = false;
//			                break;
//			            case 1:
//			                turpinat = true;
//			                break;
//			          
//			        }
//			        } while (turpinat == false);
//			        
//			        JOptionPane.showMessageDialog(null, "Tu ievadiji sekojosas piedavas: "+piedevas, null, JOptionPane.INFORMATION_MESSAGE);
				 
			      
			     merceCena = merceM.size()*2;
			     piedevasCena = piedevasM.length * 1;
			     siersCena = siersM.size()*1;
			     summa = izmersCena + merceCena + piedevasCena;
			     Rihards_pica pica = new Rihards_pica(vards, adrese, izmers, merce, piedevas,siers, summa);
			  
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
					 List<String> merceM = new ArrayList<String>(Arrays.asList(mercee));
					 merceM.add(merce);
					 
					 piedevas = (String)JOptionPane.showInputDialog(null, "Kadas piedevas picai?(Ar komatu atdali)", null, JOptionPane.QUESTION_MESSAGE);
				     piedevasM = piedevas.split(",");
				      
				     merceCena = merceM.size()*2;
				     piedevasCena = piedevasM.length * 1;
				     summa = izmersCena + merceCena + piedevasCena;
				       
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
