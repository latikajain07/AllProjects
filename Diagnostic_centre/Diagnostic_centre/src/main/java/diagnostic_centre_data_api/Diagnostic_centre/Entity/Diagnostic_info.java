package diagnostic_centre_data_api.Diagnostic_centre.Entity;

public class Diagnostic_info {
	
	private int diagnosticId;
	private String name;
	private String address;
	private int hospitalId;
	
	public int getDiagnosticId() {
		return diagnosticId;
	}
	public void setDiagnosticId(int diagnosticId) {
		this.diagnosticId = diagnosticId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getHospitalId() {
		return hospitalId;
	}
	public void setHospitalId(int hospitalId) {
		this.hospitalId = hospitalId;
	}

}
