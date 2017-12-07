package util;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

import javafx.stage.FileChooser;
import javafx.stage.Stage;

public class FileChooserBc {

	private FileChooser fileChooser;
	private StringBuilder stringBuffer;
	private File fileopen;

	public FileChooserBc() {
		// TODO Auto-generated constructor stub
	}

	public void openFile() {
		
		this.fileChooser = new FileChooser();
		this.fileChooser.setTitle("Open BC");
		
		extensionFilter(this.fileChooser);
		
		this.fileopen = this.fileChooser.showOpenDialog(new Stage());
		
		if (this.fileopen != null) {			
			readFile(this.fileopen);
		}
	}
	
	public void saveFile(String filebc){
		
        this.fileChooser = new FileChooser();
        this.fileChooser.setTitle("Save BC");
        
        extensionFilter(this.fileChooser);
        
        //Show save file dialog
        File file = this.fileChooser.showSaveDialog(new Stage());
        
        if(file != null){
            writeFile(filebc, file);        	
        }        
	}
	
	public void writeFile(String content, File file){
        try {
            FileWriter fileWriter = null;
             
            fileWriter = new FileWriter(file);
            fileWriter.write(content);
            fileWriter.close();
        } catch (IOException ex) {
            Logger.getLogger(FileChooserBc.class.getName()).log(Level.SEVERE, null, ex);
        }
         
    }
	
	private void readFile(File file) {
		this.stringBuffer = new StringBuilder();
		BufferedReader bufferedReader = null;

		try {

			bufferedReader = new BufferedReader(new FileReader(file));

			/*String text;
			while ((text = bufferedReader.readLine()) != null) {
				this.stringBuffer.append(text);
				this.stringBuffer.append("\\s");
			}*/
			
			while (bufferedReader.ready()) {				
				this.stringBuffer.append((char) bufferedReader.read());
			}

		} catch (FileNotFoundException ex) {
			Logger.getLogger(FileChooserBc.class.getName()).log(Level.SEVERE, null, ex);
		} catch (IOException ex) {
			Logger.getLogger(FileChooserBc.class.getName()).log(Level.SEVERE, null, ex);
		} finally {
			try {
				bufferedReader.close();
			} catch (IOException ex) {
				Logger.getLogger(FileChooserBc.class.getName()).log(Level.SEVERE, null, ex);
			}
		}	
	}
	
	private void extensionFilter(FileChooser fileChooser){
		fileChooser.setInitialDirectory(new File(System.getProperty("user.home"))
				);   
		fileChooser.getExtensionFilters().addAll(
				new FileChooser.ExtensionFilter("ACP", "*.acp"),
                new FileChooser.ExtensionFilter("TXT", "*.txt")
                );
	}

	public String getReadString() {
		if(this.stringBuffer.toString() != null){
			return this.stringBuffer.toString();
		}else{
			return "";
		}		
	}

	public File getFileopen() {
		return fileopen;
	}
	
	
	
	
	

}
