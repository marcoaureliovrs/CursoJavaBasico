package br.com.marcogorak.aula13;

public class OperadoresLogicos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int valor1 = 1;
		int valor2 = 2;
		
		boolean resultado1 = (valor1 ==1) && (valor2==2);
		System.out.println("Valor � 1 AND valor 2 � 2 - resultado: "+ resultado1);
		
		boolean resultado2 = (valor1 == 1) || (valor2 == 2);
		System.out.println("Valor � 1 OR valor 2 � 2 - resultado: "+ resultado2);
		
		boolean verdadeiro = true;
		boolean falso = false;
		System.out.println(verdadeiro && falso); //false
		System.out.println(verdadeiro || falso); //true
		System.out.println(verdadeiro ^ falso); //true
		System.out.println(!verdadeiro || falso); //false
		
		

	}

}
