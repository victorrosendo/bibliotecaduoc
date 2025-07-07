package biblioteca.salas.duoc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DuocApplication {

	public static void main(String[] args) {
		SpringApplication.run(DuocApplication.class, args);
	}

	/*
	Swagger
	 * 1.- Integramos librerias en el pom.xml
	 * 2.- Creamos las dos variables en el aplication.properties
	 * 3.- Modificamos los name de las llaves foraneas de algunos elementos
	 * 4.- creamos el paquete config con la clase openapiconfig
	 * 5.- Ejecutamos
	 * 6.- url: http://localhost:8081/swagger-ui/index.html
	 * 7.- Anotaciones en model y controlador
	 * HATEOAS
	 */

}
