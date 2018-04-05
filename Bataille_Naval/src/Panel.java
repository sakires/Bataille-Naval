import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Panel extends JPanel{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private PanelDroit cote_droit;
	private JLabel cote_gauche;
	private PanelSud sud;
	
	public Panel() {
		this.cote_droit = new PanelDroit();
		this.cote_gauche = new JLabel();
		this.sud = new PanelSud();
		cote_gauche.setBorder(BorderFactory.createLineBorder(Color.black));

		this.setLayout(new BorderLayout());
		this.add(cote_droit, BorderLayout.EAST);
		this.add(cote_gauche, BorderLayout.WEST);
		this.add(sud, BorderLayout.SOUTH);
	}
}
