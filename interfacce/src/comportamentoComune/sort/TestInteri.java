package comportamentoComune.sort;

import java.util.Arrays;

public class TestInteri {

	public static void main(String[] args) {
		int[] v = {7,2,5,1,8,5};
		
		for(int i : v) {
			System.out.print(i+",");
		
		}
		
		Arrays.sort(v);
		
		System.out.println("");
		
		for(int i : v) {
			System.out.print(i+",");
		
		}
	}
}
