package Java;

import java.util.Scanner;
import java.lang.Math;

public class CalcJavaClass {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		//loop
		int lp = 1;
		while (lp == 1) {
		
		// Input
		System.out.println("Digite o primeiro número");
		float num1 = scn.nextFloat();
		
		System.out.println("Digite a operação");
		String oper = scn.next();
		
		System.out.println("Digite o segundo número");
		float num2 = scn.nextFloat();
		
		switch (oper) {
		case "+": System.out.println(num1 + num2); break;
		case "-": System.out.println(num1 - num2); break;
		case "/": System.out.println(num1 / num2); break;
		case "*": System.out.println(num1 * num2); break;
		default:
			
			
			System.out.println("Quer fazer uma nova operação? Para sim, digite 1. Para não, digite 2");
			lp = scn.nextInt();
		}
	}

}
