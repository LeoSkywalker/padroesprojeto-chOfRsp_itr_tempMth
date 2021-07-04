package padroescomportamentais.templatemethod;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PessoaJuridicaTest {

    @Test

    void deveRetornarRendaAprovada(){
        PessoaJuridica pessoa = new PessoaJuridica();
        pessoa.setRendaBruta(7.000f);
        assertEquals("Renda aprovada!", pessoa.verificarAprovacaoRenda());
    }

    @Test
    void deveRetornarRendaReprovada(){
        PessoaJuridica pessoa = new PessoaJuridica();
        pessoa.setRendaBruta(6.999f);
        assertEquals("Renda reprovada!", pessoa.verificarAprovacaoRenda());
    }

    @Test
    void deveRetornarInformacoes(){
        PessoaJuridica pessoa = new PessoaJuridica();
        pessoa.setId(2);
        pessoa.setNome("Leonardo");
        pessoa.setRendaBruta(6.500f);
        assertEquals("PessoaJuridica{id= 2, nome= Leonardo, resultado= Renda reprovada!}", pessoa.getInfo());
    }
}
