package auladio.labpadraoprojetospring.service;

import auladio.labpadraoprojetospring.model.Endereco;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Client HTTP, criado via ‹b›Openfeign‹/b>, para o consumo da API do ‹b>ViaCEP‹/b>.
 * @see ‹a href="https://spring-io/projects/spring-cloud-openfeign">Spring Cloud OpenFeign‹/a>
 * @see ‹a href="https://viacep.com.br*>ViaCEP</a>
 */

// Cliente Feign
@FeignClient(name = "viaCep", url = "https://viacep.com.br")// passando a url para consumir os endpoind do ViaCep
public interface ViaCepService { // interface com uma notação "FeignClient" (consumo de API)
    //@RequestMapping(method = RequestMethod.GET, value = "/ws/{cep}/json/") // metodo que busca o Json do site
    @GetMapping("/ws/{cep}/json/") //outra opção de fazer o requerimento, do json, pelo cep no site, usando a anotation do spring
    Endereco consultarCep(@PathVariable("cep") String cep); // Converte o json em um objeto mapeado na estrutura em "Endereço"
}