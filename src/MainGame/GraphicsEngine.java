/*
 * File: GraphicsEngine.java
 *
 * The main graphics engine class, which draws things and communicates to the physics
 * engine.
 *
 * @author Sebastian Serrano-Berthet : sas3897 (github)
 * @author Christian Vaughan : christiandv (github)
 * @author Josef Lenz : JosefLenz (github)
 * @author Caitlin Barron : CaitlinBarron (github)
 *
 */

package MainGame;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.io.File;
import java.nio.file.Paths;
import java.util.ArrayList;
import javax.swing.JPanel;
import javax.swing.Timer;

import javafx.embed.swing.JFXPanel;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;


public class GraphicsEngine extends JPanel implements ActionListener {

    private PhysicsEngine physics;
    private Timer timer;
    private boolean ingame;

    private int WIDTH;
    private int HEIGHT;
    private final int DELAY = 30;

    private int scroll = 0;




    public GraphicsEngine(int width, int height) {
        WIDTH = width;
        HEIGHT = height;
        addKeyListener(new TAdapter());
        setFocusable(true);
        setPreferredSize(new Dimension(WIDTH, HEIGHT));
        timer = new Timer(DELAY, this);
        initBoard();
        JFXPanel fxPanel = new JFXPanel();
        String bip = "media/music/Pixelland (end level song).mp3"; //move this
        Media hit = new Media(Paths.get(bip).toUri().toString());
        MediaPlayer mediaPlayer = new MediaPlayer(hit);
        mediaPlayer.play();

    }

    private void initBoard() {
        setBackground(Color.BLACK);
        ingame = true;
        physics = new PhysicsEngine();
        timer.start();
    }



    // main draw
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        if (ingame) {

            drawObjects(g);

        } else {

            drawGameOver(g);
        }

        Toolkit.getDefaultToolkit().sync();
    }

    //  draws all of the things
    private void drawObjects(Graphics g) {

        g.setColor(Color.white);
        g.fillRect(0,0,WIDTH,HEIGHT);

        Player player = physics.getPlayer();



        ArrayList<Sprite> sprites = physics.getSprites();
        for( Sprite p: sprites){
            if (p.isVisible()) {
                g.drawImage(p.getImage(), p.getX() - scroll, p.getY(),
                        this);
            }
        }

        if (player.isVisible()) {
            g.drawImage(player.getImage(), player.getX() - scroll, player.getY(),
                    this);
        }

    }

    private void drawGameOver(Graphics g) {

        String msg = "Game Over";
        Font font = new Font("Helvetica", Font.BOLD, 50);
        FontMetrics fm = getFontMetrics(font);

        g.setColor(Color.white);
        g.setFont(font);
        g.drawString(msg, (WIDTH - fm.stringWidth(msg)) / 2,
                HEIGHT / 2);
        msg = "Press Enter to restart";
        font = new Font("Helvetica", Font.BOLD, 30);
        fm = getFontMetrics(font);

        g.setColor(Color.white);
        g.setFont(font);
        g.drawString(msg, (WIDTH - fm.stringWidth(msg)) / 2,
                HEIGHT / 2 + 50);
    }

    // update function
    @Override
    public void actionPerformed(ActionEvent e) {

        inGame();

        physics.update();
        scroll = physics.scroll;
        ingame = !physics.endGame;
        repaint();
    }

    // bit confused why this is here but dont delete
    private void inGame() {

        if (!ingame) {
            timer.stop();
        }
    }




    // takes keyboard inputs
    private class TAdapter extends KeyAdapter {

        @Override
        public void keyReleased(KeyEvent e) {
            physics.keyReleased(e);
        }

        @Override
        public void keyPressed(KeyEvent e) {
            physics.keyPressed(e);
            int key = e.getKeyCode();

            if (key == KeyEvent.VK_ENTER && ingame == false) {
               initBoard();
            }
        }
    }
}