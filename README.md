# Banco

Servicio Web de un banco para el cobro y reembolso por tarjeta. 

[Links](http://3.87.203.171:8080/banco.wsdl)

## Operaciones

- Cobro
- Reembolso

## Cobro 

Atributo  | Tipo
------------- | -------------
num_tarjeta  | String
cantidad  | String
pin | int

## Reembolso

Atributo  | Tipo
------------- | -------------
num_tarjeta  | String
pago_por_reservacion  | int

## Mensajes 

**Cobro:** Pide que se ingrese un numero de tarjeta (16 digitos), la cantidad a pagar y el codigo de seguridad (PIN) para hacer la transaccion, si los campos son llenados correctamente manda el mensaje: **"Pago exitoso por la cantidad de: $ `cantidad` pesos  con cargo a la tarjeta: `num_tarjeta` "**.

**Reembolso:** Pide que se ingrese un numero de tarjeta (16 digitos) y la cantidad que pagó por la reservacion, si los campos son llenados correctamente manda el mensaje: **"El reembolso es del 50 % por lo que la cantidad de reembolso es de: $ `reembolso` pesos  
A la cuenta:`num_tarjeta` "**.
