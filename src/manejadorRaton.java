import java.awt.Graphics;
import java.awt.Point;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;


public class manejadorRaton implements MouseListener{
	
	tablero t;
	
	
	public manejadorRaton(tablero t){
		this.t=t;
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		 Point p = e.getPoint();
         Graphics g = t.getGraphics();
         g.setColor(t.colorActual); 
         t.point = p;
         g.drawRect(p.x, p.y, t.grosorActual, t.grosorActual);
         g.fillRect(p.x, p.y, t.grosorActual, t.grosorActual);
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

}
