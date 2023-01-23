package org.example.adapter;

import java.util.ArrayList;
import java.util.List;

public class Adapter {

    private List<String> filenames;
    private Mp3PlayerService mp3PlayerService;

    public Adapter(Mp3PlayerService mp3PlayerService) {
        this.mp3PlayerService = mp3PlayerService;

        filenames  = new ArrayList<>();
        filenames.add("/home/music/barbie.mp4");
        filenames.add("/home/music/elle-a-fait-un-bebe-toute-seule.mp4");
        filenames.add("/home/music/allumer-le-feu.mp4");
    }

    public void play(int song) {
        /*
         * On transforme le "song" du int vers le String
         */

        // On fait l'adaptation du int vers le String
        String filename = filenames.get(song);

        mp3PlayerService.play(filename);
    }
}
