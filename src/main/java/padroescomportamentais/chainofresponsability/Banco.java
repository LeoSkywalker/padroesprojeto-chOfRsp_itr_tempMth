package padroescomportamentais.chainofresponsability;

import java.util.ArrayList;

public abstract class Banco {

    protected ArrayList listaPagamentos = new ArrayList();
    private Banco bancoResponsavel;

    public Banco getBancoResponsavel() {
        return bancoResponsavel;
    }

    public void setBancoResponsavel(Banco bancoResponsavel) {
        this.bancoResponsavel = bancoResponsavel;
    }

    public abstract String getDescricaoBanco();

    public String pagarInstituicaoResponsavel(Pagamento pagamento){
        if(listaPagamentos.contains(pagamento.getTipoPagamento())){
            return getDescricaoBanco();
        }
        else{
            if(bancoResponsavel != null){
                return bancoResponsavel.pagarInstituicaoResponsavel(pagamento);
            }
            else{
                return "Pagamento não realizado";
            }
        }
    }
}
