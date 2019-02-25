package task2;

/**
 * Created by amour on 26.06.2018.
 */
public class SnakeHeroFlyingDecorator extends HeroCapabilities{

    public SnakeHeroFlyingDecorator(String name, String capabilities, Hero hero, int experience) {
        super(name, capabilities, hero, experience);
    }

    @Override
    public String getCapabilities() {
        return " умеющая: не только кушать маглов, но и летать";
    }
}
