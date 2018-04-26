import java.util.ArrayList;

public class Bateau {
	private int taille;
	private ArrayList<MorceauBateau> composantBateau;
	
	public Bateau(int taille, ArrayList<MorceauBateau> composantBateau) {
		this.taille = taille;
		this.composantBateau = composantBateau;
	}
	
	public void Toucher(int x, int y) {
		for (int i=0;i<composantBateau.size();i++) {
			if(composantBateau.get(i).toucher(x, y))
				composantBateau.remove(i);
		}
	}
	
	public boolean couler() {
		boolean couler=true;
		if(composantBateau.isEmpty())
			couler = true;		
		return couler;
		
	}
	
}

