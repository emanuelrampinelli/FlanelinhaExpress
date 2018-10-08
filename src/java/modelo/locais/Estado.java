
package modelo.locais;

import java.util.ArrayList;
import modelo.locais.Cidade;


public class Estado {
    private int id;
    private String nome;
    private ArrayList<Cidade> lista_cidades;

    
    public Estado(int id, String nome, ArrayList<Cidade> lista_cidades) {
        this.id = id;
        this.nome = nome;
        this.lista_cidades = lista_cidades;
    }

    public Estado() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public ArrayList<Cidade> getLista_cidades() {
        return lista_cidades;
    }

    public void setLista_cidades(ArrayList<Cidade> lista_cidades) {
        this.lista_cidades = lista_cidades;
    }

   
    
    
}
