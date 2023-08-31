package Java;

import java.util.Scanner;

public class LeiaNum {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);

		//Input
		System.out.println("Digite o primeiro número");
		int varA = scn.nextInt();
		
		System.out.println("Digite o segundo número");
		int varB = scn.nextInt();
		
		System.out.println("Digite o terceiro número");
		int varC = scn.nextInt();
		
		//Maior valor
		if (varA > varB && varC < varA) {
			System.out.println("O maior valor é o primeiro: " + varA);
		}
		else if (varB > varC && varA < varB) {
			System.out.println("O maior valor é o segundo: " + varB);
		} 
		else {
			System.out.println("O maior valor é o terceiro: " + varC);
		}
		
		//Menor valor
		if (varA < varB && varC > varA) {
			System.out.println("O menor valor é o primeiro: " + varA);
		}
		else if (varB < varC && varA > varB) {
			System.out.println("O menor valor é o segundo: " + varB);
		} 
		else {
			System.out.println("O menor valor é o terceiro: " + varC);
		}
		
		//Soma e Média
		System.out.println("A soma dos valores é de: " + (varA + varB + varC));
		System.out.println("A média dos valores é de: " + (varA + varB + varC) / 3);
		
		//Impares e Pares
		if (varA % 2 == 0) {
			System.out.println("O primeiro número é par");
		}
		else {
			System.out.println("O primeiro número é ímpar");
		}
		
		if (varB % 2 == 0) {
			System.out.println("O segundo número é par");
		}
		else {
			System.out.println("O segundo número é ímpar");
		}
		
		if (varC % 2 == 0) {
			System.out.println("O terceiro número é par");
		}
		else {
			System.out.println("O terceiro número é ímpar");
		}
		
		//Contagem
		int pos = 0;
		int neu = 0;
		int neg = 0;
		
		if (varA > 0) { ++pos; }
		else if (varB > 0) { ++pos; }
		else if (varC > 0) { ++pos; }
		
		if (varA == 0) { ++neu; }
		else if (varB == 0) { ++neu; }
		else if (varC == 0) { ++neu; }
		
		if (varA > 0) { ++neg; }
		else if (varB > 0) { ++neg; }
		else if (varC > 0) { ++neg; }
		
		System.out.println("São " + pos + " números positivos");
		System.out.println("São " + neu + " números neutros");
		System.out.println("São " + neg + " números negativos");
		}
}