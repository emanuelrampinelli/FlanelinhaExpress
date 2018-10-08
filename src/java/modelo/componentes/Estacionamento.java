
package modelo.componentes;
import modelo.operadores.Administrador;
import modelo.operadores.Guarda;
import modelo.operadores.PessoaJuridica;
import java.util.ArrayList;
import modelo.locais.Endereco;
import modelo.operadores.Funcionario;


public class Estacionamento {
    private int id;
    private String nome;
    private Endereco endereco;
    private double valorHora;
    private ArrayList<Vaga> listaVagas;
    private Funcionario funcionario;
    private ArrayList<Administrador> listaAdministradores;
    private LocalizacaoGPS gps;
    private PessoaJuridica pessoaJuridica;

    public Estacionamento() {
    }

    public Estacionamento(String nome, double valorHora) {
        this.nome = nome;
        this.valorHora = valorHora;
    }

    public Estacionamento(int id, String nome, Endereco endereco, double valorHora, ArrayList<Vaga> listaVagas, Guarda guarda, LocalizacaoGPS gps) {
        this.id = id;
        this.nome = nome;
        this.endereco = endereco;
        this.valorHora = valorHora;
        this.listaVagas = listaVagas;
        //this.funcionario = funcionario;
        this.gps = gps;
    }
    
    public Estacionamento(int id, String nome, Endereco endereco, double valorHora, Guarda guarda, ArrayList<Administrador> listaAdministradores, ArrayList<Vaga> listaVagas, PessoaJuridica pessoaJuridica) {
        this.id = id;
        this.nome = nome;
        this.endereco = endereco;
        this.valorHora = valorHora;
        //this.funcionario = funcionario;
        this.listaAdministradores = listaAdministradores;
        this.listaVagas = listaVagas;
        this.pessoaJuridica = pessoaJuridica;
        
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

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public double getValorHora() {
        return valorHora;
    }

    public void setValorHora(double valorHora) {
        this.valorHora = valorHora;
    }

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }

    public ArrayList<Administrador> getListaAdministradores() {
        return listaAdministradores;
    }

    public void setListaAdministradores(ArrayList<Administrador> listaAdministradores) {
        this.listaAdministradores = listaAdministradores;
    }

    public ArrayList<Vaga> getListaVagas() {
        return listaVagas;
    }

    public void setListaVagas(ArrayList<Vaga> listaVagas) {
        this.listaVagas = listaVagas;
    }

    public PessoaJuridica getPessoaJuridica() {
        return pessoaJuridica;
    }

    public void setPessoaJuridica(PessoaJuridica pessoaJuridica) {
        this.pessoaJuridica = pessoaJuridica;
    }

    public LocalizacaoGPS getGps() {
        return gps;
    }

    public void setGps(LocalizacaoGPS gps) {
        this.gps = gps;
    }
    
    
}
