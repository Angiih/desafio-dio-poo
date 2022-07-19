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

      system.out.println(curso1);
      system.out.println(curso2);
      system.out.println(mentoria);

   }
}
