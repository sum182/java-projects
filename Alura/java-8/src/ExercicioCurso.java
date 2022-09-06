import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.OptionalDouble;
import java.util.stream.Collectors;
import java.util.stream.Stream;


class Curso {

  private String nome;
  private int alunos;

  public Curso(String nome, int alunos) {
    this.nome = nome;
    this.alunos = alunos;
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public int getAlunos() {
    return alunos;
  }

  public void setAlunos(int alunos) {
    this.alunos = alunos;
  }
}

public class ExercicioCurso {

  public static void main(String[] args) {
    List<Curso> cursos = new ArrayList<>();
    cursos.add(new Curso("Python", 45));
    cursos.add(new Curso("JavaScript", 150));
    cursos.add(new Curso("Java 8", 113));
    cursos.add(new Curso("C", 55));

    System.out.println("Ordenando por quantidade de alunos");
    System.out.println("lambda:");
    cursos.sort(Comparator.comparing(c -> c.getAlunos()));
    cursos.forEach(c -> System.out.println(c.getNome()));

    System.out.println("");
    System.out.println("Methods Reference");
    cursos.sort(Comparator.comparing(Curso::getAlunos));
    cursos.forEach(c -> System.out.println(c.getNome()));

    System.out.println("Ordenando por quantidade de alunos");
    System.out.println("lambda:");

    System.out.println("");
    System.out.println("Stream - Filtrando >100");
    cursos.stream()
        .filter(c -> c.getAlunos() > 100)
        .forEach(c -> System.out.println(c.getNome()));

    System.out.println("");
    System.out.println("Stream - Inserindo num map");
    cursos.stream()
        .filter(c -> c.getAlunos() > 100)
        .map((c -> c.getAlunos()))
        .forEach(total -> System.out.println(total));

    System.out.println("");
    System.out.println("Stream - Inserindo num map com methods referentes");
    cursos.stream()
        .filter(c -> c.getAlunos() > 100)
        .map(Curso::getAlunos)
        .forEach(System.out::println);

    System.out.println("");
    System.out.println("Stream -somando o filtro");
    int sum = cursos.stream()
        .filter(c -> c.getAlunos() > 100)
        .mapToInt(Curso::getAlunos)
        .sum();
    System.out.println(sum);

    //Como transformar o nosso Stream<Curso> em um Stream<String> contendo apenas os nomes dos cursos?
    System.out.println("");
    System.out.println(
        "Transformar o nosso Stream<Curso> em um Stream<String> contendo apenas os nomes dos cursos");
    Stream<String> nome = cursos.stream().map(Curso::getNome);
    Stream<String> nome2 = cursos.stream().map(c -> c.getNome());

    System.out.println("");
    System.out.println("Optional");
    cursos.stream()
        //filtrando elementos > 100
        .filter(c -> c.getAlunos() > 100)

        //pegando qualquer elemento
        .findAny()

        //se tiver algo imprimi (obs p findany retorna um optional)
        .ifPresent(c -> System.out.println(c.getNome()));

    System.out.println("");
    System.out.println(".collect");

    List<Curso> cursosList = cursos.stream()
        .filter(c -> c.getAlunos() > 100)
        .collect(Collectors.toList());

    cursosList
        .stream()
        .forEach(c -> System.out.println(c.getNome()));

    System.out.println("");
    System.out.println(".Map");
    Map<String, Integer> cursosMap = cursos.stream()
        .filter(c -> c.getAlunos() > 100)
        .collect(Collectors.toMap(
            c -> c.getNome(),
            c -> c.getAlunos()
        ));
    System.out.println(cursosMap);


    System.out.println("");
    System.out.println(".Map - Utilizando o foreach do proprio map");
    cursos.stream()
        .filter(c -> c.getAlunos() > 100)
        .collect(Collectors.toMap(
            c -> c.getNome(),
            c -> c.getAlunos()))
        .forEach((nome3,alunos3) -> System.out.println(nome3 + " tem " + alunos3 + " alunos"));


    //Calcule a quantidade média de alunos de todos os seus cursos utilizando a API de Stream.
    System.out.println("");
    System.out.println("Calculando a media dos cursos");
    OptionalDouble average = cursos.stream()
        .mapToInt(c -> c.getAlunos())
        .average();
    System.out.println("Média: " + average);


  }


}
