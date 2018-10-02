
package padroes.criacao;

import modelo.operadores.Pessoa;
import modelo.operadores.PessoaFisica;
import modelo.operadores.PessoaJuridica;

/**
 *
 * @author Manel
 */
public class FabricaPessoa {
    public static Pessoa criaPessoa(String pessoa){
        Pessoa pessoaCriada;
        
        if(pessoa.equalsIgnoreCase("fisica")){
            pessoaCriada = new PessoaFisica();
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
