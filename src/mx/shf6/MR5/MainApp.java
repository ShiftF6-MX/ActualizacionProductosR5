package mx.shf6.MR5;
	
import java.io.IOException;
import java.sql.Connection;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import mx.shf6.MR5.model.Producto;
import mx.shf6.MR5.utilities.ConnectionDB;
import mx.shf6.MR5.utilities.LeerArchivo;
import mx.shf6.MR5.utilities.Notificacion;
import mx.shf6.MR5.view.GestorActualizacion;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;


public class MainApp extends Application {
	
	//Pantallas
	private Stage primaryStage;
    private BorderPane rootLayout;  
    private Stage dialogStage;
    public static ConnectionDB connectionDB;
	public static Connection mysqlConnection;    
      
	//LISTA OOBSERVABLE PARA ALMACENAR A LOS USUARIOS
    private ObservableList<Producto> ventaData = FXCollections.observableArrayList();

    //CONSTRUCTOR
    public MainApp() { 
    	
    }//FIN CONSTRUCTOR
    
    //INICIACION DE ESCENARIO
    @Override
    public void start(Stage primaryStage) {
    	//INICIO DE LA CONEXION DE LA BASE DE DATOS
    	LeerArchivo.leerArchivo();
    	connectionDB = new ConnectionDB(LeerArchivo.nameDB, LeerArchivo.hostDB, LeerArchivo.userDB, LeerArchivo.passwordDB);
		mysqlConnection = connectionDB.conectarMySQL();
        this.primaryStage = primaryStage;
        this.primaryStage.setTitle("Maxicomercio Tools | Actualización Productos by Shift F6");
        initRootLayout();
        showBusqueda();
    }//FIN METODO
    
    //INICIACION DE ROOTLAYOUT
    public void initRootLayout() {
        try {
            // CARGA EL ROOT LAYOUT DEL ALCHIVO FMX
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(MainApp.class.getResource("view/Root.fxml"));
            rootLayout = (BorderPane) loader.load();        
            //MUESTRA EL CONTENIDO DEL ROOT LAYOUT.
            Scene scene = new Scene(rootLayout);
            primaryStage.setScene(scene);
            primaryStage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }//FIN TRY-CATCH
    }//FIN METODO
    
    //MUESTRA LA INTERFAZ DE GESTOR DE USUARIO
    public void showBusqueda() {
        try {
            //CARGA EL GESTOR DE USUARIO DEL ARCHIVO FMXL
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(MainApp.class.getResource("view/GestorActualizacion.fxml"));
            AnchorPane personOverview = (AnchorPane) loader.load();
            
            //ENVIA EL GESTOR DE USUARIO AL CENTRO DEL ROOT LAYOUT
            rootLayout.setCenter(personOverview);
            
            //SE OBTIENE EL ACCESO DEL CONTROLADOR AL MAIN APP
            GestorActualizacion controller = loader.getController();
            controller.setMainApp(this);            
        } catch (IOException e) {
            Notificacion.dialogoException(e);
        }//FIN TRY/CATCH
    }//FIN METODO
            
    //REGRESA EL MAIN STAGE
    public Stage getPrimaryStage() {
    	return primaryStage;
    }//FIN METODO
    
  //METODOS DE ACCESO A VARIABLE "CONNECTION"
  	public Connection getConnection() {
  		return MainApp.mysqlConnection;
  	}//FIN METODO
    
    //REGRESA LOS DATOS EN UNA LISTA OBSERVABLE DE USUARIOS
    public ObservableList<Producto> getVentaData() {
    	return ventaData;
    }//FIN METODO
    
    public static void main(String[] args) {
        launch(args);
    }//FIN METODO

    //METODOS DE ACCESO A "DIALOG STAGE"
    public Stage getDialogStage() {
		return this.dialogStage;
	}// FIN METODO
}//FIN CLASE