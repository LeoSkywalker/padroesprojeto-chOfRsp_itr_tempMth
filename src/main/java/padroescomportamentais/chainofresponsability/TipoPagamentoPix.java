package padroescomportamentais.chainofresponsability;

public class TipoPagamentoPix implements TipoPagamento{

    private static TipoPagamentoPix tipoPagamentoPix = new TipoPagamentoPix();

    private TipoPagamentoPix() {};

    public static TipoPagamentoPix getTipoPagamentoPix(){
        return tipoPagamentoPix;
    }
}
