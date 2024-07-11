package netflix;

public class ContaNetflix {

	private String idiomaPreferencial;
	private String resolucaoTela;
	
	void entrar() {
		buscarIdioma();
		resolucao();
	}
	
	private void buscarIdioma() {
		idiomaPreferencial = "EN-US";
	}
	
	private void resolucao() {
		resolucaoTela = "HDR";
	}
	
	void assistirFilme(String nomeFilme) {
		System.out.format("Iniciando o filme %s \n", nomeFilme);
		System.out.format("Exibindo o filme na resolução %s \n", resolucaoTela);
		if (idiomaPreferencial == "PT-BR" || idiomaPreferencial == "EN-US") {
			System.out.format("O áudio selecionado é %s \n", idiomaPreferencial);
		} else {
			System.out.format("O áudio selecionado será o disponível \n");
		}
	}
	
}
