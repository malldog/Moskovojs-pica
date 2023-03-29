import javax.swing.JOptionPane;

public class Rihards_pica {
	private String vards, adrese;
	private String izmers, merce, piedevas;
	private double summa;
	private String[] toppings;
public Rihards_pica(String vards, String adrese, String izmers, String merce, String piedevas, double summa){
		this.vards=vards;
		this.adrese=adrese;
		this.izmers=izmers; 
		this.merce=merce;
		this.piedevas=piedevas;
		this.summa=summa;
		this.toppings = new String[]{};
		
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
	
	public String getPiedevas(){
		return piedevas;
	}
	
	public double getSumma(){
		return summa;
	}
	
	
	public String izvadit(){
		if(adrese == "Uz vietas") {
			
			String izvade = vards+" nopirka "+izmers+" picu ar "+merce+" merci un "+piedevas+" piedevam un samaksaja "+summa;
			return izvade;
		}else{
			String izvade = vards+" pasutija uz adresi "+adrese+" "+izmers+" picu ar "+merce+" merci un "+piedevas+" piedevam un samaksaja "+summa;
			return izvade;
		}
		
		
		
		
	}
	public String toString(){
		if(adrese == "Uz vietas") {
			
			String izvade = vards+" nopirka "+izmers+" picu ar "+merce+" merci un "+piedevas+" piedevam un samaksaja "+summa;
			return izvade;
		}else{
			String izvade = vards+" pasutija uz adresi "+adrese+" "+izmers+" picu ar "+merce+" merci un "+piedevas+" piedevam un samaksaja "+summa;
			return izvade;
		}
		
	}
		
			
		
		
	
	
}
