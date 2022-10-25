
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
    private Square wall;
    private Square window;
    private Triangle roof;
    private Circle sun;
    private Square window2;
    private Square door;
    private Triangle tree;
    private Square treeTrunk;

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
        wall = new Square();
        wall.moveVertical(80);
        wall.changeSize(100);
        wall.makeVisible();

        window = new Square();
        window.changeColor("black");
        window.moveHorizontal(10);
        window.moveVertical(100);
        window.makeVisible();

        roof = new Triangle();
        roof.changeSize(50, 140);
        roof.moveHorizontal(60);
        roof.moveVertical(70);
        roof.makeVisible();

        sun = new Circle();
        sun.changeColor("yellow");
        sun.moveHorizontal(180);
        sun.moveVertical(-10);
        sun.changeSize(60);
        sun.makeVisible();
        
        window2 = new Square();
        window2.changeColor("black");
        window2.moveHorizontal(60);
        window2.moveVertical(100);
        window2.makeVisible();
        
        door = new Square();
        door.changeColor("black");
        door.moveHorizontal(35);
        door.moveVertical(150);
        door.makeVisible();
        
        door = new Square();
        door.changeColor("black");
        door.moveHorizontal(35);
        door.moveVertical(135);
        door.makeVisible();
        
        
        treeTrunk = new Square();
        treeTrunk.changeColor("brown");
        treeTrunk.moveHorizontal(195);
        treeTrunk.moveVertical(200);
        treeTrunk.makeVisible();
        
        tree = new Triangle();
        tree.changeSize(140, 70);
        tree.moveHorizontal(220);
        tree.moveVertical(105);
        tree.makeVisible();
        
        
        
        
        
        
        
        
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
