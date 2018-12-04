package controllers.numbercalculator;

import java.net.URL;
import java.util.ResourceBundle;

import controllers.BaseMainController;
import controllers.common.DigitController;
import controllers.common.DispController;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.stage.Stage;
import models.LowerArea;
import models.upperarea.UpperArea;

/**
 * Base controller class for calculator controller. 
 * 
 * @author Bin Chen
 */
public abstract class BaseCalculatorController extends BaseMainController {
	protected DigitController digitContr;
	@FXML protected DispController dispPaneController;
	
	protected UpperArea upperArea;
	protected LowerArea lowerArea;
	
	public BaseCalculatorController(Stage stage) {
		super();
		this.stage = stage;
		
		lowerArea = new LowerArea();
	}
	
	/**
	 * Update the display area view.
	 */
	protected void updateView() {
		dispPaneController.updateView();
	}
	
	/**
	 * Process the event for pressing digit buttons.
	 * 
	 * @param event				
	 */
	@FXML public void processDigit(ActionEvent event) {
		digitContr.processDigit(event);
		updateView();
	}

	/**
	 * 
	 */
	@FXML public void processPeriod() {
		digitContr.processPeriod();
		updateView();
	}
	
	@FXML public void clearEntry() {
		digitContr.clearEntry();
		updateView();
	}
	
	@FXML public void clearAll() {
		digitContr.clearEntry();
		upperArea.clear();
		updateView();
	}
	
	@FXML public void processBackspace() {
		digitContr.processBackspace();
		updateView();
	}
	
	@FXML public void submitNumber() {
		lowerArea.submitNumber();
		updateView();
	}
	
	@FXML public abstract void processFunc(ActionEvent event);
	
	@FXML public abstract void processOperator(ActionEvent event);
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		super.initialize(location, resources);
		
		dispPaneController.setLowerArea(lowerArea);
		dispPaneController.setUpperArea(upperArea);
		digitContr = new DigitController(lowerArea);
	}
}
