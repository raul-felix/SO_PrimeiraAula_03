package view;

import java.util.Scanner;

import controller.VetorController;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o tamanho do vetor: ");
		int tamanho = sc.nextInt();
		int[] vetor = new int[tamanho];
		
		for (int i = 0; i < tamanho; i++) {
			System.out.println("Digite um valor: ");
			vetor[i] = sc.nextInt();
		}
		
		VetorController vetorController = new VetorController();
		vetorController.parOuImpar(vetor);
	}

}
