package MainGame.Collidables;

import MainGame.Sprite;

/**
 * Created by Caitlin on 2/11/2017.
 */
public class Bookcase extends Sprite
{
    public int maxY;
    public int down = 0;
    public Bookcase (int x, int y)
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
        loadImage("src/MainGame/Collidables/resources/bookcase.png");
        setImageDimensions();
    }
}