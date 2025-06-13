package br.com.challenge.conversordemoedas.principal;

import br.com.challenge.conversordemoedas.modelos.Conversao;

import java.io.IOException;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner read = new Scanner(System.in);
        Conversao conversao = new Conversao();
        int option = 0;
        System.out.println("Bem vindo ao conversor de moeda =)");

        while (option != 7) {
            System.out.println(" ");

            System.out.println("""
                    1) Dolár --> Peso Argentino
                    2) Peso Argentino --> Dolár
                    3) Dólar --> Real Brasileiro
                    4) Real Brasileiro --> Dólar
                    5) Dólar --> Peso Colombiano
                    6) Peso colombiano --> Dólar
                    7) Sair""");
            System.out.println("Escolha uma opção valida: ");
            option = read.nextInt();

            if (option >= 1 && option <= 6) {
                System.out.print("Digite o valor a ser convertido: ");
                double valor = read.nextDouble();

                switch (option) {
                    case 1:
                        conversao.Converter("USD", "ARS", valor);
                        break;
                    case 2:
                        conversao.Converter("ARS", "USD", valor);
                        break;
                    case 3:
                        conversao.Converter("USD", "BRL", valor);
                        break;
                    case 4:
                        conversao.Converter("BRL", "USD", valor);
                        break;
                    case 5:
                        conversao.Converter("USD", "COP", valor);
                        break;
                    case 6:
                        conversao.Converter("COP", "USD", valor);
                        break;
                }
            } else if (option == 7) {
                System.out.println("Obrigado por usar o conversor. Até logo!");
            } else {
                System.out.println("Opção inválida, tente novamente.");

            }
        }
    }
}