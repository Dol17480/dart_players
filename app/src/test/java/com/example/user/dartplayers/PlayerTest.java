package com.example.user.dartplayers;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Created by user on 07/11/2016.
 */

public class PlayerTest {

    Player player;


    @Before
    public void before(){
        player = new Player("Phil Taylor", "The Power", 1);

    }

    @Test
    public void testPlayerSetUp() {
        assertEquals("Phil Taylor", player.getName());
        assertEquals("The Power", player.getNickname());
    }

    @Test
    public void testCheckRanking(){
        assertEquals(1, player.getRanking());
    }

    @Test
    public void testCanSetRanking(){
        player.setRanking(7);
        assertEquals(7, player.getRanking());
    }


    @Test
    public void testOverrideStringMethod(){
            assertEquals("Name: Phil Taylor, Nickname: The Power, Ranking: 1", player.toString());

    }


}
