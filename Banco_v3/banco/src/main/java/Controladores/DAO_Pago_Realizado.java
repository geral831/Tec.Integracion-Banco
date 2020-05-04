package Controladores;

import java.sql.SQLException;

import Database.ConexionAWS;

public class DAO_Pago_Realizado {
	
	String num_tarjeta;
	int cantidad;
	int pin;
	
	ConexionAWS database;
	
	public DAO_Pago_Realizado(String num_tarjeta, int cantidad, int pin) {
		this.num_tarjeta = num_tarjeta;
		this.cantidad = cantidad;
		this.pin = pin;
	}
	
	
	public boolean registrarPago() {
		boolean resultado = false;
		this.database = new ConexionAWS();
		try {
			this.database.connect().createStatement().execute(
					"INSERT INTO pagos_realizados (num_tarjeta, cantidad, pin) VALUES "
							+ "('"+this.num_tarjeta+"','"+this.cantidad+"','"+this.pin+"')");
			resultado = true;
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return resultado;
	}

}
