package br.com.generation.coletas;

import java.util.ArrayList;
import java.util.Scanner;

public class SistemaColeta {

    int parada;

    public void listaRuas() {

        Scanner leitura = new Scanner(System.in);
        String rua;
        boolean controler = true;
        int cont = 0;
        Telas t2 = new Telas();
        ArrayList<String> grupo1  = new ArrayList<>();

        grupo1.add("libano");
        grupo1.add("milton barreto");
        grupo1.add("maria jose");
        grupo1.add("maria teresa");
        grupo1.add("cruz de malta");
        grupo1.add("galileia");
        grupo1.add("das carmelitas");
        grupo1.add("luiz gonzaga");
        grupo1.add("dos dominicanos");
        grupo1.add("capitolio");
        grupo1.add("hum");

        ArrayList<String> grupo2 = new ArrayList<>();

        grupo2.add("pompeia");
        grupo2.add("dos maristas");
        grupo2.add("vaticana");
        grupo2.add("dos franciscanos");
        grupo2.add("canaa");
        grupo2.add("biblos");
        grupo2.add("nicela");
        grupo2.add("oriente");
        grupo2.add("dos vicentinos");
        grupo2.add("belchior");
        grupo2.add("bizanico");


        ArrayList<String> grupo3 = new ArrayList<>();

        grupo3.add("dos cistercense");
        grupo3.add("eden");
        grupo3.add("canossa");
        grupo3.add("maronitas");
        grupo3.add("dos campineiros");
        grupo3.add("dos missionarios");
        grupo3.add("salesiana");
        grupo3.add("toledana");


        System.out.println("Favor escrever o nome da Rua de acordo com a condição a seguir: ");
        System.out.println("");
        System.out.println("Escreva somente o nome da Rua, sem ser acomapanhado pelo prefixo 'Rua'.");
        System.out.println("Escreva o nome da Rua em letras minúsculas e sem acentos.");
        System.out.println();
        System.out.println("---- Exemplo: ");
        System.out.println("Digite o nome da rua: libano");
        System.out.println();

        while( controler == true ^ cont >= 3 ) {

            System.out.print("Insira o nome da sua rua: ");
            rua = leitura.nextLine();


            if (grupo1.contains(rua)) {
                System.out.println("A sua rua faz parte do Grupo 1 e a coleta ocorre ás segundas e quintas-feiras.");
                System.out.println("Seu grupo também possui um ponto de coleta fixa, na rua Líbano, nº 157, com funcionamento de segunda a sexta das 8:00 hrs às 17:00 hrs");
                controler = false;
            }

            else if (grupo2.contains(rua)) {
                System.out.println("A sua rua faz parte do Grupo 2 e a coleta ocorre ás terças e sextas-feiras.");
                System.out.println("Seu grupo também possui um ponto de coleta fixa, na rua Pompéia, nº 171, com funcionamento de segunda a sexta das 8:00 hrs às 17:00 hrs");
                controler = false;
            }

            else if (grupo3.contains(rua)) {
                System.out.println("A sua rua faz parte do Grupo 3 e a coleta ocorre ás quartas-feiras e ao sábados.");
                System.out.println("Seu grupo também possui um ponto de coleta fixa, na rua dos Maronitas, nº 155, com funcionamento de segunda a sexta das 8:00 hrs às 17:00 hrs");
                controler = false;
            }

            else {
                cont+=1;
                if (cont < 3) {
                    System.out.println("OPS! Houve um errro de digitação.");
                    System.out.println("Tente Novamente!");
                    System.out.println();



                }
                controler = true;

            }

        }

        if (cont > 2) {
            System.out.println("No momento ainda não atendemos a sua região, mas fique de olho!\n"
                    + "em breve estaremos expandindo nossa cobertura.");
            System.out.println();
            t2.fimPrograma();
            this.parada = 2;


        }

    }

}
