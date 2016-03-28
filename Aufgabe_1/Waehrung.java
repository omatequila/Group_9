package de.hs_mannheim.i.imb.ss16.tpe.group9.Aufgabe_1;

public class Waehrung {

	private String name;
	private String kuerzel;
	private long kurs;

	public Waehrung(String name, String kuerzel, long kurs) {
		this.name = name;
		this.kuerzel = kuerzel;
		this.kurs = kurs;
	}

	public String getName() {
		return this.name;
	}

	public String getKuerzel() {
		return this.kuerzel;
	}

	public long getKurs() {
		return this.kurs;
	}

	public long umrechnen(long Betrag, Waehrung Zielwaehrung) {
		// Umwandlung in USD
		long hilfe = (Betrag * 100) * this.kurs;
		// Umwandlung in Zielwaehrung
		hilfe = hilfe / Zielwaehrung.kurs;
		hilfe = hilfe / 100;
		// weil super außergewöhnliches rechnen in anderer klasse *100

		return hilfe;
	}

	@Override
	public String toString() { // Rubel [RUB] 1 $ = 0,0254 RUB
		double dhilfe;
		// Keine Klammer um ganze Rechnung weil (double) sich nur auf urspr.
		// long-wert this.kurs bezieht
		dhilfe = (double) (this.kurs) / 10000;
		return this.name + " [" + this.kuerzel + "] 1 $ = " + dhilfe + " " + this.kuerzel;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Waehrung other = (Waehrung) obj;
		if (kuerzel == null) {
			if (other.kuerzel != null)
				return false;
		} else if (!kuerzel.equals(other.kuerzel))
			return false;
		if (kurs != other.kurs)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((kuerzel == null) ? 0 : kuerzel.hashCode());
		result = prime * result + (int) (kurs ^ (kurs >>> 32));
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Waehrungen.Rubel);
		System.out.println(Waehrungen.Rubel.umrechnen(40, Waehrungen.Rubel));
		System.out.println(Waehrungen.USD.umrechnen(40, Waehrungen.Rubel));

	}

}
