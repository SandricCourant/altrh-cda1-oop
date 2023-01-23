package org.example.adapter;

public class Jukebox {

    private Adapter adapter;

    public Jukebox(Adapter adapter) {
        this.adapter = adapter;
    }

    public void play(int song) {
        adapter.play(song);
    }

}
