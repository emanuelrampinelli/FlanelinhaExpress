
package modelo.utilidade;

public class ValidacaoSTR {
    
    
    //Valida formato data;
    public static boolean validaData(String data) {
        
        //Verifica se tamanho de data é igual a 10;
        if(data.length() == 10){
            
            //Verifica barras na data. EX ("11/11/1999");
            return (data.charAt(2) == '/')&& 
                   (data.charAt(5) == '/')&& 
                   (data.charAt(8) == '/');
        }
        
        return false;
    }
    
    
}
