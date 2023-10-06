package questao1;

public class Pix extends Pagamento {
    private boolean comprovanteTransacaoPix;

    public Pix(String dataHoraPagamento, int numeroPagamento, double valorPago, boolean comprovanteTransacaoPix) {
        super(dataHoraPagamento, numeroPagamento, valorPago);
        this.comprovanteTransacaoPix = comprovanteTransacaoPix;
    }

    // Getters and Setters

    @Override
    public String imprimirCupomFiscal() {
        return "Data/Hora: " + getDataHoraPagamento() + "\nNúmero: " + getNumeroPagamento() +
                "\nValor: " + getValorPago() + "\nComprovante: " + comprovanteTransacaoPix;
    }
}
