package modelo.operadores;

public class PessoaJuridica extends Pessoa{
    
    //Variaveis;
    private String cnpj;
    
    //Constante;
    private static final int TAM_CNPJ = 14;
    
    //Construtor 1;
    public PessoaJuridica(int id,String nomeCompleto,String email,String telefone,String senha,String cnpj) {
        super(id, nomeCompleto,email,telefone,senha);
        this.cnpj = cnpj;
    }
    
    //Construtor 2;
    public PessoaJuridica(String nomeCompleto, String email,String telefone,String senha,String cnpj){
        super(nomeCompleto,email,telefone,senha);
        setCnpj(cnpj);
    }
    //Construtor 3;
    public PessoaJuridica(){}
    
    // ======== GET ============
    public String getCnpj() {
        return cnpj;
    }
    
    //========= SET ===========
    public final void setCnpj(String cnpj) {
       
        if(cnpj.length() == TAM_CNPJ){
            this.cnpj = cnpj;
        }else{
            throw new IllegalArgumentException("CPNJ invalido.");
        }
        
    }
    
    
    
}
