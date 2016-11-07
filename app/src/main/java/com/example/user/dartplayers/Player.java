package com.example.user.dartplayers;

/**
 * Created by user on 07/11/2016.
 */

public class Player {

    private String name;
    private String nickname;
    private int ranking;

    public Player(String name, String nickname) {
        this.name = name;
        this.nickname = nickname;
        this.ranking = 0;
    }

    public Player(String name, String nickname, int ranking) {
        this.name = name;
        this.nickname = nickname;
        this.ranking = ranking;
    }

    public String getName() {
        return this.name;
    }

    public String getNickname() {
        return this.nickname;
    }

    public int getRanking() {
        return this.ranking;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public void setRanking(int ranking) {
        this.ranking = ranking;
    }

    @Override
    public String toString() {
        return "Name: " + name + "Nickname: " + nickname + "Ranking: " + ranking;
    }
}
