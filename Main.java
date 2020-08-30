import java.awt.Color;

class Main {
  public static void main(String[] args) {
    System.out.println("Hello world!");
    World landOfTurtles = new World();

    // 1. create a turtle
    // use the default constructor for Turtle and the 'new' keyword
    Turtle t1 = new Turtle();

    // 2. move the turtle to draw a line or make a rectangle
    //  You can use methods: moveUp(n), moveDown(n), moveLeft(n), moveRight(n)
    //  n = distance.  The whole world is 600h x 800w
    t1.moveUp(35);
    t1.moveRight(75);
    t1.moveDown(35);
    t1.moveRight(75);

    // 3. Can you write the first letter of your name by moving the turtle?
    // yes, this is impossible to make a curve.
    // try, use moveXYOffset(dx, dy) to draw a diagonal.
    t1.moveXYOffset(60, 60);

    // 4, use another constructor
    // create a second turtle at a different location with a different Color
    // constructor signature:  Turtle(x, y, color)
    // where  color is = new Color(red, green, blue)
    //   and red, green, blue take values 0..255
    Turtle t2 = new Turtle(300, 400, new Color(255, 10, 128));
  }
}