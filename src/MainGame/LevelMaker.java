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
        level.add(new Background(2560, 0));
        level.add(new Background(3200,0));
        level.add(new Background(3840, 0));
        level.add(new Background(4480, 0));

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
        level.add(new Cookie(2077, 174));
        level.add(new Shelf(2050, 220));
        level.addAll(new Couch(2200, 313).getSprites());
        level.add(new Shelf(2300, 130));

        //Chandelier time
        level.add(new Cookie(2590,125));
        level.add(new Cookie(2605,125));
        level.addAll(new Chandelier(2550, 120).getSprites());
        level.add(new Stool(2520, 345));
        level.add(new Shelf(2800, 130));
        level.add(new Stool(2770, 345));
        level.add(new Bookcase(2965, 300));

        //We transfer to the kitchen
        level.add(new Cookie(3260, 310));
        level.add(new Table(3225, 345));
        level.add(new Countertop(3575, 305));
        level.add(new Stool(3800, 355));
        level.add(new Countertop(4080, 305));


        for(int i = 0; i < 10; i++){
            level.add(new Lava( i* 640, 399));
        }
        return level;
    }

}
