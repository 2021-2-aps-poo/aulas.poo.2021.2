package br.ufpb.dcx.aps.atividades.clinica;

import java.util.LinkedList;
import java.util.List;

public class Prontuario {

    private Paciente paciente;
    private List<Consulta> consultas = new LinkedList<>();

    public Prontuario(Paciente paciente){
        this.paciente = paciente;
    }

    public Consulta criarConsulta(){
        Consulta consulta = new Consulta(this );
        consultas.add(consulta);
        return consulta;

    }

    public List<Consulta> getConsultas(){
        return consultas;
    }


}
