import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso = new Curso(); //Dando início a um novo curso
        curso.setTitulo("Curso Java");
        curso.setDescricao("Descrição curso Java");
        curso.setCargaHoraria(8);

        Curso curso1 = new Curso(); //Dando início a um novo curso
        curso1.setTitulo("Curso JS");
        curso1.setDescricao("Descrição curso JS");
        curso1.setCargaHoraria(10);

        Curso curso2 = new Curso(); //Dando início a um novo curso
        curso2.setTitulo("Curso Python");
        curso2.setDescricao("Descrição curso Python");
        curso2.setCargaHoraria(8);

        System.out.println(curso);
        System.out.println(curso1);
        System.out.println(curso2);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria de JAVA");
        mentoria.setDescricao("Descrição de JAVA");
        mentoria.setData(LocalDate.now());

        System.out.println(mentoria);
    }
}