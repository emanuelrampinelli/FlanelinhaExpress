
package modelo.locais;

public class Endereco {
    private int id;
    private String logradouro;
    private String complemento=null;
    private String cep;
    private Bairro bairro;
    private Cidade cidade;
    private Estado estado;
    
    
    private final int TAM_CEP = 9;
    private final int TAM_COMPLEMENTO = 50;
    private final int TAM_LOGRADOURO = 100;

    
    @Override
    public String toString(){
        String texto;
        texto = "logradouro: " + this.logradouro;
        texto += "\nComplemento: " + this.complemento;
        texto += "\nCEP: " + this.cep;
        texto += "\nbEstado: " + this.estado.getNome();
        texto += "\nCidade: " + this.cidade.getNome();
        texto += "\nBairro: "  + this.bairro.getNome();
        return texto;
    }

    public Endereco(){
    }
    
    public Endereco(int id, String logradouro, String complemento, String cep, Bairro bairro, Cidade cidade, Estado estado) {
        this.id = id;
        this.bairro = bairro;
        this.cidade = cidade;
        this.estado = estado;
        this.cep = cep;
        this.logradouro = logradouro;
        this.complemento = complemento;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        if(logradouro.length() <= TAM_LOGRADOURO && !logradouro.equals(""))
            this.logradouro = logradouro;
        else
            throw new IllegalArgumentException("Logradouro inválido!");
    }

    public Estado getEstado() {
        return this.estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    public Cidade getCidade() {
        return this.cidade;
    }

    public void setCidade(Cidade cidade) {
        this.cidade = cidade;
    }

    public Bairro getBairro() {
        return this.bairro;
    }

    public void setBairro(Bairro bairro) {
        this.bairro = bairro;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        if (cep.length() == TAM_CEP)
            this.cep = cep;
        else
            throw new IllegalArgumentException("CEP inválido!");
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        if(complemento == null || complemento.length() <= TAM_COMPLEMENTO)
            this.complemento = complemento;
        else
            throw new IllegalArgumentException("Complemento inválido!");
    }
}

