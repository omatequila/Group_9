package de.hs_mannheim.i.imb.ss16.tpe.group9.Aufgabe_1;
import java.util.ArrayList;

public class Konto {

	private String inhaber;
	private Waehrung waehrung;
	private Betrag saldo;
	private ArrayList betraege = new ArrayList();

	public Konto(String inhaber, Waehrung waehrung, Betrag saldo){
		this.inhaber = inhaber;
		this.waehrung = waehrung;
		this.saldo = saldo;
		betraege.add(this.saldo);
	}
	public Konto(String inhaber, Waehrung waehrung){
		this.inhaber = inhaber;
		this.waehrung = waehrung;
		this.saldo = new Betrag(0, waehrung);
		betraege.add(this.saldo);
	}
	
	public String getInhaber(){
		return this.inhaber;
	}
	
	public Betrag getSaldo(){
		return this.saldo;
	}
	
	public void buche(Betrag betrag){
		long saldoneu;
		if(betrag.getBetrag() < 0) {
			saldoneu = saldo.subtrahiere(betrag);
		} else{
			saldoneu = saldo.addiere(betrag);
		}
			betraege.add(betrag);
		saldo.setBetrag(saldoneu);
		
		
	}
	public long saldo(){
		return this.saldo.getBetrag();
	}
	
	public long gebuehren(long pwert){
		long erg = this.saldo.promille(pwert);
		return erg;
	}
	
	public Waehrung getWaehrung(){
		return this.waehrung;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
