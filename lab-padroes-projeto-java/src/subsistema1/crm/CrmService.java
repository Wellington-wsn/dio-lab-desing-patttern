package subsistema1.crm;

public class CrmService { // Serviço de cadastro de cliente
    private CrmService() {  // construtor privado para garantir que não possa ser instanciado, fora desse classe
        super();
    }
    public static void gravarCliente(String nome, String cep, String cidade, String estado){
        System.out.println("Olha... Cliente salvo no sistema de CRM, PROVENDO!!!");
        System.out.println(nome);
        System.out.println(cep);
        System.out.println(cidade);
        System.out.println(estado);
    }
}
