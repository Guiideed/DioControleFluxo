package bootcamp.dio.arrayeloop;

public class Programa {
	public static void main (String[]args) {
		int[] vetor = {-6,-5,15,50,52};
		int contagem = 0;
		
		
		
		
		for(int i = (vetor.length -1) ; i >= 0 ; i--) {
			System.out.println(vetor[i]);
		}
		while(contagem<(vetor.length)) {
			System.out.println(vetor[contagem]);
			contagem++;
		}
	}
	
}

