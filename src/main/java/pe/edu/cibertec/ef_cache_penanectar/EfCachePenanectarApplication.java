package pe.edu.cibertec.ef_cache_penanectar;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class EfCachePenanectarApplication {

	public static void main(String[] args) {
		SpringApplication.run(EfCachePenanectarApplication.class, args);
	}

}
