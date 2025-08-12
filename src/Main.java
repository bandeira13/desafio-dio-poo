import br.com.dio.desafio.dominio.*;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Conteudo curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Descrição curso de Java");
        ((Curso) curso1).setCargaHoraria(8);

        Conteudo curso2 = new Curso();
        curso2.setTitulo("Curso C#");
        curso2.setDescricao("Descrição do curso de C#");
        ((Curso) curso2).setCargaHoraria(10);

        Conteudo mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria de JAVA");
        mentoria.setDescricao("Mentorias de JAVA");
        ((Mentoria) mentoria).setData(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp em Java");
        bootcamp.setDescricao("Descrição do bootcamp de Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devEu = new Dev();
        devEu.setNome("Bandeira13");
        devEu.inscreverBootcamp(bootcamp);

        // Antes de progredir
        System.out.println(" Conteúdos inscritos (início):");
        devEu.getConteudosInscritos().forEach(System.out::println);

        // Progresso 1
        devEu.progredir();
        System.out.println("\n Depois do 1º progresso:");
        System.out.println("Concluídos:");
        devEu.getConteudosConcluidos().forEach(System.out::println);
        System.out.println("Inscritos restantes:");
        devEu.getConteudosInscritos().forEach(System.out::println);

        // Progresso 2
        devEu.progredir();
        System.out.println("\n Depois do 2º progresso:");
        System.out.println("Concluídos:");
        devEu.getConteudosConcluidos().forEach(System.out::println);
        System.out.println("Inscritos restantes:");
        devEu.getConteudosInscritos().forEach(System.out::println);

        // XP total
        System.out.println("\nXP Total: " + devEu.calcularTotalXp());
    }
}
