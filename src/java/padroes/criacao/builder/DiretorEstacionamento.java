/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package padroes.criacao.builder;

import modelo.componentes.Estacionamento;
import modelo.componentes.Vaga;
import modelo.operadores.Funcionario;
import padroes.criacao.builder.BuilderEstacionamento;
import java.util.ArrayList;
import modelo.componentes.LocalizacaoGPS;
import modelo.locais.Endereco;



/**
 *
 * @author Cacherow
 */
public class DiretorEstacionamento {
    public DiretorEstacionamento(){}
    public Estacionamento builder(Endereco endereco, Vaga vaga,Funcionario funcionario, LocalizacaoGPS gps, String nome, double ValorHora,String logradouro, String cep, String bairro, String cidade, String estado,String latitude, String longitude,ArrayList<Vaga> listaVagas,String matricula, ArrayList<Funcionario> listaFuncionarios) throws Exception{
        Estacionamento estacionamento = new Estacionamento();
        BuilderEstacionamento BE = new BuilderEstacionamento(estacionamento,endereco,vaga,funcionario,gps);
        BE.addEndereco(logradouro, cep, bairro, cidade, estado);
        BE.addEstacionamento(nome, ValorHora);
        BE.addFuncionario(matricula, listaFuncionarios);
        BE.addLocalizacao(latitude, longitude);
        BE.addVaga(listaVagas);
        return estacionamento;
    }
}
