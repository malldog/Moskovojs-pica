
public class Rihards_pica {
	private String izmers, merce, piedavas;
	private int summa;
	
public Rihards_pica( String izmers, String merce, String piedavas, int summa){
		
		this.izmers=izmers; 
		this.merce=merce;
		this.piedavas=piedavas;
		this.summa=summa;
		
		
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
	
	public int getSumma(){
		return summa;
	}
	
	
}
