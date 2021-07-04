package padroescomportamentais.iterator;

public class Pessoa {

    private String cpf;
    private boolean ativo;

    public Pessoa(String cpf, boolean ativo) {
        this.cpf = cpf;
        this.ativo = ativo;
    }

    public String getCpf() { return cpf; }

    public void setCpf(String cpf) { this.cpf = cpf; }

    public boolean isAtivo() { return ativo; }

    public void setAtivo(boolean ativo) { this.ativo = ativo; }
}
