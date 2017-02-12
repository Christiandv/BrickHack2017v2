/*
 * File: LevelMaker.java
 *
 * The level-maker class, this creates the initial objects and, well, the level
 *
 * @author Sebastian Serrano-Berthet : sas3897 (github)
 * @author Christian Vaughan : christiandv (github)
 * @author Josef Lenz : JosefLenz (github)
 * @author Caitlin Barron : CaitlinBarron (github)
 *
 */

package MainGame;

import javafx.embed.swing.JFXPanel;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;

import java.nio.file.Paths;
import java.util.ArrayList;
public class LevelMaker {

    public LevelMaker(){

    }

    public ArrayList<Sprite> getLevel1(){
        ArrayList<Sprite> level = new ArrayList<Sprite>();

        //Background image
        level.add(new Background(0,0));
        level.add(new Background(640,0));
        level.add(new Background(1280,0));
        level.add(new Background(1920,0));

        //Begin hardcoding
        level.addAll(new Couch(10, 313).getSprites());
        level.addAll(new Chair(308,312).getSprites());
        level.add(new Cookie(452, 222)); //The first of many...
        level.add(new Shelf(425, 270));
        level.add(new Bookcase(600, 271));

        //Begin stools
        level.add(new Cookie(812, 305));
        level.add(new Stool(800, 345));
        level.add(new Stool(940, 345));
        level.add(new Cookie(1117, 305));
        level.add(new Stool(1105, 345));
        level.add(new Stool(1240, 345));

        //Back-to-back chairs of doom
        level.addAll(new Chair(1350, 312).getSprites());
        level.add(new Fireball(1400, 250));
        level.addAll(new BackwardChair(1430, 312).getSprites());

        //First power-up time
        level.add(new Stool(1650, 345));
        level.add(new Saucepan(1665, 300));

        //Aftermath
        level.add(new Shelf(1800, 250));
        level.add(new Stool(1950, 345));
        level.add(new Shelf(2050, 220));



        for(int i = 0; i < 10; i++){
            level.add(new Lava( i* 640, 399));
        }
        return level;
    }

}
