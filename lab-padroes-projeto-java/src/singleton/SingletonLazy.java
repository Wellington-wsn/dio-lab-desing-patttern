package singleton;

/**
 * Singleton "preguiçoso".
 *
 */
public class SingletonLazy {
    private static SingletonLazy instancia;
    private SingletonLazy(){ // construtor privado para garantir que não possa ser instanciado, fora desse classe
        super(); // Chamada do construtur da classe pai.
    }

    public static SingletonLazy getInstance() { // Mostrar a instancia para uma chamada
        if (instancia == null) {
            instancia = new SingletonLazy(); // se intancia estiver vazia, é criado uma instancia
        }
        return instancia;
    }
}