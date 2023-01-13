package br.com.dio.desafio.dominio;

import java.time.LocalDate;

public class Main {
    public static void main (String[] args){
       Curso curso1 = new Curso();
       curso1.setTítulo("curso java");
       curso1.setDescrição("descrição curso java");
       curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTítulo("curso js");
        curso2.setDescrição("descrição curso js");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTítulo("mentoria de java");
        mentoria.setDescrição("descrição mentoria java");
        mentoria.setData(LocalDate.now());

        System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);

    }


}
