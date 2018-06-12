package snakeGame;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseWheelEvent;
import java.util.ArrayList;
import java.util.Random;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.Timer;
import static snakeGame.Snake.snake;



/**
 *
 * @author kanth4624
 */
public final class Snake implements ActionListener, KeyListener {


    //Title of the window
    String title = "Snake Game ";
    // sets the framerate and delay for our game
    // this calculates the number of milliseconds per frame
    // you just need to select an approproate framerate
    int desiredFPS = 60;
    int desiredTime = Math.round((1000 / desiredFPS));
    // timer used to run the game loop
    // this is what keeps our time running smoothly :)
    Timer gameTimer;
    
    // YOUR GAME VARIABLES WOULD GO HERE
  
    public static Snake snake;
    public JFrame jframe;
    public RenderPanel renderPanel;
    public Timer timer = new Timer(20, this);
    public ArrayList<Point> snakeParts = new ArrayList<Point>();
    public static final int UP = 0, DOWN = 1, LEFT = 2, RIGHT = 3, SCALE = 10;
    public int ticks = 0, direction = DOWN, score, tailLength = 7, time;
    public Point head, cherry;
    public Random random;
    public boolean over = false, paused;
    public Dimension dim;
    private int speed;
    private Object frame;

    // GAME VARIABLES END HERE   
    public Snake() {

        dim = Toolkit.getDefaultToolkit().getScreenSize();
        jframe = new JFrame("Snake Game");
        jframe.setVisible(true);
        jframe.setSize(800, 700);
        jframe.setResizable(false);
        jframe.setLocation(dim.width / 2 - jframe.getWidth() / 2, dim.height / 2 - jframe.getHeight() / 2);
        jframe.add(renderPanel = new RenderPanel());
        jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jframe.addKeyListener(this);
        startGame();
    }

    public void startGame() {
        
        //Add the variables, and set them to there value
        over = false;
        paused = false;
        time = 1;
        score = 0;
        tailLength = 12;
        speed = 0;
        direction = DOWN;
        head = new Point(0, 1);
        random = new Random();
        snakeParts.clear();
        cherry = new Point(random.nextInt(80), random.nextInt(70));
        timer.start();

    }

    // drawing of the game happens in here
    // we use the Graphics object, g, to perform the drawing
    // NOTE: This is already double buffered!(helps with framerate/speed)
    public void paintComponent(Graphics g) {
     
        
        // GAME DRAWING BEGIN HERE
        
    }
        // GAME DRAWING ENDS HERE

    // This method is used to do any pre-setup you might need to do
    // This is run before the game loop begins!
    public void preSetup() {
        // Any of your pre setup before the loop starts should go here
    }

    // The main game loop
    // In here is where all the logic for my game will go
    public void gameLoop() {
    }

    @Override
    public void keyTyped(KeyEvent e) {
        throw new UnsupportedOperationException(); 
    }

    @Override
    public void keyReleased(KeyEvent e) {
        throw new UnsupportedOperationException(); 
    }

    private void repaint() {
        throw new UnsupportedOperationException();
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

        // if a key has been released
        @Override
        public void keyReleased(KeyEvent e) {
        }
    }

    @Override
    public void actionPerformed(ActionEvent arg0) {
        preSetup();
        gameLoop();

        //Add the render and speed
        renderPanel.repaint();
        speed++;
        
        //set snake speed to 3 - mid slwo and fast
        if (speed % 3 == 0 && head != null && !over && !paused) {
            time++;
            
            //When the snake is facing upward
            snakeParts.add(new Point(head.x, head.y));
            if (direction == UP) {

                if (head.y - 1 >= 0 && noTailAt(head.x, head.y - 1)) {
                    head = new Point(head.x, head.y - 1);

                } else {
                    over = true;
                }
            }
            //When the snake is facing downward
            if (direction == DOWN) {

                if (head.y + 1 < 67 && noTailAt(head.x, head.y + 1)) {
                    head = new Point(head.x, head.y + 1);

                } else {
                    over = true;
                }
            }
            //When the snake is in the left direction
            if (direction == LEFT) {
                if (head.x - 1 >= 0 && noTailAt(head.x - 1, head.y)) {
                    head = new Point(head.x - 1, head.y);

                } else {
                    over = true;
                }
            }
            //When the snake is in the right direction
            if (direction == RIGHT) {
                if (head.x + 1 < 80 && noTailAt(head.x + 1, head.y)) {
                    head = new Point(head.x + 1, head.y);
              
                } else {
                    over = true;
                }
            }
            
            //Once the snake eats the cherry it will add it, not lose any
            if (snakeParts.size() > tailLength) {
                //Set to 0, so snake does not shrink 
                snakeParts.remove(0);


            }
      
            if (cherry != null) {
                if (head.equals(cherry)) {

                    //Score goes up by 1 everytime snake eats a cherry
                    score += 1;
                    
                    //One block is added to the tail everytime snake eats cherry
                    tailLength++;

                    //Cherry starts here, and than random location everytime it is eaten 
                    cherry.setLocation(random.nextInt(79), random.nextInt(66));
                }
            }
        }
    }

    public boolean noTailAt(int x, int y) {

        for (Point point : snakeParts) {
            if (point.equals(new Point(x, y))) {
                return false;
            }
        }
        return true;
    }


    @Override
    public void keyPressed(KeyEvent e) {

        //You can use W,S,A,D to play as well as arrow keys
        //int for key is created 
        int keys = e.getKeyCode();

        //If you hit A, or left arrow key, the snake will turnleft
        if ((keys == KeyEvent.VK_A || keys == KeyEvent.VK_LEFT) && direction != RIGHT) {
            direction = LEFT;
        }
        
        //If you hit right button D, or right arrow key, the snake will turn right
        if ((keys == KeyEvent.VK_D || keys == KeyEvent.VK_RIGHT) && direction != LEFT) {
            direction = RIGHT;
        }

        //If you hit up button W, or up key, the snake will go up
        if ((keys == KeyEvent.VK_W || keys == KeyEvent.VK_UP) && direction != DOWN) {
            direction = UP;
        }
        
    //If you hit down button S, or down key, the snake will go down
        if ((keys == KeyEvent.VK_S || keys == KeyEvent.VK_DOWN) && direction != UP) {
            direction = DOWN;
        }
        if (keys == KeyEvent.VK_SPACE) {

            if (over) {
                
               //Game will begin once everything is correct
                startGame();
                
            } else {
                paused = !paused;

            }
        }
    }


  /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // creates an instance of my game
        snake = new Snake();
    }
}



