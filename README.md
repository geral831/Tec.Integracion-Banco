# Banco

Servicio Web de un banco para el cobro y reembolso por tarjeta. 

[Links](http://3.87.203.171:8080/banco.wsdl)

## Operaciones

- Cobro

```xml
<x:Envelope
    xmlns:x="http://schemas.xmlsoap.org/soap/envelope/"
    xmlns:ban="http://www.example.org/banco">
    <x:Header/>
    <x:Body>
        <ban:RealizarCobroRequest>
            <ban:num_tarjeta>325100000000000</ban:num_tarjeta>
            <ban:cantidad>545</ban:cantidad>
            <ban:pin>5454</ban:pin>
        </ban:RealizarCobroRequest>
    </x:Body>
</x:Envelope>
	
```

- Reembolso

```xml
<x:Envelope
    xmlns:x="http://schemas.xmlsoap.org/soap/envelope/"
    xmlns:ban="http://www.example.org/banco">
    <x:Header/>
    <x:Body>
        <ban:ReembolsoRequest>
            <ban:num_tarjeta>3251000000000000</ban:num_tarjeta>
            <ban:pago_por_reservacion>800</ban:pago_por_reservacion>
        </ban:ReembolsoRequest>
    </x:Body>
</x:Envelope>
	
```

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


## Diagrama de Clases 

![](https://github.com/geral831/Tec.Integracion-Banco/blob/master/Docs/diagrama_clases.png)

## Diagrama Casos de Usos

![](https://github.com/geral831/Tec.Integracion-Banco/blob/master/Docs/casos_uso.png)

![](https://github.com/geral831/Tec.Integracion-Banco/blob/master/Docs/CU1_cobro.png)

![](https://github.com/geral831/Tec.Integracion-Banco/blob/master/Docs/CU2_reembolso.png)


## Diagrama de Actividades

![](https://github.com/geral831/Tec.Integracion-Banco/blob/master/Docs/diagrama_Actividades.png)

## Diagrama de Componentes

![](https://github.com/geral831/Tec.Integracion-Banco/blob/master/Docs/diagrama_componentes.png)

## Diagramas de Secuencia

![](https://github.com/geral831/Tec.Integracion-Banco/blob/master/Docs/secuencia_cobro.png)



![](https://github.com/geral831/Tec.Integracion-Banco/blob/master/Docs/secuencia_reembolso.png)

## Mensajes 

**Cobro:** Pide que se ingrese un numero de tarjeta (16 digitos), la cantidad a pagar y el codigo de seguridad (PIN) para hacer la transaccion, si los campos son llenados correctamente manda el mensaje: **"Pago exitoso por la cantidad de: $ `cantidad` pesos  con cargo a la tarjeta: `num_tarjeta` "**.

**Reembolso:** Pide que se ingrese un numero de tarjeta (16 digitos) y la cantidad que pagó por la reservacion, si los campos son llenados correctamente manda el mensaje: **"El reembolso es del 50 % por lo que la cantidad de reembolso es de: $ `reembolso` pesos  
A la cuenta:`num_tarjeta` "**.
