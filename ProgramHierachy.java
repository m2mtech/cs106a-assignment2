/*
 * File: ProgramHierachy.java
 * Name: 
 * Section Leader: 
 * --------------------
 * This file is the starter file for the ProgramHierachy problem.
 */
import acm.graphics.*;
import acm.program.*;

public class ProgramHierachy extends GraphicsProgram {

	private static final int LABEL_WIDTH = 200;
	private static final int LABEL_HEIGHT = 100;
	private static final int HORIZONTAL_GAP = 50;
	private static final int VERTICAL_GAP = 50;
	private static final String LABEL_FONT = "SansSerif-16";

	public void run() {
		double cx = getWidth() / 2;
		double cy = getHeight() / 2;

		double xCenterOfLeftColumn = cx - LABEL_WIDTH - HORIZONTAL_GAP;		
		double xCenterOfRightColumn = cx + LABEL_WIDTH + HORIZONTAL_GAP;		
		double yMiddleOfFirstRow = cy - (LABEL_HEIGHT + VERTICAL_GAP) / 2;
		double yMiddleOfSecondRow = cy + (LABEL_HEIGHT + VERTICAL_GAP) / 2;

		double yBottomOfFirstRow = cy - VERTICAL_GAP / 2;
		double yTopOfSecondRow = cy + VERTICAL_GAP / 2;
		
		drawLabel("Program", cx, yMiddleOfFirstRow);
		drawLabel("GraphicsProgram", xCenterOfLeftColumn, yMiddleOfSecondRow);
		drawLabel("ConsoleProgram", cx, yMiddleOfSecondRow);
		drawLabel("DialogProgram", xCenterOfRightColumn, yMiddleOfSecondRow);

		drawLine(cx, yBottomOfFirstRow, cx, yTopOfSecondRow);
		drawLine(cx, yBottomOfFirstRow, xCenterOfLeftColumn, yTopOfSecondRow);
		drawLine(cx, yBottomOfFirstRow, xCenterOfRightColumn, yTopOfSecondRow);
	}
	
	/**
	 * draw label box centered at given coordinates
	 * @param text
	 * @param x
	 * @param y
	 */
	private void drawLabel(String text, double x, double y) {
		GRect rect = new GRect(
			x - LABEL_WIDTH / 2, y - LABEL_HEIGHT / 2, 
			LABEL_WIDTH, LABEL_HEIGHT
		);
		add(rect);
		GLabel label = new GLabel(text);
		label.setFont(LABEL_FONT);
		label.setLocation(
			x - label.getWidth() / 2,
			y + label.getAscent() / 2
		);
		add(label);		
	}
	
	/**
	 * draw line between two points
	 * @param x1
	 * @param y1
	 * @param x2
	 * @param y2
	 */
	private void drawLine(double x1, double y1, double x2, double y2) {
		GLine line = new GLine(x1, y1, x2, y2);
		add(line);
	}

}

