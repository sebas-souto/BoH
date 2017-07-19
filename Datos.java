package BoH;

public abstract class Datos {
	private double importe;
	private String Fecha;
	public Datos(double importe,String Fecha){
		this.Fecha=Fecha;
		this.importe=importe;
		
	}
	public double getImporte() {
		return importe;
	}
	public void setImporte(double importe) {
		this.importe = importe;
	}
	public String getFecha() {
		return Fecha;
	}
	public void setFecha(String fecha) {
		Fecha = fecha;
	}
	
	public String toString(){
		String imprime= String.format("%-20s%-20s",importe,Fecha);
		return imprime;
	}
}
