import acm.graphics.*;
import acm.program.*;
import java.awt.*;


//NOTE
//So I think I get the programming aspect of this drawing assignment, but man I am so confused on the math of it. I just can't
//seem to be able to wrap my head around the formula I need to get everything in the right places.
//He's kinda ugly


public class RoboBuddy extends GraphicsProgram
{

	private static final int HEAD_HEIGHT = 250;
	private static final int HEAD_WIDTH = 125;
	private static final int EYE_RADIUS = 10;
	private static final int MOUTH_HEIGHT = 40;
	private static final int MOUTH_WIDTH = 100;
	
	public void run()
	{
		makeHead(getWidth(), getHeight());
		makeEyes(getWidth(), getHeight());
		makeMouth(getWidth(), getHeight());
	}
	
	private void makeHead(double xValue, double yValue) 
	{
		double x = (xValue/2) - (HEAD_WIDTH/2);
		double y = (yValue/2) - (HEAD_HEIGHT/2);
	
		GRect head = new GRect(x,  y, HEAD_WIDTH, HEAD_HEIGHT);
		head.setFilled(true);
		head.setFillColor(Color.GRAY);
		add(head);
	}
	
	private void makeEyes(double xValue, double yValue)
	{
		double x = (xValue/2) - (HEAD_WIDTH/2);
		double y = (yValue/2) - (HEAD_HEIGHT/2);
		
		GOval leftEye = new GOval(x + (HEAD_WIDTH/4), y + (HEAD_HEIGHT/4), 2 * EYE_RADIUS, 2 * EYE_RADIUS);
		leftEye.setFilled(true);
		leftEye.setFillColor(Color.YELLOW);
		GOval rightEye = new GOval(x + ((HEAD_WIDTH/4)*3), y + (HEAD_HEIGHT/4), 2 * EYE_RADIUS, 2 * EYE_RADIUS);
		rightEye.setFilled(true);;
		rightEye.setFillColor(Color.YELLOW);
		add(leftEye);
		add(rightEye);
		
	}
	
	private void makeMouth(double xValue, double yValue)
	{
		double x = (xValue/2) - (HEAD_WIDTH/2);
		double y = (yValue/2) - (HEAD_HEIGHT/2);
		
		GRect mouth = new GRect(x +(HEAD_WIDTH/4)/2, y + (HEAD_HEIGHT/4)*3, MOUTH_WIDTH, MOUTH_HEIGHT);
		mouth.setFilled(true);;
		mouth.setFillColor(Color.WHITE);
		add(mouth);
	}

}
