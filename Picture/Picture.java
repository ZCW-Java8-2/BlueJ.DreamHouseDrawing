
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
    private Circle moon;
    private Square window2;
    private Square windowOutline;
    private Square window2Outline;
    private Square background;
    private Circle pumpkin;
    private Circle pumpkinLine;
    private Circle pumpkinLine2;
    private Circle pumpkinLine3;
    private Circle pumpkinLeft;
    private Circle pumpkinRight;
    private Triangle leftEye;
    private Triangle rightEye;
    private Circle smile;
    private Circle smileBlock;
    private Square road;
    private Square roadLine;
    private Triangle roof2;
    private Square door;
    private Square doorFrame;
    private Circle doorArc;
    private Circle doorArcLine;
    private Square doorLine;
    private Square doorHandle;
    private Square doorHandle2;
    private Square tombstone1;
    private Square tombstone11;
    private Square tombstone2;
    private Square tombstone22;
    private Square tombstone3;
    private Square tombstone33;
    private Square tombstone1ArcBlock;
    private Circle tombstone1Arc;
    private Circle tombstone2Arc;
    private Circle tombstone3Arc;
    private Square tombstone2ArcBlock;
    private Square tombstone3ArcBlock;
    private Triangle roofOutline;
    private Triangle tree1;
    private Triangle tree2;
    private Triangle tree3;
    private Triangle tree4;
    private Triangle tree5;
    private Triangle tree6;

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
        background = new Square();
        background.width = 300;
        background.height = 300;
        background.xPosition = 0;
        background.yPosition = 0;
        background.color = "black";
        background.makeVisible();
        
        sun = new Circle();
        sun.changeColor("yellow");
        sun.moveHorizontal(190);
        sun.moveVertical(-25);
        sun.changeSize(60);
        sun.makeVisible();
        
        moon = new Circle();
        moon.changeColor("black");
        moon.moveHorizontal(188);
        moon.moveVertical(-22);
        moon.changeSize(55);
        moon.makeVisible();
        
        wall = new Square();
        wall.xPosition = 150;
        wall.yPosition = 120;
        wall.width = 100;
        wall.height = 130;
        wall.makeVisible();
        
        tree1 = new Triangle();
        tree1.changeSize(130,15);
        tree1.xPosition = 270;
        tree1.yPosition = 120;
        tree1.makeVisible();
        
        tree2 = new Triangle();
        tree2.changeSize(78,9);
        tree2.xPosition = 130;
        tree2.yPosition = 100;
        tree2.makeVisible();
        
        tree3 = new Triangle();
        tree3.changeSize(75,8);
        tree3.xPosition = 30;
        tree3.yPosition = 90;
        tree3.makeVisible();
        
        tree4 = new Triangle();
        tree4.changeSize(72,8);
        tree4.xPosition = 50;
        tree4.yPosition = 80;
        tree4.makeVisible();
        
        tree5 = new Triangle();
        tree5.changeSize(69,7);
        tree5.xPosition = 100;
        tree5.yPosition = 70;
        tree5.makeVisible();
        
        tree6 = new Triangle();
        tree6.changeSize(66,7);
        tree6.xPosition = 80;
        tree6.yPosition = 60;
        tree6.makeVisible();
        
        doorArcLine = new Circle();
        doorArcLine.xPosition = 184;
        doorArcLine.yPosition = 161;
        doorArcLine.changeColor("black");
        doorArcLine.diameter = 32;
        doorArcLine.makeVisible();

        doorArc = new Circle();
        doorArc.xPosition = 185;
        doorArc.yPosition = 162;
        doorArc.changeColor("white");
        doorArc.diameter = 30;
        doorArc.makeVisible();
                
        doorFrame = new Square();
        doorFrame.xPosition = 174;
        doorFrame.yPosition = 174;
        doorFrame.width = 52;
        doorFrame.height = 72;
        doorFrame.changeColor("black");
        doorFrame.makeVisible();
        
        door = new Square();
        door.xPosition = 175;
        door.yPosition = 175;
        door.width = 50;
        door.height = 70;
        door.changeColor("yellow");
        door.makeVisible();
        
        doorLine = new Square();
        doorLine.xPosition = 200;
        doorLine.yPosition = 175;
        doorLine.width = 1;
        doorLine.height = 70;
        doorLine.changeColor("black");
        doorLine.makeVisible();
        
        doorHandle = new Square();
        doorHandle.xPosition = 196;
        doorHandle.yPosition = 210;
        doorHandle.width = 2;
        doorHandle.height = 2;
        doorHandle.changeColor("black");
        doorHandle.makeVisible();
        
        doorHandle2 = new Square();
        doorHandle2.xPosition = 203;
        doorHandle2.yPosition = 210;
        doorHandle2.width = 2;
        doorHandle2.height = 2;
        doorHandle2.changeColor("black");
        doorHandle2.makeVisible();
        
        pumpkinLine2 = new Circle();
        pumpkinLine2.changeColor("black");
        pumpkinLine2.xPosition = 109;
        pumpkinLine2.yPosition = 214;
        pumpkinLine2.changeSize(24);
        pumpkinLine2.makeVisible();
        
        pumpkinLeft = new Circle();
        pumpkinLeft.changeColor("yellow");
        pumpkinLeft.xPosition = 110;
        pumpkinLeft.yPosition = 215;
        pumpkinLeft.changeSize(22);
        pumpkinLeft.makeVisible();
        
        pumpkinLine3 = new Circle();
        pumpkinLine3.changeColor("black");
        pumpkinLine3.xPosition = 123;
        pumpkinLine3.yPosition = 214;
        pumpkinLine3.changeSize(24);
        pumpkinLine3.makeVisible();
        
        pumpkinRight = new Circle();
        pumpkinRight.changeColor("yellow");
        pumpkinRight.xPosition = 124;
        pumpkinRight.yPosition = 215;
        pumpkinRight.changeSize(22);
        pumpkinRight.makeVisible();
        
        pumpkinLine = new Circle();
        pumpkinLine.changeColor("black");
        pumpkinLine.xPosition = 114;
        pumpkinLine.yPosition = 212;
        pumpkinLine.changeSize(27);
        pumpkinLine.makeVisible();
        
        pumpkin = new Circle();
        pumpkin.changeColor("yellow");
        pumpkin.xPosition = 115;
        pumpkin.yPosition = 213;
        pumpkin.changeSize(25);
        pumpkin.makeVisible();
        
        smile = new Circle();
        smile.changeColor("black");
        smile.xPosition = 119;
        smile.yPosition = 218;
        smile.changeSize(15);
        smile.makeVisible();
        
        smileBlock = new Circle();
        smileBlock.changeColor("yellow");
        smileBlock.xPosition = 119;
        smileBlock.yPosition = 216;
        smileBlock.changeSize(15);
        smileBlock.makeVisible();
        
        leftEye = new Triangle();
        leftEye.changeColor("black");
        leftEye.changeSize(7, 7);
        leftEye.xPosition = 122;
        leftEye.yPosition = 217;
        leftEye.makeVisible();
        
        rightEye = new Triangle();
        rightEye.changeColor("black");
        rightEye.changeSize(7, 7);
        rightEye.xPosition = 132;
        rightEye.yPosition = 217;
        rightEye.makeVisible();

        roof = new Triangle();
        roof.changeSize(120, 120);
        roof.moveHorizontal(150);
        roof.moveVertical(5);
        roof.color = "yellow";
        roof.makeVisible();
        
        roofOutline = new Triangle();
        roofOutline.changeSize(115, 115);
        roofOutline.moveHorizontal(150);
        roofOutline.moveVertical(11);
        roofOutline.changeColor("black");
        roofOutline.makeVisible();
        
        roof2 = new Triangle();
        roof2.changeSize(110, 110);
        roof2.moveHorizontal(150);
        roof2.moveVertical(15);
        roof2.changeColor("red");
        roof2.makeVisible();
        
        windowOutline = new Square();
        windowOutline.changeColor("black");
        windowOutline.xPosition = 194;
        windowOutline.yPosition = 79;
        windowOutline.height = 52;
        windowOutline.width = 12;
        windowOutline.makeVisible();
        
        window2Outline = new Square();
        window2Outline.changeColor("black");
        window2Outline.xPosition = 184;
        window2Outline.yPosition = 89;
        window2Outline.height = 12;
        window2Outline.width = 32;
        window2Outline.makeVisible();
        
        window = new Square();
        window.changeColor("white");
        window.xPosition = 195;
        window.yPosition = 80;
        window.height = 50;
        window.width = 10;
        window.makeVisible();
        
        window2 = new Square();
        window2.changeColor("white");
        window2.xPosition = 185;
        window2.yPosition = 90;
        window2.height = 10;
        window2.width = 30;
        window2.makeVisible();
        
        tombstone1Arc = new Circle();
        tombstone1Arc.xPosition = 80;
        tombstone1Arc.yPosition = 204;
        tombstone1Arc.changeColor("magenta");
        tombstone1Arc.diameter = 25;
        tombstone1Arc.makeVisible();
        
        tombstone1ArcBlock = new Square();
        tombstone1ArcBlock.changeColor("black");
        tombstone1ArcBlock.xPosition = 80;
        tombstone1ArcBlock.yPosition = 210;
        tombstone1ArcBlock.height = 20;
        tombstone1ArcBlock.width = 30;
        tombstone1ArcBlock.makeVisible();
        
        tombstone1 = new Square();
        tombstone1.changeColor("green");
        tombstone1.xPosition = 90;
        tombstone1.yPosition = 180;
        tombstone1.height = 30;
        tombstone1.width = 6;
        tombstone1.makeVisible();
        
        tombstone11 = new Square();
        tombstone11.changeColor("green");
        tombstone11.xPosition = 84;
        tombstone11.yPosition = 187;
        tombstone11.height = 6;
        tombstone11.width = 18;
        tombstone11.makeVisible();
        
        tombstone2Arc = new Circle();
        tombstone2Arc.xPosition = 55;
        tombstone2Arc.yPosition = 205;
        tombstone2Arc.changeColor("blue");
        tombstone2Arc.diameter = 25;
        tombstone2Arc.makeVisible();
        
        tombstone2ArcBlock = new Square();
        tombstone2ArcBlock.changeColor("black");
        tombstone2ArcBlock.xPosition = 55;
        tombstone2ArcBlock.yPosition = 210;
        tombstone2ArcBlock.height = 20;
        tombstone2ArcBlock.width = 30;
        tombstone2ArcBlock.makeVisible();
        
        tombstone2 = new Square();
        tombstone2.changeColor("yellow");
        tombstone2.xPosition = 65;
        tombstone2.yPosition = 180;
        tombstone2.height = 30;
        tombstone2.width = 6;
        tombstone2.makeVisible();
        
        tombstone22 = new Square();
        tombstone22.changeColor("yellow");
        tombstone22.xPosition = 59;
        tombstone22.yPosition = 187;
        tombstone22.height = 6;
        tombstone22.width = 18;
        tombstone22.makeVisible();
        
        tombstone3Arc = new Circle();
        tombstone3Arc.xPosition = 30;
        tombstone3Arc.yPosition = 205;
        tombstone3Arc.changeColor("white");
        tombstone3Arc.diameter = 25;
        tombstone3Arc.makeVisible();
        
        tombstone3ArcBlock = new Square();
        tombstone3ArcBlock.changeColor("black");
        tombstone3ArcBlock.xPosition = 30;
        tombstone3ArcBlock.yPosition = 210;
        tombstone3ArcBlock.height = 20;
        tombstone3ArcBlock.width = 30;
        tombstone3ArcBlock.makeVisible();
        
        tombstone3 = new Square();
        tombstone3.changeColor("red");
        tombstone3.xPosition = 40;
        tombstone3.yPosition = 180;
        tombstone3.height = 30;
        tombstone3.width = 6;
        tombstone3.makeVisible();
        
        tombstone33 = new Square();
        tombstone33.changeColor("red");
        tombstone33.xPosition = 34;
        tombstone33.yPosition = 187;
        tombstone33.height = 6;
        tombstone33.width = 18;
        tombstone33.makeVisible();
        
        roadLine = new Square();
        roadLine.width = 300;
        roadLine.height = 10;
        roadLine.xPosition = 0;
        roadLine.yPosition = 240;
        roadLine.changeColor("blue");
        roadLine.makeVisible();
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
            window2.changeColor("white");
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
            window2.changeColor("blue");
            roof.changeColor("green");
            sun.changeColor("yellow");
        }
    }

}
