package util;

import java.util.Optional;

import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Alert.AlertType;

public class Alerts {
	TypeAlerts type;

	public Alerts(){
		
	}
	
	public Alerts(TypeAlerts type, String msg, String title) {

		switch (type) {
			case ERROR:
				error(msg, title);
				break;			
			case WARNING:
				warning(msg, title);
				break;
			case INFORMATION:
				information(msg, title);
				break;
	
			default:
				break;
		}
	}

	public void error(String msg, String title) {
		Alert alert = new Alert(AlertType.ERROR);
		alert.setTitle("Error Dialog");
		alert.setHeaderText(title.toUpperCase());
		alert.setContentText(msg + "!");
		alert.showAndWait();
	}

	public ButtonType confirmation(String msg, String title) {
		Alert alert = new Alert(AlertType.CONFIRMATION);
		alert.setTitle("Confirmation Dialog");		
		alert.setHeaderText(title.toUpperCase());
		alert.setContentText(msg + "?");

		Optional<ButtonType> result = alert.showAndWait();
		
		return result.get();
		/*if (result.get() == ButtonType.OK){
		    // ... user chose OK
		} else {
		    // ... user chose CANCEL or closed the dialog
		}*/
	}

	public void warning(String msg, String title) {
		Alert alert = new Alert(AlertType.WARNING);
		alert.setTitle("Warning Dialog");
		alert.setHeaderText(title.toUpperCase());
		alert.setContentText(msg + "!");

		alert.showAndWait();
	}
	
	public void information(String msg, String title){
		Alert alert = new Alert(AlertType.INFORMATION);
		alert.setTitle("Information Dialog");
		alert.setHeaderText(title.toUpperCase());
		alert.setContentText(msg + "!");

		alert.showAndWait();
		
	}
}
