package br.com.alura;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapExercicio2 {

  public static void main(String[] args) {
    Map<String, Integer> nomesParaIdade = new HashMap<>();
    nomesParaIdade.put("Paulo", 31);
    nomesParaIdade.put("Adriano", 25);
    nomesParaIdade.put("Alberto", 33);
    nomesParaIdade.put("Guilherme", 26);

    //Percorrendo as chaves
    System.out.println("Acessando as chaves");
    Set<String> chaves = nomesParaIdade.keySet();
    for (String nome : chaves) {
      System.out.println(nome);
    }

    //Percorrendo os valores
    System.out.println("");
    System.out.println("Percorrendo os valores");
    Collection<Integer>valores = nomesParaIdade.values();
    for (Integer idade : valores) {
      System.out.println(idade);
    }

    System.out.println("");
    System.out.println("Percorrendo as associacoes");

    Set<Entry<String, Integer>> associacoes = nomesParaIdade.entrySet();

    for (Entry<String, Integer> associacao : associacoes) {
      System.out.println(associacao.getKey() + " - " + associacao.getValue());
    }


  }

}
