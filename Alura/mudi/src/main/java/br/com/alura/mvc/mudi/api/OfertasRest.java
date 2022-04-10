package br.com.alura.mvc.mudi.api;

import br.com.alura.mvc.mudi.dto.RequisicaoNovaOferta;
import br.com.alura.mvc.mudi.model.Oferta;
import br.com.alura.mvc.mudi.model.Pedido;
import br.com.alura.mvc.mudi.repository.PedidoRepository;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/ofertas")
public class OfertasRest {

  @Autowired private PedidoRepository pedidoRepository;

  @PostMapping
  public Oferta criaOferta(RequisicaoNovaOferta requisicaoNovaOferta) {
    Optional<Pedido> pedidoBuscado = pedidoRepository.findById(requisicaoNovaOferta.getPedidoId());

    if (!pedidoBuscado.isPresent()) {
      return null;
    }

    Pedido pedido = pedidoBuscado.get();

    Oferta nova = requisicaoNovaOferta.toOferta();
    nova.setPedido(pedido);
    pedido.getOfertas().add(nova);
    pedidoRepository.save(pedido);

    return nova;
  }
}
