import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso cursoJava = new Curso("Curso Java","descrição do curso de Java",80);
        Curso cursoJS = new Curso("Curso Javascript","descrição do curso de Javascript",70);
        Mentoria mentoria = new Mentoria("Mentoria de GO","Descrição da Mentoria", LocalDate.now());

//        System.out.println(mentoria);
//        System.out.println(cursoJS);
//        System.out.println(cursoJava);

        Bootcamp bootcamp = new Bootcamp("Claro Java SpringBoot","Descrição Bootcamp Java SpringBoot");
        bootcamp.getConteudos().add(cursoJava);
        bootcamp.getConteudos().add(cursoJS);
        bootcamp.getConteudos().add(mentoria);
//        System.out.println(bootcamp.getConteudos());
        Dev devIsak = new Dev("Isak");
        Dev devCamila = new Dev("Camila");

        devIsak.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos" + devIsak.getConteudosInscritos());
        System.out.println("Conteúdos inscritos" + devCamila.getConteudosInscritos());
        devIsak.progredir();
        devCamila.progredir();

        System.out.println("Conteúdos Concluidos" + devIsak.getConteudosConcluidos());
        System.out.println("Conteúdos Concluidos" + devCamila.getConteudosConcluidos());




    }
}
