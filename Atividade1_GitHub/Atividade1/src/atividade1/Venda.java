package atividade1;


public class Venda {

    private String nomeCliente;
    private String formaPagamento;
    private PacoteViagem pacoteViagem;


    public Venda(String nomeCliente, String formaPagamento,
                 PacoteViagem pacoteViagem) {

        this.nomeCliente = nomeCliente;
        this.formaPagamento = formaPagamento;
        this.pacoteViagem = pacoteViagem;

    }


    public String getNomeCliente() {

        return nomeCliente;

    }


    public void setNomeCliente(String nomeCliente) {

        this.nomeCliente = nomeCliente;

    }


    public String getFormaPagamento() {

        return formaPagamento;

    }


    public void setFormaPagamento(String formaPagamento) {

        this.formaPagamento = formaPagamento;

    }


    public PacoteViagem getPacoteViagem() {

        return pacoteViagem;

    }


    public void setPacoteViagem(PacoteViagem pacoteViagem) {

        this.pacoteViagem = pacoteViagem;

    }


    public double conversaoParaReais(double valorDolar, double cotacao) {

        return valorDolar * cotacao;

    }


    public void mostrarvenda(double margem, double taxasAdicionais,
                             double cotacao) {

        double valorDolar =
                pacoteViagem.calcularTotalPacote(margem, taxasAdicionais);

        double totalReais =
                conversaoParaReais(valorDolar, cotacao);


        System.out.println("Cliente: " + nomeCliente);

        System.out.println("Forma de pagamento: " + formaPagamento);

        System.out.println("Destino da viagem: "
                + pacoteViagem.getDestino());

        System.out.println("Quantidade de dias: "
                + pacoteViagem.getQuantidadeDias());

        System.out.println("Tipo do transporte: "
                + pacoteViagem.getTransporte().getTipo());

        System.out.println("Descricao da hospedagem: "
                + pacoteViagem.getHospedagem().getDescricao());

        System.out.println("Valor total do pacote em dolar: "
                + valorDolar);

        System.out.println("Cotacao do dolar: " + cotacao);

        System.out.println("Valor em reais: " + totalReais);

    }

}