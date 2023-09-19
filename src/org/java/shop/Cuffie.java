package org.java.shop;

public class Cuffie extends Prodotto{
	
	private String colore;
	private boolean wireless;
	
	public Cuffie (String codice, String nome, String marca, float prezzo, int iva, String colore, boolean wireless) {
		super (codice, nome, marca, prezzo, iva);
		setColore(colore);
		setWireless(wireless);
	}
	
	public String getColore() {
		return colore;
	}
	
	public void setColore (String colore) {
		this.colore = colore;
	}
	
	public boolean getWireless() {
		return wireless;
	}
	
	public void setWireless(boolean wireless) {
		this.wireless = wireless;
	}
	
	@Override
	public String toString() {
		return "Cuffie [codice= " + getCodice() + ", nome= " + getNome() 
			+ ", marca= " + getMarca() + ", prezzo= " + getPrezzoBase() 
			+ "euro, iva= " + getIva() + ", colore= " + colore 
			+ ", wireless= " + (wireless ? "Sì" : "No") + "]";
	}
	
	 @Override
	 public float calcolaPrezzoScontato(boolean rispostaFedelta) {

	        if (!getWireless()) {
	            return getPrezzoIva() * (1 - 0.07f); 
	        } else {
	            return super.calcolaPrezzoScontato(rispostaFedelta); 
	        }
	 }

};
