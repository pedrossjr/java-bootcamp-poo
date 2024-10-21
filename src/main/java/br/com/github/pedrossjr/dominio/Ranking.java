package br.com.github.pedrossjr.dominio;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Ranking {

    private Map<Integer, String> rankingMap;

    public Ranking() {
        this.rankingMap = new HashMap<>();
    }

    public void adicionarAoRanking(Integer xp, String nome){
        rankingMap.put(xp, nome);
    }

    public void exibirRanking() {
        if(!rankingMap.isEmpty()){
            Map<Integer, String> ordenarRanking = new TreeMap<>(Collections.reverseOrder());
            ordenarRanking.putAll(rankingMap);

            System.out.println("");
            System.out.println("===============");
            System.out.println("RANKING DE DEVs");
            System.out.println("===============");

            ordenarRanking.forEach(
                (chave, valor) ->
                        System.out.println(chave + " Pts - " + valor
                )
            );
       } else {
            System.out.println("Ainda não existem participantes para classificação no ranking.");
        }
    }
}