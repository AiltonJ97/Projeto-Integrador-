package aplicação;

import java.util.Random;

import Entidade.Palavras;

public class Programa {

public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Palavras pl = new Palavras();
		
		char[] c = null;
		
		System.out.println("-------------------------------");
		System.out.println("-----------Bem Vindo-----------");
		System.out.println("--------------ao---------------");
		System.out.println("---------Jogo da Forca---------");
		System.out.println("-------------------------------");
		System.out.println();
		System.out.println("Voçê tem 8 Tentativas!!");
		String x = pl.getPalavras();
		
		c = x.toCharArray();
		
		System.out.println(x);
		
		int tamanho = x.length();
		
		// Teste de impressão de letras
		/*for (int i = 0; i < x.length(); i++) {
			System.out.print(c[i] + " ");
		}*/
		
		for(int j = 0; j < tamanho; j++) {
			System.out.print("_ ");
		}
		
		for (int i = 0; i < 8; i++) {	
			System.out.println();
			System.out.println("Digite uma letra: ");
			char letra = sc.next().charAt(0);
			for (int j = 0; j < tamanho; j++) {
				if (c[j] == letra) {
					System.out.print(letra);
				}	else {
					System.out.print("_ ");
				}
			}
		}
		sc.close();
	}	
}
