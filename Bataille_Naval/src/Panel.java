import java.awt.BorderLayout;

import javax.swing.JPanel;

public class Panel extends JPanel{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private PlacemenGrille cote_droit;
	private PlacemenGrille cote_gauche;
	private PanelSud sud;
	
	public Panel() {
		this.cote_droit = new PlacemenGrille();
		this.cote_gauche = new PlacemenGrille();
		this.sud = new PanelSud();
		//cote_gauche.setBorder(BorderFactory.createLineBorder(Color.black));

		this.setLayout(new BorderLayout());
		this.add(cote_droit, BorderLayout.EAST);
		this.add(cote_gauche, BorderLayout.WEST);
		this.add(sud, BorderLayout.SOUTH);
	}
}
