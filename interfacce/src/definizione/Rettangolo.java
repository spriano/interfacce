package definizione;

public class Rettangolo implements Figura{
	private double base;
	private double altezza;
	
	public Rettangolo(double base, double altezza) {
		this.base=base;
		this.altezza=altezza;
	}
	

	@Override
	public double calcolaArea() {
		return base*altezza;
	}

	@Override
	public double calcolaPerimetro() {
		return 2*(base+altezza);
	}
}