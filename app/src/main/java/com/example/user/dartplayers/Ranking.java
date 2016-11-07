package com.example.user.dartplayers;

import java.util.ArrayList;

/**
 * Created by user on 07/11/2016.
 */

public class Ranking {

    protected  ArrayList<String> mPlayers;

    public Players() {
        mPlayers = new ArrayList<String>();
        setUpPlayers();
        }

        public Players(ArrayList<String> currentPlayers) {
            mPlayers = new ArrayList<String>(currentPlayers);
        }

        private void setUpPlayers(){
            String[] players = {
                    ("Phil Taylor", "The Power", 1),
                    ("Raymond Barneveld", "Barney", 2),
                    ("Jocky Wilson", "Jocky", 3),
                    ("Eric Bristow", "Crafty Cockney", 4),
                    ("Bobby George", "Bobby Dazzler", 5),
                    ("Ted Hanky", "The Count", 6),
                    ("Gary Anderson", "Flying Scotsman", 7),
                    ("Andy Fordham", "The Viking", 8),
                    ("Martin Adams", "Wolfie", 9),
                    ("James Wade", "The Machine", 10)
            };
            for (String player : players) {
                add(player);
            }
        }

        public ArrayList<String> getPlayer(){
            return new ArrayList<String>(mPlayers);
        }

        public void add(String newPlayer) {
            mPlayers.add(newPlayer);
        }

        public int getLength() {
            return mPlayers.size();
        }

        public String getPlayerAtIndex(int index) {
            return mPlayers.get(index);
        }

    }
}
