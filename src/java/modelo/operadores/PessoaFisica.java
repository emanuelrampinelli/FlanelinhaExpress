package modelo.operadores;

public class PessoaFisica extends Pessoa {
    
    private String cpf;
      
    //Construtor 1;
    public PessoaFisica(int id, String nomeCompleto, String email,String telefone,String senha,String cpf) {
        super(id, nomeCompleto,email,telefone,senha);
        this.cpf = cpf;       
    }
    
    //Construtor 2;
    public PessoaFisica(String nomeCompleto,String email,String telefone,String senha, String cpf){
        super(nomeCompleto,email,telefone,senha);
        setCpf(cpf);
    }
    
    //Construtor 3;
    public PessoaFisica(){}
    
    //========= GET ===============
    public String getCpf() {
        return cpf;
    }
    
    //========= SET ===============
    public final void setCpf(String cpf) {
        
        if(!cpf.equals("")){
            this.cpf = cpf;
        }else{
            throw new IllegalArgumentException("CPF Inválido.");
        }
        
    }
    
    
    
}
