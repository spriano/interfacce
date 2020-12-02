package alternative.numeriComplessi;

public class Main {

	public static void main(String[] args) {
		
		Complex c1=new ComplexRect(3,4);
		
		Complex c2 =new ComplexPolar(5,0.9272);
		
		System.out.println(c1.real()+" + j "+c1.im());
		
		System.out.println(c1.mod()+" /__ "+c1.arg());
		
		System.out.println(c2.real()+" + j "+c2.im());
	}

}
