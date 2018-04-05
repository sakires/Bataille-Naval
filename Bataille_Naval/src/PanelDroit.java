import java.awt.BorderLayout;

import javax.swing.JPanel;

public class PanelDroit extends JPanel{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private PannelDroitContenue grille;
	
	public PanelDroit() {
		this.grille = new PannelDroitContenue();
		this.setLayout(new BorderLayout());
		this.add(grille, BorderLayout.CENTER);
	}
}
