
package modelo.locais;


public class Bairro {
    private int id;
    private String nome;
    private Cidade cidade;
    private int FK_CIDADE_id;

    public Bairro(){
    }

    public Bairro(int id, String nome, Cidade cidade) {
        this.id = id;
        this.nome = nome;
        this.cidade = cidade;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Cidade getCidade() {
        return cidade;
    }

    public void setCidade(Cidade cidade) {
        this.cidade = cidade;
    }

    public int getFK_CIDADE_id() {
        return FK_CIDADE_id;
    }

    public void setFK_CIDADE_id(int FK_CIDADE_id) {
        this.FK_CIDADE_id = FK_CIDADE_id;
    }


}
