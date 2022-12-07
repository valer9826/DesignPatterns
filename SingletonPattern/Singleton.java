package SingletonPattern;

public class Singleton {

    private volatile static Singleton uniqueInstance;

    private Singleton() {
    }

    public static Singleton getInstaSingleton() {
        if (uniqueInstance == null) {
            synchronized (Singleton.class) {
                if (uniqueInstance == null) {
                    uniqueInstance = new Singleton();

                }
            }
        }

        return uniqueInstance;
    }

    public void holaMundo() {
        System.out.println("Hola mundo Singleton!");
    }
}
