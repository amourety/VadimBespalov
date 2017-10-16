package entities;

import java.time.LocalTime;

public class Controler {
    private String nameConsole;
    private Television tv;
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
            for(int i = 0; i < tv.getChannels().length; i++){
                if (nameChannel.equals(tv.getChannels()[i])){
                    for(int k = 0; k < tv.getChannels()[i].getBroadcasts().length;k++){
                    if (LocalTime.now().isBefore(tv.getChannels()[i].getBroadcasts()[k].getStartingTime()) && LocalTime.now().isAfter(tv.getChannels()[i].getBroadcasts()[k].getEndingTime())){
                    System.out.println(tv.getChannels()[i].getNameChannel() + " now " + tv.getChannels()[i].getBroadcasts()[k].getNameBroadcast());
                    }
                    else {
                        System.err.println("This channer is not works");
                    }

                    }
                }
                else {
                    System.err.println("This channel is not correct");
                }
            }
        }



}
