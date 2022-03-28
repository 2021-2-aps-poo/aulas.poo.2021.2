package br.ufpb.dcx.aps.atividades.clinica;

import java.util.Calendar;

public class Consulta {

    private Prontuario prontuario;

    private String descricao;
    private Calendar data;

    public Consulta(Prontuario prontuario){
        this.prontuario = prontuario;
        data = Calendar.getInstance();
    }


    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Calendar getData() {
        return data;
    }

    public void setData(Calendar data) {
        this.data = data;
    }

}
