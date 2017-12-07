package view;

import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressBar;
import javafx.scene.effect.DropShadow;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class ViewInit {

	private Image img;
	private ImageView imgv;
	private BorderPane bp;
	private VBox splashLayout;
	private ProgressBar loadProgress;
	private Label progressText;
	private Stage mainStage;

	private int splash_width = 776;
	private int splash_height = 157;

	public ViewInit() {
		initComponent();
	}

	private void initComponent() {
		// Image
		this.img = new Image(getClass().getResourceAsStream("../image/ia.png"));
		
		this.imgv = new ImageView(this.img);

		this.imgv.setFitWidth(splash_height);
		this.imgv.setFitWidth(splash_width - 22);
		
		//Border Pane
		this.bp = new BorderPane();
		
		//Progress Bar
		this.loadProgress = new ProgressBar();
		this.loadProgress.setPrefWidth(splash_width - 20);

		this.progressText = new Label(". . .");
		this.splashLayout = new VBox();
		
		this.splashLayout.getChildren().addAll(this.loadProgress, this.progressText);
		this.progressText.setAlignment(Pos.CENTER);
		this.bp.setStyle(
				"-fx-padding: 5; " + "-fx-background-color: lightsteelblue ; " + "-fx-border-width:1; " + "-fx-border-color: "
						+ "linear-gradient(" + "to bottom, " + "navy, " + "derive(navy, 50%)" + ");");
		this.bp.setEffect(new DropShadow());
		
		this.bp.setBottom(this.splashLayout);
		this.bp.setCenter(this.imgv);

	}

	public BorderPane getBp(){
		return bp;
	}
	
	public Image getImg() {
		return img;
	}

	public ImageView getImgv() {
		return imgv;
	}

	public Pane getSplashLayout() {
		return splashLayout;
	}

	public ProgressBar getLoadProgress() {
		return loadProgress;
	}

	public Label getProgressText() {
		return progressText;
	}

	public Stage getMainStage() {
		return mainStage;
	}

	public int getSplashWidth() {
		return splash_width;
	}

	public int getSplashHeight() {
		return splash_height;
	}

	

}
