package auladio.labpadraoprojetospring.model;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository // Uso mais para documentar o contexto, não necessario pelo uso do "extends" que deixa claro o uso da interface
public interface EnderecoRepository extends CrudRepository<Endereco, String> {
    // interface que fornece todos os metodos de acesso a dados da entidade "Endereço",
    // usando a strategy "CrudRepository" (estrategia de implementação em bando de dado)
}
