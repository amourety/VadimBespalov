package entities;

import java.time.LocalTime;

//BUILDER FOR CONTROLER

public class Controler {
    private String nameConsole;
    private Television tv;

    public Television getTv() {
        return tv;
    }

    public void setTv(Television tv) {
        this.tv = tv;
    }

    public Controler(Builder builder){
        this.nameConsole = builder.nameConsole;
        this.tv = builder.tv;

    }
    public static Builder builder(){

        return new Builder();
    }
    public static class Builder {
        private String nameConsole;
        private Television tv;
        private Builder() {

        }

        public Builder setNameConsole(String name) {
            this.nameConsole = name;
            return this;
        }

        public Builder setTelevision(Television television) {
            this.tv = television;
            return this;
        }

        public Controler build() {
            return new Controler(this);
        }
    }
    public void changeChannel(String nameChannel){
        for(Channel c: tv.getChannels()){
            for (Channel.Broadcast s: c.getBroadcasts()) {
                if (c.getNameChannel().equals(nameChannel)) {
                    if (s.getStartingTime().isBefore(LocalTime.now()) && s.getEndingTime().isAfter(LocalTime.now())) {
                        System.out.println(c.getNameChannel() + " running now " + s.getNameBroadcast());
                        tv.setRunningChannel(c);
                        break;
                    }
                }
            }
        }
    }
}
