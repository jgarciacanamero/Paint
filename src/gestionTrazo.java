import javax.swing.*;
import javax.swing.event.*;


public class gestionTrazo implements ChangeListener{

	tablero t;
	
	public gestionTrazo(tablero t){
		this.t=t;
	}
	
	public void setGrosorActual(int grosor) {
        t.grosorActual = grosor;
	}
	
	public void stateChanged(ChangeEvent e) {
		
		JSpinner source= (JSpinner) e.getSource();	
		setGrosorActual((Integer) source.getValue());
		
	}

}
