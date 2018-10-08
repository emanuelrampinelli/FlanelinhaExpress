
package persistencia.operadores;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import modelo.operadores.PessoaJuridica;

import persistencia.conexao.ConexaoBD;

public class PersistenciaPessoaJuridica {
    
    Connection conexao = null;
    
    
    public PessoaJuridica loginPessoaJuridica(String email,String senha) throws ClassNotFoundException, SQLException{
        
        
        conexao = ConexaoBD.conectar();
        
        //========================================         
        PreparedStatement ps = conexao.prepareStatement("SELECT * FROM pessoaJuridica WHERE  email = ? and senha = ? and situacao='ativado'");
        
        ps.setString(1,email); // Email
        ps.setString(2,senha); // Senha
      
        
        //Executa SQL e guarda ID;
        ResultSet resultadoSQL = ps.executeQuery();
        
        PessoaJuridica pessoa = new PessoaJuridica();
            
        if(resultadoSQL.next()){
            
            pessoa.setId(resultadoSQL.getInt("id"));
            pessoa.setEmail(resultadoSQL.getString("nome"));
            pessoa.setTelefone(resultadoSQL.getString("telefone"));
            pessoa.setSenha(resultadoSQL.getString("senha"));
            pessoa.setCnpj(resultadoSQL.getString("cpnj"));
                
        }else{
            pessoa.setId(-1);
        }
        
        return pessoa;    
                
      
    }
}
    /*
    
    public Motorista carregaMotorista(int id) throws SQLException{
        
        conexao = ConexaoBD.conectar();
        
        PreparedStatement ps = conexao.prepareStatement("SELECT * FROM pessoa WHERE  id=?");
        
        ps.setInt(1,id); //senha
        
        //Executa SQL e guarda ID;
        ResultSet rs = ps.executeQuery();
        System.out.println("ok");
        
        if(rs.next()){
            
            //Guarda oque carregou de Pessoa;
            String nome = rs.getString("nome");
            String telefone = rs.getString("telefone");
            String email = rs.getString("email");
            
            //SQL para tabela pessoa Fisica;
            ps = conexao.prepareStatement("SELECT * FROM pessoa_fisica WHERE  fk_pessoa_id=?");
            ps.setInt(1,id); //senha
        
            //Executa SQL e guarda ID;
            rs = ps.executeQuery();
            
            if(rs.next()){
                
                //Guarda oque carrego de Pessoa Fisica;
                String cpf = rs.getString("cpf");

                //SQL para tabela Motorista;
                ps = conexao.prepareStatement("SELECT * FROM motorista WHERE  fk_pessoa_fisica_fk_pessoa_id=?");
                ps.setInt(1,id); //senha

                //Executa SQL e guarda ID;
                rs = ps.executeQuery();
                rs.next();
                //Guarda oque carrego de motorista;
                String cnh = rs.getString("cnh");
                double creditos = rs.getDouble("creditos");

                Motorista moto = new Motorista(nome,email,telefone,null,cpf,cnh,creditos);
                return moto;
            }else{
                return null;
            }
            
            
            
            
        }else{
        
            JOptionPane.showMessageDialog(null,"Dados Inválidos.");
            
            return null;
        }
        
    }
 
    public void desativaMotorista(int id) throws SQLException{
           
        conexao = ConexaoBD.conectar();
        
        String sql = String.format("UPDATE pessoa set situacao='desativado' where id = %d returning id",id);
        Statement statement = conexao.createStatement();
         
        //exeucta a query no meu banco de dados
        ResultSet rs = statement.executeQuery(sql);
        statement.close();
        conexao.close();
    
    }
    
    
    //Metodo id do Motorista;
    public int loginMotorista(String email,String senha) throws ClassNotFoundException, SQLException{
        
        
        conexao = ConexaoBD.conectar();
        //========================================         
        //Criar pessoa;
        PreparedStatement ps = conexao.prepareStatement("SELECT * FROM pessoa WHERE  email = ? and senha = ? and situacao='ativado'");
        
        ps.setString(1,email); // Email
        ps.setString(2,senha); // Senha
      
        
        //Executa SQL e guarda ID;
        ResultSet rs = ps.executeQuery();
        
  
        
        if(rs.next()){
            
            return rs.getInt("id");
            
            
        }else{
        
            JOptionPane.showMessageDialog(null,"Dados Inválidos.");
            
            return -1;
        }  
        
      
    }
    
    public void alterarSenha (int id, String senha) throws SQLException{
        
        conexao = ConexaoBD.conectar();
        
        //Update Senha;
        PreparedStatement ps = conexao.prepareStatement("Update pessoa set senha=? where id = ? returning id;");
        ps.setString(1,senha); // Senha
        ps.setInt(2,id); // ID
        
        ResultSet rs = ps.executeQuery();
        ps.close();
        conexao.close();
        
    
    }
    
    public void insertMotorista (Motorista motorista) throws SQLException{
 
        int chaveEstrangeira = 0;
        
        conexao = ConexaoBD.conectar();
        
        //Verifica se exite alguem com o cpf já cadastrado;
        PreparedStatement ps = conexao.prepareStatement("Select cpf from pessoa_fisica where cpf = ?;");
        ps.setString(1,motorista.getCpf()); // CPF
        
        ResultSet rs = ps.executeQuery();
        
        //Verifica de encontrou algum CPF;
        if(rs.next()){
            JOptionPane.showMessageDialog(null,"CPF "+rs.getString("cpf") +" já cadastrado.");
            
        }else{
            
            //========================================         
            //Criar pessoa;
            ps = conexao.prepareStatement("Insert into pessoa(nome,telefone,email,senha)" + 
                    "values (?,?,?,?) returning id;");

            ps.setString(1,motorista.getNomeCompleto()); // Nome
            ps.setString(2,motorista.getTelefone()); // Telefone
            ps.setString(3,motorista.getEmail()); // Email
            ps.setString(4,motorista.getSenha()); // Senha

            //Executa SQL e guarda ID;
            rs = ps.executeQuery();

            //Verifica se possui algum retorno;
            if(rs.next()){
                chaveEstrangeira = rs.getInt("id");
                System.out.print("\nCHAVE: "+ chaveEstrangeira);
             }else{
                throw new SQLException("Erro em carrega chave Estrangeira.");
            }


            //=============================================
            //Cria Pessoa Fisica;
            ps = conexao.prepareStatement("Insert into pessoa_fisica(cpf,fk_pessoa_id)" + 
                    "values (?,?) returning fk_pessoa_id;");

            ps.setString(1,motorista.getCpf()); // CPF
            ps.setInt(2,chaveEstrangeira); // FK Pessoa

            //Executa SQL e guarda ID;
            rs = ps.executeQuery();
            

            //=============================================
            //Cria Motorista;
            ps = conexao.prepareStatement("Insert into motorista(creditos,cnh,fk_pessoa_fisica_fk_pessoa_id)" + 
                    "values (?,?,?) returning cnh;");
            
            ps.setDouble(1,0.0); // Créditos
            ps.setString(2,motorista.getCnh());// CNH
            ps.setInt(3,chaveEstrangeira); // FK Pessoa Fisica
            
            //Executa SQL e guarda ID;
            rs = ps.executeQuery();
            
        }
        
        ps.close();
        conexao.close();
    }



}*/
