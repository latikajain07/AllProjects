package diagnostic_centre_data_api.Diagnostic_centre;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.reactive.function.client.WebClient;

@SpringBootApplication
public class DiagnosticCentreApplication {

	@Bean	
	public WebClient.Builder getWebClient()
	{
		return WebClient.builder();
		
	}
	    
		public static void main(String[] args) {
		SpringApplication.run(DiagnosticCentreApplication.class, args);
	}

}
