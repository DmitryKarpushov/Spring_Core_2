package org.example.Spring_Core;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author Дмитрий Карпушов 06.09.2022
 */

public class Computer {
    private int id;
    private MusicPlayer musicPlayer;

    public Computer(MusicPlayer musicPlayer) {
        this.id = 1;
        this.musicPlayer = musicPlayer;
    }

    @Override
    public String toString() {
        return "Computer " +
                "" + id +
                ", " + musicPlayer.playMusic();
    }
}
