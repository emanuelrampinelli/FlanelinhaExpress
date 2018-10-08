
package modelo.locais;

import java.util.ArrayList;


public class Cidade {
    private int id;
    private String nome;
    private Estado estado;
    private ArrayList<Bairro> lista_bairros;
    private int FK_ESTADO_id;


    public Cidade() {
    }

    public Cidade(String nome, Estado estado) {
        this.nome = nome; 
        this.FK_ESTADO_id = estado.getId();
        this.estado = estado;
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

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    public ArrayList<Bairro> getLista_bairros() {
        return lista_bairros;
    }

    public void setLista_bairros(ArrayList<Bairro> lista_bairros) {
        this.lista_bairros = lista_bairros;
    }

    public int getFK_ESTADO_id() {
        return FK_ESTADO_id;
    }

    public void setFK_ESTADO_id(int FK_ESTADO_id) {
        this.FK_ESTADO_id = FK_ESTADO_id;
    }
   
}
