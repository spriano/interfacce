package comportamentoComune.sort;

public class Studente implements Comparable {
	
	private int id;
	private String nome;
	private String cognome;
	
	public Studente(int id, String nome, String cognome) {
		this.id = id;
		this.nome = nome;
		this.cognome = cognome;
	}

	@Override
	// confronta i cognomi
	public int compareTo(Object o) {
		// il parametro passato è di tipo Object
		Studente other=(Studente)o; // downCast
		//confronto sui cognomi
		return cognome.compareTo(other.cognome);
	}

	@Override
	public String toString() {
		return  id + ", " + nome + ", " + cognome;
	}

}
