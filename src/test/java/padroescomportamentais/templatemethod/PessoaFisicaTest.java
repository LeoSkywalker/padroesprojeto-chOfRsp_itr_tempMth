package padroescomportamentais.templatemethod;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PessoaFisicaTest {

    @Test
    void deveRetornarRendaAprovada(){
        PessoaFisica pessoa = new PessoaFisica();
        pessoa.setRendaBruta(3.100f);
        assertEquals("Renda aprovada!", pessoa.verificarAprovacaoRenda());
    }

    @Test
    void deveRetornarRendaReprovada(){
        PessoaFisica pessoa = new PessoaFisica();
        pessoa.setRendaBruta(3.099f);
        assertEquals("Renda reprovada!", pessoa.verificarAprovacaoRenda());
    }

    @Test
    void deveRetornarInformacoes(){
        PessoaFisica pessoa = new PessoaFisica();
        pessoa.setId(1);
        pessoa.setNome("Leonardo");
        pessoa.setRendaBruta(3.500f);
        assertEquals("PessoaFisica{id= 1, nome= Leonardo, resultado= Renda aprovada!}", pessoa.getInfo());
    }
}
