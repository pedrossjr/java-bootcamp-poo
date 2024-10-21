package br.com.github.pedrossjr.dominio;

import java.util.ArrayList;

import java.util.List;

public class Progresso extends Ranking{

    private List<Integer> progressoList;

    private int cargaHoraria = 0;
    private int cargaHorariaConcluida = 0;

    public List<Integer> getProgressoList() {
        return progressoList;
    }

    public void setProgressoList(List<Integer> progressoList) {
        this.progressoList = progressoList;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    public int getCargaHorariaConcluida() {
        return cargaHorariaConcluida;
    }

    public void setCargaHorariaConcluida(int cargaHorariaConcluida) {
        this.cargaHorariaConcluida = cargaHorariaConcluida;
    }

    public Progresso() {
        this.progressoList = new ArrayList<>();
    }

    public List<Integer> adicionarProgresso(int Progresso, int CargaHorariaTotal) {
        List<Double> progresso = new ArrayList<>();

        double NovoProgresso = Progresso * CargaHorariaTotal;

         progresso.add(NovoProgresso);
        return progressoList;
    }
}
