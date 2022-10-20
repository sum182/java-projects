import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Teste {

  public static void main(String[] args) {
    Cliente c1 = new Cliente("michelli", true, "123");
    Cliente c2 = new Cliente("bruno", true, "456");

    List<Cliente> clientes = Arrays.asList(c1, c2);

    for(Cliente cliente :clientes){
      System.out.println(cliente.getNome());
      System.out.println(cliente.getSenha());
    }

    System.out.println("Autenticando:");
    c1.autenticaSenha("123");


    System.out.println();
    System.out.println("utilizando o foreach - metodo 1");
    Consumer<Cliente> consumer = (Cliente c) -> {System.out.println(c.getNome());};
    clientes.forEach(consumer);

    System.out.println();
    System.out.println("utilizando o foreach - metodo 2");
    clientes.forEach(c-> System.out.println(c.getNome()));






  }

}
