package hospital_data_api.Hospital_management.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import hospital_data_api.Hospital_management.Entity.Hospital_info;

@RestController

@RequestMapping("/hospital")
public class Hopistal_management_controller {

	@GetMapping("/{hospitalId}")
	
	ResponseEntity<Hospital_info> gethospitaldetail(@PathVariable int hospitalId)
	{
	
	 Hospital_info hospital_info = new Hospital_info();
	 hospital_info.setHospitalId(1);
	 hospital_info.setHospital_name("leelavati");
	 hospital_info.setHospital_address("gzfschgfsg");
	 
	 		
		return new ResponseEntity<Hospital_info>(hospital_info,HttpStatus.OK);
		
	}
	
}
