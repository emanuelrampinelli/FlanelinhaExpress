/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.componentes;

/**
 *
 * @author Edmiltho
 */
public final class Veiculo {
    private int id;
    private String placa;
    private int ano;
    private String modelo;
    private String marca;
    private String cor;
    public final int PLACA = 7;

    public Veiculo(int id, String placa, int ano, String modelo, String marca,String cor) {
        this.placa = placa;
        this.ano = ano;
        this.modelo = modelo;
        this.marca = marca;
        this.cor = cor;
    }

    public Veiculo(int ano, String modelo, String marca,String placa,String cor) {
        setAno(ano);
        setModelo(modelo);
        setMarca(marca);
        setPlaca(placa);
        setCor(cor);
        
        
    }
    
    public Veiculo(){}

    @Override
    public String toString() {
        return "Veiculo{" + "id=" + id + ", placa=" + placa + ", ano=" + ano + ", modelo=" + modelo + ", marca=" + marca + ", PLACA=" + PLACA + '}';
    }
    
    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }
    
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    

    public void setPlaca(String placa) {
        if (placa.length()!=PLACA)
            throw new IllegalArgumentException("Placa inválida");
        else    
            this.placa = placa;
    }

    public void setAno(int ano) {
        if(ano<=1930)
            throw new IllegalArgumentException("Ano inválido");
        else
            this.ano=ano;          
    }


    public void setModelo(String modelo) {
        if(!modelo.equals(""))
            this.modelo = modelo;
        else
            throw new IllegalArgumentException("Modelo inválido");
    }

    public void setMarca(String marca) {
        if(!marca.equals(""))
            this.marca = marca;
        else
            throw new IllegalArgumentException("Marca inválida");
    }

    public String getPlaca() {
        return placa;
    }

    public int getAno() {
        return ano;
    }

    public String getModelo() {
        return modelo;
    }

    public String getMarca() {
        return marca;
    }
    
    
    


    
}
