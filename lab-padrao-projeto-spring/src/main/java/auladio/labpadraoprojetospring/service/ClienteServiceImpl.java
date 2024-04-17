package auladio.labpadraoprojetospring.service;

import auladio.labpadraoprojetospring.model.Cliente;
import auladio.labpadraoprojetospring.model.ClienteRepository;
import auladio.labpadraoprojetospring.model.Endereco;
import auladio.labpadraoprojetospring.model.EnderecoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ClienteServiceImpl implements ClienteService{
    // Singleton: Injetar os componentes do Spring com Autowired.
    @Autowired // injetando, repositorio dos clientes
    private ClienteRepository clienteRepository;

    @Autowired // injetando, repositorio de endereço
    private EnderecoRepository enderecoRepository;
    
    @Autowired //cliente http
    private ViaCepService viaCepService;

    // TODO Strategy: Implementar os métodos definidos na interface.
    // TODO Facade: Abstrair integrações com subsistemas, provendo uma interfa

    @Override
    public Iterable<Cliente> buscarTodos() { // Retona um interable(como uma lista)
        // Buscar todos os Clientes.
        return clienteRepository.findAll();
    }

    @Override
    public Cliente buscarPorId(Long id) {
        //Buscar Cliente por ID.
        Optional<Cliente> cliente = clienteRepository.findById(id); // Estrutura de "Optional" pois ele pode ou não existir
        return cliente.get();
    }

    @Override
    public void inserir(Cliente cliente) {
        SalvarClienteComCep(cliente); // chama o metodo, salvar o cliente novo
    }

    @Override
    public void atualizar(Long id, Cliente cliente) {
        // Buscar Cliente por ID, caso exista:
        Optional<Cliente> clienteBd = clienteRepository.findById(id);
        if (clienteBd.isPresent()) {
            SalvarClienteComCep(cliente); // chama o metodo, salvar atualização do cliente
        }
    }

    @Override
    public void deletar(Long id){
        // Deletar Cliente por ID,
        clienteRepository.deleteById(id);
    }

    private void SalvarClienteComCep(Cliente cliente) { // metodo usado mais de uma vez, otimização em termo de reuso
        // Verificar se o Endereco do Cliente já existe (pelo CEP).
        // entidade idependente, com seu repositorio, "EnderecoRepositorio"
        String cep = cliente.getEndereco().getCep(); // Busca endereço no banco
        Endereco endereco = enderecoRepository.findById(cep)
                .orElseGet(() -> { // cria uma opção, se existe endereço
                    // Caso não exista, integrar com o ViaCEP e persistir o retorno.
                    Endereco novoEndereco = viaCepService.consultarCep(cep); // Buscar no ViaCep o endereço
                    enderecoRepository.save(novoEndereco); // Salvar no banco
                    return novoEndereco;
        });
        cliente.setEndereco(endereco);
        // Inserir Cliente, vinculando o Endereco (novo ou existente).
        clienteRepository.save(cliente); // salva no banco
    }
}