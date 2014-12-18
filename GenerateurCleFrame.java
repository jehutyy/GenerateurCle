import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.JTextArea;
import javax.swing.SpinnerNumberModel;

public class GenerateurCleFrame extends JFrame implements ActionListener {
	private JTextArea area;
	private JButton bouton;
	private JCheckBox boxMaj;
	private JCheckBox boxDigit;
	private JSpinner rangePass;
	private SpinnerNumberModel model;
	private Key keygen;

	public GenerateurCleFrame() {
		super();
		build();
	}

	public void build() {
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.setSize(220, 75);
		this.setResizable(false);
		this.setTitle("keygen");
		setContentPane(buildPan());
	}

	public JPanel buildPan() {
		/*JPanel maitre */
		JPanel panel = new JPanel(new BorderLayout());
		/*JPanel bouton generer */
		JPanel button = new JPanel(new BorderLayout());
		/*JPanel checkbox majuscule et chiffres et JSpinner */
		JPanel checkbox = new JPanel(new BorderLayout());

		bouton = new JButton("générer");
		bouton.addActionListener(this);

		area = new JTextArea("zone texte");

		boxMaj = new JCheckBox("Majuscules");
		boxDigit = new JCheckBox("Chiffres");
		
		model = new SpinnerNumberModel(0, 0, 100, 1);
		rangePass = new JSpinner(model);
		
		button.add(bouton, BorderLayout.WEST);
		button.add(area);
		checkbox.add(boxMaj, BorderLayout.WEST);
		checkbox.add(boxDigit, BorderLayout.CENTER);
		checkbox.add(rangePass, BorderLayout.EAST);

		panel.add(button, BorderLayout.NORTH);
		panel.add(checkbox, BorderLayout.SOUTH);

		return panel;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Object o = e.getSource();
		if (o == bouton) {
			int i = model.getNumber().intValue();
			if (boxMaj.isSelected() && boxDigit.isSelected() == false) {
				keygen = new Key(i, true, false);
				area.setText(keygen.getCle());
			} else if (boxMaj.isSelected() == false && boxDigit.isSelected()) {
				keygen = new Key(i, false, true);
				area.setText(keygen.getCle());
			} else if (boxMaj.isSelected() && boxDigit.isSelected()) {
				keygen = new Key(i, true, true);
				area.setText(keygen.getCle());
			} else
				keygen = new Key(i, false, false);
			area.setText(keygen.getCle());
		}
	}
}
