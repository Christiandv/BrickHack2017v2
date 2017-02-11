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

    int yOverLap, xOverLap;
    int yOff, xOff;
    public void playerCollisions(){
        for(Platform p : platforms){
            // you bee hitting a platform man
            if( p.getBounds().intersects(player.getBounds())){
                if(p.isHard()){// idk maybe we want passable platforms
                    xOff = player.width;
                    yOff = player.height;
                    xOverLap = (player.x+ player.width)- p.x;
                    if( Math.abs(xOverLap) > Math.abs((p.x+p.width)-player.x )){
                        xOverLap = (p.x+p.width)-player.x;
                        xOff = 0;
                    }
                    yOverLap = (player.y+ player.height)- p.y;
                    if( Math.abs(yOverLap) > Math.abs((p.y+p.height)-player.y) ){
                        yOverLap = (p.y+p.height)-player.y;
                        yOff = 0;
                    }
                    if( Math.abs(xOverLap)< Math.abs(yOverLap)){
                        if( xOff == 0){
                            // PLAYER HIT LEFT SIDE OF OBJECT
                            player.x = player.x +xOverLap;
                            player.dx = 0;
                        }else {
                            player.x = p.x - player.width;
                            player.dx = 0;
                        }
                    } else {
                        if( yOff == 0){
                            player.y = player.y +yOverLap;
                            player.dy = 0;
                        }else {
                            // PLAYER LANDED ON TOP
                            player.y = p.y - player.height;
                            player.landed();
                        }
                    }
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
