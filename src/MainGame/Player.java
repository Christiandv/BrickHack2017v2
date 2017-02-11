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

public class Player extends Sprite {

    private int dx;
    private int dy;

    public Player(int x, int y) {
        super(x, y);

        init();
    }

    private void init() {
        loadImage("media/images/stickyJumping.gif");
        getImageDimensions();
    }

    public void move() {

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
        }

    }

    public void keyPressed(KeyEvent e) {

        int key = e.getKeyCode();

        if (key == KeyEvent.VK_SPACE) {
//            jump
        }

        if (key == KeyEvent.VK_A) {
            dx = -4;
        }

        if (key == KeyEvent.VK_D) {
            dx = 4;
        }

        if (key == KeyEvent.VK_W) {
            dy = -4;
        }

        if (key == KeyEvent.VK_S) {
            dy = 4;
        }
    }



    public void keyReleased(KeyEvent e) {

        int key = e.getKeyCode();

        if (key == KeyEvent.VK_A) {
            dx = 0;
        }

        if (key == KeyEvent.VK_D) {
            dx = 0;
        }

        if (key == KeyEvent.VK_W) {
            dy = 0;
        }

        if (key == KeyEvent.VK_S) {
            dy = 0;
        }
    }
}
