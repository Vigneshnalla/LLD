package com.vignesh.structural.adapter;

public class FrenchSpeaker {
    Translator translator;
    void speakFrench(String message){
        System.out.println("Speaking in French "+message);
    }
}
