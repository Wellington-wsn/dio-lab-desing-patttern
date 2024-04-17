package auladio.labpadraoprojetospring.service;

import auladio.labpadraoprojetospring.model.Cliente;

/**
 * Interface que define o padrão <b>Strategy</b> no domínio de cliente.
 * Com isso, se necessario, podemos ter multiplas implementações dessa
 * mesma interface.
 */

public interface ClienteService { // Operações de CRUD

    Iterable<Cliente> buscarTodos();
    Cliente buscarPorId(Long id);

    void inserir(Cliente cliente);
    void atualizar(Long id, Cliente cliente);
    void deletar(Long id);
}
