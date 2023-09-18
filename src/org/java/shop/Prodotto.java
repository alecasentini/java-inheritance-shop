package org.java.shop;

public class Prodotto {
	private String codice;
	private String nome;
	private String marca;
	private float prezzo;
	private int iva;
	
	public Prodotto (String codice, String nome, String marca, float prezzo, int iva){
		this.codice = codice;
		setNome(nome);
		setMarca(marca);
		setPrezzo (prezzo);
		setIva (iva);
	}
	
	public String getCodice() {
		
		return codice;
	}
	
	public String getNome() {
		
		return nome;
	}
	public void setNome(String nome) {
		
		this.nome = nome;
	}
	
	public String getMarca() {
		
		return marca;
	}
	public void setMarca(String marca) {
		
		this.marca = marca;
	}
	
	public float getPrezzo() {
		
		return prezzo;
	}
	public void setPrezzo(float prezzo) {
		
		this.prezzo = prezzo;
	}
	
	public int getIva() {
		
		return iva;
	}
	public void setIva(int iva) {
		
		this.iva = iva;
	}
	
	public float getPrezzoBase() {
		return prezzo;
	}
	
	public float getPrezzoIva() {
		float prezzoIva = prezzo + (prezzo * iva / 100);
		return prezzoIva;
	}
	
	public float calcolaPrezzoScontato(boolean rispostaFedelta) {
        float scontoBase = rispostaFedelta ? 0.02f : 0.0f; 
        return getPrezzoIva() * (1 - scontoBase);
    }

	
	
};

