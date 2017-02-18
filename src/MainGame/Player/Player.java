/*
 * File: Player.java
 *
 * The player class, this defines things that the player can do, like move, jump ,etc
 *
 * @author Sebastian Serrano-Berthet : sas3897 (github)
 * @author Christian Vaughan : christiandv (github)
 * @author Josef Lenz : JosefLenz (github)
 * @author Caitlin Barron : CaitlinBarron (github)
 *
 */

package MainGame.Player;

import MainGame.Sprite;

import java.awt.event.KeyEvent;
import javax.swing.*;
import java.awt.Image;

public class Player extends Sprite {

    Image jumping, movingRight, movingLeft, idle;

    public int dx;
    public int dy;
    private int jumps;
    public boolean powerup;
    public short type;
    private Timer right;
    private Timer left;
    public boolean onGround = true;
    public boolean walking = false;
    public boolean invincible = false;

    public Player(int x, int y) {
        super(x, y);

        init();
    }

    private void init() {
        loadImages();
        image = idle;
        setImageDimensions();
        jumps = 2;
        right = new Timer(20, e -> {dx += 1;  if(onGround) image = movingRight;});
        left = new Timer( 20, e -> {dx -= 1;  if(onGround) image = movingLeft;});
        type = 0;
    }

    public void loadImages() {
        //Pan, Blanket, Spaceship -> 1, 2, 3
        if(type == 1)
        {
            jumping = new ImageIcon("src/MainGame/Player/resources/stickyJumpingSauce.gif").getImage();
            movingLeft = new ImageIcon("src/MainGame/Player/resources/stickyLeftWalkSauce.gif").getImage();
            movingRight = new ImageIcon("src/MainGame/Player/resources/stickyRightWalkSauce.gif").getImage();
            idle = new ImageIcon("src/MainGame/Player/resources/stickyIdleSauce.gif").getImage();
        }
        else {

            jumping = new ImageIcon("src/MainGame/Player/resources/stickyJumping.gif").getImage();
            movingLeft = new ImageIcon("src/MainGame/Player/resources/stickyLeftWalk.gif").getImage();
            movingRight = new ImageIcon("src/MainGame/Player/resources/stickyRightWalk.gif").getImage();
            idle = new ImageIcon("src/MainGame/Player/resources/stickyIdle.gif").getImage();
        }
    }

    public void move() {
        if( Math.abs(dx) > 5){
            if( dx < 0){
                dx = -5;
            }
            if( dx > 0){
                dx = 5;
            }
        }
        x += dx;
        y += dy;

        if( Math.abs(dx) < 1 && !walking && onGround){
            image = idle;
        }

        dy  += 2;
        if (x < 1) {
            x = 1;
        }

        if( y + height> 400){
            // FELL OFF THE BOTTOM
            y = 400 - height;
            dy = 0;
            landed();
        }

    }

    public void keyPressed(KeyEvent e) {

        int key = e.getKeyCode();



        if (key == KeyEvent.VK_A) {
            left.start();
            right.stop();

            walking = true;
        }

        if (key == KeyEvent.VK_D) {
            right.start();
            left.stop();

            walking = true;
        }

        if (key == KeyEvent.VK_W || key == KeyEvent.VK_SPACE) {
            // jump
            jump();

        }

        if (key == KeyEvent.VK_S) {

        }
    }



    public void keyReleased(KeyEvent e) {

        int key = e.getKeyCode();

        if (key == KeyEvent.VK_A) {
            left.stop();
            walking = false;
        }

        if (key == KeyEvent.VK_D) {
            right.stop();
            walking = false;
        }

        if (key == KeyEvent.VK_W) {

        }

        if (key == KeyEvent.VK_S) {

        }
    }
    public void landed(){
        jumps = 2;
        dy = 0;
        dx *= .75;
        onGround = true;

    }
    public void jump(){
        if( jumps > 0 ){
            jumps --;
            dy = -20;
            onGround = false;
            image = jumping;
        }
    }
}
