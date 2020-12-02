package alternative.items;

public class Main {
	
	public static void main(String[] args) {
		Listino list=new Listino();
		Prezzi l1=new Libro("Divina Commedia","Dante",15);
		Prezzi l2=new Libro("Promessi Sposi","manzoni",14);
		
		Prezzi r1=new Rivista("Pc professionale","Novembre",5);
		Prezzi r2=new Rivista("Elettronica In","Dicembre",6);
		
		list.addItem(l1);
		list.addItem(l2);
		
		list.addItem(r1);
		list.addItem(r2);
		
		list.stampa();
		System.out.println(list.totale());
	}

}
