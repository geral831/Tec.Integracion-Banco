package Modelo;

public class Pagos_Realizados {
	
	String num_tarjeta;
	int cantidad;
	int pin;
	
	public Pagos_Realizados(String num_tarjeta, int cantidad, int pin) {
		
		this.num_tarjeta = num_tarjeta;
		this.cantidad = cantidad;
		this.pin = pin;
	}
	
	public void setNum_Tarjeta(String num_tarjeta) {
		this.num_tarjeta = num_tarjeta;
	}
	
	public String getNum_Tarjeta() {
		return num_tarjeta;
	}
	
	
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	
	public int getCantidad() {
		return cantidad;
	}
	
	public void setPin(int pin) {
		this.pin = pin;
	}
	
	public int getPin() {
		return pin;
	}
}
