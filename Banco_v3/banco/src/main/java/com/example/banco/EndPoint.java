package com.example.banco;

import org.example.banco.*;


import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import Controladores.DAO_Pago_Realizado;
import Controladores.DAO_Reembolsos_Realizados;


import java.lang.*;
import java.lang.Number;



@Endpoint
public class EndPoint {
	

	@PayloadRoot(namespace="http://www.example.org/banco", 
			localPart="RealizarCobroRequest")
	
	
	@ResponsePayload
	
	public RealizarCobroResponse Cobro(@RequestPayload RealizarCobroRequest peticion, @RequestPayload RealizarCobroRequest cant, @RequestPayload RealizarCobroRequest pin){
		
		RealizarCobroResponse respuesta = new RealizarCobroResponse();

	
		if (peticion.getNumTarjeta().length()==16) {
			
		String cad1 = peticion.getNumTarjeta().substring(0,4);
			int cadena1 = Integer.parseInt(cad1);
	
			if(cadena1>=3250 && cadena1<=5499){
				
				DAO_Pago_Realizado pago_realizado = new DAO_Pago_Realizado(peticion.getNumTarjeta(), cant.getCantidad(), pin.getPin());
				
				if(pago_realizado.registrarPago()) {
	
					respuesta.setPagoRealizado("\n" + "Pago exitoso por la cantidad de: $ "  + cant.getCantidad() + " pesos" + "\n" + "Con cargo a la tarjeta: " + peticion.getNumTarjeta() +"\n\n" + "El pago ha sido registrado con exito");
					
				}
				else {
					respuesta.setPagoRealizado("No se registro ningun pago...");
				}
				
				
			}
			
			else {
				respuesta.setPagoRealizado("Error... El número de cuenta no existe");
			}
		
			
		}
		
		else {
			respuesta.setPagoRealizado("La tarjeta debe contener 16 digitos...");
		}
		

		return respuesta;
		
	}
	
	
	//-------------------------------------------------------------------------------------
	
	@PayloadRoot(namespace="http://www.example.org/banco", 
			localPart="ReembolsoRequest")
	
	@ResponsePayload
	
	public ReembolsoResponse Reembolso(@RequestPayload ReembolsoRequest peticion, @RequestPayload ReembolsoRequest pago){
		
		ReembolsoResponse respuesta = new ReembolsoResponse();
		
		if (peticion.getNumTarjeta().length()==16) {
			
			String cad1 = peticion.getNumTarjeta().substring(0,4);
				int cadena1 = Integer.parseInt(cad1);
		
				if(cadena1>=3250 && cadena1<=5499){
					
					int reem = pago.getPagoPorReservacion();
					int res = reem /2;
					pago.setPagoPorReservacion(res);
					
					
					DAO_Reembolsos_Realizados registro_reembolsos = new DAO_Reembolsos_Realizados(peticion.getNumTarjeta(), pago.getPagoPorReservacion());
				
					if(registro_reembolsos.registrarReembolso()) {
						
						respuesta.setReembolsoRealizado("\n" +"El reembolso es del 50 % "+ "\n" +"Por lo que la cantidad de reembolso es de: $ "  + pago.getPagoPorReservacion() + " pesos" + "\n" + "A la cuenta: " + peticion.getNumTarjeta());
					}
					else {
						respuesta.setReembolsoRealizado("No se hizo el reembolso");
					}
					
					
					
				}
				
				else {
					respuesta.setReembolsoRealizado("Error... El número de cuenta no existe");
				}
			
				
			}
			
			else {
				respuesta.setReembolsoRealizado("La tarjeta debe contener 16 digitos...");
			}
			

			return respuesta;
		
	}
	

}
