import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

public class OrdenaString {

  public static void main(String[] args) {
    List<String> palavras = new ArrayList<>();
    palavras.add("alura online");
    palavras.add("editora casa do codigo");
    palavras.add("caelum");

    System.out.println("Java Antigo");
    Comparator<String> comparadorPorTamanho = new ComparadorPorTamanho();
    Collections.sort(palavras, comparadorPorTamanho);
    System.out.println(palavras);

    System.out.println("");
    System.out.println("Java 8");
    palavras.sort(comparadorPorTamanho);
    System.out.println(palavras);

    System.out.println("");
    System.out.println("ForEach");
    Consumer<String> consumidor = new ImprimeNaLinha();
    palavras.forEach(consumidor);

    System.out.println("");
    System.out.println("Lambdas - foreach");
    palavras.forEach(s -> System.out.println(s));

    System.out.println("");
    System.out.println("Lambdas - Comparator");

    System.out.println("Utilizando o compare");
    palavras.sort((s1, s2) -> {
      if (s1.length() < s2.length()) {
        return -1;
      }
      if (s1.length() > s2.length()) {
        return 1;
      }
          return 0;
        }
    );
    System.out.println(palavras);

    System.out.println("Utilizando a API com o Integer.compare");
    palavras.sort((s1, s2) -> Integer.compare(s1.length(), s2.length()));
    System.out.println(palavras);

    System.out.println("Utilizando uma outra alternativa");
    palavras.sort(Comparator.comparing(s -> s.length()));
    System.out.println(palavras);


    System.out.println("Utilizando uma outra alternativa");
    palavras.sort(Comparator.comparing(String::length));
    System.out.println(palavras);


  }


  static class ComparadorPorTamanho implements Comparator<String> {

    @Override
    public int compare(String s1, String s2) {
      if (s1.length() < s2.length()) {
        return -1;
      }

      if (s1.length() > s2.length()) {
        return 1;
      }

      return 0;
    }
  }

  static class ImprimeNaLinha implements Consumer<String> {

    @Override
    public void accept(String s) {
      System.out.println(s);
    }
  }

}