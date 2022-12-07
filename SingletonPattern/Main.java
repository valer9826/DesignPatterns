package SingletonPattern;

public class Main {
    public static void main(String[] args) {
        Singleton singleton1 = Singleton.getInstaSingleton();
        SingletonEnum singleton2 = SingletonEnum.INSTANCE;
        singleton1.holaMundo();
        singleton2.holaMundo();
    }
}
