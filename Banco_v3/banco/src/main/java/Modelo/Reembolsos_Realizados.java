package Modelo;

public class Reembolsos_Realizados {
	
	String num_tarjeta;
	int pago_por_reservacion;
	
	
	public Reembolsos_Realizados(String num_tarjeta, int pago_por_reservacion) {
		
		this.num_tarjeta = num_tarjeta;
		this.pago_por_reservacion = pago_por_reservacion;
	
		
	}
	
	public void setNum_Tarjeta(String num_tarjeta) {
		this.num_tarjeta = num_tarjeta;
	}
	
	public String getNum_Tarjeta() {
		return num_tarjeta;
	}
	
	public void setPago_por_Reservacion(int pago_por_reservacion) {
		this.pago_por_reservacion = pago_por_reservacion;
	}
	
	public int getPago_por_Reservacion() {
		return pago_por_reservacion;
	}
	
	
	
}
