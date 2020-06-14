package Bri;

public class Client {
public static void main(String[] args) {
	Color color;
	Pen pen;
	
	color=(Color)XMLUtilPen.getBean("color");
	pen=(Pen)XMLUtilPen.getBean("Pen");
	
	pen.setColor(color);
    pen.draw("œ ª®");
    }
}
