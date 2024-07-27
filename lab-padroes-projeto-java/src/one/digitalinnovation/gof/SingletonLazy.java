package one.digitalinnovation.gof;

/**
 * Singleton preguiçoso
 * 
 */
public class SingletonLazy {

    private static SingletonLazy instance;

    private SingletonLazy() {
        super();
    }

    public static SingletonLazy() {
        if (instance == null) {
            this.instance = new SingletonLazy();
        }
        return instance;
    }
}
