package subsistema2.cep;

import singleton.SingletonEager;

public class CepApi {
    private static CepApi instancia  = new CepApi(); // quando a classe for acionada a instancia ja é atribuida, fica pronta para retornar

    private CepApi(){ // construtor privado para garantir que não possa ser instanciado, fora desse classe
        super(); // Chamada do construtur da classe pai.
    }

    public static CepApi getInstance() { // Mostrar a instancia para uma chamada
        return instancia;
    }

    public  String recuperarCidade(String cep){
        return "Araraquara";
    }

    public  String recuperarEstado(String cep){
        return "SP";


    }
}
