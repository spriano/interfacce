package alternative.factory;

public interface Complex {
	double real();
	double im();
	double mod();
	double arg();
	//metodo statico per costruire un oggetto di tipo ComplexRect
	static Complex fromRect(double re, double im) {
		return new ComplexRect(re,im);
	}
	//metodo statico per costruire un oggetto di tipo ComplexPolar
	static Complex fromPolar(double mod, double arg) {
		return new ComplexPolar(mod,arg);
	}
	
}
