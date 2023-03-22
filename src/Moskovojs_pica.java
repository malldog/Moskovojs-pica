import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.swing.JOptionPane;

public class Moskovojs_pica {

	public static void main(String[] args) {
		String izvele;
		String darbibas[] = {"Nopirkt picu", "Pasutit picu", "Aiziet", "Apturet"};
		
		int izmersCena = 0;
		int merceCena = 0;
		int piedavasCena = 0;
		int summa = 0;
		String merces[] = {"Kecupa", "Kiploku", "Pesto"};
		String izmers = "";
		int izmeri;
		String merce = "";
		String mercee[] = {};
		String piedavas = "";
		String piedavasM[] = {};
		
		boolean majas = false;
		
		JOptionPane.showMessageDialog(null, "Sveicinati labakaja picerija", null, JOptionPane.INFORMATION_MESSAGE);
		do{
			izvele =(String)JOptionPane.showInputDialog(null, "Darbibas izvele", null, JOptionPane.QUESTION_MESSAGE, null, darbibas, darbibas[0]);
			switch(izvele){
			case "Nopirkt picu":
				if(majas==false) {
				 izmeri = JOptionPane.showOptionDialog(null, "Cik lielu picu velies?", null, JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE,
						 null, new String[] {"20cm", "30cm", "50cm"}, null);
				 switch(izmeri){
		   			case 0:
		   				izmers = "20cm";
		                izmersCena = 5;
		                break;
		            case 1:
		                izmers = "30cm";
		                izmersCena = 6;
		                break;
		            case 2:
		                izmers = "50cm";
		                izmersCena = 8;
		                break;
		        }
				 merce = (String)JOptionPane.showInputDialog(null, "Kadu merci velies?", null, JOptionPane.QUESTION_MESSAGE, null, merces, merces[0]);
				 List<String> merceM = new ArrayList<String>(Arrays.asList(mercee));
				 merceM.add(merce);
				 
				 piedavas = (String)JOptionPane.showInputDialog(null, "Kadas piedevas picai?(Ar komatu atdali)", null, JOptionPane.QUESTION_MESSAGE);
			     piedavasM = piedavas.split(",");
			      
			     merceCena = merceM.size()*2;
			     piedavasCena = piedavasM.length * 1;
			     summa = izmersCena + merceCena + piedavasCena;
			        
			     Rihards_pica pica = new Rihards_pica(izmers, merce, piedavas, summa);
				 JOptionPane.showMessageDialog(null, "Pica nopirkta", null, JOptionPane.INFORMATION_MESSAGE);
				 
				}else	JOptionPane.showMessageDialog(null, "Jus neesiet uz vietas picerija, pameginiet pasutit picu", "error", JOptionPane.ERROR_MESSAGE);
				break;
				
			case "Pasutit picu":
				if(majas==true){
					 izmeri = JOptionPane.showOptionDialog(null, "Cik lielu picu velies?", null, JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE,
							 null, new String[] {"20cm", "30cm", "50cm"}, null);
					 switch(izmeri){
			   			case 0:
			   				izmers = "20cm";
			                izmersCena = 5;
			                break;
			            case 1:
			                izmers = "30cm";
			                izmersCena = 6;
			                break;
			            case 2:
			                izmers = "50cm";
			                izmersCena = 8;
			                break;
			        }
					 merce = (String)JOptionPane.showInputDialog(null, "Kadu merci velies?", null, JOptionPane.QUESTION_MESSAGE, null, merces, merces[0]);
					 List<String> merceM = new ArrayList<String>(Arrays.asList(mercee));
					 merceM.add(merce);
					 
					 piedavas = (String)JOptionPane.showInputDialog(null, "Kadas piedevas picai?(Ar komatu atdali)", null, JOptionPane.QUESTION_MESSAGE);
				     piedavasM = piedavas.split(",");
				      
				     merceCena = merceM.size()*2;
				     piedavasCena = piedavasM.length * 1;
				     summa = izmersCena + merceCena + piedavasCena;
				        
				     Rihards_pica pica = new Rihards_pica(izmers, merce, piedavas, summa);
					 JOptionPane.showMessageDialog(null, "Pica pasutita", null, JOptionPane.INFORMATION_MESSAGE);	
				}else 	JOptionPane.showMessageDialog(null, "Jus neesiet majas, pameginiet nopirkt picu", "error", JOptionPane.ERROR_MESSAGE);

				break;
				
			case "Aiziet":
				if(majas==false){
					majas = true;
					JOptionPane.showMessageDialog(null, "Jus aizgajat majas", null, JOptionPane.INFORMATION_MESSAGE);
				}else{
					majas = false;
					JOptionPane.showMessageDialog(null, "Jus aizgajat uz piceriju", null, JOptionPane.INFORMATION_MESSAGE);
				}
				break;
				}
		}while(!izvele.equalsIgnoreCase("Apturet"));
	}

}
