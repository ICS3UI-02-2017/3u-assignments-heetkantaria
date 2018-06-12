package snakeGame;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Point;
import javax.swing.JPanel;

@SuppressWarnings("serial")
/**
 * @author kanth4624
 */
public class RenderPanel extends JPanel {
    private Object frame;

    @Override
    protected void paintComponent(Graphics g) {

        // always clear the screen first!
        g.clearRect(0, 0, WIDTH, HEIGHT);

        //set background color black
        g.setColor(Color.BLACK);
         
        //create two fonts set to Arial
        Font biggerFont = new Font("Arial", Font.BOLD, 20);
        Font biggerFont2 = new Font("Arial", Font.BOLD, 30);

        //create a snake
        Snake snake = Snake.snake;
        g.fillRect(0, 0, 900, 800);

        //set snake color to yellow
        g.setColor(Color.YELLOW);

        //the snake begins from the top corner
        for (Point point : snake.snakeParts) {
            g.fillRect(point.x * Snake.SCALE, point.y * Snake.SCALE, Snake.SCALE, Snake.SCALE);
        }
        g.fillRect(snake.head.x * Snake.SCALE, snake.head.y * Snake.SCALE, Snake.SCALE, Snake.SCALE);

        //The cherry will be randomnly placed in the area
        //cherry color is set red
        g.setColor(Color.RED);
        g.fillRect(snake.cherry.x * Snake.SCALE, snake.cherry.y * Snake.SCALE, Snake.SCALE, Snake.SCALE);

        //displays score, length of snake, and time you are playing in seconds, on the screen
        //add bigger font, and color 
        g.setFont(biggerFont);
        String string = "SCORE: " + snake.score + " LENGTH: " + snake.tailLength + " TIME: " + snake.time / 20;
        //set color white
        g.setColor(Color.WHITE);
        //Centered at the top 
        g.drawString(string, (int) (getWidth() / 2.5 - string.length() * 2f), 30);

        //Displays game over when you lose
        g.setFont(biggerFont2);
        g.setColor(Color.CYAN);
        string = " GAME OVER! ";
        //Hit space to play again
        
        
        //The spot where "Game Over" is located
        if (snake.over) {
            //Centered in the middle
            g.drawString(string, (int) (getWidth() / 2.4 - string.length() * 2f), (int) snake.dim.getHeight() / 3);
        }

        //hit space button to pause the game
        //add bigger font and color
        g.setFont(biggerFont2);
        g.setColor(Color.CYAN);
        string = "PAUSED ";
        //The spot where "Pause" is located
        if (snake.paused && !snake.over) {
            //centerd in the middle
            g.drawString(string, (int) (getWidth() / 2.3 - string.length() * 2f), (int) snake.dim.getHeight() / 3);
        }
    }
}
