package BoH;

import java.util.Scanner;

public class Menu {
	public Menu (){}
	
	public static void cabecera(){
		System.out.println("***********************************************");
		System.out.println("**********        BOH            **************");
		System.out.println("**********The business of my home**************");
		System.out.println("***********************************************");
	}
	public static void cola(){
		System.out.println("***********************************************");
		System.out.println("********Sebastian L. Souto Robles**************");
		System.out.println("***********************************************");
	}
	
	public static void cuerpo(){
		System.out.println("1-Ingresar");
		System.out.println("2-Aniadir gasto");
		System.out.println("3-Visualizar");
		System.out.println("4-Grafica gastos");
		System.out.println("0-Salir");
	}
	
	public int selecMenu(){
		int respu=0;
		Scanner sc = new Scanner(System.in);  
		respu = Integer.parseInt(sc.nextLine()); 
		return respu;
	}
	
	
	public double entradaTecladoCantidad(){
		double respu=0;
		Scanner sc = new Scanner(System.in);  
		respu = Double.parseDouble(sc.nextLine()); 
		return respu;
	}
	
	
	public String entradaTecladoTexto(){
		String respu;
		Scanner sc = new Scanner(System.in);  
		respu = sc.nextLine(); 
		return respu;
	}

}
