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

        level.add(new Platform(400,200));
        level.addAll( new Couch(10, 313).getSprites());
        level.addAll(new Chair(300,312).getSprites());
        level.addAll(new Chandelier(500, 240).getSprites());
        return level;
    }

}
