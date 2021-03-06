package Examples;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.JComponent;
import javax.swing.JFrame;
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
public class DrawingsExample extends JComponent implements ActionListener {

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
    
    Color custom = new Color(66, 244, 226);
    int pacmanX = 100;
    int pacmanAngle = 45;
    int PacmanRotate = 270;
    boolean pacmanClosing = true;
    
    int mouseX = 0;
    int mouseY = 0;
    
    // GAME VARIABLES END HERE    

    
    // Constructor to create the Frame and place the panel in
    // You will learn more about this in Grade 12 :)
    public DrawingsExample(){
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
        
        gameTimer = new Timer(desiredTime,this);
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
        // use custom colour variable
        g.setColor(custom);
        
        //create a background
        g.fillRect(0, 0, WIDTH, HEIGHT);
        
        //set the colour
        g.setColor(Color.MAGENTA);
        //draw a filled in rectangle
        //(x,y, width, hieght)
        g.fillRect(100, 75, 150, 50);
        
        //draw anything that is an "oval"
        //(x,y, width, height)
        g.setColor(Color.YELLOW);
	g.fillOval(100, 75, 150, 50);
		
        //draw a black outline around the oval
         g.setColor(Color.BLACK);
	g.drawOval(100, 75, 150, 50);
        
        //rounds the corners
        //(x,y, width, heights, radiusWidth, radiusHeight
        g.fillRoundRect(300, 75, 150, 50, 20, 40);
        
        //draw a polygon
        int[] triangleX = {mouseX, 600, 450};
        int[] triangleY = {mouseY, 500, 500};
        
        g.fillPolygon(triangleX, triangleX, 3);
        
        //create a pacman shape
        g.setColor(Color.YELLOW);
        //Animation
        g.fillArc(pacmanX, 400, 100, 100, pacmanAngle, PacmanRotate);
        g.drawLine(250, 125, 500, 400);
        
        
        
        
        
        
        
        
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
        //Move pacman across the screen
        pacmanX = pacmanX + 3;
        
        //when pacman leaves the screen
        if(pacmanX > WIDTH){
            pacmanX = -100;
        }
        
        //make pacman roll
        if(pacmanClosing){
        pacmanAngle = pacmanAngle - 3;
          if(pacmanX > WIDTH){
           pacmanX = -45;
    }else{
                pacmanAngle = pacmanAngle+3;
          PacmanRotate = PacmanRotate + 3;
          }
             
         
    }
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
               //set mouse coordinated
            mouseX = e.getX();
                mouseY = e.getY();
                
             
            
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
        DrawingsExample game = new DrawingsExample();
    }
}

