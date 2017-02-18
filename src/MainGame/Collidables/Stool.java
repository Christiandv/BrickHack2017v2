/*
 * File: Stool.java
 *
 * The sprite and behavior for stool objects.
 *
 * @author Sebastian Serrano-Berthet : sas3897 (github)
 * @author Christian Vaughan : christiandv (github)
 * @author Josef Lenz : JosefLenz (github)
 * @author Caitlin Barron : CaitlinBarron (github)
 *
 */

package MainGame.Collidables;

import MainGame.Sprite;

public class Stool extends Sprite {

    public int maxY;
    public int down = 0;
    public Stool (int x, int y)
    {
        super(x, y);
        maxY = y;
        init();
    }
    public void update(){
        if(down>0) {
            y++;
            if (y > 460)
                y = 460;
            down -- ;
        } else {
            y--;
            if(y < maxY)
                y = maxY;
        }
        if( down < 0)
            down = 0;
    }

    public void init(){
        hard = true;
        loadImage("src/MainGame/Collidables/resources/stool.png");
        setImageDimensions();
    }
}
