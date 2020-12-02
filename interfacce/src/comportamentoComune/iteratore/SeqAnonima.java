package comportamentoComune.iteratore;

import java.util.Iterator;

import comportamentoComune.iteratore.Sequenza.Seq;

public class SeqAnonima implements Iterable{
	
private Persona[] lista;
	
	public SeqAnonima(Persona[] lista) {
		this.lista = lista;
	}
	
	@Override
	// restituisce una classe interna che implementa Iterator
	public Iterator iterator() {
		return new Iterator() {
			private int i=0;
		
			public boolean hasNext() {
				return i<lista.length;
			}
			@Override
			public Object next() {		
				return lista[i++];
			}
		};
	}
	
}

