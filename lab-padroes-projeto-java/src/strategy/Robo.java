package strategy;

public class Robo {
    private Comportamento strategy; // propriedade - estrategia de comportamento do robo

    public void setStrategy(Comportamento strategy) {
        this.strategy = strategy;
    }

    public void mover(){ //Chama o metodo da classe comportamento
        strategy.mover();
    }
}
