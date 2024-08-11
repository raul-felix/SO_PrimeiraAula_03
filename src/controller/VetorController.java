package controller;

public class VetorController {
	
	public VetorController() {
		super();
	}
	
	public void parOuImpar(int[] vet) {
		
		for (int num : vet) {
			if (num % 2 != 0) {
				System.out.println(num + " é ímpar");
			} else if (num % 10 == 0) {
				System.out.println(num + " é par e múltiplo de 10");
			}
		}
	}
}
