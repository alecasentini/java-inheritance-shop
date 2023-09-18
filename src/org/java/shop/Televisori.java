package org.java.shop;

public class Televisori extends Prodotto{
	
	private int dimensioni;
	private boolean smart;
	
	public Televisori (String codice, String nome, String marca, float prezzo, int iva, int dimensioni, boolean smart) {
		
		super(codice, nome, marca, prezzo, iva);
		setDimensioni (dimensioni);
		setSmart (smart);
	}
	
	public int getDimensionii() {
		return dimensioni;
	}
	
	public void setDimensioni(int dimensioni) {
		this.dimensioni = dimensioni;
	}
	
	public boolean getSmart(){
		return smart;
	}
	
	public void setSmart(boolean smart) {
		this.smart = smart;
	}
	
	@Override
	public String toString() {
		return "Televisore [codice= " + getCodice() + ", nome= " + getNome() 
			+ ", marca= " + getMarca() + ", prezzo= " + getPrezzoBase() 
			+ "euro, iva= " + getIva() + ", dimensioni= " + dimensioni 
			+ " pollici, smart= " + (smart ? "Sì" : "No") + "]";
	}
	
	@Override
    public float calcolaPrezzoScontato(boolean rispostaFedelta) {

        if (!getSmart()) {
            return getPrezzoIva() * (1 - 0.10f); 
        } else {
            return super.calcolaPrezzoScontato(rispostaFedelta);
        }
    }

		
};
