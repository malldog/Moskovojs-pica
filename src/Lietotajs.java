
public class Lietotajs {
	private String vards, adrese;
	Rihards_pica pica;
	public Lietotajs(String vards, String adrese, Rihards_pica pica){
		this.vards=vards;
		this.adrese=adrese;
		this.pica=pica;
	}
	public String getVards(){
		return vards;
	}
	public String getAdrese(){
		return adrese;
	}
	
	public String ceks(){
		if(adrese == "Uz vietas") {
			String izvade = "\nSanemts picerija\nPasutitajs "+vards+"\nPicas izmers "+pica.getIzmers()+"\nPicas merce "+pica.getMerce()+"\nPicas siers "+pica.getSiers()+
					"\nPicas piedevas "+pica.getPiedevas()+"\n\nKopa samaksajat: "+pica.getSumma()+"$";
			return izvade;
		}else{
			String izvade = "\nPasutita uz "+adrese+"\nMaksa par piegadi 3$\nPasutitajs: "+vards+"\nPicas izmers "+pica.getIzmers()+"\nPicas merce "+pica.getMerce()+"\nPicas siers "+pica.getSiers()+
					"\nPicas piedevas "+pica.getPiedevas()+"\n\nKopa samaksajat: "+pica.getSumma()+"$";
			return izvade;
		}
		
	}
	//Prieks izveidotam picam
	public String izvadit() {
		
		if(adrese == "Uz vietas") {
			String izvade = "\nSanemts picerija\nPasutitajs "+vards+"\nPicas izmers "+pica.getIzmers()+"\nPicas merce "+pica.getMerce()+"\nPicas siers "+pica.getSiers()+
					"\nPicas piedevas "+pica.getPiedevas()+"\n\nKopa samaksajat: "+pica.getSumma()+"$\n---------------------------------------------------------";
			return izvade;
		
		}else {
			String izvade = "\nPasutita uz "+adrese+"\nMaksa par piegadi 3$\nPasutitajs: "+vards+"\nPicas izmers "+pica.getIzmers()+"\nPicas merce "+pica.getMerce()+"\nPicas siers "+pica.getSiers()+
					"\nPicas piedevas "+pica.getPiedevas()+"\n\nKopa samaksajat: "+pica.getSumma()+"$\n---------------------------------------------------------";
			return izvade;
		}
	}
	
	//Prieks txt faila
	public String toString(){
		if(adrese == "Uz vietas") {
			String izvade = vards+" nopirka "+pica.getIzmers()+" picu ar "+pica.getMerce()+" merci ar "+pica.getSiers()+" sieru un "+pica.getPiedevas()+" piedevam un samaksaja "+pica.getSumma()+"$";
			return izvade;
		}else{
			String izvade = vards+" pasutija uz adresi "+adrese+" "+pica.getIzmers()+" picu ar "+pica.getMerce()+" merci ar "+pica.getSiers()+" sieru un "+pica.getPiedevas()+" piedevam un samaksaja "+pica.getSumma()+"$";
			return izvade;
		}
		
	}
}
