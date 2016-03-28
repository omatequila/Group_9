package de.hs_mannheim.i.imb.ss16.tpe.group9.Aufgabe_1;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Betrag fuenfUSD = new Betrag(5, Waehrungen.USD);
		Betrag fuenfYen = new Betrag(5, Waehrungen.Yen);
		Betrag fuenfRUB = new Betrag(5, Waehrungen.Rubel);
		
		System.out.println(fuenfUSD.addiere(fuenfYen));
		System.out.println(fuenfYen.addiere(fuenfYen));
		System.out.println(fuenfRUB.addiere(fuenfRUB));
		
		Konto meins = new Konto("Max Mustermann",Waehrungen.USD, fuenfUSD);
		System.out.println(meins.getInhaber());
		System.out.println(meins.getSaldo().getBetrag());
		meins.buche(fuenfUSD);
		System.out.println(meins.getSaldo().getBetrag());
		meins.buche(fuenfRUB);
		System.out.println(meins.getSaldo().getBetrag());
		
		
	}

}
