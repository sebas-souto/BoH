package BoH;
/**
@autor Sebastian Leonardo Souto Robles
*/
import java.util.Date;
import java.util.TreeMap;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;



public class BoH {
	public static  TreeMap<Integer,Gasto> lista=new TreeMap<Integer,Gasto>();
	public static  TreeMap<Integer,Gasto> lista_comunes=new TreeMap<Integer,Gasto>();
	public static  TreeMap<Integer,Ingreso> lista_ingreso=new TreeMap<Integer,Ingreso>();
	public static int key=0;
	public static double saldo_actual=0;
	public static String fichero;
	
	
	public static void main(String[] args) {
		fichero="Agenda.txt";
		int eleccion;
		Date hoy= new Date();
		Fichero f1=new Fichero();
		f1.Cargar(fichero);
		Menu m1=new Menu();
		Ingreso saldo=null;
		int p=0;
		
                Ventana venta=new Ventana();
		venta.setVisible(true);
		
	    f1.Guardar(fichero, saldo_actual, lista);
		
	}
	
	public static double dame_saldo(){
		return saldo_actual;
	}

	
	
}
