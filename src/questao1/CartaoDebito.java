package questao1;

public class CartaoDebito extends Pagamento {
    private String numCartao;
    private String titularCartao;

    public CartaoDebito(String dataHoraPagamento, int numeroPagamento, double valorPago,
                        String numCartao, String titularCartao) {
        super(dataHoraPagamento, numeroPagamento, valorPago);
        this.numCartao = numCartao;
        this.titularCartao = titularCartao;
    }

    // Getters and Setters

    @Override
    public String imprimirCupomFiscal() {
        return "Data/Hora: " + getDataHoraPagamento() + "\nNúmero: " + getNumeroPagamento() +
                "\nValor: " + getValorPago() + "\nCartão: " + numCartao +
                "\nTitular: " + titularCartao;
    }
}
