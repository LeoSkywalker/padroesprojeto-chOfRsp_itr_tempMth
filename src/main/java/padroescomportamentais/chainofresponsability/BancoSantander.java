package padroescomportamentais.chainofresponsability;

public class BancoSantander extends Banco {

    public BancoSantander(Banco responsavel){
        listaPagamentos.add(TipoPagamentoBoleto.getTipoPagamentoBoleto());
        setBancoResponsavel(responsavel);
    }

    @Override
    public String getDescricaoBanco() {
        return "Banco Santander";
    }
}
