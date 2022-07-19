import br.com.dio.desafio.dominio.Bootecamp;
import br.com.dio.desafio.dominio.Conteudo;
import br.com.dio.desafio.dominio.Curso;

import java.time.LocalDate;

import static jdk.internal.logger.DefaultLoggerFinder.SharedLoggers.system;

public class Main {
   public static void main(String[] args){

      Curso curso1 = new Curso();
      curso1.setTitulo("curso java");
      curso1.setDescricao("descrição curso java");
      curso1.setCargaHoraria(8);


      Curso curso2 = new Curso();
      curso1.setTitulo("curso js");
      curso1.setDescricao("descrição curso js");
      curso1.setCargaHoraria(4);



      Mentoria mentoria = new Mentoria();
      mentoria.setTitulo("mentoria de java");
      mentoria.setDescricao("descrição mentoria java");
      mentoria.setData(LocalDate.now());

      /*system.out.println(curso1);
      system.out.println(curso2);
      system.out.println(mentoria);*/

      Bootecamp bootecamp = new Bootecamp();
      bootecamp.setDescricao("Descrição Bootecamp Java Developer");
      bootecamp.getConteudos().add(curso1);
      bootecamp.getConteudos().add(curso2);
      bootecamp.getConteudos().add(mentoria);

      Dev devAngelica = new Dev();
      devAngelica.setNome("Angelica");
      devAngelica.inscreverBootecamp(bootecamp);
      System.out.println("Conteudos Inscritos Angelica:" + devAngelica.getConteudosInscritos());

      devAngelica.progredir();

      System.out.println("Conteudos Inscritos Angelica:" + devAngelica.getConteudosInscritos());
      System.out.println("Conteudos Concluidos Angelica:" + devAngelica.getConteudosConcluidos());
      System.out.println("XP:" +devAngelica.calculatTotalXp());

      System.out.println("--------")

      Dev devMatheus = new Dev();
      devMatheus.setNome("Matheus");
      devMatheus.inscreverBootecamp(bootecamp);
      System.out.println("Conteudos Inscritos Matheus:" + devMatheus.getConteudosInscritos());
      devMatheus.progredir();
      devMatheus.progredir();
      devMatheus.progredir();
      System.out.println("-");
      System.out.println("-")
      System.out.println("Conteudos Inscritos Matheus:" + devMatheus.getConteudosInscritos());
      System.out.println("Conteudos Concluidos Matheus:" + devAngelica.getConteudosConcluidos());
      System.out.println("XP:" +devMatheus.calculatTotalXp());

   }
}
