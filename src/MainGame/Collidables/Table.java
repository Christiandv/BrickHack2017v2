package MainGame.Collidables;

import MainGame.Sprite;

/**
 * Created by Hephaestus on 2/12/2017.
 */
public class Table extends Sprite {
    public int maxY;
    public int down = 0;
    public Table (int x, int y)
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
        loadImage("src/MainGame/Collidables/resources/table.png");
        setImageDimensions();
    }
}
