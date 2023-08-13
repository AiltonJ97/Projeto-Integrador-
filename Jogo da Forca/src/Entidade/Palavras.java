package Entidade;

import java.util.Random;

public class Palavras {
	private String[] palavras = new String[]{"ARPANET", "BROWSER", "CLIENTE", "FLUXOGRAMA", "DOWNLOAD", "FIREWALL",
			"INTERNET", "NAVEGACAO", "PACOTE", "PROTOCOLO", "ROTEADOR", "REPETIDOR"};
	
	public String getPalavras() {
		Random random = new Random();
		int x = random.nextInt(12);
		String palavra = this.palavras[x];
		
		return  palavra;
	}
	
}
