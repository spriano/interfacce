package alternative.items;

import java.util.ArrayList;
import java.util.List;

public class Listino {
	// si utiliozza l'UpCast a Prezzi per memorizzare 
	// sia oggetti di tipo Libro che di tipo Rivista
	private List<Prezzi> items;

	public Listino() {
		items= new ArrayList<>();
	}
	public void addItem(Prezzi p) {
		items.add(p);
	}
	public int numeroItems() {
		return items.size();
	}
	public double totale(){
		double somma=0;
		System.out.print("totale: ");
		for(Prezzi p: items) {
			somma+=p.getprice();
		}
		return somma;
	}
	public void stampa() {
		for(Prezzi p: items) {
			System.out.println(p);
		}
	}
}
