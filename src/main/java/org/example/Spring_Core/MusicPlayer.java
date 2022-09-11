package org.example.Spring_Core;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.Random;

/**
 * @author Дмитрий Карпушов 04.09.2022
 */

public class MusicPlayer {
    @Value("${musicPlayer.name}")
    private String name;
    @Value("${musicPlayer.volume}")
    private int volume;

    private Music music1;
    private Music music2;

    public MusicPlayer(@Qualifier("rockMusic") Music music1,@Qualifier("classicalMusic") Music music2) {
        this.music1 = music1;
        this.music2 = music2;
    }
    public String playMusic(){
        return "Playing: " + music1.getSong()+", "+music2.getSong();
    }

    public String getName() {
        return name;
    }

    public int getVolume() {
        return volume;
    }
}




/*public class MusicPlayer {
    private ClassicalMusic classicalMusic;
    private RockMusic rockMusic;

    @Autowired
    public MusicPlayer(ClassicalMusic classicalMusic, RockMusic rockMusic) {
        this.classicalMusic = classicalMusic;
        this.rockMusic = rockMusic;
    }

    public void playMusic(Janr janr) {
        Random random = new Random();
        int randomNumber = random.nextInt(3);

        if (janr == Janr.CLASSICAL) {
            // случайная классическая песня
            System.out.println(classicalMusic.getSong().get(randomNumber));
        } else {
            // случайная рок песня
            System.out.println(rockMusic.getSong().get(randomNumber));
        }
    }
}*/
