package org.example.Spring_Core;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Дмитрий Карпушов 04.09.2022
 */
public class MusicPlayer {
    //private Music music;
    private List<Music> musicList = new ArrayList<>();
    private String name;
    private int volume;

    //IoC


    public MusicPlayer(List<Music> musicList, String name, int volume) {
        this.musicList = musicList;
        this.name = name;
        this.volume = volume;
    }

    public MusicPlayer() {
    }


    public void playMusic() {
        for (Music music: musicList){
            System.out.println("Playing : "+music.getSong());
        }
    }

    public List<Music> getMusicList() {
        return musicList;
    }

    public void setMusicList(List<Music> musicList) {
        this.musicList = musicList;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }
}
