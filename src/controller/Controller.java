/**
 * 
 */
package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import model.Model;
import view.View;

/**
 * @author IulianC
 *
 */
public class Controller {
	private Model mModel;
	private View mView;

	/**
	 * @param mModel
	 * @param mView
	 */
	public Controller(Model mModel, View mView) {
		this.mModel = mModel;
		this.mView = mView;

		this.mView.addOptionListener(new OptionListener());
	}

	public class OptionListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent arg0) {
			String location;
			try {
				location = mView.getLocationChosen();

				mModel.setWeatherDetails(Model.DEFAULT_TEMEPERATURE,
						Model.DEFAULT_WINDSPEED);

				String[] weatherDetails = mModel.getWeatherDetails();
				mView.setWeatherDetails(weatherDetails[0], weatherDetails[1]);
			} catch (Exception e) {

			}

		}
	}

}