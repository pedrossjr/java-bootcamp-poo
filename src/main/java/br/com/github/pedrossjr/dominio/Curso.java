package br.com.github.pedrossjr.dominio;

import java.util.Random;

public class Curso extends Conteudo {
    private int cargaHoraria;
    private int minimoValor = 0;
    private int maximaValor = 9;

    Random random = new Random();

    @Override
    public double calcularXP() {
        int valor = random.nextInt((maximaValor - minimoValor) + 1) + minimoValor;
        return ( XP_PADRAO * cargaHoraria ) + valor;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    @Override
    public String toString() {
        return "\n\nCurso { " +
                "\ntitulo = " + getTitulo() +
                ", \ndescricao = " + getDescricao() +
                ", \ncargaHoraria = " + cargaHoraria +
                "\n}";
    }
}