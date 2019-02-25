package task2;

/**
 * Created by amour on 26.06.2018.
 */
public class SnakeHeroSayDecorator extends SnakeHeroFlyingDecorator{

    public SnakeHeroSayDecorator(String name, String capabilities, Hero hero, int experience) {
        super(name, capabilities, hero, experience);
    }

    @Override
    public String getCapabilities() {
        return "умеющая не только кушать маглов и летать, но и говорить";
    }
}
