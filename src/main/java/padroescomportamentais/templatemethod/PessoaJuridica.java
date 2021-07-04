package padroescomportamentais.templatemethod;

public class PessoaJuridica extends Pessoa{

    public String verificarAprovacaoRenda() {
        if (this.getRendaBruta() >= 7.000f){
            return "Renda aprovada!";
        }
        else {
            return "Renda reprovada!";
        }
    }

    @Override
    public String getTipo() {
        return "PessoaJuridica";
    }
}
