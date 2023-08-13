package aplicação;

import java.util.Random;

import Entidade.Palavras;

public class Programa {

	public static void main(String[] args) {
		
		String[] palavras = new String[]{"ARPANET", "BROWSER", "CLIENTE", "FLUXOGRAMA", "DOWNLOAD", "FIREWALL",
										"INTERNET", "NAVEGACAO", "PACOTE", "PROTOCOLO", "ROTEADOR", "REPETIDOR"};
		
		
		Palavras pl = new Palavras();
		
		System.out.println("-------------------------------");
		System.out.println("-----------Bem Vindo-----------");
		System.out.println("--------------ao---------------");
		System.out.println("---------Jogo da Forca---------");
		System.out.println("-------------------------------");
		
		
		Random random = new Random();
		int x = random.nextInt(12);
		
		System.out.println(palavras[x]);
		
		System.out.println(pl.getPalavras());
		
		System.out.println("FIM");
	}	
}
