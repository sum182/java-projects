package br.com.alura.bytebank.registrador;

import br.com.alura.bytebank.model.Pagamento;
import br.com.alura.bytebank.model.Tipo;

import java.util.ArrayList;
import java.util.List;

public class RegistroDePagamento {

  private final static List<Pagamento> PAGAMENTOS = new ArrayList<>();

  public void registra(List<Pagamento> pagamentos) {
    for (int i = 0; i < pagamentos.size(); i++) {
      Pagamento pagamento = pagamentos.get(i);
      verificaTipo(pagamento);
      salva(pagamento);
    }
    exibiEfetuados();
  }

  private void exibiEfetuados() {
    if (!PAGAMENTOS.isEmpty()) {
      System.out.println("Todos os pagamentos");
      for (int i = 0; i < PAGAMENTOS.size(); i++) {
        System.out.println(PAGAMENTOS.get(i));
      }
    } else {
      System.out.println("Não temos pagamentos");
    }
  }

  private void verificaTipo(Pagamento p) {
    if (p.getTipo().equals(Tipo.CREDITO)) {
      p.setValor(p.getValor() * 1.02);
    }

    if (p.getTipo().equals(Tipo.DEBITO)) {
      p.setValor(p.getValor() * 1.001);
    }
  }

  private void salva(Pagamento p) {
    PAGAMENTOS.add(p);
    System.out.println("Pagamento realizado " + p);
  }

}
