package com.bridgelabz.oops2;

class Phone{
    void voiceCall(){
        System.out.println("Make VoiceClass");
    }
    void sms(){
        System.out.println("We Can send SMS");
    }
}
interface Camera{
    void click();
    void record();
}

interface Player{
    void play();
    void pause();
    void stop();
}

class Smartphone extends Phone implements Camera,Player{

    public void click() {
        System.out.println("Take a Selfi");
    }
    public void record() {
        System.out.println("Take a video");
    }
    public void play() {
        System.out.println("Play Music");
    }
    public void pause() {
        System.out.println("Pause Music");
    }
    public void stop() {
        System.out.println("Stop Music");
    }
}
public class MultipleInterface {
    public static void main(String[] args) {
        Smartphone oppo = new Smartphone();
        oppo.voiceCall();
        oppo.sms();
        oppo.click();
        oppo.record();
        oppo.play();
        oppo.pause();
        oppo.stop();
    }
}
