package BoH;
/**
@autor Sebastian Leonardo Souto Robles
*/
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.TreeMap;

import javax.swing.JOptionPane;

public class Fichero {
	
	
	public static void Guardar(String f_salida,double entra,TreeMap<Integer,Gasto> lista){
		
        PrintWriter pw = null;
		try {
			pw = new PrintWriter(f_salida);
            
			//pw.println(entra);//
			for(int x=0;x<BoH.lista_ingreso.size();x++){
		    	 Ingreso salida=(Ingreso)BoH.lista_ingreso.get(x);
		    	 pw.println(salida.getImporte()+"*"+salida.getFecha());
		    }
					
		    for(int x=0;x<lista.size();x++){
		    	 Gasto salida=(Gasto)lista.get(x);
		    	 pw.println(salida.getConcepto()+"*"+salida.getImporte()+"*"+salida.getFecha());
		    }
			pw.close(); //CERRAMOS EL FICHERO
		}		
		catch(Exception e){ 
			JOptionPane.showMessageDialog(null,"Error en fichero.");
			//System.out.println("Error en fichero.");
			System.exit(0);
		}
	}
	

	//	QUEDA PORCARGAR LAS APUESTAS, NO FUNCIONA.
	  public static void Cargar (String f_entrada) {
	    	/*PRIMERO VERIFICAMOS QUE EXISTA EL FICHERO, DESPUES PASAMOS LOS DATOS A UN OBJETO DE
	    	 * LINEA Y POSTERIORMENTE AL MAPA.*/
	    	
		String lineas;
		String [] campo;

		Scanner ficheroentrada=null;
		try	{

			ficheroentrada = new Scanner(new FileInputStream(f_entrada));

		}catch(FileNotFoundException e){
			JOptionPane.showMessageDialog(null,"Fichero no encontrado.");
			//System.out.println("Fichero no encontrado.");
			return;
			//System.exit(0);
		}

		int x=0,conta=0;
		while(ficheroentrada.hasNextLine()){ //recorremos fichero
			
			lineas = ficheroentrada.nextLine();
	//		System.out.println("#"+lineas);
			lineas.trim();
			String [] parametros=	lineas.split("\\*");
		//	System.out.println("-"+parametros.length+"+"+parametros.toString());
			
			if(parametros.length==2){
				Double importe=Double.parseDouble(parametros[0]);
				String fecha=parametros[1];
				Ingreso g1=new Ingreso(importe,fecha);
				//System.out.println("Objeto cargado: "+g1.toString());
				BoH.lista_ingreso.put(Ingreso.key_ingreso, g1);
				Ingreso.key_ingreso++;
			}
			if(parametros.length>2){
				
				//System.out.println("*"+parametros[0]+"*"+parametros[1]+"*"+parametros[2]);
				String concepto=parametros[0];
				Double importe=Double.parseDouble(parametros[1]);
				String fecha=parametros[2];
				Gasto g1=new Gasto(importe,fecha,concepto);
				//System.out.println("Objeto cargado: "+g1.toString());
				BoH.lista.put(BoH.key, g1);
				BoH.key++;
				
				
			}
			
			
		}
		//System.out.println("Se ha cargado el archivo.");
		
		ficheroentrada.close();
		
	}


	  public static void CerrarMes(){
		    PrintWriter pw = null;
			try {
				pw = new PrintWriter("Mes_Cerrado.txt");
	            
				//pw.println(entra);//
				pw.println("**********************************************************************");
				pw.println("***********INGRESOS ESTE MES******************************************");
				for(int x=0;x<BoH.lista_ingreso.size();x++){
			    	 Ingreso salida=(Ingreso)BoH.lista_ingreso.get(x);
			    	 pw.println(salida.toString());
			    }
				pw.println("**********************************************************************");
				pw.println("***********INGRESOS ESTE MES******************************************");
			    for(int x=0;x<BoH.lista.size();x++){
			    	 Gasto salida=(Gasto)BoH.lista.get(x);
			    	 pw.println(salida.toString());
			    }
			    pw.println("*********************************************************************");
			    pw.println("Gasto total: "+String.format("%.2f",Gasto.dame_gasto()));
			    pw.println("Saldo final: "+String.format("%.2f",Ingreso.dame_sueldo()));
			    pw.println("*********************************************************************");
			    pw.println("*********************************************************************");
				pw.close(); //CERRAMOS EL FICHERO
				JOptionPane.showMessageDialog(null,"El mes se ha cerrado y los datos estan en Mes_Cerrado.txt"
						+ " puede borrar Agenda.txt si no quiere que sus gatos del nuevo mes se unan al del anterior"
						+ " en caso contrario no lo borre.");
			}		
			catch(Exception e){ 
				JOptionPane.showMessageDialog(null,"Error en fichero.");
				//System.out.println("Error en fichero.");
				System.exit(0);
			}
	  }

}


