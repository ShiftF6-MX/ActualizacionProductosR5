package mx.shf6.MR5.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.URL;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ResourceBundle;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.controlsfx.dialog.ProgressDialog;

import javafx.concurrent.Task;
import javafx.fxml.Initializable;
import javafx.stage.FileChooser;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import mx.shf6.MR5.model.Producto;

public class ReadExcelFile implements Initializable {
	
	public static boolean readFile(Stage escenarioPrincipal) {
		Task<?> copyWorker;
		FileChooser seleccionarArchivo = new FileChooser();
		List<String> listaExtensiones = new ArrayList<String>();
		listaExtensiones.add("*.XLS");
		listaExtensiones.add("*.XLSX");
		FileChooser.ExtensionFilter extensionesValidas = new FileChooser.ExtensionFilter("Hojas de cálculo (*.xls, *.xlsx)", listaExtensiones);
		seleccionarArchivo.getExtensionFilters().add(extensionesValidas);
		File archivoExcel = seleccionarArchivo.showOpenDialog(escenarioPrincipal);
		
		if (archivoExcel == null)
			return false;		
		
		copyWorker = createWorker(archivoExcel);
		ProgressDialog dialog = new ProgressDialog(copyWorker);
		dialog.initStyle(StageStyle.UNDECORATED);
		dialog.setTitle("Mensaje de Mxicomercio");
		dialog.setHeaderText("Mensaje de Mxicomercio");
		dialog.setContentText("El archivo se esta cargando...");
		new Thread(copyWorker).start();
		dialog.showAndWait();
		return true;
	}//END METHOD

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		
		
	}//FIN METODO
	
	public static Task<?> createWorker(File archivoExcel) {
		System.out.println("Worker");
		return new Task<Object>() {

			@Override
			protected Object call() throws Exception {
					
				try {
					FileInputStream fis = new FileInputStream(archivoExcel);
					XSSFWorkbook workBook = new XSSFWorkbook(fis);
					System.out.println("Inicio while");
					XSSFSheet sheet = workBook.getSheetAt(0);
					Iterator<Row> rowIterator = sheet.rowIterator();
					while (rowIterator.hasNext()) {
						Row row = rowIterator.next();
						System.out.println(row.getRowNum());
						Iterator<Cell> cellIterator = row.cellIterator();
						ArrayList<String> data = new ArrayList<String>();
						while (cellIterator.hasNext()) {
							Cell cell = cellIterator.next();
							switch (cell.getCellTypeEnum()) {
							case STRING:
								data.add(cell.getStringCellValue());
								System.out.println("Text:" + cell.getStringCellValue());
								break;
							case NUMERIC:
								DecimalFormat decimalFormat = new DecimalFormat("#,###");
								data.add(decimalFormat.format(cell.getNumericCellValue()));
								System.out.println("Numero:" + cell.getNumericCellValue());
								break;
							default:
								data.add("");
								System.out.println("VALOR NO IDENTIFICADO");
								break;
							}//END SWITCH
						}//END WHILE
						if (row.getRowNum() > 0) {
							Producto producto = new Producto();
							producto.setCodigo(data.get(1));
							producto.setDescripcion(data.get(2));
							producto.setUnidad(data.get(3));
							producto.setIDivisa(Integer.parseInt(data.get(4)));
							producto.setILinea(Integer.parseInt(data.get(5)));
							producto.setIClase(Integer.parseInt(data.get(6)));
							producto.setIMarca(Integer.parseInt(data.get(7)));
							producto.setIDepartamento(Integer.parseInt(data.get(8)));
							producto.setCodBar1(data.get(9));
							producto.setCodBar2(data.get(10));
							producto.setCodBar3(data.get(11));
							producto.setReqLote(Integer.parseInt(data.get(12)));
							producto.setReqSerie(Integer.parseInt(data.get(13)));													
							producto.setExistencia(Double.parseDouble(data.get(14)));
							producto.setSaldo(Double.parseDouble(data.get(15)));							
							//producto.setITipo(Integer.parseInt(data.get(16)));
							producto.setMetodoValuacion(Integer.parseInt(data.get(16)));
							producto.setCostoUltimo(data.get(17));	
							producto.setPrecio1(Double.parseDouble(data.get(18)));
							producto.setPrecio2(Double.parseDouble(data.get(19)));
							producto.setPrecio3(Double.parseDouble(data.get(20)));
							producto.setPrecio4(Double.parseDouble(data.get(21)));
							producto.setPrecio5(Double.parseDouble(data.get(22)));
							producto.setImpuestos(Integer.parseInt(data.get(23)));							
							producto.setUfSATProser(data.get(24));
							producto.setUfSATUniproser(data.get(25));
							producto.setVisible(Integer.parseInt(data.get(26)));
						}//END IF
					}//END WHILE
					workBook.close();
				} catch (IOException ex) {
					Notificacion.dialogoException(ex);
				}//END TRY/CATCH
				return true;
			}//FIN METODO			
		};//FIN SENTENCIA
	}//FIN METODO
	
}//END CLASS