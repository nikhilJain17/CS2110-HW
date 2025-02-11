import java.awt.*;

import javax.swing.*;


/**
 * 
 * This class is used to draw lines onto the JPanel
 * 
 * Each path connecting a village is a line.
 * 
 * This class is only the visual representation of that.
 * 
 * @author Nick
 *
 */

public class Line extends JComponent {
	
	int x1, x2, y1, y2;
	
	public Line(int x1, int x2, int y1, int y2) {
		this.x1 = x1;
		this.x2 = x2;
		this.y1 = y1;
		this.y2 = y2;
	}
	
	// Draw the line
	public void paint(Graphics g) {
		
		final int OFFSET = 25; // to draw in middle of button
		
//        System.out.println(this.x1 + ", " + this.y1 + "--" + this.x2 + ", " + this.y2);

        Graphics2D g2 = (Graphics2D) g;
        
        g2.setColor(Color.BLACK);
        
        BasicStroke smoothStroke = new BasicStroke(15, BasicStroke.CAP_BUTT, BasicStroke.JOIN_BEVEL);
//        smoothStroke.
        g2.setStroke(smoothStroke);
        
         int BORDEROFFSET = 0; // yolo
        
        // draw a thick black line as the border
        g2.drawLine(x1 + OFFSET, y1 + OFFSET, x2 + OFFSET, y2 + OFFSET);
//        g2.drawLine(x1 + OFFSET, y1 + OFFSET, ((x2 + BORDEROFFSET + OFFSET) +  (x1 + BORDEROFFSET + OFFSET) / 2) ,
//        		((y2 + BORDEROFFSET + OFFSET) +  (y2 + BORDEROFFSET + OFFSET) / 2));
        
        // make a road in the middle
        Color beige = new Color (242, 203, 136);
        g2.setColor(beige);
        BasicStroke borderStroke = new BasicStroke((float) 10);
        g2.setStroke(borderStroke);
        
        
        
//        
         
         /***
          * draw the line from x1, y1 to some point where it is not quite x2, y2, but rather the line stops before that
          * then, draw a triangle as an arrowhead
          * this will show a 1 way road
          */
        
         
//        if (y1 - y2 > 150 && y1 - y2 < 300)
//        	g2.setColor(Color.orange);
        // draw a line above and below to make it appear like a border
        g2.drawLine(x1 - BORDEROFFSET + OFFSET, y1 - BORDEROFFSET + OFFSET, x2 - BORDEROFFSET + OFFSET, y2 - BORDEROFFSET + OFFSET);
//        g2.drawLine(x1 + BORDEROFFSET + OFFSET, y1 + BORDEROFFSET + OFFSET, 
//        		((x2 + BORDEROFFSET + OFFSET) + (x1 + BORDEROFFSET + OFFSET) / 2) ,
//        		((y2 + BORDEROFFSET + OFFSET) + (y2 + BORDEROFFSET + OFFSET) / 2));
        g2.drawLine(x1 + OFFSET, y1 + OFFSET, x2 + OFFSET, y2 + OFFSET);
        
        
        
        
        // draw an arrow pointing the direction of the road
//        g2.setColor(Color.BLUE);
//        BasicStroke thinStroke = new BasicStroke((float) 5);
//        g2.setStroke(thinStroke);
//        int arrowOffset = -10;
//        g2.drawLine(x1 - arrowOffset, y1 - arrowOffset, ((x1 + x2) / 2 ) + arrowOffset, ((y1 + y2) / 2) + arrowOffset);
        
        
//        System.out.println(this.x1 + ", " + this.y1 + "--" + this.x2 + ", " + this.y2);
    }

}
