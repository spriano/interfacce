package alternative.items;

public class Rivista implements Prezzi {
	
	private String nome;
	private String mese;
	private double prezzo;
	
	

	public Rivista(String nome, String mese, double prezzo) {
		super();
		this.nome = nome;
		this.mese = mese;
		this.prezzo = prezzo;
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
		return "Rivista: " + nome + ", "+ mese+ " ," + prezzo ;
	}
}
