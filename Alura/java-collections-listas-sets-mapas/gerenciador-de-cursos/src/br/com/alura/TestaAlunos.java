package br.com.alura;

import java.util.HashSet;
import java.util.Set;

public class TestaAlunos {

  public static void main(String[] args) {
    Set<String> alunos = new HashSet<>();
    alunos.add("Rodrigo Turini");
    alunos.add("Alberto Souza");
    alunos.add("Nico Steppat");
    System.out.println(alunos);

    System.out.println(alunos.size());

    System.out.println("");
    System.out.println("imprimindo foreach");
    for (String aluno:alunos) {
      System.out.println(aluno);
    }

    System.out.println("");
    System.out.println("outra forma de foreach");
    alunos.forEach(aluno->{
      System.out.println(aluno);
    });

    System.out.println("");
    boolean pauloEstaMatriculoa = alunos.contains("Paulo Silvieira");
    System.out.println("Paulo está matriculado? = " + pauloEstaMatriculoa);

  }

}
