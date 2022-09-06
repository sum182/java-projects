public class ExercicioThread {

  public static void main(String[] args) {


    System.out.println("Executando sem o lambda");
    new Thread(new Runnable() {
      @Override
      public void run() {
        System.out.println("Executando Runnable");
      }
    }).start();

    //Utilizando lambda
    System.out.println("Executando com o lambda");
    System.out.println("");
    //new Thread(() -> System.out.println("Executando um Runnable")).start();

    new Thread(
        () -> System.out.println("Executando um Runnable")
    ).start();


  }

}
