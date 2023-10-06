package questao1;

public class Main {
    public static void main(String[] args) {
        CartaoCredito cc = new CartaoCredito("09-10-2023 12:30", 1234, 150.0,
                "1234568367123456", "VISA", "Thales Augusto");
        System.out.println(cc.imprimirCupomFiscal());

        Pix pix = new Pix("06-10-2023 12:32", 1235, 100.0, true);
        System.out.println(pix.imprimirCupomFiscal());

        CartaoDebito cd = new CartaoDebito("05-10-2023 12:34", 1236, 50.0,
                "9876543210123456", "Janaina Silva");
        System.out.println(cd.imprimirCupomFiscal());
    }
}
