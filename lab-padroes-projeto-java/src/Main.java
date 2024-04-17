import Facade.Facade;
import singleton.SingletonEager;
import singleton.SingletonLazy;
import singleton.SingletonLazyHolder;
import strategy.*;

public class Main {
    public static void main(String[] args) {
        // Teste Design Pattern Singleton
        // Mesmo instanciando mais de uma vez, recebe o mesmo endereçamento de memoria(mesma instancia)

        SingletonLazy lazy = SingletonLazy.getInstance(); //usando o getInstance para receber a instancia da classe
        System.out.println(lazy); // > Singleton.SingletonLazy@19bb089b
        lazy = SingletonLazy.getInstance();
        System.out.println(lazy); // > Singleton.SingletonLazy@19bb089b

        SingletonEager eager = SingletonEager.getInstance(); //usando o getInstance para receber a instancia da classe
        System.out.println(eager); // > Singleton.SingletonEager@11531931
        eager = SingletonEager.getInstance();
        System.out.println(eager); // > Singleton.SingletonEager@11531931

        SingletonLazyHolder lazyHolder = SingletonLazyHolder.getInstance(); //usando o getInstance para receber a instancia da classe
        System.out.println(lazyHolder); // > Singleton.SingletonLazyHolder@45c8e616
        lazyHolder = SingletonLazyHolder.getInstance();
        System.out.println(lazyHolder); // > Singleton.SingletonLazyHolder@45c8e616

        // Strategy
        // Uma instancia com cada tipo de comportamento de um robo, polimorfismo uso de interface, comportamento que pode variar.
        Comportamento defensivo = new ComportamentoDefensivel();
        Comportamento nornal = new ComportamentoNormal();
        Comportamento agressivo = new ComportamentoAgressivo();

        Robo robo = new Robo();

        robo.setStrategy(nornal);
        robo.mover();
        robo.mover();

        robo.setStrategy(defensivo);
        robo.mover();

        robo.setStrategy(agressivo);
        robo.mover();
        robo.mover();
        robo.mover();

        // Facade
        // migrando usuario com informações base e salvando dados com implementação de informação com uma Api
        Facade facade = new Facade();
        facade.migrarCriente("Wellington", "15104747");

    }

}