package operadoreRelacionais;

public class Operadores {
	public static void main (String[]args) {
		
		int valor1 = 2;
		int valor2= 3;
		
		System.out.println(valor1 == valor2);
		System.out.println(valor1 >= valor2);
		System.out.println(valor1 <= valor2);
		System.out.println(valor1 != valor2);
		
		
		
		String nome1 = "Gustavo";
		String nome2 = "Jonas";
		/* Não funcina, pois são dados diferentes:
		*System.out.println(nome1 == valor2);
		*System.out.println(valor1 >= valor2);
		*/
		
		System.out.println(nome1 == nome2);
		System.out.println(valor1 != valor2);
	}
}
