### Spring Framework

Explorando alguns padrões de projetos com Spring:

- Singleton: @Bean e @Autowired;
- Strategy: @Service e @Repository;
- Facade: construiremos uma API REST com o mesmo objetivo
desse padrão, abstrair a complexidade das seguintes
integrações: Spring Data JPA' e ViaCEP (Feign).

' Em memória (usando o "h2").

Projeto do spring initializr: Spring Web, JPA, H2 e OpenFeign 
(projeto usando a versão do spring 2.5.4, springdoc-openapi v1.8.0)

Dependencia adicional (OpenAPI): 
  <dependency>
      <groupId>org.springdoc</groupId>
      <artifactId>springdoc-openapi-ui</artifactId>
      <version>1.8.0</version>
   </dependency>

**Simplificando a criação de POJO:**

- Os atributos do modelo endereço foram gerados automaticamente
pelo site [jsonschema2pojo.org](http://jsonschema2pojo.org)
- API usada no projeto - ViaCEP [https://viacep.com.br](https://viacep.com.br/)
