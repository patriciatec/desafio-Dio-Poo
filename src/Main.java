import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

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

        /*System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);*/

            Bootcamp bootcamp = new Bootcamp();
            bootcamp.setNome("Bootcamp java Developer");
            bootcamp.setDescrição("Descrição bootcamp java Developer");
            bootcamp.getConteudos().add(curso1);
            bootcamp.getConteudos().add(curso2);
            bootcamp.getConteudos().add(mentoria);

            Dev devPatricia = new Dev();
            devPatricia.setNome("Patricia");
            devPatricia.inscreverBootcamp(bootcamp);
            System.out.println("Conteúdos Inscritos:" + devPatricia.getConteudosInscritos());
            devPatricia.progredir();
            devPatricia.progredir();
            System.out.println("Conteúdos Concluídos:" + devPatricia.getConteudosConcluidos());
            System.out.println("XP:" + devPatricia.calcularTotalXp());


            System.out.println("-------");

            Dev devBruna = new Dev();
            devBruna.setNome("Bruna");
            devBruna.inscreverBootcamp(bootcamp);
            System.out.println("Conteúdos Inscritos:" + devBruna.getConteudosInscritos());
           devBruna.progredir();
            System.out.println("Conteúdos Concluídos:" + devBruna.getConteudosConcluidos());
            System.out.println("XP:" + devBruna.calcularTotalXp());

        }


    }


