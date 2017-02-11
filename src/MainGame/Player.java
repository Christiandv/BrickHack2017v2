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

package MainGame;

import java.awt.event.KeyEvent;
import java.util.ArrayList;
import javax.swing.*;

public class Player extends Sprite {

    private int dx;
    private int dy;
    private int jumps;

    Timer right;
    Timer left;
    public Player(int x, int y) {
        super(x, y);

        init();
    }

    private void init() {
        loadImage("media/images/stickyJumping.gif");
        getImageDimensions();
        jumps = 2;
        right = new Timer(20, e -> {dx += 1;});
        left = new Timer( 20, e -> dx -= 1);
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

        dy  += 2;


        if (x < 1) {
            x = 1;
        }
        if ( x > 700){
            // WENT OFF THE RIGHT SIDE
        }

        if (y < 1) {
            y = 1;
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

        if (key == KeyEvent.VK_SPACE) {
//            jump
        }

        if (key == KeyEvent.VK_A) {
            left.start();
            right.stop();

        }

        if (key == KeyEvent.VK_D) {
            right.start();
            left.stop();
        }

        if (key == KeyEvent.VK_W) {
            if( jumps > 0 && dy > -12){
                jumps --;
                dy = -20;
            }

        }

        if (key == KeyEvent.VK_S) {

        }
    }



    public void keyReleased(KeyEvent e) {

        int key = e.getKeyCode();

        if (key == KeyEvent.VK_A) {
            left.stop();

        }

        if (key == KeyEvent.VK_D) {
            right.stop();
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
    }
}
