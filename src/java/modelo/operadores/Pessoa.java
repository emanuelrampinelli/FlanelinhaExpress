
package modelo.operadores;

public abstract class Pessoa  {
    
    //Variaveis;
    private int id;
    
    private String nomeCompleto;
    private String email;
    private String telefone;
    String senha;

   
    //Construtor 1;
    public Pessoa(int id, String nomeCompleto,String email,String telefone,String senha){
        this.id = id;
        this.nomeCompleto = nomeCompleto;
        this.email = email;
        this.telefone = telefone;
        this.senha = senha;
    }
    
    //Construtor 2;
    public Pessoa (String nomeCompleto,String email,String telefone,String senha){
        
        setNomeCompleto(nomeCompleto);
        setTelefone(telefone);
        setEmail(email);
        setSenha(senha);
       
        
        
    }

    public Pessoa() {
        
    }
    
    // ============ GET ===============
    public int getId_pessoa() {
        return id;
    }
   
    public String getNomeCompleto() {
        return nomeCompleto;
    }
    
    public String getEmail() {
        return email;
    }

    public final String getTelefone() {
        return telefone;
    }
    
     public int getId() {
        return id;
    }

    public String getSenha() {
        return senha;
    }
    
    // ============ SET ================
  
    public final void setNomeCompleto(String nomeCompleto) {
        
        if(!nomeCompleto.equals("")){
            this.nomeCompleto = nomeCompleto;
        }else{
            throw new IllegalArgumentException("Nome em branco.");
        }      
    }
    
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }

    public void setId(int id) {
        this.id = id;
    }

    public final void setSenha(String senha) {
       this.senha = senha;
    }


}
