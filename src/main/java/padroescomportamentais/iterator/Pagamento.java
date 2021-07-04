package padroescomportamentais.iterator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Pagamento implements Iterable<Pessoa>{

    private List<Pessoa> pessoas = new ArrayList<Pessoa>();

    public Pagamento(Pessoa... pessoas){
        this.pessoas = Arrays.asList(pessoas);
    }

    @Override
    public Iterator<Pessoa> iterator() {
        return pessoas.iterator();
    }
}
