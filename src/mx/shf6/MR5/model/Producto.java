package mx.shf6.MR5.model;

import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class Producto {

	//PROPIEDADES
	public ObjectProperty<Integer> sysPk;
	public StringProperty codBar1;
	public StringProperty codBar2;
	public StringProperty codBar3;
	public StringProperty codigo;
	public StringProperty costoUltimo;
	public StringProperty descripcion;
	public ObjectProperty<Double> existencia;
	public ObjectProperty<Integer> iClase;
	public ObjectProperty<Integer> iTipo;
	public ObjectProperty<Integer> metodoValuacion;
	public ObjectProperty<Double> precio1;
	public ObjectProperty<Double> precio2;
	public ObjectProperty<Double> precio3;
	public ObjectProperty<Double> precio4;
	public ObjectProperty<Double> precio5;
	public ObjectProperty<Integer> reqLote;
	public ObjectProperty<Integer> reqSerie;
	public ObjectProperty<Double> saldo;
	public StringProperty unidad;
	public ObjectProperty<Integer> visible;
	public ObjectProperty<Integer> iDepartamento;
	public ObjectProperty<Integer> iDivisa;
	public ObjectProperty<Integer> iLinea;
	public ObjectProperty<Integer> iMarca;
	public ObjectProperty<Integer> impuestos;
	public StringProperty ufSATProser;
	public StringProperty ufSATUniproser;
	
	//CONTRUCTOR SIN PARAMETROS
	public Producto() {
		this(0,"","","","","","",0.0,0,0,0,0.0,0.0,0.0,0.0,0.0,0,0,0.0,"",0,0,0,0,0,0,"","");
	}//FIN CONSTRUCTOR
	
	public Producto(Integer sys_Pk, String codBar1, String codBar2, String codBar3, String codigo, String costoUltimo, String descripcion, 
			Double existencia, int iClase, int iTipo, int metodoValuacion, Double precio1, Double precio2, Double precio3, Double precio4, 
			Double precio5, int reqLote, int reqSerie, Double saldo, String unidad, int visible, int iDepartamento, int iDivisa, int iLinea, 
			int iMarca, int impuestos, String ufSATProser, String ufSATUniproser) {
		
		this.sysPk = new SimpleObjectProperty<Integer>(sys_Pk);
		this.codBar1 = new SimpleStringProperty(codBar1);
		this.codBar2 = new SimpleStringProperty(codBar2);
		this.codBar3 = new SimpleStringProperty(codBar3);
		this.codigo = new SimpleStringProperty(codigo);
		this.costoUltimo = new SimpleStringProperty(costoUltimo);
		this.descripcion = new SimpleStringProperty(descripcion);
		this.existencia = new SimpleObjectProperty<Double>(existencia);
		this.iClase = new SimpleObjectProperty<Integer>(iClase);
		this.iTipo = new SimpleObjectProperty<Integer>(iTipo);
		this.metodoValuacion = new SimpleObjectProperty<Integer>(metodoValuacion);
		this.precio1 = new SimpleObjectProperty<Double>(precio1);
		this.precio2 = new SimpleObjectProperty<Double>(precio2);
		this.precio3 = new SimpleObjectProperty<Double>(precio3);
		this.precio4 = new SimpleObjectProperty<Double>(precio4);
		this.precio5 = new SimpleObjectProperty<Double>(precio5);
		this.reqLote = new SimpleObjectProperty<Integer>(reqLote);
		this.reqSerie = new SimpleObjectProperty<Integer>(reqSerie);
		this.saldo = new SimpleObjectProperty<Double>(saldo);
		this.unidad = new SimpleStringProperty(unidad);
		this.visible = new SimpleObjectProperty<Integer>(visible);
		this.iDepartamento = new SimpleObjectProperty<Integer>(iDepartamento);
		this.iDivisa = new SimpleObjectProperty<Integer>(iDivisa);
		this.iLinea = new SimpleObjectProperty<Integer>(iLinea);
		this.iMarca = new SimpleObjectProperty<Integer>(iMarca);
		this.impuestos = new SimpleObjectProperty<Integer>(impuestos);
		this.ufSATProser = new SimpleStringProperty(ufSATProser);
		this.ufSATUniproser = new SimpleStringProperty(ufSATUniproser);
	}//FIN CONSTRUCTOR
	
	//METODOS DE ACCESO A "SYSPK"
	public void setSysPk(Integer sysPk) {
		this.sysPk.set(sysPk);
	}//FIN METODO
	
	public Integer getSysPk() {
		return this.sysPk.get();
	}//FIN METODO
	
	public ObjectProperty<Integer> sysPkProperty(){
		return this.sysPk;
	}//FIN METODO
	//FIN METODOS "SYSPK"
	
	//METODOS DE ACCESO A "CODBAR1"
	public void setCodBar1(String codBar1) {
		this.codBar1.set(codBar1);
	}//FIN METODO
	
	public String getCodBar1() {
		return this.codBar1.get();
	}//FIN METODO
	
	public StringProperty codBar1Property() {
		return this.codBar1;
	}//FIN METODO
	//FIN METODOS "CODBAR1"
	
	//METODOS DE ACCESO A "CODBAR2"
	public void setCodBar2(String codBar2) {
		this.codBar2.set(codBar2);
	}//FIN METODO
	
	public String getCodBar2() {
		return this.codBar2.get();
	}//FIN METODO
	
	public StringProperty codBar2Property() {
		return this.codBar2;
	}//FIN METODO
	//FIN METODOS "CODBAR2"
	
	//METODOS DE ACCESO A "CODBAR3"
	public void setCodBar3(String codBar3) {
		this.codBar3.set(codBar3);
	}//FIN METODO
	
	public String getCodBar3() {
		return this.codBar3.get();
	}//FIN METODO
	
	public StringProperty codBar3Property() {
		return this.codBar3;
	}//FIN METODO
	//FIN METODOS "CODBAR3"
	
	//METODOS DE ACCESO A "CODIGO"
	public void setCodigo(String codigo) {
		this.codigo.set(codigo);
	}//FIN METODO
	
	public String getCodigo() {
		return this.codigo.get();
	}//FIN METODO
	
	public StringProperty codigoProperty() {
		return this.codigo;
	}//FIN METODO
	//FIN METODOS "CODIGO"
	
	//METODOS DE ACCESO A "COSTO ULTIMO"
	public void setCostoUltimo(String costoUltimo) {
		this.costoUltimo.set(costoUltimo);
	}//FIN METODO
	
	public String getCostoUltimo() {
		return this.costoUltimo.get();
	}//FIN METODO
	
	public StringProperty costoUltimoProperty() {
		return this.costoUltimo;
	}//FIN METODO
	//FIN METODOS "COSTO ULTIMO"
	
	//METODOS DE ACCESO A "DESCRIPCION"
	public void setDescripcion(String descripcion) {
		this.descripcion.set(descripcion);
	}//FIN METODO
	
	public String getDescripcion() {
		return this.descripcion.get();
	}//FIN METODO
	
	public StringProperty descripcionProperty() {
		return this.descripcion;
	}//FIN METODO
	//FIN METODOS "DESCRIPCION"
	
	//METODOS DE ACCESO A "EXISTENCIA"
	public void setExistencia(Double existencia) {
		this.existencia.set(existencia);
	}//FIN METODO
	
	public Double getExistencia() {
		return this.existencia.get();
	}//FIN METODO
	
	public ObjectProperty<Double> existenciaProperty() {
		return this.existencia;
	}//FIN METODO
	//FIN METODOS "EXISTENCIA"
	
	//METODOS DE ACCESO A "ICLASE"
	public void setIClase(int iClase) {
		this.iClase.set(iClase);
	}//FIN METODO
	
	public int getIClase() {
		return this.iClase.get();
	}//FIN METODO
	
	public ObjectProperty<Integer> iClaseProperty() {
		return this.iClase;
	}//FIN METODO
	//FIN METODOS "ICLASE"
	
	//METODOS DE ACCESO A "ITIPO"
	public void setITipo(int iTipo) {
		this.iTipo.set(iTipo);
	}//FIN METODO
	
	public int getITipo() {
		return this.iTipo.get();
	}//FIN METODO
	
	public ObjectProperty<Integer> iTipoProperty() {
		return this.iTipo;
	}//FIN METODO
	//FIN METODOS "ITIPO"
	
	//METODOS DE ACCESO A "METODO VALUACION"
	public void setMetodoValuacion(int metodoValuacion) {
		this.metodoValuacion.set(metodoValuacion);
	}//FIN METODO
	
	public int getMetodoValuacion() {
		return this.metodoValuacion.get();
	}//FIN METODO
	
	public ObjectProperty<Integer> metodoValuacionProperty() {
		return this.metodoValuacion;
	}//FIN METODO
	//FIN METODOS "METODO VALUACION"
	
	//METODOS DE ACCESO A "PRECIO1"
	public void setPrecio1(Double precio1) {
		this.precio1.set(precio1);
	}//FIN METODO
	
	public Double getPrecio1() {
		return this.precio1.get();
	}//FIN METODO
	
	public ObjectProperty<Double> precio1Property() {
		return this.precio1;
	}//FIN METODO
	//FIN METODOS "PRECIO1"
	
	//METODOS DE ACCESO A "PRECIO2"
	public void setPrecio2(Double precio2) {
		this.precio2.set(precio2);
	}//FIN METODO
	
	public Double getPrecio2() {
		return this.precio2.get();
	}//FIN METODO
	
	public ObjectProperty<Double> precio2Property() {
		return this.precio2;
	}//FIN METODO
	//FIN METODOS "PRECIO2"
	
	//METODOS DE ACCESO A "PRECIO3"
	public void setPrecio3(Double precio3) {
		this.precio3.set(precio3);
	}//FIN METODO
	
	public Double getPrecio3() {
		return this.precio3.get();
	}//FIN METODO
	
	public ObjectProperty<Double> precio3Property() {
		return this.precio3;
	}//FIN METODO
	//FIN METODOS "PRECIO3"
	
	//METODOS DE ACCESO A "PRECIO4"
	public void setPrecio4(Double precio4) {
		this.precio4.set(precio4);
	}//FIN METODO
	
	public Double getPrecio4() {
		return this.precio4.get();
	}//FIN METODO
	
	public ObjectProperty<Double> precio4Property() {
		return this.precio4;
	}//FIN METODO
	//FIN METODOS "PRECIO4"
	
	//METODOS DE ACCESO A "PRECIO3"
	public void setPrecio5(Double precio5) {
		this.precio5.set(precio5);
	}//FIN METODO
	
	public Double getPrecio5() {
		return this.precio5.get();
	}//FIN METODO
	
	public ObjectProperty<Double> precio5Property() {
		return this.precio5;
	}//FIN METODO
	//FIN METODOS "PRECIO5"
	
	//METODOS DE ACCESO A "REQLOTE"
	public void setReqLote(int reqLote) {
		this.reqLote.set(reqLote);
	}//FIN METODO
	
	public int getReqLote() {
		return this.reqLote.get();
	}//FIN METODO
	
	public ObjectProperty<Integer> reqLoteProperty() {
		return this.reqLote;
	}//FIN METODO
	//FIN METODOS "REQLOTE"
	
	//METODOS DE ACCESO A "REQSERIE"
	public void setReqSerie(int reqSerie) {
		this.reqSerie.set(reqSerie);
	}//FIN METODO
	
	public int getReqSerie() {
		return this.reqSerie.get();
	}//FIN METODO
	
	public ObjectProperty<Integer> reqSerieProperty() {
		return this.reqSerie;
	}//FIN METODO
	//FIN METODOS "REQSERIE"
	
	//METODOS DE ACCESO A "SALDO"
	public void setSaldo(Double saldo) {
		this.saldo.set(saldo);
	}//FIN METODO
	
	public Double getSaldo() {
		return this.saldo.get();
	}//FIN METODO
	
	public ObjectProperty<Double> saldoProperty() {
		return this.saldo;
	}//FIN METODO
	//FIN METODOS "SALDO"
	
	//METODOS DE ACCESO A "UNIDAD"
	public void setUnidad(String unidad) {
		this.unidad.set(unidad);
	}//FIN METODO
	
	public String getUnidad() {
		return this.unidad.get();
	}//FIN METODO
	
	public StringProperty unidadProperty() {
		return this.unidad;
	}//FIN METODO
	//FIN METODOS "UNIDAD"
	
	//METODOS DE ACCESO A "VISIBLE"
	public void setVisible(int visible) {
		this.visible.set(visible);
	}//FIN METODO
	
	public int getVisible() {
		return this.visible.get();
	}//FIN METODO
	
	public ObjectProperty<Integer> visibleProperty() {
		return this.visible;
	}//FIN METODO
	//FIN METODOS "VISIBLE"
	
	//METODOS DE ACCESO A "IDEPARTAMENTO"
	public void setIDepartamento(int iDepartamento) {
		this.iDepartamento.set(iDepartamento);
	}//FIN METODO
	
	public int getIDepartamento() {
		return this.iDepartamento.get();
	}//FIN METODO
	
	public ObjectProperty<Integer> iDepartamentoProperty() {
		return this.iDepartamento;
	}//FIN METODO
	//FIN METODOS "IDEPARTAMENTO"
	
	//METODOS DE ACCESO A "IDIVISA"
	public void setIDivisa(int iDivisa) {
		this.iDivisa.set(iDivisa);
	}//FIN METODO
	
	public int getIDivisa() {
		return this.iDivisa.get();
	}//FIN METODO
	
	public ObjectProperty<Integer> iDivisaProperty() {
		return this.iDivisa;
	}//FIN METODO
	//FIN METODOS "IDIVISA"
	
	//METODOS DE ACCESO A "ILINEA"
	public void setILinea(int iLinea) {
		this.iLinea.set(iLinea);
	}//FIN METODO
	
	public int getILinea() {
		return this.iLinea.get();
	}//FIN METODO
	
	public ObjectProperty<Integer> iLineaProperty() {
		return this.iLinea;
	}//FIN METODO
	//FIN METODOS "ILINEA"
	
	//METODOS DE ACCESO A "IMARCA"
	public void setIMarca(int iMarca) {
		this.iMarca.set(iMarca);
	}//FIN METODO
	
	public int getIMarca() {
		return this.iMarca.get();
	}//FIN METODO
	
	public ObjectProperty<Integer> iMarcaProperty() {
		return this.iMarca;
	}//FIN METODO
	//FIN METODOS "IMARCA"
	
	//METODOS DE ACCESO A "IMPUESTOS"
	public void setImpuestos(int impuestos) {
		this.impuestos.set(impuestos);
	}//FIN METODO
	
	public int getImpuestos() {
		return this.impuestos.get();
	}//FIN METODO
	
	public ObjectProperty<Integer> impuestosProperty() {
		return this.impuestos;
	}//FIN METODO
	//FIN METODOS "IMPUESTOS"
	
	//METODOS DE ACCESO A "UFSATPROSER"
	public void setUfSATProser(String ufSATProser) {
		this.ufSATProser.set(ufSATProser);
	}//FIN METODO
	
	public String getUfSATProser() {
		return this.ufSATProser.get();
	}//FIN METODO
	
	public StringProperty ufSATProserProperty() {
		return this.ufSATProser;
	}//FIN METODO
	//FIN METODOS "UFSATPROSER"
	
	//METODOS DE ACCESO A "UFSATUNIPROSER"
	public void setUfSATUniproser(String ufSATUniproser) {
		this.ufSATUniproser.set(ufSATUniproser);
	}//FIN METODO
	
	public String getUfSATUniproser() {
		return this.ufSATUniproser.get();
	}//FIN METODO
	
	public StringProperty ufSATUniproserProperty() {
		return this.ufSATUniproser;
	}//FIN METODO
	//FIN METODOS "UFSATUNIPROSER"
}//FIN CLASE