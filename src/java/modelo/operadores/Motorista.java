
package modelo.operadores;

public final class Motorista extends PessoaFisica{
 
    private String cnh;
    private double creditos;

    
    //Quantidade de caracter CNH;
    private static final int TAMANHO_CNH = 11;

    public Motorista(int id, String nomeCompleto, String email, String telefone, String senha ,String cpf, String cnh,double creditos) {
        super(id, nomeCompleto, email, telefone,senha, cpf);
        this.cnh = cnh;
        this.creditos = creditos;

    }
    
     public Motorista(String nomeCompleto, String email, String telefone, String senha,String cpf, String cnh,double creditos) {
        super( nomeCompleto, email, telefone,senha, cpf);
        setCnh(cnh);
        setCreditos(creditos);
        
    }

    public Motorista() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
  
    //========= GET ==================
    public String getCnh() {
        return cnh;
    
    }
   
    
    public double getCreditos() {
        return creditos;
    }

    
    // ========= SET ==================
    

    public final void setCnh(String cnh) {
        
        if(cnh.length() == TAMANHO_CNH){
            this.cnh = cnh;
        }else{
            throw new IllegalArgumentException("CNH invalido.");
        }
        
        
    }
    
    public void setCreditos(double creditos) {
        this.creditos = creditos;
    }

    @Override
    public String getSenha() {
        return this.senha;
    }

  
    

   
}
