/*
 * File: PhysicsEngine.java
 *
 * The main physics engine class, this will handle gravity, etc.
 *
 * @author Sebastian Serrano-Berthet : sas3897 (github)
 * @author Christian Vaughan : christiandv (github)
 * @author Josef Lenz : JosefLenz (github)
 * @author Caitlin Barron : CaitlinBarron (github)
 *
 */

package MainGame;

import java.awt.event.KeyEvent;
import java.util.ArrayList;

public class PhysicsEngine {
    Player player;
    ArrayList<Platform> platforms;

    private final int IPLAYER_X = 40;
    private final int IPLAYER_Y = 60;
    //platforms
    //enemies
    //powerups

    public PhysicsEngine(){
        player = new Player(IPLAYER_X, IPLAYER_Y);
        platforms = new ArrayList<Platform>();
        platforms.add(new Platform(400,200));
    }

    public void update(){
        if (player.isVisible()) {
            player.move();
        }
        //collisions
        playerCollisions();
    }

    public void playerCollisions(){
        for(Platform p : platforms){
            // you bee hitting a platform man
            if( p.getBounds().intersects(player.getBounds())){
                if(p.isHard()){// idk maybe we want passable platforms

                }
            }
        }
    }
    public Player getPlayer()
    {
        return player;
    }
    public ArrayList<Platform> getPlatforms(){
        return platforms;
    }

    public void keyPressed(KeyEvent e) {
        player.keyPressed(e);
    }

    public void keyReleased(KeyEvent e) {
        player.keyReleased(e);
    }
}
