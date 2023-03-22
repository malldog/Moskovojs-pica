import javax.swing.JOptionPane;

public class Moskovojs_pica {

	public static void main(String[] args) {
		String izvele;
		String darbibas[] = {"Nopirkt picu", "Pasutit picu", "Aiziet", "Apturet"};
		boolean majas = false;
		
		JOptionPane.showMessageDialog(null, "Sveicinati labakaja picerija", null, JOptionPane.INFORMATION_MESSAGE);
		do{
			izvele =(String)JOptionPane.showInputDialog(null, "Darbibas izvele", null, JOptionPane.QUESTION_MESSAGE, null, darbibas, darbibas[0]);
			switch(izvele){
			case "Nopirkt picu":
				if(majas==false) {
				String izmers =(String) JOptionPane.showInputDialog(null);
				String merce = (String)JOptionPane.showInputDialog(null);
				String piedavas = (String)JOptionPane.showInputDialog(null);
				
				}else	JOptionPane.showMessageDialog(null, "Jus neesiet uz vietas picerija, pameginiet pasutit picu", "error", JOptionPane.ERROR_MESSAGE);
				break;
				
			case "Pasutit picu":
				if(majas==true){
					
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
