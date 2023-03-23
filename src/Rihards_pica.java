import javax.swing.JOptionPane;

public class Rihards_pica {
	private String vards, adrese;
	private String izmers, merce, piedavas;
	private double summa;
	
public Rihards_pica(String vards, String adrese, String izmers, String merce, String piedavas, double summa){
		this.vards=vards;
		this.adrese=adrese;
		this.izmers=izmers; 
		this.merce=merce;
		this.piedavas=piedavas;
		this.summa=summa;
		
		
	}
	public String getVards(){
		return vards;
	}
	public String getAdrese(){
		return adrese;
	}
	public String getIzmers(){
		return izmers;
	}
	
	public String getMerce(){
		return merce;
	}
	
	public String getPiedavas(){
		return piedavas;
	}
	
	public double getSumma(){
		return summa;
	}
	
	public String izvadit() {
		if(adrese == "Uz vietas") {
			
			String izvade = vards+" nopirka "+izmers+" picu ar "+merce+" merci un "+piedavas+" piedevam un samaksaja "+summa;
			return izvade;
		}else{
			String izvade = vards+" pasutija uz adresi "+adrese+" "+izmers+" picu ar "+merce+" merci un "+piedavas+" piedevam un samaksaja "+summa;
			return izvade;
		}
		
	}
	
		
			
		
		
	
	
}
