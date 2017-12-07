package view;

import javafx.geometry.Insets;
import javafx.geometry.Orientation;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.control.Separator;
import javafx.scene.control.SplitPane;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.scene.control.TextArea;
import javafx.scene.control.ToolBar;
import javafx.scene.control.Tooltip;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.Priority;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;

public class ViewPrincipal {

	private BorderPane bp;
	private BorderPane bpConsole;
	private BorderPane bpBC;	
	
	private SplitPane centersp;
	private SplitPane leftsp;
	private SplitPane panesp;
	
	private TextArea ta;
	private TextArea taBC;
	private TextArea taConsole;

	private HBox hBox1;
	private HBox hbConsole;
	private VBox topContainer;	

	private TabPane painelAbas;
	private Tab abaconsole;

	private Button btstart;
	private Button btstop;
	private Button btupbc;
	private Button btclean;
	private Button btbcsave;
	private Button btbcimport;
	private Button btbcexport;
	private Button btbcdel;
	private Button btbcnew;
	private Button btdelconsole;
	
	private Image imgStart;
	private Image imgStop;
	private Image imgImportBC;	
	private Image imgImport;
	private Image imgExport;
	private Image imgSave;
	private Image imgDelete;
	private Image imgNew;
	private Image imgClear;
	private Image imgDelConsole;
	
	private MenuBar mainMenu;
	
	private Menu file;	
	private MenuItem openFile;
	private MenuItem exitApp;
	
	private Menu clean;
	private MenuItem cleanconsole;
	private MenuItem cleantableview;
	private MenuItem cleansintatico;
	private MenuItem cleancode;
	
	private ToolBar toolBar;
	private ToolBar toolBarBc;
	
	private Label lbFile;
	private Label lbConsole;
	private Label lbTxtConsole;

	public ViewPrincipal() {
		initComponents();
	}

	
	private void initComponents() {
		
		String style_backgroud = "-fx-background-color: transparent;";
		
		this.bp = new BorderPane();
		this.bp.setStyle(style_backgroud);

		// Text Area
		this.ta = new TextArea();
		// this.ta.setMinSize(700,400);
		this.taBC = new TextArea();
		this.taBC.setWrapText(true);
		this.taBC.setStyle("-fx-font-size:12pt; -fx-font-weight:bold; -fx-font-family:Monaco, 'Courier New', MONOSPACE");
		this.taBC.autosize();

		// Imagem
		this.imgStart = new Image(getClass().getResourceAsStream("../image/start_24x24.png"));
		this.imgStop = new Image(getClass().getResourceAsStream("../image/stop_24x24.png"));
		this.imgImportBC = new Image(getClass().getResourceAsStream("../image/database_24x24.png"));
		this.imgExport = new Image(getClass().getResourceAsStream("../image/export_24x24.png"));
		this.imgImport = new Image(getClass().getResourceAsStream("../image/import_24x24.png"));
		this.imgDelete = new Image(getClass().getResourceAsStream("../image/delete_24x24.png"));
		this.imgSave = new Image(getClass().getResourceAsStream("../image/save_24x24.png"));
		this.imgNew = new Image(getClass().getResourceAsStream("../image/newfile_24x24.png"));
		this.imgClear= new Image(getClass().getResourceAsStream("../image/clear_24x24.png"));
		this.imgDelConsole = new Image(getClass().getResourceAsStream("../image/delete_8x8.png"));		
		
		
			
		// Button
		this.btstart = new Button();
		this.btstart.setStyle(style_backgroud);
		this.btstop = new Button();
		this.btstop.setStyle(style_backgroud);
		this.btupbc = new Button();
		this.btupbc.setStyle(style_backgroud);
		this.btclean = new Button();
		this.btclean.setStyle(style_backgroud);
		
		this.btstart.setGraphic(new ImageView(this.imgStart));
		this.btstop.setGraphic(new ImageView(this.imgStop));
		this.btupbc.setGraphic(new ImageView(this.imgImportBC));
		this.btclean.setGraphic(new ImageView(this.imgClear));
		

		// Menu
		this.mainMenu = new MenuBar();
		//this.mainMenu.setStyle(style_backgroud);
		this.toolBar = new ToolBar();
		this.toolBar.setStyle(style_backgroud);
		this.toolBar.getItems().addAll(this.btstart, this.btstop, this.btupbc,new Separator(),this.btclean);		

		this.clean = new Menu("Clean");
		this.cleancode = new MenuItem("Code");
		this.cleantableview = new MenuItem("Lexico");
		this.cleansintatico = new MenuItem("Sintatico");
		this.cleanconsole = new MenuItem("Console");
		this.clean.getItems().addAll(this.cleancode, this.cleantableview, this.cleansintatico, this.cleanconsole);
		
		this.file = new Menu("File");
		this.openFile = new MenuItem("Open File");
		this.exitApp = new MenuItem("Exit");
		this.file.getItems().addAll(this.openFile, this.exitApp);

		this.mainMenu.getMenus().addAll(this.file, this.clean);

		this.topContainer = new VBox();
		this.topContainer.getChildren().add(this.mainMenu);
		this.topContainer.getChildren().add(this.toolBar);

		
		//Button BC
		this.btbcnew = new Button();
		this.btbcsave = new Button();
		this.btbcimport = new Button();
		this.btbcexport = new Button();
		this.btbcdel = new Button();
		this.btdelconsole = new Button();
		this.btdelconsole.setScaleX(0.5);
		this.btdelconsole.setScaleY(0.5);
		
		
		this.btbcnew.setTooltip(new Tooltip("Novo"));
		this.btbcsave.setTooltip(new Tooltip("Salvar"));
		this.btbcimport.setTooltip(new Tooltip("Importar"));
		this.btbcexport.setTooltip(new Tooltip("Exportar"));
		this.btbcdel.setTooltip(new Tooltip("Delete"));
		
		this.btbcexport.setGraphic(new ImageView(this.imgExport));
		this.btbcimport.setGraphic(new ImageView(this.imgImport));
		this.btbcdel.setGraphic(new ImageView(this.imgDelete));
		this.btbcsave.setGraphic(new ImageView(this.imgSave));
		this.btbcnew.setGraphic(new ImageView(this.imgNew));
		this.btclean.setGraphic(new ImageView(this.imgClear));
		this.btdelconsole.setGraphic(new ImageView(this.imgDelConsole));		
		
		
		//Label BC
		this.lbFile = new Label();		
		this.lbFile.setFont(Font.font ("Arial", 14));
		this.lbFile.setTextFill(Color.BLACK);
		this.lbFile.setAlignment(Pos.BOTTOM_RIGHT);
		
		//ToolBar BC
		this.toolBarBc = new ToolBar();
		this.toolBarBc.getItems().addAll(this.btbcnew, this.btbcsave, this.btbcimport, this.btbcexport, this.btbcdel);		
		
		//BorderPane BC
		this.bpBC = new BorderPane();		
		//this.bpBC.setCenter(this.taBC);
		this.bpBC.setTop(this.toolBarBc);
		this.bpBC.setBottom(this.lbFile);
		
		
		//Text Area Console		
		this.taConsole =  new TextArea();
		
		//Label Console
		this.lbTxtConsole = new Label("[ACP Application] - ");		
		this.lbTxtConsole.setFont(Font.font ("Arial", 8));
		this.lbTxtConsole.setTextFill(Color.BLACK);
		this.lbTxtConsole.setAlignment(Pos.CENTER_LEFT);
		
		this.lbConsole = new Label();		
		this.lbConsole.setFont(Font.font ("Arial", 8));
		this.lbConsole.setTextFill(Color.BLACK);
		this.lbConsole.setAlignment(Pos.CENTER_LEFT);
		
		//Hbox Console
		this.hbConsole = new HBox();
		this.hbConsole.setPadding(new Insets(1, 1, 1, 1));//new Insets(15, 12, 15, 12));
		this.hbConsole.setSpacing(1);		
		this.hbConsole.getChildren().addAll(this.lbTxtConsole, this.lbConsole);//,this.btdelconsole);
		
		addStackPane(this.hbConsole, this.btdelconsole, Pos.CENTER_RIGHT);
		
		
		//BorderPane Console
		this.bpConsole = new BorderPane();
		this.bpConsole.setTop(this.hbConsole);
		this.bpConsole.setCenter(this.taConsole);
		
		
		
		// Tab Pane Console
		this.painelAbas = new TabPane();
		this.abaconsole = new Tab("Console");
		this.abaconsole.setClosable(false);
		// this.aba2 = new Tab("Aba 2");/
		// this.aba3 = new Tab("Aba 3");		
		this.abaconsole.setContent(this.bpConsole);
		this.painelAbas.getTabs().addAll(this.abaconsole);// , this.aba2, this.aba3);
		
		

		// Split Pane
		this.leftsp = new SplitPane();
		this.leftsp.setOrientation(Orientation.VERTICAL);
		this.leftsp.getItems().addAll(this.ta,this.painelAbas);

		this.centersp = new SplitPane();
		this.centersp.setOrientation(Orientation.VERTICAL);
		// this.centersp.setPrefSize(200, 200);
		this.centersp.getItems().addAll(this.bpBC);

		this.panesp = new SplitPane();
		this.panesp.setOrientation(Orientation.HORIZONTAL);
		this.panesp.getItems().addAll(this.leftsp,this.centersp);

				
		// HBox
		this.hBox1 = new HBox();
		this.hBox1.getChildren().addAll(this.panesp);

		this.bp.setCenter(this.panesp);
		this.bp.setTop(this.topContainer);
		this.bp.setBottom(new Label("DISCIPLINA: INTELIGÊNCIA ARTIFICIAL"));
		

	}
	
	public void addStackPane(HBox hb, Node nd, Pos pos) {
	    StackPane stack = new StackPane();
	    stack.getChildren().addAll(nd);	    
	    stack.setAlignment(pos);
	    hb.getChildren().add(stack);           
	    HBox.setHgrow(stack, Priority.ALWAYS);	    
	}


	public BorderPane getBp() {
		return bp;
	}


	public void setBp(BorderPane bp) {
		this.bp = bp;
	}


	public SplitPane getCentersp() {
		return centersp;
	}


	public void setCentersp(SplitPane centersp) {
		this.centersp = centersp;
	}


	public SplitPane getLeftsp() {
		return leftsp;
	}


	public void setLeftsp(SplitPane leftsp) {
		this.leftsp = leftsp;
	}


	public SplitPane getPanesp() {
		return panesp;
	}


	public void setPanesp(SplitPane panesp) {
		this.panesp = panesp;
	}


	public Pane getPaneBC() {
		return bpBC;
	}


	public void setPaneBC(BorderPane bpBC) {
		this.bpBC = bpBC;
	}


	public TextArea getTa() {
		return ta;
	}


	public void setTa(TextArea ta) {
		this.ta = ta;
	}


	public TextArea getTaBC() {
		return taBC;
	}


	public void setTaBC(TextArea taBC) {
		this.taBC = taBC;
	}


	public TextArea getTaConsole() {
		return taConsole;
	}


	public void setTaConsole(TextArea taConsole) {
		this.taConsole = taConsole;
	}


	public HBox gethBox1() {
		return hBox1;
	}


	public void sethBox1(HBox hBox1) {
		this.hBox1 = hBox1;
	}

	public VBox getTopContainer() {
		return topContainer;
	}


	public void setTopContainer(VBox topContainer) {
		this.topContainer = topContainer;
	}


	public TabPane getPainelAbas() {
		return painelAbas;
	}


	public void setPainelAbas(TabPane painelAbas) {
		this.painelAbas = painelAbas;
	}


	public Tab getAbaconsole() {
		return abaconsole;
	}


	public void setAbaconsole(Tab abaconsole) {
		this.abaconsole = abaconsole;
	}


	public Button getBtstart() {
		return btstart;
	}


	public void setBtstart(Button btstart) {
		this.btstart = btstart;
	}


	public Button getBtstop() {
		return btstop;
	}


	public void setBtstop(Button btstop) {
		this.btstop = btstop;
	}


	public Button getBtupbc() {
		return btupbc;
	}


	public void setBtupbc(Button btupbc) {
		this.btupbc = btupbc;
	}


	public Button getBtbcsave() {
		return btbcsave;
	}


	public void setBtbcsave(Button btbcsave) {
		this.btbcsave = btbcsave;
	}


	public Button getBtbcimport() {
		return btbcimport;
	}


	public void setBtbcimport(Button btbcimport) {
		this.btbcimport = btbcimport;
	}


	public Button getBtbcexport() {
		return btbcexport;
	}


	public void setBtbcexport(Button btbcexport) {
		this.btbcexport = btbcexport;
	}


	public Button getBtbcdel() {
		return btbcdel;
	}


	public void setBtbcdel(Button btbcdel) {
		this.btbcdel = btbcdel;
	}

	public Button getBtbcnew() {
		return btbcnew;
	}


	public Image getImgStart() {
		return imgStart;
	}


	public void setImgStart(Image imgStart) {
		this.imgStart = imgStart;
	}


	public Image getImgStop() {
		return imgStop;
	}


	public void setImgStop(Image imgStop) {
		this.imgStop = imgStop;
	}


	public Image getImgBC() {
		return imgImportBC;
	}


	public void setImgBC(Image imgBC) {
		this.imgImportBC = imgBC;
	}


	public MenuBar getMainMenu() {
		return mainMenu;
	}


	public void setMainMenu(MenuBar mainMenu) {
		this.mainMenu = mainMenu;
	}


	public Menu getFile() {
		return file;
	}


	public void setFile(Menu file) {
		this.file = file;
	}


	public MenuItem getOpenFile() {
		return openFile;
	}


	public void setOpenFile(MenuItem openFile) {
		this.openFile = openFile;
	}


	public MenuItem getExitApp() {
		return exitApp;
	}


	public void setExitApp(MenuItem exitApp) {
		this.exitApp = exitApp;
	}


	public Menu getClean() {
		return clean;
	}


	public void setClean(Menu clean) {
		this.clean = clean;
	}


	public MenuItem getCleanconsole() {
		return cleanconsole;
	}


	public void setCleanconsole(MenuItem cleanconsole) {
		this.cleanconsole = cleanconsole;
	}


	public MenuItem getCleantableview() {
		return cleantableview;
	}


	public void setCleantableview(MenuItem cleantableview) {
		this.cleantableview = cleantableview;
	}


	public MenuItem getCleansintatico() {
		return cleansintatico;
	}


	public void setCleansintatico(MenuItem cleansintatico) {
		this.cleansintatico = cleansintatico;
	}


	public MenuItem getCleancode() {
		return cleancode;
	}


	public void setCleancode(MenuItem cleancode) {
		this.cleancode = cleancode;
	}


	public ToolBar getToolBar() {
		return toolBar;
	}


	public void setToolBar(ToolBar toolBar) {
		this.toolBar = toolBar;
	}


	public ToolBar getToolBarBc() {
		return toolBarBc;
	}


	public void setToolBarBc(ToolBar toolBarBc) {
		this.toolBarBc = toolBarBc;
	}


	public Label getLbFile() {
		return lbFile;
	}


	public BorderPane getBpBC() {
		return bpBC;
	}


	public Button getBtclean() {
		return btclean;
	}


	public Label getLbConsole() {
		return lbConsole;
	}


	public Button getBtdelconsole() {
		return btdelconsole;
	}

	
	
	
	

	
	

	
}
