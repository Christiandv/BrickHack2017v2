/*
 * File: Chandelier.java
 *
 * The sprite and behavior for chandelier objects.
 *
 * @author Sebastian Serrano-Berthet : sas3897 (github)
 * @author Christian Vaughan : christiandv (github)
 * @author Josef Lenz : JosefLenz (github)
 * @author Caitlin Barron : CaitlinBarron (github)
 *
 */

package MainGame;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class Chandelier extends Sprite{

    Sprite ChandelierBar;
    int reset = -1;
    int fall  = -1;
    int maxY;

    public Chandelier(int x, int y){
        super(x,y);
        maxY = y;
        hard = true;
        ChandelierBar = new Sprite(x+20, y + 112); // if you fuck around here tell me -christian
        ChandelierBar.hard = true;
        ChandelierBar.loadImage("media/images/chandelierCollisionBar.png");
        ChandelierBar.setImageDimensions();
        loadImage("media/images/chandalierBar.png");
        setImageDimensions();
    }

//    public ArrayList<Sprite> getSprites()
//    {
//        ArrayList<Sprite> sprites = new ArrayList<Sprite>();
//        sprites.add(ChandelierBase);
//        sprites.add(ChandelierBar);
//        return sprites;
//    }

    public void update(){
        if( fall > 0){
            fall --;
        }
        if(fall == 0) {
            y+=5;
            hard = false;
            if (y > 460) {

                fall = -1;
                reset = 80;
                y = maxY;
            }
        }
        if( reset > 0){
            if( reset %10 == 0){
                setVisible(!isVisible());
            }

            reset --;
        }
        if( reset == 0){

            hard = true;
            reset = -1;
        }

    }

    @Override
    public Rectangle getBounds() {
        return ChandelierBar.getBounds();
    }


}
