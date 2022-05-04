package br.com.bytebank.banco.test.util;

import java.util.ArrayList;
import java.util.Currency;
import java.util.List;

public class TesteOutrosWrappers {

  public static void main(String[] args) {

    //autoboxing
    Integer idadeRef = Integer.valueOf(29);

    //unboxing
    System.out.println(idadeRef.intValue());

    Double dRef = Double.valueOf(3.2);
    System.out.println(dRef.doubleValue());

    Boolean bRef = Boolean.valueOf(Boolean.TRUE);
    System.out.println(bRef.booleanValue());

    Number refNumero = Integer.valueOf(29);

    Number refNumero1 = Float.valueOf(29.9f);
    System.out.println(refNumero1);

    List<Number> lista = new ArrayList<>();
    lista.add(10);
    lista.add(32.6);
    lista.add(25.6f);





  }
}
