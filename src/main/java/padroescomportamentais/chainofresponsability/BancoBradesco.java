package padroescomportamentais.chainofresponsability;

public class BancoBradesco extends Banco{

    public BancoBradesco(Banco responsavel){
        listaPagamentos.add(TipoPagamentoPix.getTipoPagamentoPix());
        setBancoResponsavel(responsavel);
    }

    @Override
    public String getDescricaoBanco() {
        return "Banco Bradesco";
    }
}
