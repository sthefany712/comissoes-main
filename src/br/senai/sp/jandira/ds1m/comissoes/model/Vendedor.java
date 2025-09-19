package br.senai.sp.jandira.ds1m.comissoes.model;

import java.util.Scanner;

public class Vendedor {
    String nomeVendedor;
    double totalDeVendas;
    double percentualDaComissao;
    double valorDaComissaoEmReais;
    double perguntarSimouNao;

    public void obterDados(){
        Scanner leitor = new Scanner(System.in);

        System.out.println("** CALCULADORA DE COMISSÔES **");
        System.out.println("--------------------------------");

        //Obtendo o nome do vendedor
        System.out.print("Qual o nome do vendedor?");
        nomeVendedor = leitor.nextLine();

        //Obtendo o total de vendas do vendedor
        System.out.print("Qual o total de vendas do(a) vendedor(a) " + nomeVendedor + "? ");
        totalDeVendas = leitor.nextDouble();

        calcularComissao();
    }

    public void calcularComissao(){
      if (totalDeVendas < 20000){
          percentualDaComissao = 5;
        } else {
          percentualDaComissao = 10;
      }
      valorDaComissaoEmReais = totalDeVendas * percentualDaComissao / 100;

      exibirResultados();
    }

    public void exibirResultados(){
        System.out.println("-----------------------------");
        System.out.println("** R E S U L T A D O S **");
        System.out.println("-----------------------------");
        System.out.println("VENDEDOR: " + nomeVendedor);
        System.out.println("TOTAL DE VENDAS: R$" + totalDeVendas);
        System.out.println("PERCENTUAL DA COMISSÃO: " + percentualDaComissao + "%");
        System.out.println("VALOR DA COMISSÃO PAGA: R$ " + valorDaComissaoEmReais);
        System.out.println("-----------------------------");

        exibirResposta();
    }

    public void exibirResposta(){
        Scanner leitor = new Scanner(System.in);
        System.out.println("Calcular a comissão de outro vendedor?" );
        System.out.println("Digite 1 para sim e 0 para sair: ");
        perguntarSimouNao = leitor.nextDouble();
        digitar1();
    }

    public void digitar1() {
        if (perguntarSimouNao == 1) {
            obterDados();
        } else {
            System.out.print("Bye");
        }
    }
}


