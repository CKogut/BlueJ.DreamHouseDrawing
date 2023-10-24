/**
 * This class represents a simple picture. You can draw the picture using
 * the draw method. But wait, there's more: being an electronic picture, it
 * can be changed. You can set it to black-and-white display and back to
 * colors (only after it's been drawn, of course).
 *
 * This class was written as an early example for teaching Java with BlueJ.
 * 
 * @author  Michael Kölling and David J. Barnes
 * @version 1.1  (24 May 2001)
 */
public class Picture
{
    private Square sky;
    private Square wall;
    private Square window;
    private Triangle roof;
    private Circle sun;
    private Square grass;

    /**
     * Constructor for objects of class Picture
     */
    public Picture()
    {
        // nothing to do... instance variables are automatically set to null
    }

    /**
     * Draw this picture.
     */
    public void draw()
    {
        sky = new Square();
        sky.changeColor("blue");
        sky.moveHorizontal(-60);
        sky.moveVertical(-50);
        sky.changeSize(300);
        sky.makeVisible();
        
        wall = new Square();
        wall.moveVertical(20);
        wall.changeSize(100);
        wall.changeColor("black");
        wall.makeVisible();
        
        roof = new Triangle();
        roof.changeSize(50, 150);
        roof.moveHorizontal(60);
        roof.moveVertical(20);
        roof.changeColor("magenta");
        roof.makeVisible();

        window = new Square();
        window.changeColor("yellow");
        window.moveHorizontal(20);
        window.moveVertical(50);
        window.makeVisible();

        sun = new Circle();
        sun.changeColor("red");
        sun.moveHorizontal(180);
        sun.moveVertical(80);
        sun.changeSize(60);
        sun.makeVisible();
        
        sky = new Square();
        sky.changeColor("green");
        sky.moveHorizontal(-60);
        sky.moveVertical(120);
        sky.changeSize(300);
        sky.makeVisible();
        
    }

    /**
     * Change this picture to black/white display
     */
    public void setBlackAndWhite()
    {
        if(wall != null)   // only if it's painted already...
        {
            wall.changeColor("black");
            window.changeColor("white");
            roof.changeColor("black");
            sun.changeColor("black");
        }
    }

    /**
     * Change this picture to use color display
     */
    public void setColor()
    {
        if(wall != null)   // only if it's painted already...
        {
            wall.changeColor("red");
            window.changeColor("black");
            roof.changeColor("green");
            sun.changeColor("yellow");
        }
    }

}
