import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso cursoJava = new Curso("Curso Java","descrição do curso de Java",80);
        Curso cursoJS = new Curso("Curso Javascript","descrição do curso de Javascript",70);
        Mentoria mentoria = new Mentoria("Mentoria de GO","Descrição da Mentoria", LocalDate.now());

        System.out.println(mentoria);
        System.out.println(cursoJS);
        System.out.println(cursoJava);
    }
}
