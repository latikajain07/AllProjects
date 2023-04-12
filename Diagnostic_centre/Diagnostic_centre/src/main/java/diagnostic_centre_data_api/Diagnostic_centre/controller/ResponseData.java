package diagnostic_centre_data_api.Diagnostic_centre.controller;

public class ResponseData<Hospital_management, Diagnostic_info> {     
	
	private Hospital_management hospital;
	private Diagnostic_info diagnostic;
	
	public Hospital_management getHospital() {
		return hospital;
	}
	public void setHospital(Hospital_management hospital) {
		this.hospital = hospital;
	}
	public Diagnostic_info getDiagnostic() {
		return diagnostic;
	}
	public void setDiagnostic(Diagnostic_info diagnostic) {
		this.diagnostic = diagnostic;
	}
	@Override
	public String toString() {
		return "ResponseData [hospital=" + hospital + ", diagnostic=" + diagnostic + "]";
	}
	  
	   
}
