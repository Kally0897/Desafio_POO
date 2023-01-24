import br.com.dio.desafio.dominio.*;

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

//        System.out.println(curso);
//        System.out.println(curso1);
//        System.out.println(curso2);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria de JAVA");
        mentoria.setDescricao("Descrição de JAVA");
        mentoria.setData(LocalDate.now());

        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("Mentoria de JAVA");
        mentoria1.setDescricao("Descrição de JAVA");
        mentoria1.setData(LocalDate.now());

//        Conteudo conteudo = new Curso();  //Aqui é um exemplo de Polimorfismo
//        Conteudo conteudo1 = new Mentoria(); //Aqui é um exemplo de Polimorfismo


        Mentoria mentoria2 = new Mentoria();
        mentoria2.setTitulo("Mentoria de JAVA");
        mentoria2.setDescricao("Descrição de JAVA");
        mentoria2.setData(LocalDate.now());



//        System.out.println(mentoria);
//        System.out.println(mentoria1);
//        System.out.println(mentoria2);

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso);
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev desenvolvedor = new Dev();
        desenvolvedor.setNome("Kalliandra Lima");
        desenvolvedor.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos Kalliandra: " + desenvolvedor.getConteudosInscritos());

        desenvolvedor.progredir();
        desenvolvedor.progredir();

        System.out.println("-");

        System.out.println("Conteúdos inscritos Kalliandra: " + desenvolvedor.getConteudosInscritos());

        System.out.println("Conteúdos concluídos Kalliandra: " + desenvolvedor.getConteudosConcluidos());

        System.out.println("XP de Kalliandra: " + desenvolvedor.calcularTotalXp());


        System.out.println("-------------------------------------------------------------");


        Dev desenvolvedor1 = new Dev();
        desenvolvedor1.setNome("João Lucas Fonseca Teodósio");
        desenvolvedor1.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos João: " + desenvolvedor1.getConteudosInscritos());

        desenvolvedor1.progredir();
        desenvolvedor1.progredir();
        desenvolvedor1.progredir();
        desenvolvedor1.progredir();

        System.out.println("-");

        System.out.println("Conteúdos inscritos João: " + desenvolvedor1.getConteudosInscritos());

        System.out.println("Conteúdos concluídos João: " + desenvolvedor.getConteudosConcluidos());

        System.out.println("XP de João: " + desenvolvedor1.calcularTotalXp());


    }
}