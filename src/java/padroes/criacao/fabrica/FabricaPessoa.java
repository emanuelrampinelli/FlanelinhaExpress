
package padroes.criacao.fabrica;

import modelo.operadores.Funcionario;
import modelo.operadores.Motorista;
import modelo.operadores.Pessoa;
import modelo.operadores.PessoaJuridica;

/**
 *
 * @author Manel
 */
public class FabricaPessoa {
    public static Pessoa criaPessoa(String pessoa){
        Pessoa pessoaCriada;
        
        if(pessoa.equalsIgnoreCase("funcionario")){
            pessoaCriada = new Funcionario();
            return pessoaCriada;
        }
        else if(pessoa.equalsIgnoreCase("motorista")){
            pessoaCriada = new Motorista();
            return pessoaCriada;
        }
        else if(pessoa.equalsIgnoreCase("juridica")){
            pessoaCriada = new PessoaJuridica();
            return pessoaCriada;
            
        }else{
            return null;
        }
        
    
        
    }
}
