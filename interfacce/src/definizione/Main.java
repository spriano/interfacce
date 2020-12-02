package definizione;

public class Main {

	public static void main(String[] args) {
		// si crea un rettangolo con riferimento a Figura
		Figura f=new Rettangolo(2,5);
		System.out.println("Area "+f.calcolaArea());
		System.out.println("Perimetro "+f.calcolaPerimetro());

	}
}
