package bootcamp.dio.arrayeloop;
import java.util.Scanner;

public class Tabuada {
	public static void main(String[]args) {
		Scanner leitor = new Scanner(System.in);
		System.out.println("Qual o numero da tabuda voce vai verificar?");
		int valorTabuada = leitor.nextInt();
		
		int contagem = 0;
		
		for(int i = 1; i<=9; i++) {
			System.out.println(valorTabuada+  "x "+ i+ " = " + (valorTabuada*i));
			contagem++;
			
		}
		leitor.close();

}

}