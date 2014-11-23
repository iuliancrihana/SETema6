import controller.Controller;
import model.Model;
import view.View;

/**
 * 
 */

/**
 * @author IulianC
 *
 */
public class Main {
	public static void main(String[] args) {
		View theView = new View();
		Model theModel = new Model();

		Controller theController = new Controller(theModel, theView);
		theView.setVisible(true);
	}
}