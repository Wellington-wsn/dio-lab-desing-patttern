package Facade;

import subsistema1.crm.CrmService;
import subsistema2.cep.CepApi;

public class Facade { // incrementar os clientes para outra base de dados, consumir uma api e juntar as informações
    public void migrarCriente(String nome, String cep) { // Interface mais simples para consumir as informaçõe
        String cidade = CepApi.getInstance().recuperarCidade(cep); // Usar a Api com as informações adicionais do cliente "Cidade" e "estado" pelo cep
        String estado = CepApi.getInstance().recuperarEstado(cep);

        CrmService.gravarCliente(nome, cep, cidade, estado); //  criar usuario, o metodo "migrar cliente" não contem todas as informações que precisa
    }
}