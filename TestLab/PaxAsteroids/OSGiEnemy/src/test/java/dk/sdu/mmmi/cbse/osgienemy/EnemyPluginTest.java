/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dk.sdu.mmmi.cbse.osgienemy;

import dk.sdu.mmmi.cbse.common.data.Entity;
import dk.sdu.mmmi.cbse.common.data.GameData;
import dk.sdu.mmmi.cbse.common.data.World;
import dk.sdu.mmmi.cbse.common.data.entityparts.MovingPart;
import dk.sdu.mmmi.cbse.common.data.entityparts.PositionPart;
import dk.sdu.mmmi.cbse.common.enemy.Enemy;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author lucas
 */
public class EnemyPluginTest {
    
    public EnemyPluginTest() {
    }

    @org.junit.jupiter.api.BeforeAll
    public static void setUpClass() throws Exception {
    }

    @org.junit.jupiter.api.AfterAll
    public static void tearDownClass() throws Exception {
    }

    @org.junit.jupiter.api.BeforeEach
    public void setUp() throws Exception {
    }

    @org.junit.jupiter.api.AfterEach
    public void tearDown() throws Exception {
    }

    /**
     * Test of start method, of class EnemyPlugin.
     */
    @org.junit.jupiter.api.Test
    public void testStart() {
        System.out.println("start");
        GameData gameData = new GameData();
        World world = new World();
        EnemyPlugin instance = new EnemyPlugin();
        instance.start(gameData, world);
        int i=0;
        for (Entity entity : world.getEntities(Enemy.class)) {
            i++;
        }
        assertTrue(i > 0);
    }

    /**
     * Test of stop method, of class EnemyPlugin.
     */
    @org.junit.jupiter.api.Test
    public void testStop() {
        System.out.println("stop");
        GameData gameData = new GameData();
        World world = new World();
        EnemyPlugin instance = new EnemyPlugin();
        instance.start(gameData, world);
        instance.stop(gameData, world);
         int i=0;
        for (Entity entity : world.getEntities(Enemy.class)) {
            i++;
        }
        assertTrue(i <= 0);
    }
    
}
