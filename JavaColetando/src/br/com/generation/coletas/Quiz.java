package br.com.generation.coletas;

import java.util.Scanner;

public class Quiz {

    int opcao;


    public void escolhaOpcao()
    {
        Scanner scan = new Scanner (System.in);
        int op;

        op = scan.nextInt();


        {
            switch(op)
            {
                case 1:
                    Quiz jogo = new Quiz();
                    jogo.QuizColetando();
                    break;
                case 2:
                    Telas t3 = new Telas();
                    t3.fimPrograma();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Digite uma opção válida!");
                    System.out.println();
                    Telas t2 = new Telas();
                    t2.opcoes();
                    escolhaOpcao();
                    break;
            }
        }
    }


    public void QuizColetando()
    {
        Scanner entrada = new Scanner (System.in);

        String quiz;
        String resposta;
        int total= 0;
        boolean controle = true;

        System.out.println("======================================== QUIZ JAVA COLETANDO ======================================================================");
        System.out.println();
        System.out.println("==================================================================================================================================");
        System.out.println("BEM VINDE AO NOSSO QUIZ, SERÃO TRÊS PERGUNTAS PARA VOCÊ TER A CHANCE DE ACUMULAR MAIS PONTOS!!\nDIGITE ENTER PARA COMEÇAR... ");
        System.out.println("====================================================================================================================================");
        resposta = entrada.nextLine();

        while (controle) {


            System.out.println("VALENDO 20 PONTOS: \nPERGUNTA A) O PAPEL CORRESPONDE A QUAL COR DE LIXEIRA?");
            System.out.println("[1] VERDE");
            System.out.println("[2] AZUL");
            System.out.println("[3] PRETO");
            System.out.println("[4] ROXO");
            System.out.println("[5] AMARELO");
            System.out.print("    DIGITE SUA RESPOSTA:");

            resposta = entrada.nextLine();

            switch(resposta) {
                case "1":
                    System.out.println("OPS, VOCÊ ERROU )=");
                    controle = false;
                    break;

                case "2":
                    System.out.println("PARABÊNS, SUA RESPOSTA ESTÁ CERTA (:");
                    controle = false;
                    total +=20;
                    break;

                case "3":
                    System.out.println("OPS, VOCÊ ERROU )=");
                    controle = false;
                    break;

                case "4":
                    System.out.println("OPS, VOCÊ ERROU )=");
                    controle = false;
                    break;

                case "5":
                    System.out.println("OPS, VOCÊ ERROU )=");
                    controle = false;
                    System.out.println();
                    break;
                default:
                    System.out.println("====================================================================================================================================");
                    System.out.println("====================================================================================================================================");

                    System.out.println(resposta + " NÃO É UMA OPÇÃO VÁLIDA, TENTE NOVAMENTE:(");
                    break;
            }
        }

        controle = true;
        while(controle) {
            System.out.println("====================================================================================================================================");
            System.out.println("====================================================================================================================================");
            System.out.println("VALENDO 40 PONTOS:\nPERGUNTA B) POR QUE A COLETA SELETIVA É IMPORTANTE? ");
            System.out.println("[1] ELA AJUDA CADA VEZ MAIS AO DESMATAMENTO DA FLORESTA AMAZÔNICA.");
            System.out.println("[2] A COLETA SELETIVA NÃO SERVE PARA NADA.");
            System.out.println("[3] ELA É IMPORTANTE POIS PERMITE QUE OS RESÍDUOS SEJAM SEPARADOS EM CATEGORIAS\n    FACILITANTO NA HORA DA RECICLAGEM.");

            System.out.print("    DIGITE A RESPOSTA:");
            resposta = entrada.nextLine();

            switch(resposta) {

                case "1":
                    System.out.println("OPS, VOCÊ ERROU )=");
                    controle = false;
                    break;

                case "2":
                    System.out.println("OPS, VOCÊ ERROU )=");
                    controle = false;
                    break;

                case "3":
                    System.out.println("PARABÉNS, SUA RESPOSTA ESTÁ CERTA (:");
                    controle = false;
                    total+=40;
                    System.out.println();
                    break;
                default:
                    System.out.println();
                    System.out.println(resposta +" NÃO É UMA OPÇÃO VÁLIDA, TENTE NOVAMENTE:(");
                    break;

            }
        }
        controle = true;
        while(controle) {
            System.out.println("====================================================================================================================================");
            System.out.println("====================================================================================================================================");
            System.out.println("VALENDO 60 PONTOS:\nPERGUNTA C) QUAIS CORES RESPECTIVAMENTE CORRESPONDEM AOS SEUS MATERIAIS\nAZUL/AMARELO/VERMELHO/PRETO/ROXO/LARANJA ");
            System.out.println("[1] PAPEL/METAL/PLÁSTICO/MADEIRA/LIXO RADIOTIVO/RESIDUOS PERIGOSOS ");
            System.out.println("[2] PAPEL/METAL/PLÁSTICO/LIXO RADIOTIVO/MADEIRA/RESIDUOS PERIGOSOS");
            System.out.println("[3] MADEIRA/METAL/PAPEL/PLÁSTICO/LIXO RADIOTIVO/RESIDUOS PERIGOSOS");

            System.out.print("    DIGITE A RESPOSTA: ");
            resposta = entrada.nextLine();

            switch(resposta) {

                case "1":
                    System.out.println("PARABÉNS, SUA RESPOSTA ESTÁ CERTA (:");
                    controle = false;
                    total+=60;
                    break;

                case "2":
                    System.out.println("OPS, VOCÊ ERROU )=");
                    controle = false;
                    break;

                case "3":
                    System.out.println("OPS, VOCÊ ERROU )=");
                    controle = false;
                    System.out.println();
                    break;
                default:
                    System.out.println();
                    System.out.println(resposta + " NÃO É UMA OPÇÃO VÁLIDA, TENTE NOVAMENTE:(");
                    break;
            }
        }
        System.out.println();
        System.out.println("VOCÊ TOTALIZOU: " + total + " PONTOS (;");




        if (total == 120)
        {
            System.out.println("Parabéns!! Você acaba de receber 85% de desconto na sua próxima conta de luz!");
            this.opcao = 3;
        }
        else if(total == 100 || total == 80)
        {
            System.out.println("Parabéns!! VocÃª acaba de receber 85% de desconto na sua próxima conta de água!");
            this.opcao = 3;
        }
        else if(total == 60 || total == 40)
        {
            System.out.println("Parabéns!! VocÃª acaba de receber 70% de desconto na sua próxima compra de gás!!");
            this.opcao = 3;
        }
        else if (total <= 20)
        {
            System.out.println("Você atingiu uma pontuação baixa! NÃo fique triste! Você receberá 30% de desconto na sua próxima compra de gás!!");
            this.opcao = 3;
        }
        System.exit(0);

    }

}
