package comportamentoComune.iteratore;

public class Persona {
	String nome;
	String cognome;
	
	public Persona(String nome, String cognome) {
		this.nome = nome;
		this.cognome = cognome;
	}
	
	@Override
	public String toString() {
		return nome + ", " + cognome;
	}

}
