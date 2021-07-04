package padroescomportamentais.templatemethod;

public abstract class Pessoa {

    private int id;
    protected String nome;
    private float rendaBruta;

    public int getId() { return id; }

    public void setId(int id) { this.id = id; }

    public String getNome() { return nome; }

    public void setNome(String nome) { this.nome = nome; }

    public float getRendaBruta() { return rendaBruta; }

    public void setRendaBruta(float rendaBruta) { this.rendaBruta = rendaBruta; }

    public abstract String verificarAprovacaoRenda();

    public String getTipo(){ return "PessoaFisica"; }

    public String getInfo(){
        return getTipo() + "{" +
                "id= " + this.id +
                ", nome= " + this.nome +
                ", resultado= " + this.verificarAprovacaoRenda()
                + "}";
    }
}
