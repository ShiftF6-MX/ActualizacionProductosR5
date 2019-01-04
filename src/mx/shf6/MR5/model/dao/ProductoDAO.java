package mx.shf6.MR5.model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import mx.shf6.MR5.model.Producto;
import mx.shf6.MR5.utilities.Notificacion;

public class ProductoDAO {

	public static boolean modificarPrecios(Connection connection, Object Producto){
		String query = "UPDATE producto "
				+ "SET CostoUltimo = ?, Precio1 = ?, Precio2 = ?, Precio3 = ?, "
				+ "Precio4 = ?, Precio5 = ?, Impuestos = ? "
				+ "WHERE codigo = ?;";
		try {
			Producto producto=(Producto)Producto;			
			PreparedStatement preparedStatement = (PreparedStatement) connection.prepareStatement(query);
			preparedStatement.setString(1, producto.getCostoUltimo());
			preparedStatement.setDouble(2, producto.getPrecio1());
			preparedStatement.setDouble(3, producto.getPrecio2());
			preparedStatement.setDouble(4, producto.getPrecio3());
			preparedStatement.setDouble(5, producto.getPrecio4());
			preparedStatement.setDouble(6, producto.getPrecio5());
			preparedStatement.setInt(7, producto.getImpuestos());
			preparedStatement.setString(8, producto.getCodigo());
			preparedStatement.execute();
			return true;
		} catch (SQLException ex) {
			Notificacion.dialogoException(ex);
			return false;
		}//FIN TRY-CATCH
	}//FIN METODO
	
	public static boolean modificarExistencia(Connection connection, Object Producto){
		String query = "UPDATE producto "
				+ "SET Existencia = ?, Saldo = ? "
				+ "WHERE codigo = ?;";
		try {
			Producto producto=(Producto)Producto;			
			PreparedStatement preparedStatement = (PreparedStatement) connection.prepareStatement(query);
			preparedStatement.setDouble(1, producto.getExistencia());
			preparedStatement.setDouble(2, producto.getSaldo());
			preparedStatement.setString(3, producto.getCodigo());
			preparedStatement.execute();
			return true;
		} catch (SQLException ex) {
			Notificacion.dialogoException(ex);
			return false;
		}//FIN TRY-CATCH
	}//FIN METODO
	
	public static boolean modificarSAT(Connection connection, Object Producto){
		String query = "UPDATE producto "
				+ "SET uf_sat_proser = ?, uf_sat_uniproser = ? "
				+ "WHERE codigo = ?;";
		try {
			Producto producto=(Producto)Producto;			
			PreparedStatement preparedStatement = (PreparedStatement) connection.prepareStatement(query);
			preparedStatement.setString(1, producto.getUfSATProser());
			preparedStatement.setString(2, producto.getUfSATUniproser());
			preparedStatement.setString(3, producto.getCodigo());
			preparedStatement.execute();
			return true;
		} catch (SQLException ex) {
			Notificacion.dialogoException(ex);
			return false;
		}//FIN TRY-CATCH
	}//FIN METODO
	
	public static boolean modificarInformacion(Connection connection, Object Producto){
		String query = "UPDATE producto "
				+ "SET Descripcion = ?, IMarca = ?, ILinea = ?, IDepartamento = ?, "
				+ "IClase = ?, ReqLote = ?, ReqSerie = ?, CodBar1 = ?, CodBar2 = ?, CodBar3 = ? "
				+ "WHERE codigo = ?;";
		try {
			Producto producto=(Producto)Producto;			
			PreparedStatement preparedStatement = (PreparedStatement) connection.prepareStatement(query);
			preparedStatement.setString(1, producto.getDescripcion());
			preparedStatement.setInt(2, producto.getIMarca());
			preparedStatement.setInt(3, producto.getILinea());
			preparedStatement.setInt(4, producto.getIDepartamento());
			preparedStatement.setInt(5, producto.getIClase());
			preparedStatement.setInt(6, producto.getReqLote());
			preparedStatement.setInt(7, producto.getReqSerie());
			preparedStatement.setString(8, producto.getCodBar1());
			preparedStatement.setString(9, producto.getCodBar2());
			preparedStatement.setString(10, producto.getCodBar3());
			preparedStatement.setString(11, producto.getCodigo());
			preparedStatement.execute();
			return true;
		} catch (SQLException ex) {
			Notificacion.dialogoException(ex);
			return false;
		}//FIN TRY-CATCH
	}//FIN METODO
}//FIN CLASE