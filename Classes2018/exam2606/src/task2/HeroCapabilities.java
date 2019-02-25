package task2;

/**
 * Created by amour on 26.06.2018.
 */
public abstract class HeroCapabilities implements Hero{

    protected String name;
    protected int experience;

    @Override
    public void addEx(int a) {
        this.experience +=a;
    }


    public void setExperience(int experience) {
        this.experience = experience;
    }

    public int getExperience() {
        return experience;
    }

    @Override
    public String getName() {
        return name + getCapabilities();
    }

    public abstract String getCapabilities();

    protected String capabilities;
    protected Hero hero;

    public HeroCapabilities(String name, String capabilities, Hero hero,int experience){
        this.name = name;
        this.capabilities = capabilities;
        this.hero = hero;
        this.experience = experience;
    }

}
