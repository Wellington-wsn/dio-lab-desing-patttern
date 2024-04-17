package auladio.labpadraoprojetospring.model;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository // Uso mais para documentar o contexto
public interface ClienteRepository  extends CrudRepository<Cliente, Long> {
    // interface que fornece todos os metodos de acesso a dados da entidade "Cliente",
    // usando a strategy "CrudRepository" (estrategia de implementação em bando de dado)
}
