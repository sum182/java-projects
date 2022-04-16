package br.com.bytebank.banco.test;

import br.com.bytebank.banco.modelo.ContaCorrente;

public class TesteArrayReferencias {

  public static void main(String[] args) {
    ContaCorrente[] contas = new ContaCorrente[5];
    ContaCorrente cc1 = new ContaCorrente(22,11);
    contas[0] = cc1;

    ContaCorrente cc2 = new ContaCorrente(22,22);
    contas[1] = cc2;


    System.out.println("contas = " + contas[0].toString());
    System.out.println("contas = " + contas[1].toString());

    ContaCorrente ref = contas[1];
    System.out.println("cc2.getnumero = " + cc2.getNumero());
    System.out.println("ref.getnumero = " + ref.getNumero());




  }

}
