package alternative.numeriComplessi;

public class ComplexRect implements Complex {
	
	private double im,re;
	
	public ComplexRect(double re, double im) {
		this.im = im;
		this.re = re;
	}

	@Override
	public double real() {
		return re;
	}

	@Override
	public double im() {
		return im;
	}

	@Override
	public double mod() {
		return Math.sqrt(re*re+im*im);
	}

	@Override
	public double arg() {
		return Math.atan2(im, re);
	}

}
