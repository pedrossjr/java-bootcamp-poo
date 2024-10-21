package br.com.github.pedrossjr.dominio;

import java.util.ArrayList;

import java.util.List;

public class Progresso extends Ranking{

    private List<Integer> progressoList;

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
