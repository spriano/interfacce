package alternative.items;

public class Libro implements Prezzi{
	
	private String titolo;
	private double prezzo;
	private String autore;
	
	public Libro(String titolo, String autore, double prezzo) {
		this.titolo = titolo;
		this.prezzo = prezzo;
		this.autore = autore;
	}

	@Override
	public void setPrice(double prezzo) {
		this.prezzo=prezzo;
		
	}

	@Override
	public double getprice() {
		return prezzo;
		
	}

	@Override
	public String toString() {
		return "Libro: " + titolo + ", "+ autore+ " ," + prezzo ;
	}
	

}
