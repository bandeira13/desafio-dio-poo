import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Mentoria;
import br.com.dio.desafio.dominio.Conteudo;
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


        System.out.println("XP Curso1: " + curso1.calcularXp());
        System.out.println("XP Curso2: " + curso2.calcularXp());
        System.out.println("XP Mentoria: " + mentoria.calcularXp());
    }
}
