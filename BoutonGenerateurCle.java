import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;


public class BoutonGenerateurCle extends JButton implements ActionListener{

	public BoutonGenerateurCle(String nom) {
		super(nom);
		addActionListener(this);
	}
	
	@Override
	public void actionPerformed(ActionEvent arg0) {
		System.out.println("clique bouton");
	}

}
