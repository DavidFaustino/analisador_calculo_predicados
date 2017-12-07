package controller;

import java.io.File;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.LinkedList;

import analyzer.old.lexical.Machine;
import analyzer.old.lexical.machines.n00.Alfa_ao;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.ButtonType;
import javafx.scene.effect.DropShadow;
import javafx.scene.image.Image;
import javafx.scene.input.KeyCode;
import javafx.stage.Stage;
import util.Alerts;
import util.FileChooserBc;
import stack.ArrayStack;
import view.ViewPrincipal;

public class ControllerViewPrincipal {
	

	private ViewPrincipal viewprinc;
	
	private Alerts typealerts;

	private Stage window;
	private Scene scene;
	
	private DropShadow shadow;
	
	private String arquivo = "";
	private String msg = "";
	private String title = "";	
	private File arqFile;

	public ControllerViewPrincipal(Stage stage) {
		this.window = stage;
		
		this.viewprinc = new ViewPrincipal();
		try {
			typealerts = new Alerts();
			initListernerConsole();
			initListernerBC();
		} catch (Exception e) {			
			e.printStackTrace();
		}

		this.scene = new Scene(this.viewprinc.getBp(), 800, 600);
		
		this.window.getIcons().add(new Image(getClass().getResourceAsStream("../image/Spartan_48x48.png")));

		this.window.setScene(this.scene);
		this.window.setTitle("ACP");
		this.window.centerOnScreen();
		this.window.show();
	}

	private void initListernerConsole() throws Exception {
		
		//START
		this.viewprinc.getBtstart().setOnAction( startacp -> {
			System.out.println("----Clicou no Btn Start----");
			
			System.out.println(this.viewprinc.getTa().getText());
			
			this.viewprinc.getTaConsole().insertText(0, this.viewprinc.getTa().getText());		
			
		});	
		
		this.viewprinc.getBtstart().setOnMouseEntered(startentered -> {
			this.shadow = new DropShadow();
			this.viewprinc.getBtstart().setEffect(this.shadow);
		});
		
		this.viewprinc.getBtstart().setOnMouseExited(startexited ->{
			this.viewprinc.getBtstart().setEffect(null);
		});
		
		//PRECISAR STOP
		this.viewprinc.getBtstop().setOnAction( stopacp ->{
			
		});
		
		this.viewprinc.getBtstop().setOnMouseEntered(stopentered -> {
			this.shadow = new DropShadow();
			this.viewprinc.getBtstop().setEffect(this.shadow);
		});
		
		this.viewprinc.getBtstop().setOnMouseExited(stopexited ->{
			this.viewprinc.getBtstop().setEffect(null);
		});
		
		
		//PRECIONAR UP BC
		this.viewprinc.getBtupbc().setOnAction(upbcacp ->{
			
		});
		
		this.viewprinc.getBtupbc().setOnMouseEntered(upbcentered -> {
			this.shadow = new DropShadow();
			this.viewprinc.getBtupbc().setEffect(this.shadow);
		});
		
		this.viewprinc.getBtupbc().setOnMouseExited(upbcexited ->{
			this.viewprinc.getBtupbc().setEffect(null);
		});
		
		//PRECIONAR CLEAN TA
		this.viewprinc.getBtclean().setOnAction(cleanacp ->{
			
			this.viewprinc.getTa().clear();
		});
		
		this.viewprinc.getBtclean().setOnMouseEntered(cleanentered -> {
			this.shadow = new DropShadow();
			this.viewprinc.getBtclean().setEffect(this.shadow);
		});
		
		this.viewprinc.getBtclean().setOnMouseExited(cleanexited ->{
			this.viewprinc.getBtclean().setEffect(null);
		});
		
		//PRECIONADO ENTER
		this.viewprinc.getTa().setOnKeyPressed(pressedacp ->{
			if(pressedacp.getCode()==KeyCode.ENTER){
				//System.out.println("TECLA ENTER FOI PRECIONADA");	
				this.viewprinc.getLbConsole().setText("Comando tecla enter | " + getDateTime());
				
				//IMPLEMENTAR O COMANDO ENTER PARA ANALISAR TUDO A PARTIR DO PONTO.
				
				//TESTE ANALISE LEXICA
				Machine tt =  Alfa_ao.ALFAao;
				try {
					LinkedList<Integer> levels = new LinkedList<Integer>();
					boolean n = tt.accepted(this.viewprinc.getTa().getText(), levels, new ArrayStack<Character>());
					this.viewprinc.getTaConsole().appendText(String.valueOf(n));
				} catch (Exception e) {					
					e.printStackTrace();
				}
			}			
		});
		
		//PRECIONADO DELETE CONSOLE
		this.viewprinc.getBtdelconsole().setOnMouseClicked(delconsole ->{
			this.viewprinc.getTaConsole().clear();			
			getMsgLbConsole("ListernerConsole","Btdelconsole","MouseClicked","Console vazia");
		});
		
		this.viewprinc.getBtdelconsole().setOnMouseEntered(delconsoleentered -> {
			this.shadow = new DropShadow();
			this.viewprinc.getBtdelconsole().setEffect(this.shadow);
		});
		
		this.viewprinc.getBtdelconsole().setOnMouseExited(delconsoleexited ->{
			this.viewprinc.getBtdelconsole().setEffect(null);
		});
	}
	
	
	private void initListernerBC(){
		
		//SAVE FILE
		this.viewprinc.getBtbcsave().setOnAction( save -> {			
			FileChooserBc filechoose = new FileChooserBc();			
			//VERIFICAR SE E UMA FORMULA BEM FORMADA
			int len = this.viewprinc.getTaBC().getText().replaceAll(" ", "").replaceAll("\t", "").replaceAll("\r\n","").replaceAll("\n", "").length();
			if(this.arqFile == null && len != 0){
				filechoose.saveFile(this.viewprinc.getTaBC().getText());
			}else if(len == 0){
				this.msg = "Arquivo em branco";
				this.title = "ATENCAO";
				this.typealerts.warning(msg, title);
			}else{
				filechoose.writeFile(this.viewprinc.getTaBC().getText(), this.arqFile);
			}
			
		});
		
		//IMPORT BC
		this.viewprinc.getBtbcimport().setOnAction(importbc -> {
			FileChooserBc filechoose = new FileChooserBc();			
			filechoose.openFile();
			
					
			
			if(filechoose.getFileopen() != null){
				this.viewprinc.getTaBC().clear();
				this.viewprinc.getBpBC().setCenter(this.viewprinc.getTaBC());
				this.viewprinc.getTaBC().appendText(filechoose.getReadString());	
				
				this.arqFile = filechoose.getFileopen();//file corrent
				this.viewprinc.getLbFile().setText("File: " + this.arqFile.getName());
				this.viewprinc.getLbFile().setAlignment(Pos.BOTTOM_RIGHT);
			}
			
			
		});
		
		//EXPORT BC
		this.viewprinc.getBtbcexport().setOnAction(exportbc ->{
			FileChooserBc filechoose = new FileChooserBc();
			filechoose.saveFile(this.viewprinc.getTaBC().getText());
		});
		
		//NEW FILE
		this.viewprinc.getBtbcnew().setOnAction(identarbc ->{					
			this.viewprinc.getTaBC().clear();
			this.viewprinc.getBpBC().setCenter(null);
			this.arqFile = null;
			this.viewprinc.getBpBC().setCenter(this.viewprinc.getTaBC());
			
		});
		
		//DELETE FILE
		this.viewprinc.getBtbcdel().setOnAction(deletebc ->{
			String msg = "DELETAR ARQUIVO \"" + arquivo + "\"";
			String title = "Voce tem certeza";
						
			if (this.typealerts.confirmation(msg, title) == ButtonType.OK){
			    // ... user chose OK	
				
				if (this.arqFile != null){
					msg = "Arquivo " + this.arqFile.getName() + "deletado!";
					title = "SUCESSO";
					this.arqFile.delete();
					this.typealerts.information(msg, title);
				}
				this.viewprinc.getTaBC().clear();
				this.viewprinc.getBpBC().setCenter(null);
				this.viewprinc.getLbFile().setText("Arquivo Deletado.");
				this.arqFile = null;
			}else{
				
			}
			
			
		});
	}
	
	private String getDateTime() {
		DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		Date date = new Date();
		return dateFormat.format(date);
	}
	
	private void getMsgLbConsole(String metodo, String node, String event, String msg){
		System.out.println("[METODO]: " + metodo + " | " + "[NODE]: " + node + " | " + "[EVENT]: " + event + " | " + "[MSG]: " + msg);		
		this.viewprinc.getLbConsole().setText(msg + " | " + getDateTime());
	}
	
	@SuppressWarnings("unused")
	private void getMsgTaConsole(String metodo, String node, String event, String msg){
		System.out.println("[METODO]: " + metodo + " | " + "[NODE]: " + node + " | " + "[EVENT]: " + event + " | " + "[MSG]: " + msg);		
		this.viewprinc.getTaConsole().setText(msg);
		
	}
	
	
   
  
}
