package mx.shf6.MR5.view;

import javafx.fxml.FXML;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.stage.Stage;
import mx.shf6.MR5.MainApp;
import mx.shf6.MR5.utilities.ReadExcelFile;

public class GestorActualizacion {
	
	//PROPIEDADES
	private MainApp mainApp;
	private ToggleGroup groupoRadio;
	//private File archivoExcel;
	
	//COMPONENTES INTERFAZ DE USUARIO
	@FXML private TextField rutaArchivo;
	@FXML private RadioButton preciosRadio;
	@FXML private RadioButton existenciaRadio;
	@FXML private RadioButton satRadio;
	@FXML private RadioButton informacionRadio;
	
	@FXML private void initialize() {
		this.groupoRadio = new ToggleGroup();
		this.preciosRadio.setToggleGroup(groupoRadio);
		this.existenciaRadio.setToggleGroup(groupoRadio);
		this.satRadio.setToggleGroup(groupoRadio);
		this.informacionRadio.setToggleGroup(groupoRadio);
		this.preciosRadio.setSelected(true);
    }//FIN METODO
	
	//ACCESO AL CLASE PRINCIPAL QUE CONTROLA LAS VISTAS
	public void setMainApp(MainApp mainApp) {
        this.mainApp = mainApp;
    }//FIN METODO
	
	//ABRE EL DIALOGO PARA CARGAR ARCHIVO
    @FXML private void cargarButtonHandler() {
	   if (ReadExcelFile.readFile((Stage) this.mainApp.getDialogStage())) {
		   System.out.println("Se ha cargado el archivo correctamente");
	   }
    }//FIN METODO    
    
    //METODO PARA CAMBIAR LAS PROPIEDADES
    @FXML private void cambiarPropiedades() {
    	/*if(ReadExcelFile.readFile(archivoExcel, mainApp)) {
    		Notificacion.dialogoAlerta(AlertType.INFORMATION, "Mensaje Maxicomercio", "Los productos se modificaron correctamente");
    	}else {
    		Notificacion.dialogoAlerta(AlertType.ERROR, "Mensaje Maxicomercio", "Los productos no se pudieron modificar");
    	}//FIN IF ELSE*/
    }//FIN METODOS
}//FIN CLASE