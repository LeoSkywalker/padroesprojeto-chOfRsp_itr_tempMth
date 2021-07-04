package padroescomportamentais.chainofresponsability;

public class TipoPagamentoCheque implements TipoPagamento {

    private static TipoPagamentoCheque tipoPagamentoCheque = new TipoPagamentoCheque();

    private TipoPagamentoCheque() {};

    public static TipoPagamentoCheque getTipoPagamentoCheque(){
        return tipoPagamentoCheque;
    }



}
