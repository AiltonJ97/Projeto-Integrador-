package Entidade;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Palavras {
	private String[] palavras = new String[] { "ARPANET", "BROWSER", "CLIENTE", "FLUXOGRAMA", "DOWNLOAD", "FIREWALL",
			"INTERNET", "NAVEGACAO", "PACOTE", "PROTOCOLO", "ROTEADOR", "REPETIDOR", "APLICACAO", "ASSINATURA",
			"BITNET", "CIBERESPACO", "DATAGRAMA", "DOMINIO", "PORTAL", "PROVEDOR", "SERVIDOR", "TRANSFERENCIA" };

	public Palavras() {
		System.out.println("-------------------------------");
		System.out.println("-----------Bem Vindo-----------");
		System.out.println("--------------ao---------------");
		System.out.println("---------Jogo da Forca---------");
		System.out.println("-------------------------------");
		System.out.println();
		System.out.println("Voçê tem 8 Tentativas!!");
	}

	// Gerador de palavras
	public String getPalavras() {
		Random random = new Random();
		int x = random.nextInt(palavras.length);
		String palavra = this.palavras[x];

		return palavra;
	}

	// Metodo executador do game
	public void Game() {
		Scanner sc = new Scanner(System.in);

		char repetir = 'S';

		while (repetir == 'S') {
			// Buscar palavra e armazenar num array
			String x = getPalavras();
			char[] c = x.toCharArray();
			int tamanho = x.length();
			String[] resultado = new String[tamanho];

			for (int j = 0; j < tamanho; j++) {
				resultado[j] = "_ ";
			}

			// inicio do game
			for (int i = 0; i < 8; i++) {
				System.out.println();
				System.out.println("Digite uma letra: ");
				char letra = sc.next().toUpperCase().charAt(0);
				for (int j = 0; j < tamanho; j++) {
					if (c[j] == letra) {
						resultado[j] = letra + "";
					}
				}
				// Saida do resultado do game
				System.out.println(Arrays.toString(resultado));
				System.out.println();

				// Reponder a palavra chave
				System.out.println("Deseja responder a palavra? S/N");
				char responder = sc.next().toUpperCase().charAt(0);
				if (responder == 'S') {
					sc.nextLine();
					System.out.println("Qual a palavra?");
					String palavra = sc.nextLine().toUpperCase();
					if (palavra.equals(x)) {
						System.out.println("Você Acertou!!");
						break;
					} else {
						System.out.println("Você errou, continue tentando");
						continue;
					}
				}
			}
			// Continue
			System.out.println("Deseja continuar o Game? S/N");
			repetir = sc.next().toUpperCase().charAt(0);
		}
		sc.close();
	}

}
