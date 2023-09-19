package org.java.shop;

public class Smartphone extends Prodotto{
	private String imei;
	private int memoria;
	
	public Smartphone (String codice, String nome, String marca, float prezzo, int iva, String imei, int memoria) {
		
		super (codice, nome, marca, prezzo, iva);
		this.setImei(imei);
		this.setMemoria(memoria);
	}
	
	public String getImei() {
		return imei;
	}
	
	public void setImei (String imei) {
		this.imei = imei;
	}
	
	public int getMemoria() {
		return memoria;
	}
	
	public void setMemoria(int memoria) {
		this.memoria = memoria;
	}
	
	@Override
	public String toString() {
		return "Smartphone [codice= " + getCodice() + ", nome= " + getNome() 
			+ ", marca= " + getMarca() + ", prezzo= " + getPrezzoBase() 
			+ "euro, iva= " + getIva() + "%, imei=" + imei + ", memoria= " + memoria + "Gb]";
	}
	
	@Override
    public float calcolaPrezzoScontato(boolean rispostaFedelta) {

		if (getMemoria() < 32) {
	        return getPrezzoIva() * (1 - 0.05f); 
	    } else {
	        return super.calcolaPrezzoScontato(rispostaFedelta); 
	    }
    }
		
};
