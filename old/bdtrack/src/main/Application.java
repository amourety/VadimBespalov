package main;

/**
 * Created by amour on 15.03.2017.
 */
abstract class Application {
    public Application(){
        this.init();
        this.start();
    }
    abstract void init();
    abstract void start();
}
