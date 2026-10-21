package atividade1;

import java.util.Scanner;


public class Principal {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        System.out.println("Digite o tipo de transporte:");

        String tipoTransporte = scanner.nextLine();


        System.out.println("Digite o valor do transporte:");

        double valorTransporte = scanner.nextDouble();


        Transporte transporte =
                new Transporte(tipoTransporte, valorTransporte);


        scanner.nextLine();


        System.out.println("Digite a descricao da hospedagem:");

        String descricaoHospedagem = scanner.nextLine();


        System.out.println("Digite o valor da diaria:");

        double valorDiaria = scanner.nextDouble();


        Hospedagem hospedagem =
                new Hospedagem(descricaoHospedagem, valorDiaria);


        scanner.nextLine();


        System.out.println("Digite o destino da viagem:");

        String destino = scanner.nextLine();


        System.out.println("Digite a quantidade de dias:");

        int quantidadeDias = scanner.nextInt();


        PacoteViagem pacoteViagem =
                new PacoteViagem(
                        transporte,
                        hospedagem,
                        destino,
                        quantidadeDias
                );


        System.out.println("Digite a margem de lucro (%):");

        double margem = scanner.nextDouble();


        System.out.println("Digite o valor das taxas adicionais:");

        double taxasAdicionais = scanner.nextDouble();


        double totalPacote =
                pacoteViagem.calcularTotalPacote(
                        margem,
                        taxasAdicionais
                );


        System.out.println("\n--- PACOTE DE VIAGEM ---");

        System.out.println("Destino: "
                + pacoteViagem.getDestino());

        System.out.println("Quantidade de dias: "
                + pacoteViagem.getQuantidadeDias());

        System.out.println("Transporte: "
                + pacoteViagem.getTransporte().getTipo());

        System.out.println("Hospedagem: "
                + pacoteViagem.getHospedagem().getDescricao());

        System.out.println("Valor total em dolar: US$ "
                + totalPacote);


        scanner.nextLine();


        System.out.println("\nDigite o nome do cliente:");

        String nomeCliente = scanner.nextLine();


        System.out.println("Digite a forma de pagamento:");

        String formaPagamento = scanner.nextLine();


        Venda venda =
                new Venda(
                        nomeCliente,
                        formaPagamento,
                        pacoteViagem
                );


        System.out.println("Digite a cotacao do dolar:");

        double cotacao = scanner.nextDouble();


        System.out.println("\n--- DADOS DA VENDA ---");


        venda.mostrarvenda(
                margem,
                taxasAdicionais,
                cotacao
        );


        scanner.close();

    }

}