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

import javafx.embed.swing.JFXPanel;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;

import java.awt.event.KeyEvent;
import java.nio.file.Paths;
import java.util.ArrayList;

public class PhysicsEngine
{
    Player player;
    LevelMaker levelGen;
    boolean endGame = false;
    int scroll = 0;

    ArrayList<Sprite> sprites;

    public MediaPlayer song;
    public JFXPanel thing;
    public String tune;

    public int playerScore;

    private final int IPLAYER_X = 50;
    private final int IPLAYER_Y = 313;
    //platforms
    //enemies
    //powerups

    public PhysicsEngine(){
        levelGen = new LevelMaker();
        player = new Player(IPLAYER_X, IPLAYER_Y);
        sprites = new ArrayList<Sprite>();

        sprites = levelGen.getLevel1();
        playerScore = 0;
        thing = new JFXPanel();
        tune = "media/music/Mountain Emperor (lava song).mp3"; //move this
        Media hit = new Media(Paths.get(tune).toUri().toString());
        song = new MediaPlayer(hit);
        song.play();
    }


    public void update(){
        if (player.isVisible()) {
            player.move();
        }
        handleScroll();
        //collisions
        playerCollisions();
    }

    public void handleScroll(){
        if( player.x+ player.width> scroll + 450){
            scroll = player.x + player.width - 450;
        }
        if( player.x < scroll + 150){
            scroll = player.x  - 150;
        }

        if( scroll < 0 ){
            scroll = 0;
        }
    }

    int yOverLap, xOverLap;
    int yOff, xOff;
    public void playerCollisions()
    {
        for(Sprite p : sprites) {
            // you bee hitting a platform man
            if (p.getBounds().intersects(player.getBounds())) {

                if (p.hurts) {
                    if (player.powerup && player.type == "pan") {
                        player.type = "none";
                        player.powerup = false;
                        player.loadImages();
                        player.jump();
                        endGame = false;
                    } else {
                        endGame = true;
                    }
                }

                if (p.isHard()) {// idk maybe we want passable platforms
                    xOff = player.width;
                    yOff = player.height;
                    xOverLap = (player.x + player.width) - p.x;
                    if (Math.abs(xOverLap) > Math.abs((p.x + p.width) - player.x)) {
                        xOverLap = (p.x + p.width) - player.x;
                        xOff = 0;
                    }
                    yOverLap = (player.y + player.height) - p.y;
                    if (Math.abs(yOverLap) > Math.abs((p.y + p.height) - player.y)) {
                        yOverLap = (p.y + p.height) - player.y;
                        yOff = 0;
                    }
                    if (Math.abs(xOverLap) < Math.abs(yOverLap)) {
                        if (xOff == 0) {
                            // PLAYER HIT LEFT SIDE OF OBJECT
                            player.x = player.x + xOverLap;
                            player.dx = 0;
                        } else {
                            player.x = p.x - player.width;
                            player.dx = 0;
                        }
                    } else {
                        if (yOff == 0) {
                            player.y = player.y + yOverLap;
                            player.dy = 0;
                        } else {
                            // PLAYER LANDED ON TOP
                            player.y = p.y - player.height;
                            player.landed();
                            if (p instanceof Bookcase) {
                                ((Bookcase) p).down = 10;

                            }
                            if (p instanceof Stool) {
                                ((Stool) p).down = 10;

                            }
                            if (p instanceof Table){
                                ((Table) p).down = 10;
                            }
                        }
                    }
                }
                if (!p.isHard())//possibly powerup
                {
                    if (p instanceof Powerup) {
                        int type = ((Powerup) p).type;
                        switch (type) {
                            case 0:
                                //cube checkpoint code
                                break;
                            case 1:
                                //cookie code
                                if (p.isVisible()) {
                                    playerScore++;
                                }
                                p.setVisible(false);
                                break;
                            case 2:
                                //lego code
                                break;
                            case 3:
                                //blanket code
                                break;
                            case 4:
                                //pan code
                                if (p.isVisible()) {
                                    player.powerup = true;
                                    player.type = "pan";
                                    player.loadImages();
                                }
                                p.setVisible(false);
                                break;
                            case 5:
                                //rocket code
                                break;
                            case 6:
                                //pie code
                                break;
                        }

                    }
                }
            }
            
            if (p instanceof Bookcase) {
                ((Bookcase) p).update();
            }
            if (p instanceof Stool) {
                ((Stool) p).update();
            }
            if (p instanceof Table){
                ((Table) p).update();
            }
        }
    }
    public Player getPlayer()
    {
        return player;
    }

    public ArrayList<Sprite> getSprites() { return sprites; }

    public void keyPressed(KeyEvent e) {
        player.keyPressed(e);
    }

    public void keyReleased(KeyEvent e) {
        player.keyReleased(e);
    }
}
