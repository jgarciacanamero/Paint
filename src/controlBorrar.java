import java.awt.event.*;



public class controlBorrar implements ActionListener{

	tablero t;
	
	public controlBorrar (tablero t){
		
		this.t=t;
	}
	
	public void actionPerformed(ActionEvent e){
		
		t.repaint();
	}

}
