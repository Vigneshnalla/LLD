package com.vignesh.structural.adapter;

class EnglishClient {
    private EnglishSpeaker speaker;

    public EnglishClient(EnglishSpeaker speaker) {
        this.speaker = speaker;
    }

    public void express(String message) {
        speaker.speakEnglish(message);
    }
}