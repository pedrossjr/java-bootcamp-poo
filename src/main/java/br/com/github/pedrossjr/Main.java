package br.com.github.pedrossjr;

import br.com.github.pedrossjr.dominio.*;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Progresso ranking = new Progresso();

        Curso curso1 = new Curso();
        curso1.setTitulo("Curso de Java Básico");
        curso1.setDescricao("Descrição do curso.");
        curso1.setCargaHoraria(18);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso de Java Intermediário");
        curso2.setDescricao("Descrição do curso.");
        curso2.setCargaHoraria(18);

        Curso curso3 = new Curso();
        curso3.setTitulo("Curso de Java Avançado");
        curso3.setDescricao("Descrição do curso.");
        curso3.setCargaHoraria(18);

        Curso curso4 = new Curso();
        curso4.setTitulo("Curso de Java com Spring Boot Básico");
        curso4.setDescricao("Descrição do curso.");
        curso4.setCargaHoraria(18);

        Curso curso5 = new Curso();
        curso5.setTitulo("Curso de Java com Spring Boot Intermediário");
        curso5.setDescricao("Descrição do curso.");
        curso5.setCargaHoraria(18);

        Curso curso6 = new Curso();
        curso6.setTitulo("Curso de Java com Spring Boot Avançado");
        curso6.setDescricao("Descrição do curso.");
        curso6.setCargaHoraria(18);

        Curso curso7 = new Curso();
        curso7.setTitulo("Curso de Java com Dicas Complementares");
        curso7.setDescricao("Descrição do curso.");
        curso7.setCargaHoraria(18);

        // O conceito de Polimorfismo é poder criar um curso a partir de um conteúdo.
        // Tudo que eu tenho em curso, eu tenho em conteúdo mas, nem tudo que eu tenho em curso, eu tenho em conteúdo.
        // Ou seja, poder instânciar uma classe de várias formas.
        Conteudo conteudo1 = new Curso();
        conteudo1.setTitulo("Cerimônia de Lançamento do Bootcamp");
        conteudo1.setDescricao("Descrição dda cerimônia de laçamento do bootcamp.");

        Conteudo conteudo2 = new Mentoria();
        conteudo2.setTitulo("Cerimônia de Lançamento da Mentoria");
        conteudo2.setDescricao("Descrição dda cerimônia de laçamento da mentoria.");

        System.out.println(conteudo1);
        System.out.println(conteudo2);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria Java");
        mentoria.setDescricao("Descrição mentoria");
        mentoria.setData(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer com Spring Boot");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(curso3);
        bootcamp.getConteudos().add(curso4);
        bootcamp.getConteudos().add(curso5);
        bootcamp.getConteudos().add(curso6);
        bootcamp.getConteudos().add(curso7);
        bootcamp.getConteudos().add(mentoria);

        Dev devCamila = new Dev();
        devCamila.setNome("Camila");
        devCamila.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos " + devCamila.getNome() + ": " + devCamila.getConteudoInscritos());
        devCamila.progredir();
        devCamila.progredir();
        devCamila.progredir();
        devCamila.progredir();
        devCamila.progredir();
        devCamila.calcularTotalXp();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos " + devCamila.getNome() + ": " + devCamila.getConteudoInscritos());
        System.out.println("Conteúdos Concluídos " + devCamila.getNome() + ": " + devCamila.getConteudosConcluidos());
        System.out.println("Progresso: ");
        ranking.adicionarAoRanking(devCamila.calcularTotalXp().intValue(), devCamila.getNome());

        System.out.println("-----------------#-----------#-----------------");

        Dev devJoao = new Dev();
        devJoao.setNome("Cristina");
        devJoao.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos " + devJoao.getNome() + ": " + devCamila.getConteudoInscritos());
        devJoao.progredir();
        devJoao.progredir();
        devJoao.progredir();
        devJoao.progredir();
        devJoao.progredir();
        devJoao.calcularTotalXp();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos " + devJoao.getNome() + ": " + devCamila.getConteudoInscritos());
        System.out.println("Conteúdos Concluídos " + devJoao.getNome() + ": " + devCamila.getConteudosConcluidos());
        System.out.println("Progresso: ");
        ranking.adicionarAoRanking(devJoao.calcularTotalXp().intValue(), devJoao.getNome());

        System.out.println("-----------------#-----------#-----------------");

        Dev devPedro = new Dev();
        devPedro.setNome("Pedro");
        devPedro.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos " + devPedro.getNome() + ": " + devCamila.getConteudoInscritos());
        devPedro.progredir();
        devPedro.progredir();
        devPedro.progredir();
        devPedro.progredir();
        devPedro.progredir();
        devPedro.progredir();
        devPedro.calcularTotalXp();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos " + devPedro.getNome() + ": " + devCamila.getConteudoInscritos());
        System.out.println("Conteúdos Concluídos " + devPedro.getNome() + ": " + devCamila.getConteudosConcluidos());
        System.out.println("Progresso: ");
        ranking.adicionarAoRanking(devPedro.calcularTotalXp().intValue(), devPedro.getNome());

        ranking.exibirRanking();
    }
}