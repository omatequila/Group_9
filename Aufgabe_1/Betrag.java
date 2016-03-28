package de.hs_mannheim.i.imb.ss16.tpe.group9.Aufgabe_1;

public class Betrag {
	private long betrag;
	private Waehrung waehrung;
	
	public Betrag (long  betrag, Waehrung waehrung){
		this.betrag = betrag*100; 	
		this.waehrung = waehrung;
	}
	
	public Betrag (double  betrag, Waehrung waehrung){
		this.betrag = (long)(betrag*100);	
		this.waehrung = waehrung;
	}
	public long getBetrag(){
		return this.betrag;
	}
	public void setBetrag(long betrag){
		this.betrag = betrag;
	}
	public long getVorzeichen(){
		if(this.betrag<0){
			return -1;
		}else{
			return 1;
		}
		
	}
	
	public long addiere( Betrag betragEins){
		long Additionsbetrag = this.waehrung.umrechnen(this.betrag, betragEins.waehrung);
			 Additionsbetrag = (Additionsbetrag + betragEins.betrag);
			 Additionsbetrag = betragEins.waehrung.umrechnen(Additionsbetrag, this.waehrung);
		return Additionsbetrag;
	}

	public long subtrahiere( Betrag betragEins){
		long Subtraktionsbetrag = (this.betrag - betragEins.betrag);
		return Subtraktionsbetrag;
	}
	
	public long multipliziere(double betragEins){
		long summe = (long)(this.betrag * betragEins);
		return summe;
	}
	
	public long multipliziere(long betragEins){
		long summe = (this.betrag*betragEins);
		return summe;	
	}
	
	public long prozent(long prozentwert){
		long pwert = (this.betrag*prozentwert)/100;
		return pwert;
	}
	
	public long promille(long promillewert){
		long pwert = (this.betrag*promillewert)/1000;
		return pwert;
	}

	public long getVorkomma(){
		//sebasti erkärt mir später 
		if (this.betrag > 0) {
			return this.betrag % 100;
		}
		else {
			return this.betrag * (-1) % 100;
		}
	}
	
	public long getNachkomma(){
		
		double KommaZahl = this.betrag;
		
		int zweiNachkommaStellen = (int)(KommaZahl * 100.0) % 100;
		return zweiNachkommaStellen;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
