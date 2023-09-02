package Entidade;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Palavras {
	
	private Integer Id;
	
	private String[] palavras = new String[] { "ARPANET", "BROWSER", "CLIENTE", "FLUXOGRAMA", "DOWNLOAD", "FIREWALL",
			"INTERNET", "NAVEGACAO", "PACOTE", "PROTOCOLO", "ROTEADOR", "REPETIDOR", "APLICACAO", "ASSINATURA",
			"CIBERESPACO", "DATAGRAMA", "DOMINIO", "PORTAL", "PROVEDOR", "SERVIDOR", "TRANSFERENCIA"};
	
	private String[] dicas = new String[] { "Foi a primeira rede de computadores", "Um programa que nos permite navegar pela internet", "Contrata serviços ou adquire mercadorias",
			"Ilustra as etapas, sequências e decisões de um processo ou fluxo de trabalho", "Baixar um arquivo da Internet para um dispositivo", "Dispositivo de segurança de rede "
					+ "que monitora o tráfego que entra e sai da sua rede", "Conjunto de redes de computadores", "Passear pela web, movendo-se de um website para outro", "Estruturta de dados",
					"Conjunto de informações, decisões, normas e de regras", "Recebe e envia dados nas redes de computadores", "Aparelho que recebe o sinal gerado pelo seu roteador e o amplifica",
					"Interface entre a infraestrutura de rede e a inserção", "Processo criptográfico extremadamente seguro", "Espaço existente no mundo de comunicação em que não "
					+ "é necessária a presença física do homem", "Unidade de transferência básica de pacotes", "Localizar e identificar conjuntos de computadores na Internet",
					"Site na internet projetado para aglomerar e distribuir conteúdos", "Fornece seu acesso à Internet", "Sistema de computação centralizada que fornece serviços a uma rede",
					"Movimentação de dados entre dois pontos"};
	
	public Palavras() {
		System.out.println("-------------------------------");
		System.out.println("-----------Bem Vindo-----------");
		System.out.println("--------------ao---------------");
		System.out.println("---------Jogo da Forca---------");
		System.out.println("-------------------------------");
		System.out.println();
	}
	// Gerador de palavras
	public String getPalavras() {
		Random random = new Random();
		Id = random.nextInt(palavras.length);
		String palavra = this.palavras[Id];

		return palavra;
	}
	// Dicas
	public String getDicas() {
		String dica = this.dicas[Id];
		
		return dica;
	}
	
	//Metodo executador do game
	public void Game() {
		Scanner sc = new Scanner(System.in);
		
		char repetir = 'S';

		while (repetir == 'S') {
			//Buscar palavra e armazenar num array
			String x = getPalavras();
			char[] c = x.toCharArray();
			int tamanho = x.length();
			String[] resultado = new String[tamanho];
			
			int cont = 8;
			System.out.println("Voçê tem "+cont+" Tentativas!!");
			
			for (int j = 0; j < tamanho; j++) {
				resultado[j] = "_ ";
			}

			System.out.println();
			System.out.println(Arrays.toString(resultado));
			System.out.println();

			// inicio do game
			for (int i = 0; i < cont; i++) {
				System.out.println();
				System.out.println("Digite uma letra: ");
				char letra = sc.next().toUpperCase().charAt(0);
				for (int j = 0; j < tamanho; j++) {
					if (c[j] == letra) {
						resultado[j] = letra + "";
					}
				}
				cont -= 1;
				// Saida do resultado do game
				System.out.println(Arrays.toString(resultado));
				
				if (cont <= 4) {
					System.out.println("Deseja uma dica? S/N");
					char dic = sc.next().toUpperCase().charAt(0);
					if(dic == 'S') {
						System.out.println("Dica: " + getDicas());
					}
					// Reponder a palavra chave
					System.out.println("Deseja responder a palavra? S/N");
					char responder = sc.next().toUpperCase().charAt(0);
					System.out.println();
					System.out.println("Voçê tem "+cont+" Tentativas!!");
					System.out.println();
					if (responder == 'S') {
						sc.nextLine();
						System.out.println("Qual a palavra?");
						String palavra = sc.nextLine().toUpperCase();
						if (palavra.equals(x)) {
							System.out.println();
							System.out.println("Você Acertou!!");
							break;
						}else {
							System.out.println();
							System.out.println("Você errou, continue tentando");
							continue;
						}
					}
				}
				System.out.println();
			}
			// Continue
			System.out.println("Deseja continuar o Game? S/N");
			repetir = sc.next().toUpperCase().charAt(0);
		}
		sc.close();
	}
}
