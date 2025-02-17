package ru.aleksLiss.sandbox;

import java.util.ArrayList;
import java.util.List;

public class MusicPlayer {

    private Music music;
    private String name;
    private int volume;
    private List<Music> musicList = new ArrayList<>();

    public MusicPlayer(Music music) {
        this.music = music;
    }

    public MusicPlayer() {
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

    public void setMusic(Music music) {
        this.music = music;
    }

    public void setMusicList(List<Music> musicList) {
        this.musicList = musicList;
    }

    public void playMusic() {
        for (Music music1 : musicList) {
            System.out.println("Playing: " + music1.getSong());
        }
    }
}
