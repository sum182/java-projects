package br.com.alura;

import java.util.Set;
import java.util.TreeSet;

public class TestaRecibo {

  public static void main(String[] args) {
    Set<Recibo> recibos = new TreeSet<Recibo>();

    Recibo rec1 = new Recibo();
    recibos.add(rec1);

    Recibo rec2 = new Recibo();
    recibos.add(rec2);

    Recibo rec3 = new Recibo();
    recibos.add(rec3);

  }


}
