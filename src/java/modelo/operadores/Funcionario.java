
package modelo.operadores;

import modelo.utilidade.ValidacaoSTR;

public class Funcionario extends PessoaFisica {
    
    //Variaveis;
    private String matricula;   
    private String dataAdmissao;
    private String dataDemissao;
    
    
    
    //Construtor 1;
    public Funcionario(int id, String nomeCompleto, String email, String telefone,String senha, String cpf,
                       String matricula,String dataAdmissao,String dataDemissao) {
        
        super(nomeCompleto, email, telefone,senha, cpf);
        this.matricula = matricula;
        this.dataAdmissao = dataAdmissao;
        this.dataDemissao = dataDemissao;
    }
    
    //Construtor 2;
    public Funcionario(String nomeCompleto, String email, String telefone,String senha,String cpf,
                       String matricula,String dataAdmissao,String dataDemissao){
            super(nomeCompleto, email, telefone,senha, cpf);
            setDataAdmissao(dataAdmissao);
            setDataDemissao(dataDemissao);
            setMatricula(matricula);
    }
    
    public Funcionario(){}

    // ========= GET ==============
    public String getMatricula() {
        return matricula;
    }
    
    public String getDataAdmissao() {
        return dataAdmissao;
    }
     
    public String getDataDemissao() {
        return dataDemissao;
    }
    
    
    // ========= SET ===============
    public final void setMatricula(String matricula) {
        
        if(!matricula.equals("")){
            this.matricula = matricula;
        }else{
            throw new IllegalArgumentException("Matricula Inválida.");
        }    
        
    }

    public final void setDataAdmissao(String dataAdmissao) {
           
       if(ValidacaoSTR.validaData(dataAdmissao)){
           this.dataAdmissao = dataAdmissao;
       }else{
       
           throw new IllegalArgumentException("Data Admissao Invalida.");
       }
        
    }

    public final void setDataDemissao(String dataDemissao) {
        
        if(ValidacaoSTR.validaData(dataDemissao)){
            this.dataDemissao = dataDemissao;
        }else{
            throw new IllegalArgumentException("Data Demissao Invalida.");
        }
            
    }
}
