package br.ufpb.dcx.aps.atividades.clinica;

import java.util.HashMap;
import java.util.Map;

public class Clinica {


    private Map<Paciente, Prontuario> prontuarios = new HashMap<>();


    public void addPaciente(Paciente paciente){

        prontuarios.put(paciente,new Prontuario(paciente));

    }

    public Prontuario getProntuario(Paciente paciente){
        return prontuarios.get(paciente);
    }


}
