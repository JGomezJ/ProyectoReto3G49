package co.jagj.proyectos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@EntityScan(basePackages = {"co.jagj.proyectos.modelo.entidades"})
@SpringBootApplication
public class ProyectoReto3G943Application {

	public static void main(String[] args) {
		SpringApplication.run(ProyectoReto3G943Application.class, args);
	}

}
