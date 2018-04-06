
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
//instruction a faire dans l ordre ligne 41 puis 188 et enfin 235
public class GrilleBoutton extends JPanel{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
//////////////////// Label //////////////////////////////
	
	//Label Horizontal
	private JLabel h_a;
	private JLabel h_b;
	private JLabel h_c;
	private JLabel h_d;
	private JLabel h_e;
	private JLabel h_f;
	private JLabel h_g;
	private JLabel h_h;
	private JLabel h_i;
	private JLabel h_j;
	
	//Label vertical
	private JLabel v_0;
	private JLabel v_1;
	private JLabel v_2;
	private JLabel v_3;
	private JLabel v_4;
	private JLabel v_5;
	private JLabel v_6;
	private JLabel v_7;
	private JLabel v_8;
	private JLabel v_9;
	private JLabel v_10;
	
////////////////////Boutton////////////////////////////
	//Colonne a
	private CaseBoutton a_1; // Faire de meme pour tout les autres JButton en remplacant le type JButton par case
	private JButton a_2;
	private JButton a_3;
	private JButton a_4;
	private JButton a_5;
	private JButton a_6;
	private JButton a_7;
	private JButton a_8;
	private JButton a_9;
	private JButton a_10;
	
	//Colonne b
	private JButton b_1;
	private JButton b_2;
	private JButton b_3;
	private JButton b_4;
	private JButton b_5;
	private JButton b_6;
	private JButton b_7;
	private JButton b_8;
	private JButton b_9;
	private JButton b_10;
	
	//Colonne c
	private JButton c_1;
	private JButton c_2;
	private JButton c_3;
	private JButton c_4;
	private JButton c_5;
	private JButton c_6;
	private JButton c_7;
	private JButton c_8;
	private JButton c_9;
	private JButton c_10;
	
	//Colonne d
	private JButton d_1;
	private JButton d_2;
	private JButton d_3;
	private JButton d_4;
	private JButton d_5;
	private JButton d_6;
	private JButton d_7;
	private JButton d_8;
	private JButton d_9;
	private JButton d_10;
	
	//Colonne e
	private JButton e_1;
	private JButton e_2;
	private JButton e_3;
	private JButton e_4;
	private JButton e_5;
	private JButton e_6;
	private JButton e_7;
	private JButton e_8;
	private JButton e_9;
	private JButton e_10;
	
	//Colonne f
	private JButton f_1;
	private JButton f_2;
	private JButton f_3;
	private JButton f_4;
	private JButton f_5;
	private JButton f_6;
	private JButton f_7;
	private JButton f_8;
	private JButton f_9;
	private JButton f_10;
	
	//Colonne g
	private JButton g_1;
	private JButton g_2;
	private JButton g_3;
	private JButton g_4;
	private JButton g_5;
	private JButton g_6;
	private JButton g_7;
	private JButton g_8;
	private JButton g_9;
	private JButton g_10;
	
	//Colonne h
	private JButton h_1;
	private JButton h_2;
	private JButton h_3;
	private JButton h_4;
	private JButton h_5;
	private JButton h_6;
	private JButton h_7;
	private JButton h_8;
	private JButton h_9;
	private JButton h_10;
	
	//Colonne i
	private JButton i_1;
	private JButton i_2;
	private JButton i_3;
	private JButton i_4;
	private JButton i_5;
	private JButton i_6;
	private JButton i_7;
	private JButton i_8;
	private JButton i_9;
	private JButton i_10;
	
	//Colonne j
	private JButton j_1;
	private JButton j_2;
	private JButton j_3;
	private JButton j_4;
	private JButton j_5;
	private JButton j_6;
	private JButton j_7;
	private JButton j_8;
	private JButton j_9;
	private JButton j_10;
	
//////////////////////////// Constructeur //////////////////////////////
	
	public GrilleBoutton() {
		
		//Instantiation de la premiere horizontale
		this.h_a = new JLabel("a");
		this.h_b = new JLabel("b");
		this.h_c = new JLabel("c");
		this.h_d = new JLabel("d");
		this.h_e = new JLabel("e");
		this.h_f = new JLabel("f");
		this.h_g = new JLabel("g");
		this.h_h = new JLabel("h");
		this.h_i = new JLabel("i");
		this.h_j = new JLabel("j");
		
		//Instantiation de la premiere Verticale
		this.v_0 = new JLabel("");
		this.v_1 = new JLabel("1");
		this.v_2 = new JLabel("2");
		this.v_3 = new JLabel("3");
		this.v_4 = new JLabel("4");
		this.v_5 = new JLabel("5");
		this.v_6 = new JLabel("6");
		this.v_7 = new JLabel("7");
		this.v_8 = new JLabel("8");
		this.v_9 = new JLabel("9");
		this.v_10 = new JLabel("10");
		
		//Instantiation Boutton colonne a
		this.a_1 = new CaseBoutton(1, 1); //remplacer les constructeur par case(int numeroColonne(x) ,int numero Ligne (y))
		this.a_2 = new JButton();
		this.a_3 = new JButton();
		this.a_4 = new JButton();
		this.a_5 = new JButton();
		this.a_6 = new JButton();
		this.a_7 = new JButton();
		this.a_8 = new JButton();
		this.a_9 = new JButton();
		this.a_10 = new JButton();
		
		//Instantiation Boutton colonne b
		this.b_1 = new JButton();
		this.b_2 = new JButton();
		this.b_3 = new JButton();
		this.b_4 = new JButton();		
		this.b_5 = new JButton();
		this.b_6 = new JButton();
		this.b_7 = new JButton();
		this.b_8 = new JButton();
		this.b_9 = new JButton();
		this.b_10 = new JButton();
		
		//Instantiation Boutton colonne c
		this.c_1 = new JButton();
		this.c_2 = new JButton();
		this.c_3 = new JButton();
		this.c_4 = new JButton();
		this.c_5 = new JButton();
		this.c_6 = new JButton();		
		this.c_7 = new JButton();
		this.c_8 = new JButton();
		this.c_9 = new JButton();
		this.c_10 = new JButton();
		
		//Instantiation Boutton colonne d
		this.d_1 = new JButton();
		this.d_2 = new JButton();
		this.d_3 = new JButton();
		this.d_4 = new JButton();
		this.d_5 = new JButton();
		this.d_6 = new JButton();
		this.d_7 = new JButton();
		this.d_8 = new JButton();
		this.d_9 = new JButton();
		this.d_10 = new JButton();
		
		//Instantiation Boutton colonne e
		this.e_1 = new JButton();
		this.e_2 = new JButton();
		this.e_3 = new JButton();
		this.e_4 = new JButton();
		this.e_5 = new JButton();
		this.e_6 = new JButton();
		this.e_7 = new JButton();
		this.e_8 = new JButton();
		this.e_9 = new JButton();
		this.e_10 = new JButton();
		
		//Instantiation Boutton colonne f
		this.f_1 = new JButton();
		this.f_2 = new JButton();
		this.f_3 = new JButton();
		this.f_4 = new JButton();
		this.f_5 = new JButton();
		this.f_6 = new JButton();
		this.f_7 = new JButton();
		this.f_8 = new JButton();		
		this.f_9 = new JButton();
		this.f_10 = new JButton();
		
		//Instantiation Boutton colonne g
		this.g_1 = new JButton();
		this.g_2 = new JButton();
		this.g_3 = new JButton();
		this.g_4 = new JButton();
		this.g_5 = new JButton();
		this.g_6 = new JButton();
		this.g_7 = new JButton();
		this.g_8 = new JButton();
		this.g_9 = new JButton();
		this.g_10 = new JButton();
		
		//Instantiation Boutton colonne h
		this.h_1 = new JButton();
		this.h_2 = new JButton();
		this.h_3 = new JButton();
		this.h_4 = new JButton();
		this.h_5 = new JButton();		
		this.h_6 = new JButton();
		this.h_7 = new JButton();
		this.h_8 = new JButton();
		this.h_9 = new JButton();
		this.h_10 = new JButton();
		
		//Instantiation Boutton colonne i
		this.i_1 = new JButton();
		this.i_2 = new JButton();
		this.i_3 = new JButton();
		this.i_4 = new JButton();
		this.i_5 = new JButton();
		this.i_6 = new JButton();
		this.i_7 = new JButton();
		this.i_8 = new JButton();
		this.i_9 = new JButton();
		this.i_10 = new JButton();
		
		//Instantiation Boutton colonne j
		this.j_1 = new JButton();
		this.j_2 = new JButton();
		this.j_3 = new JButton();
		this.j_4 = new JButton();
		this.j_5 = new JButton();
		this.j_6 = new JButton();
		this.j_7 = new JButton();
		this.j_8 = new JButton();
		this.j_9 = new JButton();
		this.j_10 = new JButton();
		
		//Declaration du layout
		this.setLayout(new GridLayout(11,11));
		
		//Ligne 1
		this.add(v_0);
		this.add(h_a);
		this.add(h_b);
		this.add(h_c);
		this.add(h_d);
		this.add(h_e);
		this.add(h_f);
		this.add(h_g);
		this.add(h_h);
		this.add(h_i);
		this.add(h_j);
		
		//Ligne 2
		this.add(v_1);
		this.add(a_1.getBoutton()); //ajouter .getBoutton() pour les add des variables ne commencant pas par v_* 
		this.add(b_1);
		this.add(c_1);
		this.add(d_1);
		this.add(e_1);
		this.add(f_1);
		this.add(g_1);
		this.add(h_1);
		this.add(i_1);
		this.add(j_1);
		
		//Ligne 3
		this.add(v_2);
		this.add(a_2);
		this.add(b_2);
		this.add(c_2);
		this.add(d_2);
		this.add(e_2);
		this.add(f_2);
		this.add(g_2);
		this.add(h_2);
		this.add(i_2);
		this.add(j_2);
		
		//Ligne 4
		this.add(v_3);
		this.add(a_3);
		this.add(b_3);
		this.add(c_3);
		this.add(d_3);
		this.add(e_3);
		this.add(f_3);
		this.add(g_3);
		this.add(h_3);
		this.add(i_3);
		this.add(j_3);
		
		//Ligne 5
		this.add(v_4);
		this.add(a_4);
		this.add(b_4);
		this.add(c_4);
		this.add(d_4);
		this.add(e_4);
		this.add(f_4);
		this.add(g_4);
		this.add(h_4);
		this.add(i_4);
		this.add(j_4);
		
		//Ligne 6
		this.add(v_5);
		this.add(a_5);
		this.add(b_5);
		this.add(c_5);
		this.add(d_5);
		this.add(e_5);
		this.add(f_5);
		this.add(g_5);
		this.add(h_5);
		this.add(i_5);
		this.add(j_5);
		
		//Ligne 7
		this.add(v_6);
		this.add(a_6);
		this.add(b_6);
		this.add(c_6);
		this.add(d_6);
		this.add(e_6);
		this.add(f_6);
		this.add(g_6);
		this.add(h_6);
		this.add(i_6);
		this.add(j_6);
		
		//Ligne 8
		this.add(v_7);
		this.add(a_7);
		this.add(b_7);
		this.add(c_7);
		this.add(d_7);
		this.add(e_7);
		this.add(f_7);
		this.add(g_7);
		this.add(h_7);
		this.add(i_7);
		this.add(j_7);
		
		//Ligne 9
		this.add(v_8);
		this.add(a_8);
		this.add(b_8);
		this.add(c_8);
		this.add(d_8);
		this.add(e_8);
		this.add(f_8);
		this.add(g_8);
		this.add(h_8);
		this.add(i_8);
		this.add(j_8);
		
		//Ligne 10
		this.add(v_9);
		this.add(a_9);
		this.add(b_9);
		this.add(c_9);
		this.add(d_9);
		this.add(e_9);
		this.add(f_9);
		this.add(g_9);
		this.add(h_9);
		this.add(i_9);
		this.add(j_9);
		
		//Ligne 11
		this.add(v_10);
		this.add(a_10);		
		this.add(b_10);
		this.add(c_10);
		this.add(d_10);
		this.add(e_10);
		this.add(f_10);
		this.add(g_10);
		this.add(h_10);
		this.add(i_10);
		this.add(j_10);

	}	
}
