package br.com.generation.coletas;

public class MenuPrincipal {

    public static void main(String[] args) {

        Quiz joguinho = new Quiz();
        Telas t1 = new Telas();
        SistemaColeta coleta = new SistemaColeta();
        Integer a =2;

        Cadastro c1 = new Cadastro();
        c1.fazerCadastro();
        t1.inicioAtendimento();

        coleta.listaRuas();

        if(a.equals(coleta.parada))
        {
            System.exit(0);
        }

        System.out.println();
        t1.encerramento();
        t1.opcoes();
        joguinho.escolhaOpcao();
    }
}
