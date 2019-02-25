/**
 * Created by amour on 06.08.2018.
 */
public class Smert extends Thread{
    private Simsik simsik;
    public Smert(Simsik simsik){
        this.simsik = simsik;
    }
    public void start(){
        while(simsik.zhiv()) {
            try {
                sleep(1000);
                simsik.bornToDie();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            if(!simsik.zhiv()){
                System.out.println("VADIM UMER");
                System.exit(1);
            }
        }

    }
}
