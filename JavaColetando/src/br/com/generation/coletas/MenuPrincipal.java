package br.com.generation.coletas;

public class MenuPrincipal {
	
	public static void main(String[] args) {
		
		Quiz joguinho = new Quiz();
		
		//while(joguinho.opcao != 2) {
		
		Cadastro c1 = new Cadastro();
		c1.fazerCadastro();

		Telas t1 = new Telas();
		t1.inicioAtendimento();
		
		SistemaColeta coleta = new SistemaColeta();
		coleta.listaRuas();
		
		t1.encerramento();
		
		t1.opcoes();
		
		joguinho.escolhaOpcao();
		
	}
		
	
}


