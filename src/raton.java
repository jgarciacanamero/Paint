import java.awt.BasicStroke;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.event.InputEvent;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;



public class raton implements MouseMotionListener{
	
	tablero t;
	
	
	
	public raton(tablero t){
		this.t=t;
	}

	@Override
	public void mouseDragged(MouseEvent e) {
	
		// TODO Auto-generated method stub
		if((e.getModifiers() & InputEvent.BUTTON1_MASK) == InputEvent.BUTTON1_MASK){
		 Point p = e.getPoint();
         Graphics2D g = (Graphics2D) t.getGraphics();
         g.setColor(t.colorActual);
         g.setStroke(new BasicStroke(t.grosorActual));
         g.drawLine(t.point.x, t.point.y, p.x, p.y);
         t.point = p;
		}else{
			Point p = e.getPoint();
	         Graphics2D g = (Graphics2D) t.getGraphics();
	         g.setColor(t.colorActual);
	         g.setStroke(new BasicStroke(t.grosorActual));
	         t.repaint(t.point.x, t.point.y,(t.grosorActual*4),(t.grosorActual*4)); // Multiplico por 4 el grosorActual porque sino cuesta mucho de borrar las lineas dibujadas
	         t.point = p;	
	         
	       
		}
     }
	

	@Override
	public void mouseMoved(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

}
