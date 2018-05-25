package assignment8;

import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.JComponent;
import javax.swing.JFrame;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseWheelEvent;
import javax.swing.Timer;

/**
 *
 * @author kanth4624
 */
public class A8Q1 extends JComponent implements ActionListener {

    // Height and Width of our game
    static final int WIDTH = 800;
    static final int HEIGHT = 600;
    //Title of the window
    String title = "My Game";
    // sets the framerate and delay for our game
    // this calculates the number of milliseconds per frame
    // you just need to select an approproate framerate
    int desiredFPS = 60;
    int desiredTime = Math.round((1000 / desiredFPS));
    // timer used to run the game loop
    // this is what keeps our time running smoothly :)
    Timer gameTimer;
    // YOUR GAME VARIABLES WOULD GO HERE
    //create a custom colour
    Color custom = new Color(66, 244, 226);
    Color tan = new Color(224, 178, 143);
    Color brown = new Color(112, 94, 84);
    //animate the tongue to move up and down
    int tongue = 345;
    int tongueDirect = 1;
    //animate so the lines move up and down
    int line = 50;
    int lineDirect = 1;
    //The eyes will move up and down
    int eye = 300;
    int eyesDirect = 1;
    //the nose moves up and down
    int nose = 250;
    int noseDirect = 1;
    //make the  right eyebrows move side to side
    int eyebrowR = 195;
    int eyebrowRDirect = 1;
    //make the  right eyebrows move side to side
    int eyebrowL = 40;
    int eyebrowLDirect = 1;

    // GAME VARIABLES END HERE    
    // Constructor to create the Frame and place the panel in
    // You will learn more about this in Grade 12 :)
    public A8Q1() {
        // creates a windows to show my game
        JFrame frame = new JFrame(title);

        // sets the size of my game
        this.setPreferredSize(new Dimension(WIDTH, HEIGHT));
        // adds the game to the window
        frame.add(this);

        // sets some options and size of the window automatically
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        // shows the window to the user
        frame.setVisible(true);

        // add listeners for keyboard and mouse
        frame.addKeyListener(new Keyboard());
        Mouse m = new Mouse();
        this.addMouseMotionListener(m);
        this.addMouseWheelListener(m);
        this.addMouseListener(m);

        gameTimer = new Timer(desiredTime, this);
        gameTimer.setRepeats(true);
        gameTimer.start();
    }

    // drawing of the game happens in here
    // we use the Graphics object, g, to perform the drawing
    // NOTE: This is already double buffered!(helps with framerate/speed)
    @Override
    public void paintComponent(Graphics g) {
        // always clear the screen first!
        g.clearRect(0, 0, WIDTH, HEIGHT);

        // GAME DRAWING GOES HERE

        //use custom colour for the background
        g.setColor(custom);

        //create a background
        g.fillRect(0, 0, WIDTH, HEIGHT);

        //Create lines for the background
        g.setColor(Color.BLACK);
        g.fillRect(0, line, 1100, 30);
        g.fillRect(0, line, 1100, 30);

        //Draw a tan oval for the face
        g.setColor(tan);
        g.fillOval(100, 125, 400, 300);

        //Make the outside of the eye
        g.setColor(Color.WHITE);
        g.fillOval(185, 200, 75, 55);
        g.fillOval(325, 200, 75, 55);

        //make the inside pupil of the eye
        g.setColor(Color.BLACK);
        //left eye
        g.fillOval(210, eye, 25, 25);
        //right eye
        g.fillOval(350, eye, 25, 25);

        //create a hat
        g.setColor(brown);
        g.fillRect(160, 100, 300, 55);

        //small rectangle on hat
        g.fillRect(255, 5, 100, 150);

        //Create a small rectangle as a logo for the hat
        g.setColor(Color.YELLOW);
        g.fillRect(275, 25, 50, 70);

        //create the nose of the character
        g.setColor(Color.BLACK);
        g.fillArc(125, nose, 300, 100, 70, 20);

        //Create a mouth 
        g.fillArc(175, 275, 250, 100, 180, 180);

        //create the tounge
        g.setColor(Color.RED);
        g.fillArc(220, tongue, 250, 50, 120, 120);

        //create eyebrows
        g.setColor(Color.BLACK);
        //right 
        g.fillArc(eyebrowR, 180, 240, 30, 25, 50);
        //left
        g.fillArc(eyebrowL, 180, 240, 30, 10, 60);

        //Make a Sun
        g.setColor(Color.YELLOW);
        g.fillArc(1, 1, 130, 130, 450, 450);






        // GAME DRAWING ENDS HERE
    }

    // This method is used to do any pre-setup you might need to do
    // This is run before the game loop begins!
    public void preSetup() {
        // Any of your pre setup before the loop starts should go here
    }

    // The main game loop
    // In here is where all the logic for my game will go
    public void gameLoop() {

        //Make the tongue move up and down
        if (tongue >= 365) {
            tongueDirect = -1;
        }
        if (tongue <= 340) {
            tongueDirect = 1;
        }
        tongue = tongue + tongueDirect * 1;


        //the black line will move up and down from one end of the screen to the other
        if (line >= 600) {
            lineDirect = -1;
        }
        if (line <= 10) {
            lineDirect = 1;
        }
        //The speed it will move
        line = line + lineDirect * 10;

        //Move the eyes coming down, to its location
        //Once the eyes go up, it will stay there and shake
        if (eye >= 200) {
            eyesDirect = -1;
        }
        if (eye <= 237) {
            eyesDirect = 1;
        }
        //It will move slow
        eye = eye + eyesDirect * 2;

        //move the nose up and down
        if (nose >= 285) {
            noseDirect = -1;
        }
        if (nose <= 265) {
            noseDirect = 1;
        }
        nose = nose + noseDirect * 1;

        //Make the right eyebrow move quickly horizontally
        if (eyebrowR >= 185) {
            eyebrowRDirect = -1;
        }
        if (eyebrowR <= 200) {
            eyebrowRDirect = 1;
        }
        eyebrowR = eyebrowR + eyebrowRDirect * 5;

        //Make the left eyebrow move quickly horizontally
        if (eyebrowL >= 40) {
            eyebrowLDirect = -1;
        }
        if (eyebrowL <= 40) {
            eyebrowLDirect = 1;
        }
        eyebrowL = eyebrowL + eyebrowLDirect * 5;
    }

    // Used to implement any of the Mouse Actions
    private class Mouse extends MouseAdapter {

        // if a mouse button has been pressed down
        @Override
        public void mousePressed(MouseEvent e) {
        }

        // if a mouse button has been released
        @Override
        public void mouseReleased(MouseEvent e) {
        }

        // if the scroll wheel has been moved
        @Override
        public void mouseWheelMoved(MouseWheelEvent e) {
        }

        // if the mouse has moved positions
        @Override
        public void mouseMoved(MouseEvent e) {
        }
    }

    // Used to implements any of the Keyboard Actions
    private class Keyboard extends KeyAdapter {

        // if a key has been pressed down
        @Override
        public void keyPressed(KeyEvent e) {
        }

        // if a key has been released
        @Override
        public void keyReleased(KeyEvent e) {
        }
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        preSetup();
        gameLoop();
        repaint();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // creates an instance of my game
        A8Q1 game = new A8Q1();
    }
}
