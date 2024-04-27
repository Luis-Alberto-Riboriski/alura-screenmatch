package estudo.java.spring.Screenmatch;

import estudo.java.spring.Screenmatch.model.DadosSerie;
import estudo.java.spring.Screenmatch.service.ConsumirAPI;
import estudo.java.spring.Screenmatch.service.ConverteDados;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ScreenmatchApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(ScreenmatchApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		ConsumirAPI consumoApi = new ConsumirAPI();
		String json = consumoApi.obterDados("http://www.omdbapi.com/?t=breaking+bad&apikey=f21e0c86");
		System.out.println(json);
		ConverteDados conversor = new ConverteDados();
		DadosSerie dados = conversor.obterDados(json, DadosSerie.class);
		System.out.println(dados);


	}
}
