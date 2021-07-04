package padroescomportamentais.iterator;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PesquisaTest {

    @Test
    void deveContarPessoasEfetuaramPagamento(){
        Pagamento pagamento = new Pagamento(
                new Pessoa("11000897567", true),
                new Pessoa("11155826537", false),
                new Pessoa("11100987747", true),
                new Pessoa("11100568457", false)
        );
        assertEquals(2, Pesquisa.contarPessoasEfetuaramPagamento(pagamento));
    }
}
