package padroescomportamentais.iterator;

public class Pesquisa {

    public static Integer contarPessoasEfetuaramPagamento(Pagamento pagamento){
        int qtd = 0;
        for(Pessoa pessoa : pagamento){
            if(pessoa.isAtivo()){
                qtd++;
            }
        }
        return qtd;
    }
}
