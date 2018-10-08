
package modelo.operadores;

public final class Administrador extends Funcionario {
    
    private String senha;
  
    //Construtor 1;
    public Administrador
    (int id, String nomeCompleto, String email, String telefone, String senha,String cpf,String matricula,String dataAdmissao,String dataDemissao) {
        
        super(id,nomeCompleto, email, telefone,senha, cpf, matricula, dataAdmissao, dataDemissao);
        
        this.senha = senha;
    
    }
    
    //Construtor 2;
    public Administrador(String nomeCompleto, String email, String telefone,String senha,String cpf,
                       String matricula,String dataAdmissao,String dataDemissao) {
        
        super(nomeCompleto, email, telefone,senha, cpf, matricula, dataAdmissao, dataDemissao);
        setSenha(senha);
        
    }
    
    // ======== GET ==========
    public String getSenha() {
        return senha;
    }
    
    // ======== SET ==========
   
    
    
}
