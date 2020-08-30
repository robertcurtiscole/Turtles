import java.awt.Canvas;
import java.awt.Graphics;
import java.awt.Color;

class Turtle
{
  // instance variables
  private int xLocation;
  private int yLocation;
  private Color color;    // current color

  // what world does this turtle live in?
  private World world;
  private Canvas c;
  private Graphics g;

  // default constructor
  public Turtle()
  {
    this(250, 250);
  }

  // new constructor with 2 parameters
  public Turtle(int x, int y)
  {
    this(x, y, new Color(0, 255, 0));
  }

  // new constructor with 3 parameters
  public Turtle(int x, int y, Color col)
  {
    xLocation = x;
    yLocation = y;
    // get our world and canvas to draw upon
    world = World.getWorld();
    c = World.getCanvas();
    g = c.getGraphics();

    color = col;
    DrawTurtle();
  }

  // change the color of the turtle and her path
  public void setColor(Color newColor)
  {
    color = newColor;
  }

  // draw a crude representation of a turtle
  private void DrawTurtle()
  {
    int turtleLeft = xLocation-8;
    int turtleTop  = yLocation-7;

    g.setColor(color);
    // body
    g.fillOval(turtleLeft, turtleTop, 17, 14);
    // feet
    g.fillOval(turtleLeft+0, turtleTop+0, 4, 4);
    g.fillOval(turtleLeft+14, turtleTop+0, 4, 4);
    g.fillOval(turtleLeft+0, turtleTop+11, 4, 4);
    g.fillOval(turtleLeft+14, turtleTop+11, 4, 4);
    // head - always to right
    g.fillOval(turtleLeft+16, turtleTop+5, 7, 5);
  }

  // move up and draw as we move
  public void moveUp(int distance)
  {
    g.setColor(color);
    // draw a line up
    g.drawLine(xLocation, yLocation, xLocation, yLocation-distance);
    yLocation -= distance;
    DrawTurtle();
  }

  // move down and draw as we move
  public void moveDown(int distance)
  {
    g.setColor(color);
    // draw a line up
    g.drawLine(xLocation, yLocation, xLocation, yLocation+distance);
    yLocation += distance;
    DrawTurtle();
  }

  // move left and draw as we move
  public void moveLeft(int distance)
  {
    g.setColor(color);
    // draw a line up
    g.drawLine(xLocation, yLocation, xLocation-distance, yLocation);
    xLocation -= distance;
    DrawTurtle();
  }

  // move right and draw as we move
  public void moveRight(int distance)
  {
    g.setColor(color);
    // draw a line up
    g.drawLine(xLocation, yLocation, xLocation+distance, yLocation);
    xLocation += distance;
    DrawTurtle();
  }

  // move diagonally any direction
  public void moveXYOffset(int dx, int dy)
  {
    g.setColor(color);
    // draw a line up
    g.drawLine(xLocation, yLocation, xLocation+dx, yLocation+dy);
    xLocation += dx;
    yLocation += dy;
    DrawTurtle();
  }

}