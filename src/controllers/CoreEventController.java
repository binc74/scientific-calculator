package controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

/**
 * Controller for core events.
 * 
 * @author Bin Chen
 */
public class CoreEventController {
	@FXML protected Button btnClose;
	
	public CoreEventController() {
	}
		
	/**
	 * Process close window event.
	 */
	@FXML public void processExit() {
		System.out.println("exit");
		Stage stage = (Stage) btnClose.getScene().getWindow();
		stage.close();
	}
	
	/**
	 * Process minimize window event.
	 */
	@FXML public void processMinimize() {
		System.out.println("minimize");
		Stage stage = (Stage) btnClose.getScene().getWindow();
		stage.setIconified(true);
	}
	
	/**
	 * Process drag window event.
	 * 
	 * @param event				the mouse event
	 */
	@FXML public void processDragging(MouseEvent event) {
		
	}
}
