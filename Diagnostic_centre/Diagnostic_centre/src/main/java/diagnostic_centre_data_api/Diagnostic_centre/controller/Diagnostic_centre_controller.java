package diagnostic_centre_data_api.Diagnostic_centre.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.reactive.function.client.WebClient;

import diagnostic_centre_data_api.Diagnostic_centre.Entity.Diagnostic_info;

@RestController
@RequestMapping("/diagnostic")
public class Diagnostic_centre_controller {
	

	
	@Autowired
	private WebClient.Builder webClient;
	 
	@GetMapping("/{diagnosticId}")
	ResponseEntity<ResponseData> getdiagnosticdetail(@PathVariable int diagnosticId)	
	
	{
	
		 ResponseData responseData= new ResponseData();		
		Diagnostic_info diagnostic_info=new Diagnostic_info();
		diagnostic_info.setDiagnosticId(1);
		diagnostic_info.setName("diagnostic_leelavati");
		diagnostic_info.setAddress("gsajhghgxdhgA");
		diagnostic_info.setHospitalId(1);
		
		int hospipatlId= diagnostic_info.getHospitalId();
		
		
		responseData.setDiagnostic(diagnostic_info); 
		
		Hospital_managemenet h1=webClient.build()
				.get().uri("http://localhost:8080/hospital/"+hospipatlId)
	        	.retrieve()
		        .bodyToMono(Hospital_managemenet.class).block();
		
		
		    responseData.setHospital(h1);
		return new ResponseEntity<ResponseData>(responseData,HttpStatus.OK);
		
	}

}
