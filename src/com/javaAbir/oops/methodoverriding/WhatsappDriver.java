package com.javaAbir.oops.methodoverriding;

class Whats_1{
    Whats_1 Sent(){
        System.out.println("Single Tik");
        return new Whats_1();
    }
}

class Whats_2 extends Whats_1{
    @Override
    protected Whats_1 Sent(){
        super.Sent();
        System.out.println("Double Tik");
        return new Whats_1();
    }
    public void VoiceNote(){
        System.out.println("Voice Note Msg");
    }
    void VideoCall(){
        System.out.println("Normal Video Call");
    }
}

class  Whats_3 extends Whats_2{
    @Override
    public Whats_2 Sent(){
        super.Sent();
        System.out.println("Blue tik");
        return new Whats_2();
    }
    @Override
    void VideoCall(){
        super.VideoCall();
         System.out.println("Video CAll with Filter");
    }
}

public class WhatsappDriver {
    public static void main(String[] args) {
        Whats_3 w3 = new Whats_3();
        w3.Sent();
        w3.VideoCall();
        w3.VoiceNote();
    }
}
