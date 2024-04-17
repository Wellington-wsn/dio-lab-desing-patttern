package singleton;

/**
 * Singleton "apressado".
 *
 */
public class SingletonEager {
    private static SingletonEager instancia  = new SingletonEager(); // quando a classe for acionada a instancia ja é atribuida, jafica pronta para retornar

    private SingletonEager(){ // construtor privado para garantir que não possa ser instanciado, fora desse classe
        super(); // Chamada do construtur da classe pai.
    }

    public static SingletonEager getInstance() { // Mostrar a instancia para uma chamada
        return instancia;
    }
}