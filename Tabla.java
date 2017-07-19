package BoH;
/**
@autor Sebastian Leonardo Souto Robles
*/
import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.JPanel;
import javax.swing.JFrame;
import java.awt.*;
import java.awt.event.*;
import java.util.TreeMap;

public class Tabla extends JFrame {
	
 public Tabla() {
	 super("BoH-The business of my home");
	 //array bidimencional de objetos con los datos de la tabla
	 String [] columnas={"Concepto", "Importe", "Fecha"};
	 Object[][] data = new Object[BoH.lista.size()][3];
	 for (int i = 0; i < BoH.lista.size(); i++) {
		 	Gasto aux=(Gasto)BoH.lista.get(i);
		 	data[i][0] = aux.getConcepto();
		 	data[i][1] = aux.getImporte();
		 	data[i][2]=aux.getFecha();	
     }
	 //array de String's con los títulos de las columnas
	 crear_tabla(columnas,data);
	
 }
 public Tabla( TreeMap<Integer,Ingreso> lista_ingreso) {
	 super("BoH-The business of my home");
	 //array bidimencional de objetos con los datos de la tabla
	 String [] columnas={"Importe", "Fecha"};
	 Object[][] data = new Object[lista_ingreso.size()][2];
	 for (int i = 0; i < lista_ingreso.size(); i++) {
		 Ingreso aux=(Ingreso)lista_ingreso.get(i);
		 	data[i][0] = aux.getImporte();
		 	data[i][1]=aux.getFecha();	
     }
	 //array de String's con los títulos de las columnas
	 crear_tabla(columnas,data);
	
 }
 
 public void crear_tabla( String [] columnas,Object[][] data){
	 
	 //se crea la Tabla
	 final JTable table = new JTable(data, columnas);
 	table.setPreferredScrollableViewportSize(new Dimension(500, 70));
 	//Creamos un JscrollPane y le agregamos la JTable
 	JScrollPane scrollPane = new JScrollPane(table);
 	//Agregamos el JScrollPane al contenedor
 	getContentPane().add(scrollPane, BorderLayout.CENTER);
 	//manejamos la salida
 	addWindowListener(new WindowAdapter() {
 		public void windowClosing(WindowEvent e) {
 		//	System.exit(0);
 		}
 });
 }
 


}
