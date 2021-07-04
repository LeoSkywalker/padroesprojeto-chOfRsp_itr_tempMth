package padroescomportamentais.templatemethod;

public class PessoaFisica extends Pessoa{

    @Override
    public String verificarAprovacaoRenda() {
        if(this.getRendaBruta() >= 3.100f){
            return "Renda aprovada!";
        }
        else{
            return "Renda reprovada!";
        }
    }
}
