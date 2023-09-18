package org.java.shop;

public class Main {
	public static class Smartphone extends Prodotto{
		private String imei;
		private int memoria;
		
		public Smartphone (String codice, String nome, String marca, float prezzo, int iva, String imei, int memoria) {
			
			super (codice, nome, marca, prezzo, iva);
			setImei (imei);
			setMemoria(memoria);
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
	    public float calcolaPrezzoScontato(boolean tesseraFedelta) {

			if (getMemoria() < 32) {
		        return getPrezzoBase() * (1 - 0.05f); 
		    } else {
		        return super.calcolaPrezzoScontato(tesseraFedelta); 
		    }
	    }
			
	};
		
	public static class Televisori extends Prodotto{
		
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
	    public float calcolaPrezzoScontato(boolean tesseraFedelta) {

	        if (!getSmart()) {
	            return getPrezzoIva() * (1 - 0.10f); 
	        } else {
	            return super.calcolaPrezzoScontato(tesseraFedelta);
	        }
	    }

			
	};

	public static class Cuffie extends Prodotto{
		
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
		 public float calcolaPrezzoScontato(boolean tesseraFedelta) {

		        if (!getWireless()) {
		            return getPrezzoBase() * (1 - 0.07f); 
		        } else {
		            return super.calcolaPrezzoScontato(tesseraFedelta); 
		        }
		 }

	};

	public static void main(String[] args) {
		Smartphone s1 = new Smartphone("1A", "XS", "iPhone", 889.0f, 22, "55555-11-444444-3", 64);
		System.out.println(s1);
		
		Smartphone s2 = new Smartphone("1B", "P20", "Huawei", 349.0f, 22, "66666-22-999999-8", 32);
		System.out.println(s2);
		
		Televisori t1 = new Televisori ("2A", "Cristal UHD", "Samsung", 1300.0f, 22, 55, true);
		System.out.println(t1);
		
		Televisori t2 = new Televisori ("2B", "Oled HD", "LG", 1000.0f, 22, 44, false);
		System.out.println(t2);
		
		Cuffie c1 = new Cuffie ("3A", "500 Tune", "JBL", 40.0f, 22, "Bianco", false);
		System.out.println(c1);
		
		Cuffie c2 = new Cuffie ("3B", "Quietcomfort", "Bose", 300.0f, 22, "Nero", true);
		System.out.println(c2);
		
		
	}
}
