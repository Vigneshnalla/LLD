package com.vignesh.structural.adapter;

public class Test {
   public static void main(String[] args) {
        FrenchSpeaker frenchSpeaker = new FrenchSpeaker();
        Translator translator = new Translator(frenchSpeaker);
        EnglishClient client = new EnglishClient(translator);

        client.express("Hello! Thank you for the meeting.");
    }


}
