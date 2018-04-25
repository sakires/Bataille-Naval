import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class CaseBoutton extends JButton implements ActionListener{

	private int x;//numero de la  colonne  
	private int y ;//numero de la ligne
	public CaseBoutton( int x, int y) {

		this.x = x;
		this.y = y;
	}


	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println(this.x);
		
	}
}
