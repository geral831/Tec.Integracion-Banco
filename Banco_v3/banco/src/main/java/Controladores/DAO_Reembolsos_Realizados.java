package Controladores;

import java.sql.SQLException;
import Database.ConexionAWS;


public class DAO_Reembolsos_Realizados {
	
	String num_tarjeta;
	int pago_por_reservacion;
	int pago_reembolso;
	
	
	ConexionAWS database;
	
	public DAO_Reembolsos_Realizados(String num_tarjeta, int pago_por_reservacion) {
		this.num_tarjeta = num_tarjeta;
		this.pago_por_reservacion = pago_por_reservacion;
		
		
	}
	
	
	public boolean registrarReembolso() {
		boolean resultado = false;
		this.database = new ConexionAWS();
		try {
			this.database.connect().createStatement().execute(
					"INSERT INTO  reembolsos_realizados(num_tarjeta, pago_por_reservacion) VALUES "
							+ "('"+this.num_tarjeta+"','"+this.pago_por_reservacion+"')");
			resultado = true;
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return resultado;
	}

}
