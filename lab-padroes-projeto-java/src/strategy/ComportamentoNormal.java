package strategy;

public class ComportamentoNormal implements Comportamento { // Implementar a classe comportamento (que define a estrategia)

    @Override // sobrepondo metodo implementado
    public void mover() { // metodo precisa ser implementado junto com a classe
        System.out.println("Movendo normalmente...");
    }

}
