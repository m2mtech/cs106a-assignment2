/*
 * File: CenteredText.java
 * -----------------------
 * This programs displays a message centered in the graphics window.
 */
import acm.graphics.*;
import acm.program.*;

public class CenteredText extends GraphicsProgram {
	
	public void run() {
		GLabel label = new GLabel("CS106A rocks my socks!");
		label.setFont("SansSerif-28");
		double x = (getWidth() - label.getWidth()) / 2;
		double y = (getHeight() + label.getAscent()) / 2;
		label.setLocation(x, y);
		add(label);
	} 

}