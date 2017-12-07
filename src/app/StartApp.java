package app;

import javafx.animation.FadeTransition;
import javafx.application.Application;
import javafx.beans.property.ReadOnlyObjectProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.concurrent.Task;
import javafx.concurrent.Worker;
import javafx.geometry.Rectangle2D;
import javafx.scene.Scene;
import javafx.stage.Screen;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import javafx.util.Duration;
import controller.ControllerViewPrincipal;
import view.ViewInit;


public class StartApp extends Application {
		
	private ViewInit viewInit;

	public static void main(String[] args) {
		launch(args);
		
	}

	@Override
	public void start(Stage stage) throws Exception {		
		this.viewInit = new ViewInit();
		final Task<ObservableList<String>> contagem = new Task<ObservableList<String>>() {
			@Override
			protected ObservableList<String> call() throws InterruptedException {
				ObservableList<String> foundFriends = FXCollections.<String> observableArrayList();
				ObservableList<String> availableFriends = FXCollections.observableArrayList("10%", "20%", "30%", "40%", "50%", "60%", "70%", "80%", "90%", "100%");

				updateMessage("Finding friends . . .");
				for (int i = 0; i < availableFriends.size(); i++) {
					Thread.sleep(200);
					updateProgress(i + 1, availableFriends.size());
					String nextFriend = availableFriends.get(i);
					foundFriends.add(nextFriend);
					updateMessage("Starting system. . . " + nextFriend);
				}
				Thread.sleep(200);
				updateMessage("All friends found.");

				return foundFriends;
			}
		};

		showSplash(stage, contagem, () -> showMainStage(contagem.valueProperty()));
		new Thread(contagem).start();
		
	}
	
	
	private void showMainStage(ReadOnlyObjectProperty<ObservableList<String>> contagem) {		
		new ControllerViewPrincipal(new Stage());		
	}
	
	
	private void showSplash(Stage initStage, Task<?> task, InitCompletionHandler initCompletionHandler) {
		
		this.viewInit.getProgressText().textProperty().bind(task.messageProperty());
		this.viewInit.getLoadProgress().progressProperty().bind(task.progressProperty());
		
		task.stateProperty().addListener((observableValue, oldState, newState) -> {
			if (newState == Worker.State.SUCCEEDED) {
				this.viewInit.getLoadProgress().progressProperty().unbind();
				this.viewInit.getLoadProgress().setProgress(1);
				initStage.toFront();
				FadeTransition fadeSplash = new FadeTransition(Duration.seconds(1.0),this.viewInit.getSplashLayout());
				fadeSplash.setFromValue(1.0);
				fadeSplash.setToValue(0.0);
				fadeSplash.setOnFinished(actionEvent -> initStage.hide());
				fadeSplash.play();
				initCompletionHandler.complete();
			} 
		});

		Scene splashScene = new Scene(this.viewInit.getBp());
		initStage.initStyle(StageStyle.UNDECORATED);
		final Rectangle2D bounds = Screen.getPrimary().getBounds();
		initStage.setScene(splashScene);
		initStage.setX(bounds.getMinX() + bounds.getWidth() / 2 - this.viewInit.getSplashWidth() / 2);
		initStage.setY(bounds.getMinY() + bounds.getHeight() / 2 - this.viewInit.getSplashHeight() / 2);
		initStage.centerOnScreen();
		initStage.show();
	}
	
	public interface InitCompletionHandler {
		public void complete();
	}
}