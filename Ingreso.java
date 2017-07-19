package BoH;
/**
@autor Sebastian Leonardo Souto Robles
*/
import java.util.Date;

import javax.swing.JOptionPane;

public class Ingreso extends Datos {
	private boolean tipo;
	public static double saldo_actual;
	public static int key_ingreso=0;
	
	public Ingreso(double importe, String Fecha, boolean tipoMensual){
		super(importe, Fecha);
		tipo=tipoMensual;//Ingreso Mensual
	}
	public Ingreso(double importe, String Fecha){
		super(importe, Fecha);
		tipo=false;//Ingreso extra
	}
	

	public boolean isTipo() {
		return tipo;
	}

	public void setTipo(boolean tipo) {
		this.tipo = tipo;
	}
	
	public String toString(){
		return "Saldo Actual: "+String.format("%.2f",saldo_actual)+" "+super.toString();
	}
	
	public static Ingreso ingreso(Date hoy,String cantidad){
		try{
			double importe=Double.parseDouble(cantidad);
			Ingreso money=new Ingreso( importe,hoy.toString(),true);
			BoH.lista_ingreso.put(key_ingreso, money);
			key_ingreso++;
			BoH.saldo_actual+=importe;
			return money;
		}catch(Exception e){
			JOptionPane.showMessageDialog(null,"Error al añadir ingreso, compruebe el valor introducido.");
			
		}
		return null;
	
}
	public static void dame_tabla(){
		 Tabla frame = new Tabla(BoH.lista_ingreso);
		 frame.pack();
		 frame.setVisible(true);
		
	}
	
	public static double dame_sueldo(){
		double saldo=0;
		for(int x=0;x<BoH.lista_ingreso.size();x++){
			Ingreso aux=(Ingreso)BoH.lista_ingreso.get(x);
			saldo+=aux.getImporte();
		}
		double gasto=Gasto.dame_gasto();
		saldo=saldo-gasto;
		return saldo;
		
	}

	/*public static void modificarIngreso(){
		int fila=Integer.parseInt(Ventana2.KeyIngreso.getText());
		double importe=Double.parseDouble(Ventana2.ModiImporteIngreso.getText());
		Ingreso aux=(Ingreso)BoH.lista_ingreso.get(fila-1);
		aux.setImporte(importe);
		BoH.lista_ingreso.put(fila-1, aux);
	}
	public static void eliminarIngreso(){
		int fila=Integer.parseInt(Ventana2.EliminarIngreso.getText());
		BoH.lista_ingreso.remove(fila-1);
	}*/
}
