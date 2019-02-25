/**
 * Created by amour on 06.08.2018.
 */
public class Simsik {
    private String name;
    private int potrebEDA = 100;
    private int potrebSEX = 100;
    private int potrebPOSER = 100;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPotrebEDA() {
        return potrebEDA;
    }

    public void setPotrebEDA(int potrebEDA) {
        this.potrebEDA = potrebEDA;
    }

    public int getPotrebSEX() {
        return potrebSEX;
    }

    public void setPotrebSEX(int potrebSEX) {
        this.potrebSEX = potrebSEX;
    }

    public int getPotrebPOSER() {
        return potrebPOSER;
    }

    public void setPotrebPOSER(int potrebPOSER) {
        this.potrebPOSER = potrebPOSER;
    }

    public Simsik(String name){
        this.name = name;
    }
    public void sayPotreb(){
        System.out.println(potrebEDA + "," + potrebSEX+ "," +potrebPOSER);
        if (potrebEDA < 20) {
            System.out.println(name + ": SUKA YA OCHEN HOCHU ZHRAT");
        }
        if (potrebPOSER < 20) {
            System.out.println(name + ": SUKA YA OCHEN HOCHU SRAT");
        }
        if (potrebSEX < 20) {
            System.out.println(name + ": SUKA YA OCHEN HOCHU SEXSA");
        }
        if (potrebEDA > 20 & potrebSEX > 20 & potrebPOSER >20){
            System.out.println(name + ": NICHEGO NE HOCHU PISU SHEKOCHU");
        }
    }
    public void poest(String zhrachka){
        potrebEDA = 100;
        potrebSEX = potrebSEX + 10;
        if(potrebSEX > 100){
            potrebSEX = 100;
        }
        potrebPOSER = potrebPOSER - 50;
        System.out.println(name + ": YA POZHRAL " + zhrachka);
    }

    public void potrahatsya(String chika) {
        potrebSEX = 100;
        potrebEDA = potrebEDA - 10;
        System.out.println(name + ": YA POTRAHALSYA S " + chika);
    }
    public void postrat() {
        potrebPOSER = 100;
        potrebEDA = potrebEDA + 20;
        if(potrebEDA > 100){
            potrebEDA = 100;
        }
        System.out.println(name + ": YA POSRAL");
    }
    public void bornToDie(){
        potrebPOSER--;
        potrebSEX--;
        potrebEDA--;
    }
    public boolean zhiv(){
        if (potrebEDA <= 0 || potrebPOSER <= 0 || potrebSEX <=0){
            return false;
        }
        return true;
    }
}
