package com.vignesh;
// State interface
interface State {
    void play(MusicPlayer player);
    void pause(MusicPlayer player);
    void stop(MusicPlayer player);
}

// Concrete State: Playing
class PlayingState implements State {
    @Override
    public void play(MusicPlayer player) {
        System.out.println("Already playing music 🎶");
    }

    @Override
    public void pause(MusicPlayer player) {
        System.out.println("Pausing the music ⏸️");
        player.setState(new PausedState());
    }

    @Override
    public void stop(MusicPlayer player) {
        System.out.println("Stopping the music ⏹️");
        player.setState(new StoppedState());
    }
}

// Concrete State: Paused
class PausedState implements State {
    @Override
    public void play(MusicPlayer player) {
        System.out.println("Resuming the music ▶️");
        player.setState(new PlayingState());
    }

    @Override
    public void pause(MusicPlayer player) {
        System.out.println("Music is already paused ⏸️");
    }

    @Override
    public void stop(MusicPlayer player) {
        System.out.println("Stopping the music ⏹️");
        player.setState(new StoppedState());
    }
}

// Concrete State: Stopped
class StoppedState implements State {
    @Override
    public void play(MusicPlayer player) {
        System.out.println("Playing the music ▶️");
        player.setState(new PlayingState());
    }

    @Override
    public void pause(MusicPlayer player) {
        System.out.println("Music is stopped, cannot pause ❌");
    }

    @Override
    public void stop(MusicPlayer player) {
        System.out.println("Music is already stopped ⏹️");
    }
}

// Context Class
class MusicPlayer {
    private State state;

    public MusicPlayer() {
        // Default state
        state = new StoppedState();
    }

    public void setState(State state) {
        this.state = state;
    }

    public void play() {
        state.play(this);
    }

    public void pause() {
        state.pause(this);
    }

    public void stop() {
        state.stop(this);
    }
}

// Client Code
public class Main {
    public static void main(String[] args) {
        MusicPlayer player = new MusicPlayer();

        player.play();   // Playing the music
        player.pause();  // Pausing the music
        player.play();   // Resuming
        player.stop();   // Stopping
        player.pause();  // Invalid action
    }
}

