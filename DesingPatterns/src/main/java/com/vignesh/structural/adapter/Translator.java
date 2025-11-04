package com.vignesh.structural.adapter;

public class Translator implements EnglishSpeaker {
    private FrenchSpeaker frenchSpeaker;
    
    public Translator(FrenchSpeaker frenchSpeaker) {
        this.frenchSpeaker = frenchSpeaker;
    }
    public void speakEnglish(String message){
        String frenchMessage = translateToFrench(message);
        frenchSpeaker.speakFrench(frenchMessage);
    }

    private String translateToFrench(String message) {
        // Simplified translation logic
        return message.replace("Hello", "Bonjour").replace("Thank you", "Merci");
    }
}

