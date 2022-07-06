package br.com.alura;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Collections;

public class TestandoListas {

  public static void main(String[] args) {
    String aula1 = "Conhecendo mais de listas";
    String aula2 = "Modelando a classe aula";
    String aula3 = "Trabalhando com Cursos e Sets";

    ArrayList<String> aulas = new ArrayList<>();
    aulas.add(aula1);
    aulas.add(aula2);
    aulas.add(aula3);

    System.out.println("");
    System.out.println("Imprimindo a lista:");
    System.out.println(aulas);

    System.out.println("");
    System.out.println("Removendo o primeiro elemento:");
    aulas.remove(0);
    System.out.println(aulas);

    System.out.println("");
    System.out.println("Percorrendo a lista com foreach");
    for (String aula: aulas) {
      System.out.println("Aula: " + aula);
    }


    System.out.println("");
    System.out.println("Primeira aula");
    String primeiraAula = aulas.get(0);
    System.out.println("A primeira aula é: " + primeiraAula);

    System.out.println("");
    System.out.println("Percorrendo a lista com for");
    for(int i=0; i < aulas.size(); i++){
      System.out.println("aula: " + aulas.get(i));
    }

    System.out.println("");
    System.out.println("Percorrendo a lista com foreach do proprio Objeto");
    aulas.forEach(aula -> {
      System.out.println("percorrendo:");
      System.out.println(aula);
    });

    System.out.println("");
    System.out.println("Ordenando as aulas");
    aulas.add("Aumentando nosso conhecimento");
    System.out.println("Lista na ordem original");
    System.out.println(aulas);

    System.out.println("Lista ordenada");
    Collections.sort(aulas);
    System.out.println(aulas);


  }

}
