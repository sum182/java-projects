package br.com.bytebank.banco.test.util;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;
import java.util.ArrayList;

public class Teste {

  public static void main(String[] args) {
    ArrayList lista = new ArrayList();

    Conta cc = new ContaCorrente(22,11);
    lista.add(cc);

    Conta cc2 = new ContaCorrente(22,22);
    lista.add(cc2);

    System.out.println("Tamanho da lista = " + lista.size());

    Conta ref = (Conta) lista.get(0);
    System.out.println(ref.getNumero());

    lista.remove(0);
    System.out.println("Tamanho da lista = " + lista.size());


  }

}
