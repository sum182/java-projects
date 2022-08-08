package br.com.alura;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class TesteAlunosSemAcentos {


  public static void main(String[] args) {
    Set<String> alunos = new HashSet<>();
    Set<String> alunosSincronizados = Collections.synchronizedSet(alunos);

    alunos.add("Paulo");
    alunos.add("Alberto");
    alunos.add("Pedro");

    System.out.println(alunos.size());

    boolean adicionou = alunos.add("Pedro");
    System.out.println("Pedro foi adicionado ao Set? " + adicionou);

    System.out.println(alunos.size());
  }

}
