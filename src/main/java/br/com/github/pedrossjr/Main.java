package br.com.github.pedrossjr;

import br.com.github.pedrossjr.dominio.*;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Curso curso1 = new Curso();
        curso1.setTitulo("Curso de Java");
        curso1.setDescricao("Descrição do curso de Java");
        curso1.setCargaHoraria(56);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso de Node");
        curso2.setDescricao("Descrição do curso de Node");
        curso2.setCargaHoraria(40);

        Curso curso3 = new Curso();
        curso3.setTitulo("Curso de Python");
        curso3.setDescricao("Descrição do curso de Python");
        curso3.setCargaHoraria(60);

        Curso curso4 = new Curso();
        curso4.setTitulo("Curso de C#");
        curso4.setDescricao("Descrição do curso de C#");
        curso4.setCargaHoraria(65);

        // O conceito de Polimorfismo é poder criar um curso a partir de um conteúdo.
        // Tudo que eu tenho em curso eu tenho em conteúdo mas nem tudo que eu tenho em curso tenho em conteúdo.
        // Ou seja, instânciar uma classe de várias formas.
        Conteudo conteudo1 = new Curso();
        Conteudo conteudo2 = new Mentoria();

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria Java");
        mentoria.setDescricao("Descrição mentoria");
        mentoria.setData(LocalDate.now());

        Ranking ranking = new Ranking();

        // System.out.println(curso1);
        // System.out.println(curso2);
        // System.out.println(mentoria);

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devCamila = new Dev();
        devCamila.setNome("Camila");
        devCamila.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos " + devCamila.getNome() + ": " + devCamila.getConteudoInscritos());
        devCamila.progredir();
        devCamila.progredir();
        devCamila.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos " + devCamila.getNome() + ": " + devCamila.getConteudoInscritos());
        System.out.println("Conteúdos Concluídos " + devCamila.getNome() + ": " + devCamila.getConteudosConcluidos());
        System.out.println("XP: " + devCamila.calcularTotalXp());
        ranking.adicionarAoRanking(devCamila.calcularTotalXp().intValue(), devCamila.getNome());

        System.out.println("-----------------");

        Dev devJoao = new Dev();
        devJoao.setNome("João");
        devJoao.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos " + devJoao.getNome() + ": " + devCamila.getConteudoInscritos());
        devJoao.progredir();
        devJoao.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos " + devJoao.getNome() + ": " + devCamila.getConteudoInscritos());
        System.out.println("Conteúdos Concluídos " + devJoao.getNome() + ": " + devCamila.getConteudosConcluidos());
        System.out.println("XP: " + devJoao.calcularTotalXp());
        ranking.adicionarAoRanking(devJoao.calcularTotalXp().intValue(), devJoao.getNome());

        ranking.exibirRanking();
    }
}