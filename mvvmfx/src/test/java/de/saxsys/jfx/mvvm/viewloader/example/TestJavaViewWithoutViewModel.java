package de.saxsys.jfx.mvvm.viewloader.example;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.Initializable;
import javafx.scene.layout.VBox;

import de.saxsys.jfx.mvvm.api.InjectViewModel;
import de.saxsys.jfx.mvvm.api.JavaView;

public class TestJavaViewWithoutViewModel extends VBox implements JavaView, Initializable {
	
	// this injection point will be ignored as this view class doesn't define a ViewModelType
	@InjectViewModel
	public TestViewModel viewModel;
	
	public boolean wasInitialized = false;
	
	@Override
	public void initialize(URL url, ResourceBundle resourceBundle) {
		wasInitialized = true;
	}
}