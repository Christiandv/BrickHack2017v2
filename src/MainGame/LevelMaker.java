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
        level.addAll(new Couch(10, 313).getSprites());
        level.addAll(new Chair(308,312).getSprites());
        level.add(new Shelf(425, 270));
        level.add(new Bookcase(600, 271));

        //Begin stools
        level.add(new Stool(800, 345));
        level.add(new Stool(940, 345));
        level.add(new Stool(1105, 345));
        level.add(new Stool(1240, 345));

        //Back-to-back chairs of doom
        level.addAll(new Chair(1350, 312).getSprites());
        level.add(new Fireball(1400, 250));
        level.addAll(new BackwardChair(1430, 312).getSprites());

        for(int i = 0; i < 10; i++){
            level.add(new Lava( i* 640, 399));
        }
        return level;
    }

}
