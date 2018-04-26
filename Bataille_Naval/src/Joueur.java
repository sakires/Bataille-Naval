import java.util.ArrayList;

public class Joueur {
	private boolean sontTour;
	private ArrayList<Bateau> sesBateau;
	public Joueur(boolean sontTour, ArrayList<Bateau> sesBateau) {
		this.sontTour = sontTour;
		this.sesBateau = sesBateau;
	}
	public void finDeTour() {
		this.sontTour=false;
	}
	public void debutTour() {
		this.sontTour=true;
	}
	public void tirer(Joueur j,int x , int y) {
		for (int i=0 ; i< j.sesBateau.size() ;i++) {
			j.sesBateau.get(i).Toucher(x, y);
			j.couler();			
		}
		
	}
	public void couler() {
		for (int i=0 ; i< this.sesBateau.size() ;i++) {
			if (this.sesBateau.get(i).couler())
				this.sesBateau.remove(i);
		}
	}
}
