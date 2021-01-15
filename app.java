import java.awt.*;
import java.applet.*;
public class app extends Applet
{ 
	int x1[]={20,120,200,20};
	int y1[]={20,120,20,20};
	int n1=4;
	public void paint(Graphics g)
	{
	g.setColor(Color.green); 
	g.drawPolygon(x1,y1,n1); 
	g.fillPolygon(x1,y1,n1);
	g.setColor(Color.red); 
	g.drawRect(200,20,300,80);
	g.setColor(Color.blue); 
	g.fillOval(310,20,410,120);
	g.drawLine(450,50,600,50);
	}
}
