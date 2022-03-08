package br.com.dio.desafio.dominio;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Torne-se um programador Java completo");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso JavaScript");
        curso2.setDescricao("Torne-se um programador JavaScript completo");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria de java");
        mentoria.setDescricao("Tire suas dúvidas sobre Java");
        mentoria.setData(LocalDate.now());


        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Complete e ganhe um estágio");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devPaulo = new Dev();
        devPaulo.setNome("Paulo Bisetto");
        devPaulo.inscreverBootcamp(bootcamp);
        System.out.println("-------");
        System.out.println("Conteúdos Inscritos Paulo Bisetto:" + devPaulo.getConteudosInscritos());
        devPaulo.progredir();
        devPaulo.progredir();
        System.out.println("-------");
        System.out.println("Conteúdos Inscritos Paulo Bisetto:" + devPaulo.getConteudosInscritos());
        System.out.println("-------");
        System.out.println("Conteúdos Concluídos Paulo Bisetto:" + devPaulo.getConteudosConcluidos());
        System.out.println("-------");
        System.out.println("XP:" + devPaulo.calcularTotalXp());

        System.out.println("-------");

        Dev devBruna = new Dev();
        devBruna.setNome("Joao");
        devBruna.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Bruna:" + devBruna.getConteudosInscritos());
        devBruna.progredir();
        devBruna.progredir();
        devBruna.progredir();
        System.out.println("-------");
        System.out.println("Conteúdos Inscritos Bruna:" + devBruna.getConteudosInscritos());
        System.out.println("-------");
        System.out.println("Conteúdos Concluidos Bruna:" + devBruna.getConteudosConcluidos());
        System.out.println("-------");
        System.out.println("XP:" + devBruna.calcularTotalXp());
        System.out.println("-------");

    }

}