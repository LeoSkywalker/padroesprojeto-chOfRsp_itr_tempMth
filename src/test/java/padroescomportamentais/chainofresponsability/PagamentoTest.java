package padroescomportamentais.chainofresponsability;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PagamentoTest {

    BancoBB bb;
    BancoBradesco bradesco;
    BancoSantander santander;

    @BeforeEach
    void setUp(){
        bb = new BancoBB(null);
        bradesco = new BancoBradesco(bb);
        santander = new BancoSantander(bradesco);
    }

    @Test
    void deveRetornarBancoSantanderParaPagamentoBoleto(){
        assertEquals("Banco Santander", santander.pagarInstituicaoResponsavel(new Pagamento(TipoPagamentoBoleto.getTipoPagamentoBoleto())));
    }

    @Test
    void deveRetornarBancoBradescoParaPagamentoPix(){
        assertEquals("Banco Bradesco", santander.pagarInstituicaoResponsavel(new Pagamento(TipoPagamentoPix.getTipoPagamentoPix())));
    }

    @Test
    void deveRetornarBancoBbParaPagamentoCartao(){
        assertEquals("Banco do Brasil", santander.pagarInstituicaoResponsavel(new Pagamento(TipoPagamentoCartao.getTipoPagamentoCartao())));
    }

    @Test
    void deveRetornarNaoRealizadoParaPagamentoCheque(){
        assertEquals("Pagamento não realizado", santander.pagarInstituicaoResponsavel(new Pagamento(TipoPagamentoCheque.getTipoPagamentoCheque())));
    }
}
