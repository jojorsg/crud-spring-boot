package br.com.jojo.projetosb.model.repositories;

import br.com.jojo.projetosb.model.entities.Produto;
import org.springframework.data.repository.CrudRepository;

public interface ProdutoRepository extends CrudRepository<Produto, Integer> {

}
