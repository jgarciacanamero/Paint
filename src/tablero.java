import java.awt.Color;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import javax.swing.*;


public class tablero extends JApplet {

	JLabel color,grosor;
	JButton limpiar;
	JRadioButton azul,amarillo,rojo;
	JSpinner trazo;
	int grosorActual=1;
	Color colorActual;
	Point point=null;
	
	public void init(){
		this.getContentPane().setLayout(null);
		
		color= new JLabel("Color Trazo:");
		color.setBounds(50, 5, 100, 26);
		this.getContentPane().add(color);
		
		grosor= new JLabel("Grosor Trazo:");
		grosor.setBounds(240, 5, 100, 26);
		this.getContentPane().add(grosor);
		
		limpiar= new JButton("Limpiar");
		limpiar.setBounds(400, 25, 100, 26);
		this.getContentPane().add(limpiar);
		
		azul= new JRadioButton("Azul");
		azul.setBounds(5, 30, 55, 26);
		this.getContentPane().add(azul);
		
		amarillo= new JRadioButton("Amarillo");
		amarillo.setBounds(60, 30, 85, 26);
		this.getContentPane().add(amarillo);
		
		rojo= new JRadioButton("Rojo");
		rojo.setBounds(140, 30, 60, 26);
		this.getContentPane().add(rojo);
		
		ButtonGroup rb= new ButtonGroup();
		rb.add(azul);
		rb.add(amarillo);
		rb.add(rojo);
		
		trazo= new JSpinner();
		trazo.setBounds(280, 30, 50, 26);
		trazo.setModel(new SpinnerNumberModel(grosorActual,1,10,grosorActual));
		this.getContentPane().add(trazo);
		
		//manejadores
		
		limpiar.addActionListener(new controlBorrar(this));
		
		azul.addActionListener(new coloresTrazo(Color.blue));
		amarillo.addActionListener(new coloresTrazo(Color.yellow));
		rojo.addActionListener(new coloresTrazo(Color.red));
		
		trazo.addChangeListener(new gestionTrazo(this));
		
		
		getContentPane().addMouseListener(new manejadorRaton(this));
		getContentPane().addMouseMotionListener(new raton(this));
		
		
	}
	public class coloresTrazo implements ActionListener{
		
		
		Color co;
		

		public coloresTrazo(Color co){
			
			this.co=co;
		}

		
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			setColor(co);
			
		}
		
	}
		public void setColor(Color c) {
		this.colorActual=c;
		
	}

}
		
	

	

