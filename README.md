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
            <ban:nombre_cliente></ban:nombre_cliente>
            <ban:num_tarjeta></ban:num_tarjeta>
            <ban:fecha_vencimiento></ban:fecha_vencimiento>
            <ban:codigo_cvc></ban:codigo_cvc>
            <ban:cantidad></ban:cantidad>
        </ban:RealizarCobroRequest>
    </x:Body>
</x:Envelope>
	
```

- Reembolso

```xml
<SOAP-ENV:Envelope
    xmlns:SOAP-ENV="http://schemas.xmlsoap.org/soap/envelope/">
    <SOAP-ENV:Header/>
    <SOAP-ENV:Body>
        <ns2:ReembolsoResponse
            xmlns:ns2="http://www.example.org/banco">
            <ns2:reembolso_realizado
                xmlns:xs="http://www.w3.org/2001/XMLSchema"
                xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xsi:type="xs:string">
El reembolso es del 95 % 
Por lo que la cantidad de reembolso es de: $ 2850 pesos
A la cuenta: 3250000000000015
            </ns2:reembolso_realizado>
        </ns2:ReembolsoResponse>
    </SOAP-ENV:Body>
</SOAP-ENV:Envelope>
	
```
## Mensajes 

**Función**  | **Parámetros** |**Mensaje**
------------- | -------------| -----------
**RealizarCobro** |`nombre_cliente`,`num_tarjeta`,`fecha_vencimineto`,`codigo_cvc` y `cantidad`	| "Pago exitoso por la cantidad de: $ `cantidad` pesos  con cargo a la tarjeta: `num_tarjeta`... El pago ha sido registrado con exito".
 **Reembolso** | `num_tarjeta` y `pago_por_reservacion`|El reembolso es del 95 % Por lo que la cantidad de reembolso es de: $ `cantidad` pesos A la cuenta: `num_tarjeta`


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

