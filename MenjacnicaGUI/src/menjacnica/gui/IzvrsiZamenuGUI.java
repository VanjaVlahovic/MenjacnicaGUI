package menjacnica.gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Toolkit;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JSpinner;
import javax.swing.JList;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JComboBox;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.JSlider;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ButtonGroup;
import java.awt.Dimension;
import java.awt.Cursor;
import javax.swing.event.AncestorListener;
import javax.swing.event.AncestorEvent;
import javax.swing.event.ChangeListener;
import javax.swing.event.ChangeEvent;

public class IzvrsiZamenuGUI extends JFrame {

	private JPanel contentPane;
	private MenjacnicaGUI gp;
	private JLabel lblKupovniKurs;
	private JLabel lblValuta;
	private JLabel lblProdajniKurs;
	private JTextField textFieldKupovniKurs;
	private JTextField textFieldProdajniKurs;
	private JComboBox comboBox;
	private JLabel lblIznos;
	private JLabel lblVrstaTransakcije;
	private JTextField textFieldIznos;
	private JRadioButtonMenuItem rdbtnmntmKupovina;
	private JRadioButtonMenuItem rdbtnmntmProdaja;
	private JSlider slider;
	private JButton btnIzvrsiZamenu;
	private JButton btnOdustani;
	private final ButtonGroup buttonGroup = new ButtonGroup();

	/**
	 * Create the frame.
	 */
	public IzvrsiZamenuGUI(MenjacnicaGUI gp) {
		this.gp = gp;
	
	
	
		createContents();
	}
	private void createContents() {
		setTitle("Izvrsi zamenu");
		setResizable(false);
		setIconImage(Toolkit.getDefaultToolkit().getImage(IzvrsiZamenuGUI.class.getResource("/icons/dollar-conversion-money-exchange-euro-331d8d5e5a6031a7-512x512.png")));
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.add(getLblKupovniKurs());
		contentPane.add(getLblValuta());
		contentPane.add(getLblProdajniKurs());
		contentPane.add(getTextFieldKupovniKurs());
		contentPane.add(getTextFieldProdajniKurs());
		contentPane.add(getComboBox());
		contentPane.add(getLblIznos());
		contentPane.add(getLblVrstaTransakcije());
		contentPane.add(getTextFieldIznos());
		contentPane.add(getRdbtnmntmKupovina());
		contentPane.add(getRdbtnmntmProdaja());
		contentPane.add(getSlider());
		contentPane.add(getBtnIzvrsiZamenu());
		contentPane.add(getBtnOdustani());
	}
	private JLabel getLblKupovniKurs() {
		if (lblKupovniKurs == null) {
			lblKupovniKurs = new JLabel("Kupovni kurs");
			lblKupovniKurs.setBounds(33, 11, 86, 14);
		}
		return lblKupovniKurs;
	}
	private JLabel getLblValuta() {
		if (lblValuta == null) {
			lblValuta = new JLabel("Valuta");
			lblValuta.setBounds(182, 11, 46, 14);
		}
		return lblValuta;
	}
	private JLabel getLblProdajniKurs() {
		if (lblProdajniKurs == null) {
			lblProdajniKurs = new JLabel("Prodajni kurs");
			lblProdajniKurs.setBounds(300, 11, 111, 14);
		}
		return lblProdajniKurs;
	}
	private JTextField getTextFieldKupovniKurs() {
		if (textFieldKupovniKurs == null) {
			textFieldKupovniKurs = new JTextField();
			textFieldKupovniKurs.setEditable(false);
			textFieldKupovniKurs.setBounds(33, 34, 116, 32);
			textFieldKupovniKurs.setColumns(10);
		}
		return textFieldKupovniKurs;
	}
	private JTextField getTextFieldProdajniKurs() {
		if (textFieldProdajniKurs == null) {
			textFieldProdajniKurs = new JTextField();
			textFieldProdajniKurs.setEditable(false);
			textFieldProdajniKurs.setBounds(300, 34, 134, 32);
			textFieldProdajniKurs.setColumns(10);
		}
		return textFieldProdajniKurs;
	}
	private JComboBox getComboBox() {
		if (comboBox == null) {
			comboBox = new JComboBox();
			comboBox.addItem("EUR");
			comboBox.addItem("USD");
			comboBox.addItem("CHF");
			comboBox.setBounds(179, 36, 83, 22);
		}
		return comboBox;
	}
	private JLabel getLblIznos() {
		if (lblIznos == null) {
			lblIznos = new JLabel("Iznos");
			lblIznos.setBounds(33, 103, 111, 14);
		}
		return lblIznos;
	}
	private JLabel getLblVrstaTransakcije() {
		if (lblVrstaTransakcije == null) {
			lblVrstaTransakcije = new JLabel("Vrsta transakcije");
			lblVrstaTransakcije.setBounds(238, 98, 132, 25);
		}
		return lblVrstaTransakcije;
	}
	private JTextField getTextFieldIznos() {
		if (textFieldIznos == null) {
			textFieldIznos = new JTextField();
			textFieldIznos.setBounds(33, 128, 182, 32);
			textFieldIznos.setColumns(10);
		}
		return textFieldIznos;
	}
	private JRadioButtonMenuItem getRdbtnmntmKupovina() {
		if (rdbtnmntmKupovina == null) {
			rdbtnmntmKupovina = new JRadioButtonMenuItem("Kupovina");
			buttonGroup.add(rdbtnmntmKupovina);
			rdbtnmntmKupovina.setBounds(248, 122, 117, 21);
		}
		return rdbtnmntmKupovina;
	}
	private JRadioButtonMenuItem getRdbtnmntmProdaja() {
		if (rdbtnmntmProdaja == null) {
			rdbtnmntmProdaja = new JRadioButtonMenuItem("Prodaja");
			buttonGroup.add(rdbtnmntmProdaja);
			rdbtnmntmProdaja.setBounds(248, 143, 117, 21);
		}
		return rdbtnmntmProdaja;
	}
	private JSlider getSlider() {
		if (slider == null) {
			slider = new JSlider();
			slider.addChangeListener(new ChangeListener() {
				public void stateChanged(ChangeEvent arg0) {
					textFieldIznos.setText(Integer.toString(slider.getValue()));
				}
			});
			slider.setMajorTickSpacing(10);
			slider.setMinorTickSpacing(5);
			slider.setOpaque(false);
			slider.setSnapToTicks(true);
			slider.setValueIsAdjusting(true);
			slider.setPaintLabels(true);
			slider.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
			slider.setPaintTicks(true);
			slider.setToolTipText("");
			slider.setName("");
			slider.setBounds(84, 171, 286, 52);
		}
		return slider;
	}
	private JButton getBtnIzvrsiZamenu() {
		if (btnIzvrsiZamenu == null) {
			btnIzvrsiZamenu = new JButton("Izvrsi zamenu");
			btnIzvrsiZamenu.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					String transakcija;
					if (rdbtnmntmKupovina.isSelected())
						transakcija = "kupovina";
					else
						transakcija = "prodaja";
					String kurs = "Naziv: "+comboBox.getSelectedItem()+" Iznos: "+textFieldIznos.getText()+
							" Transakcija: "+transakcija;
					gp.dodaj(kurs);
					dispose();					
				}
			});
			btnIzvrsiZamenu.setPreferredSize(new Dimension(120, 46));
			btnIzvrsiZamenu.setBounds(33, 234, 150, 33);
		}
		return btnIzvrsiZamenu;
	}
	private JButton getBtnOdustani() {
		if (btnOdustani == null) {
			btnOdustani = new JButton("Odustani");
			btnOdustani.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					dispose();
				}
			});
			btnOdustani.setPreferredSize(new Dimension(120, 46));
			btnOdustani.setBounds(258, 234, 150, 33);
		}
		return btnOdustani;
	}
}
