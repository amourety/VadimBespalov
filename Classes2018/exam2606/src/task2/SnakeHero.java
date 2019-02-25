package task2;

/**
 * Created by amour on 26.06.2018.
 */
public class SnakeHero implements Hero {

    private String name;
    private String capabilities;
    private int experience;

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public SnakeHero(String name, String capabilities) {
        this.name = name;
        this.capabilities = capabilities;
        this.experience = 0;
    }

    @Override
    public String getName() {
        return name + " умеющая: "+ getCapabilities();
    }

    @Override
    public String getCapabilities() {
        return capabilities;
    }

    @Override
    public void addEx(int a) {
        this.experience +=a;
    }
}
