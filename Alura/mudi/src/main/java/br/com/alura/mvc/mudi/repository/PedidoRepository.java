package br.com.alura.mvc.mudi.repository;

import br.com.alura.mvc.mudi.model.Pedido;
import br.com.alura.mvc.mudi.model.StatusPedido;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface PedidoRepository extends JpaRepository<Pedido, Long> {

  List<Pedido> findByStatus(StatusPedido status);

  @Query("select p from Pedido p join p.user u where u.username = :username")
  List<Pedido> findAllByUsuario(@Param("username") String username);

  @Query("select p from Pedido p join p.user u where u.username = :username and p.status = :status")
  List<Pedido> findByStatusEUsuario(
      @Param("status") StatusPedido status, @Param("username") String username);
}