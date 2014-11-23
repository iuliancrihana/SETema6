/**
 * 
 */
package view;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.WindowConstants;

import controller.Controller.OptionListener;

/**
 * @author IulianC
 *
 */
public class View extends JFrame {
	private static final long serialVersionUID = -5758555454500685115L;

	// View Components
	private JComboBox<String> mComboBox = new JComboBox<String>();
	private JTextField mTemperatureTf = new JTextField(20);
	private JTextField mWindSpeedTf = new JTextField(20);
	private JButton mChooseBtn = new JButton("Ok");
	private JButton mUpdateBtn = new JButton("Update");

	/**
	 * Constructor
	 */
	public View() {
		JLabel labelLocatie = new JLabel("Locatie");
		labelLocatie.setBounds(10, 8, 82, 14);

		mComboBox.setModel(new DefaultComboBoxModel(new String[] { "Bucuresti",
				"Altele" }));
		mComboBox.setBounds(102, 5, 126, 20);

		JLabel labelTemp = new JLabel("Temperatura");
		labelTemp.setBounds(10, 58, 77, 14);

		mTemperatureTf.setEditable(false);
		mTemperatureTf.setBounds(102, 55, 126, 20);

		JLabel labelVant = new JLabel("Viteza Vant");
		labelVant.setBounds(10, 111, 77, 14);

		mWindSpeedTf.setEditable(false);
		mWindSpeedTf.setBounds(102, 105, 126, 20);

		mChooseBtn.setBounds(10, 170, 89, 23);

		mUpdateBtn.setBounds(139, 170, 89, 23);

		// Layout the components.
		JPanel content = new JPanel();
		content.setLayout(null);
		content.add(labelLocatie);
		content.add(mComboBox);
		content.add(labelTemp);
		content.add(mTemperatureTf);
		content.add(labelVant);
		content.add(mWindSpeedTf);
		content.add(mChooseBtn);
		content.add(mUpdateBtn);

		// Finalize layout
		this.setContentPane(content);
		this.pack();

		this.setSize(260, 240);
		this.setTitle("Vreme");
		this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
	}

	public String getLocationChosen() {
		return mComboBox.getSelectedItem().toString();
	}

	public void setWeatherDetails(String temperature, String windSpeed) {
		mTemperatureTf.setText(temperature);
		mWindSpeedTf.setText(windSpeed);
	}

	public void addOptionListener(OptionListener optionListener) {
		mChooseBtn.addActionListener(optionListener);
		mUpdateBtn.addActionListener(optionListener);

	}
}