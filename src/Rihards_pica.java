

public class Rihards_pica {
	private String vards, adrese;
	private String izmers, merce, piedevas, siers;
	private double summa;
public Rihards_pica(String vards, String adrese, String izmers, String merce, String piedevas, String siers, double summa){
		this.vards=vards;
		this.adrese=adrese;
		this.izmers=izmers; 
		this.merce=merce;
		this.piedevas=piedevas;
		this.siers=siers;
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
	
	public String getPiedevas(){
		return piedevas;
	}
	public String getSiers(){
		return siers;
	}
	
	public double getSumma(){
		return summa;
	}
	public String ceks(){
		
		
		
	     
		if(adrese == "Uz vietas") {
			String izvade = "\nSanemts picerija\nPasutitajs "+vards+"\nPicas izmers "+izmers+"\nPicas merce "+merce+"\nPicas siers "+siers+
					"\nPicas piedevas "+piedevas+"\n\nKopa samaksajat: "+summa+"$";
			return izvade;
		}else{
			String izvade = "\nPasutita uz "+adrese+"\nMaksa par piegadi 3$\nPasutitajs: "+vards+"\nPicas izmers "+izmers+"\nPicas merce "+merce+"\nPicas siers "+siers+
					"\nPicas piedevas "+piedevas+"\n\nKopa samaksajat: "+summa+"$";
			return izvade;
		}
		
		
		
		
	}
	//Prieks izveidotam picam
	public String izvadit() {
		
		if(adrese == "Uz vietas") {
			String izvade = "\nSanemts picerija\nPasutitajs "+vards+"\nPicas izmers "+izmers+"\nPicas merce "+merce+"\nPicas siers "+siers+
					"\nPicas piedevas "+piedevas+"\n\nKopa samaksajat: "+summa+"$\n---------------------------------------------------------";
			return izvade;
		
		}else {
			String izvade = "\nPasutita uz "+adrese+"\nMaksa par piegadi 3$\nPasutitajs: "+vards+"\nPicas izmers "+izmers+"\nPicas merce "+merce+"\nPicas siers "+siers+
					"\nPicas piedevas "+piedevas+"\n\nKopa samaksajat: "+summa+"$\n---------------------------------------------------------";
			return izvade;
		}
	}
	
	//Prieks txt faila
	public String toString(){
		if(adrese == "Uz vietas") {
			String izvade = vards+" nopirka "+izmers+" picu ar "+merce+" merci ar "+siers+" sieru un "+piedevas+" piedevam un samaksaja "+summa+"$";
			return izvade;
		}else{
			String izvade = vards+" pasutija uz adresi "+adrese+" "+izmers+" picu ar "+merce+" merci ar "+siers+" sieru un "+piedevas+" piedevam un samaksaja "+summa+"$";
			return izvade;
		}
		
	}
		
			
		
		
	
	
}
