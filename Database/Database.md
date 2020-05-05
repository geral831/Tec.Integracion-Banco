# Base de Datos

### Clase Conexion

``` java
package Database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexionAWS {

	Connection conn = null;

	String driver = "com.mysql.jdbc.Driver";
	String database =  "Banco";
	String hostname = "localhost";
	String port = "3306";
	String url = "jdbc:mysql://"+hostname+":"+port+"/"+database+"?useTimezone=true&serverTimezone=UTC";
	String username = "root";
	String password = "";
	
	public Connection connect() {
		
		try {
			this.conn = DriverManager.getConnection(this.url,this.username,this.password);
		} catch (SQLException e) {
			System.out.println("Conexion Fallida!:\n" + e.getMessage());
		}

		if (conn != null) {
			System.out.println("Conexion establecida");
		} else {
			System.out.println("No se pudo establecer conexion");
		}
		
		return this.conn;
	
	}

}
```
### Base de datos MySQL en EC2: Banco

![](https://github.com/geral831/Tec.Integracion-Banco/blob/master/Database/img/c1.png)

### Tabla para el registro de Pagos

```sql

CREATE TABLE `pagos_realizados` (
  `num_tarjeta` varchar(16) NOT NULL,
  `cantidad` int(10) NOT NULL,
  `pin` int(4) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
```


![](https://github.com/geral831/Tec.Integracion-Banco/blob/master/Database/img/c2.png)

### Tabla para el registro de Reembolsos
```sql
CREATE TABLE `reembolsos_realizados` (
  `num_tarjeta` varchar(16) NOT NULL,
  `pago_por_reservacion` int(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

```
![](https://github.com/geral831/Tec.Integracion-Banco/blob/master/Database/img/c3.png)



### Web Service en Ejecucion
![](https://github.com/geral831/Tec.Integracion-Banco/blob/master/Database/img/c4.png)
