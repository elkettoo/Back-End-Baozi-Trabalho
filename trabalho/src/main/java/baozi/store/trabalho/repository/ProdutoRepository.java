package baozi.store.trabalho.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import baozi.store.trabalho.model.Produto;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Long> {

}
