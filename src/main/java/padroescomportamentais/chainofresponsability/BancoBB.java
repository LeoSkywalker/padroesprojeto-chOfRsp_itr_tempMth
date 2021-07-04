package padroescomportamentais.chainofresponsability;

public class BancoBB extends Banco{

    public BancoBB(Banco responsavel) {
        listaPagamentos.add(TipoPagamentoCartao.getTipoPagamentoCartao());
        setBancoResponsavel(responsavel);
    }

    @Override
    public String getDescricaoBanco() {
        return "Banco do Brasil";
    }
}
