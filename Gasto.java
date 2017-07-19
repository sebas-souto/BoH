package BoH;
/**
@autor Sebastian Leonardo Souto Robles
*/
import java.io.FileNotFoundException;
import java.util.Date;
import java.util.TreeMap;

import javax.swing.JOptionPane;



public class Gasto extends Datos{
	private String concepto;
	public static double gasto_total;
	
	public Gasto(double importe, String Fecha, String concepto){
		super(importe, Fecha);
		this.setConcepto(concepto);
	}

	public String getConcepto() {
		return concepto;
	}

	public void setConcepto(String concepto) {
		this.concepto = concepto;
	}
	public String toString(){
		String imprime=String.format("%-20s",concepto);
		return imprime+super.toString();
	}
	
	public static void aniadir_gasto(TreeMap<Integer,Gasto> lista,Menu m1,Date hoy){
		try{
		//	double importe=Double.parseDouble(Ventana.Importe_pantalla.getText());
		//	String concepto=Ventana.Concepto_pantalla.getText();
		//	Gasto g1=new Gasto( importe, hoy.toString(), concepto);
			lista.put(BoH.key, g1);
			BoH.key++;
			BoH.saldo_actual=BoH.saldo_actual-importe;
		//	gasto_total+=importe;
			return;
		}catch(Exception e){
			JOptionPane.showMessageDialog(null,"Error al a�adir gasto, compruebe los valores introducidos.");
			
		}
		
		
	}
	/**********************QUEDA POR TERMINAR**********************************/
	public static int buscar(String concepto){
		int key=0;
		for(int x=0;x<BoH.lista.size();x++){
			Gasto aux=(Gasto)BoH.lista.get(x);
			if(aux.getConcepto().equalsIgnoreCase(concepto.trim())){
				key=x;
			}
		}
		return key;
	}
	/************************************************************************/

	public static void visualizar(TreeMap<Integer,Gasto> lista){
		
		String cabecera= String.format("%-20s%-20s%-20s","CONCEPTO","IMPORTE","FECHA");
		System.out.println(cabecera);
		for(int x=0;x<BoH.key;x++){
			Gasto aux=(Gasto)lista.get(x);
			System.out.println(aux.toString());
			gasto_total+=aux.getImporte();
		}
		System.out.println("		TOTAL: "+gasto_total);
	}
	
	public static void dame_grafica(TreeMap<Integer,Gasto> lista){
		DefaultPieDataset data = new DefaultPieDataset();
		//RECORRER LA LISTA Y A�ARDIRLOS A LA REPRESENTACION
		for(int x=0;x<lista.size();x++){
			Gasto aux=(Gasto) lista.get(x);
			data.setValue(aux.concepto, aux.getImporte());
		}
		//CREAMOS EL GRAFICO DE LOS GASTOS
		 JFreeChart chart = ChartFactory.createPieChart("Gastos",data,true, true,false);
	  
		 // Mostrar Grafico
		    ChartFrame frame = new ChartFrame("BoH-The business of my home", chart);
		    frame.pack();
		    frame.setVisible(true);
		
	}
	
	public static void dame_table(){
		 Tabla frame = new Tabla();
		 frame.pack();
		 frame.setVisible(true);
		
	}
	
	public static double dame_gasto(){
		gasto_total=0;
		for(int x=0;x<BoH.lista.size();x++){
			Gasto aux=(Gasto)BoH.lista.get(x);
			gasto_total+=aux.getImporte();
		}
		return gasto_total;
	}
	public static void modificarGasto(){
		int fila=Integer.parseInt(Ventana2.KeyGasto.getText());
		String concepto=Ventana2.ModiConcepto.getText();
		double importe=Double.parseDouble(Ventana2.ModiImporte.getText());
		Gasto aux=(Gasto)BoH.lista.get(fila-1);
		aux.setImporte(importe);
		aux.setConcepto(concepto);
		BoH.lista.put(fila-1, aux);
	}
	
	public static void eliminarGasto(){
		int fila=Integer.parseInt(Ventana2.EliminarGasto.getText());
		BoH.lista.remove(fila-1);
	}
	

	

}
