package com.vignesh.structural.composite;

import java.util.ArrayList;
import java.util.List;

public class Playlist implements IComponent{

    String playlistName;
    private List<IComponent> playlist = new ArrayList<>();

    public Playlist(String playlistName) {
        this.playlistName = playlistName;
    }

    
    public void add(IComponent component){
        this.playlist.add(component);
    }
    public void remove(IComponent component){
        playlist.remove(component);
    }


    @Override
    public void play() {
        System.out.println("Currently this "+ playlistName + "is Playing");
        for(IComponent component : playlist)
            component.play();
    }

    @Override
    public void setPlaybackSpeed(float speed) {
       System.out.println("Currently this "+ playlistName + "is Playing at speed "+speed);
        for(IComponent component : playlist)
            component.setPlaybackSpeed(speed);
    
    }

    @Override
    public String getName() {
        return playlistName;
    }


    
}
