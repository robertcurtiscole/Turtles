import javax.swing.JFrame;
import java.awt.Canvas;
import java.awt.Graphics;
import java.awt.Color;

public class World
{
  // instance variables:
  public int    width;
  public int    height;

  private static World singleton = null;  // not really, need a factory
  private static JFrame frmMain;
  private static Canvas cnvs;

  // default constructor
  public World()
  {
    this(800,600);    // call constructor below
  }

  // constructor with two parameters in signature
  public World(int w, int h)
  {
    width = w;
    height = h;
    frmMain = new JFrame();
    frmMain.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frmMain.setSize(width, height);

    cnvs = new Canvas();
    cnvs.setSize(width, height);

    frmMain.add(cnvs);
    frmMain.setVisible(true);

    Graphics g = cnvs.getGraphics();
    g.setColor(new Color(255, 0, 0));
    g.drawString("World", 15, 30);  

    singleton = this;
  }

  public static World getWorld() { return singleton; }
  public static Canvas getCanvas() { return cnvs; }
}