package com.example.user.dartplayers;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Created by user on 07/11/2016.
 */

public class RankingTest {

    @Before
    public void beforeEach() {
        player = new Player(;
    }

    @Test
    public void getPlayerTest()
    {
        Player player = new Player();
        assertNotNull(player.getPlayer());
    }
}
