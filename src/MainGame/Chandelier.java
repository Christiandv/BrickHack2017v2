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

    public Chandelier(int x, int y){
        super(x,y);
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


    @Override
    public Rectangle getBounds() {
        return ChandelierBar.getBounds();
    }


}
