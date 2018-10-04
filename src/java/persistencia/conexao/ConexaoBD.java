
package persistencia.conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ConexaoBD {
    //Tipo static para <connection> para ela ser enxergada pelos métodos abaixo (que são static)
    static Connection connection = null;
    
    public static Connection conectar() throws SQLException{
        String url = "jdbc:postgresql://localhost:5432/postgres_poo1";
        String usuario = "postgres";
        String senha = "aluno";

        try {
            //verifica se as classe da biblioteca existem
            Class.forName("org.postgresql.Driver");
            //abre a conexao com o  banco de dados chamado BD_ESTACIONA.
            connection = (Connection) DriverManager.getConnection(url, usuario, senha);
            System.out.println("Banco de dados aberto");
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
            Logger.getLogger(ConexaoBD.class.getName()).log(Level.SEVERE, null, ex);
        }
        return connection;
    }
    
    public static void executeSQL(String sql) throws SQLException {
        //abre a conexao com o banco de dados.
        connection = ConexaoBD.conectar();
        Statement statement = connection.createStatement();
        
        //exeucta o sql no meu banco de dados
        statement.executeUpdate(sql);
        statement.close();
        
        //fecha a conexao com o banco de dados
        connection.close();
    }
    

}
