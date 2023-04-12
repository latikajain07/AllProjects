package diagnostic_centre_data_api.Diagnostic_centre.controller;

public class Hospital_managemenet {

	private int hospitalId;
	private String hospital_name;
	private String hospital_address;
	public int getHospitalId() {
		return hospitalId;
	}
	public void setHospitalId(int hospitalId) {
		this.hospitalId = hospitalId;
	}
	public String getHospital_name() {
		return hospital_name;
	}
	public void setHospital_name(String hospital_name) {
		this.hospital_name = hospital_name;
	}
	public String getHospital_address() {
		return hospital_address;
	}
	public void setHospital_address(String hospital_address) {
		this.hospital_address = hospital_address;
	}
	@Override
	public String toString() {
		return "Hospital_managemenet [hospitalId=" + hospitalId + ", hospital_name=" + hospital_name
				+ ", hospital_address=" + hospital_address + "]";
	}
	
	
}
