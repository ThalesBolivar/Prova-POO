package questao1;

public class CartaoCredito extends Pagamento {
    private String numCartao;
    private String bandeiraCartao;
    private String titularCartao;

    public CartaoCredito(String dataHoraPagamento, int numeroPagamento, double valorPago,
                         String numCartao, String bandeiraCartao, String titularCartao) {
        super(dataHoraPagamento, numeroPagamento, valorPago);
        this.numCartao = numCartao;
        this.bandeiraCartao = bandeiraCartao;
        this.titularCartao = titularCartao;
    }

    // Getters and Setters

    @Override
    public String imprimirCupomFiscal() {
        return "Data/Hora: " + getDataHoraPagamento() + "\nNúmero: " + getNumeroPagamento() +
                "\nValor: " + getValorPago() + "\nCartão: " + numCartao +
                "\nBandeira: " + bandeiraCartao + "\nTitular: " + titularCartao;
    }
}

