package yolocorp.fowlercastle.GUI;
import java.awt.*;
import javax.swing.*;

import yolocorp.fowlercastle.model.Coffre;
import yolocorp.fowlercastle.observateur.Observateur;

public class FenetreEtat extends JFrame implements Observateur{

	private JTextField txtEtat;

	public FenetreEtat()
	{
		setTitle("Etat du coffre");
		setBounds(500,500,190,130);
		Container contentPane = getContentPane();
		contentPane.setLayout(new FlowLayout());
		
		JLabel labEtat = new JLabel("ETAT");
		contentPane.add(labEtat);
		txtEtat = new JTextField(15);
		contentPane.add(txtEtat);
		setVisible(true);
		afficherEtat("CacheParBibliotheque");
	}
	
	public void afficherEtat(String etat)
	{
		txtEtat.setText(etat);
	}

	@Override
	public void update(Coffre coffre) {
		afficherEtat(coffre.nomEtat());
	}
}