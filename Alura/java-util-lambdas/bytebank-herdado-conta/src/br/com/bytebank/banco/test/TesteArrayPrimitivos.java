package br.com.bytebank.banco.test;

public class TesteArrayPrimitivos {

  public static void main(String[] args) {
    System.out.println("Teste 1");
    teste1();
    System.out.println("");
    System.out.println("");
    System.out.println("Teste 2");
    teste2();


  }

  public static void teste1(){
    int [] idades = new int[5];

    idades[0] = 29;
    idades[1] = 39;
    idades[2] = 49;
    idades[3] = 59;
    idades[4] = 69;

    int idade4 = idades[3];
    System.out.println(idade4);
    System.out.println(idades.length);
  }

  public static void teste2(){
    int [] idades = new int[5];

    for(int i = 0; i < idades.length; i ++){
      idades[i] = i * i;

    }

    for(int i = 0; i < idades.length; i ++){
      System.out.println("Array idades --> elemento[" + i + "]" + " valor:" + idades[i]);
    }

  }





}
