package br.com.alura;

import java.util.Objects;

public class Aluno {

  private String nome;
  private int numeroMatricula;

  public Aluno(String nome, int numeroMatricula) {
    this.nome = nome;
    this.numeroMatricula = numeroMatricula;
  }

  public String getNome() {
    return nome;
  }

  public int getNumeroMatricula() {
    return numeroMatricula;
  }

  @Override
  public String toString() {
    return "Aluno{" +
        "nome='" + nome + '\'' +
        ", numeroMatricula=" + numeroMatricula +
        '}';
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }

    if (o == null || getClass() != o.getClass()) {
      return false;
    }

    Aluno outro = (Aluno) o;
    return this.nome.equals(outro.nome);
  }


  @Override
  public int hashCode() {
    return this.nome.hashCode();
  }
}
