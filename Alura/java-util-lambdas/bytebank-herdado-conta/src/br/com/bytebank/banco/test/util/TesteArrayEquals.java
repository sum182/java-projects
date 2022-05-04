package br.com.bytebank.banco.test.util;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;
import java.util.ArrayList;

public class TesteArrayEquals {

  public static void main(String[] args) {
    ArrayList<Conta> lista = new ArrayList<Conta>();

    Conta cc = new ContaCorrente(22,11);
    lista.add(cc);

    Conta cc2 = new ContaCorrente(22,22);
    lista.add(cc2);

    Conta cc3 = new ContaCorrente(22,22);
    lista.add(cc3);

    boolean existe = lista.contains(cc3);

    System.out.println("Já existe na lista? = " + existe);

    System.out.println("");
    System.out.println("");

    for (Conta conta:lista){
      System.out.println(conta);
    }

  }

}
