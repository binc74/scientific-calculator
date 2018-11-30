package controllers;

import java.net.URL;
import java.util.ResourceBundle;

import controllers.common.CoreEventController;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.stage.Stage;

public abstract class BaseController implements Initializable {
	protected Stage stage;
	
	@FXML
	private CoreEventController topPaneController;
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		topPaneController.setupStage(stage);
	}
}