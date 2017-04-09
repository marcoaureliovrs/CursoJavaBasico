package br.com.marcogorak.aula13;

public class CurtoCircuito {

	public static void main(String[] args) {
		boolean verdadeiro =true;
		boolean falso = false;
		//Verifica ambos valores
		boolean resultado1 = falso & verdadeiro;
		
		/**Verifica o primeiro valor se caso já for falso o 
		 * intepretador nem verifica o segundo pois entende-se 
		 * que o resultado será falso
		 */
		boolean resultado2 = falso && verdadeiro; 

		System.out.println(resultado1);
		System.out.println(resultado2);
		

	}

}
