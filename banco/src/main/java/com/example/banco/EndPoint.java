package com.example.banco;

import org.example.banco.*;

import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

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
		
				
				respuesta.setPagoRealizado("Pago exitoso por la cantidad de: $ "  + cant.getCantidad() + " pesos con cargo a la tarjeta: " + peticion.getNumTarjeta());
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
					
					respuesta.setReembolsoRealizado("El reembolso es del 50 % por lo que la cantidad de reembolso es de: $ "  + pago.getPagoPorReservacion() + " pesos" + "\n" + "A la cuenta: " + peticion.getNumTarjeta());
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
