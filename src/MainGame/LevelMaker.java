package MainGame;

/**
 * Created by Chris on 2/11/2017.
 */

import java.util.ArrayList;
public class LevelMaker {

    public LevelMaker(){

    }

    public ArrayList<Sprite> getLevel1(){
        ArrayList<Sprite> level = new ArrayList<Sprite>();

        for(int i = 0; i < 10; i++){
            level.add(new Lava( i* 640, 399));
        }
        level.add(new Platform(400,200));
        level.addAll( new Couch(10, 313).getSprites());
        level.addAll(new Chair(300,312).getSprites());
        level.addAll(new Chandelier(500, 240).getSprites());

        Sprite fireball = new Sprite(700, 200);
        fireball.loadImage("media/images/fireballTest.gif");
        fireball.setImageDimensions();
        fireball.hurts = true;
        fireball.setHard();

        level.add(fireball);
        return level;
    }

}
