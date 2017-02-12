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


        //Begin hardcoding
        level.addAll( new Couch(10, 313).getSprites());
        level.addAll(new Chair(308,312).getSprites());
        level.add(new Shelf(425, 270));
        level.add(new Bookcase(540, 271));


        level.add(new Fireball(700,200));

        for(int i = 0; i < 10; i++){
            level.add(new Lava( i* 640, 399));
        }
        return level;
    }

}
