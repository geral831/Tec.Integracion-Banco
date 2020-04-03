# Banco

Servicio Web de un banco para el cobro y reembolso por tarjeta. 

[Links](http://3.87.203.171:8080/banco.wsdl)

## Operaciones

- Cobro
- Reembolso

## Cobro 

Atributo  | Tipo
------------- | -------------
Num_tarjeta  | String
Cantidad  | String

## Reembolso

Atributo  | Tipo
------------- | -------------
Num_tarjeta  | String
Cantidad  | String

## Mensajes 

**Cobro:** Pide que se ingrese un numero de tarjeta (16 digitos) y la cantidad a pagar, si los campos son llenados correctamente manda el mensaje: **"Pago exitoso por la cantidad de: $ `cantidad` pesos  con cargo a la tarjeta: `num_tarjeta` "**.

**Reembolso:** Pide que se ingrese un numero de tarjeta (16 digitos) y la cantidad que será reembolsada al cliente, si los campos son llenados correctamente manda el mensaje: **"Rembolso exitoso por la cantidad de: $ `cantidad` pesos  con cargo a la tarjeta: `num_tarjeta` "**.
