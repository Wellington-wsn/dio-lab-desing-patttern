package singleton;

/**
 * Singleton "LazyHolder".
 * @see <a href="https://starkoverflow.com/a/24018148">Referencia</a> // acessar o site
 *
 */
public class SingletonLazyHolder {
    private static class InstanceHolder{ // inerclass(uma classe dentro de outra) encapsular a instancia
        public static SingletonLazyHolder instancia  = new SingletonLazyHolder(); // quando a classe for acionada a instancia ja é atribuida, jafica pronta para retornar
    }

    private SingletonLazyHolder(){ // construtor privado para garantir que não possa ser instanciado, fora desse classe

        super(); // Chamada do construtur da classe pai.
    }

    public static SingletonLazyHolder getInstance() { // Mostrar a instancia para uma chamada
        return InstanceHolder.instancia; //acessado pelo hoder antes
    }
}