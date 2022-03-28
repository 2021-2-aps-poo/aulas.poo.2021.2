package br.ufpb.dcx.aps.atividades.clinica;

import java.util.HashMap;
import java.util.Map;

public class Clinica {


    private Map<Paciente, Prontuario> prontuarios = new HashMap<>();


    public void addPaciente(Paciente paciente){
        if (prontuarios.containsKey(paciente))
            throw new RuntimeException("Este paciente já está cadastrado!!");

        prontuarios.put(paciente,new Prontuario(paciente));
    }

    public Prontuario getProntuario(Paciente paciente) throws ClinicaException {
        if(!this.prontuarios.containsKey(paciente))
            throw new ClinicaException("Paciente não existe"+paciente);
        return prontuarios.get(paciente);
    }
}
