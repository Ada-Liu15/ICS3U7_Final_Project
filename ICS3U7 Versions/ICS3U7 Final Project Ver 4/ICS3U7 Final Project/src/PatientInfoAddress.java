
/**
 * 
 * @author Ada
 *
 */

public class PatientInfoAddress {
	private static String address = "";
	private static String city = "";
	private static String province = "";
	
	public PatientInfoAddress(String fAddress, String fCity, String fProvince) {
		address = fAddress;
		city = fCity;
		province = fProvince;
	}
	
	public String changeStreet(String cAddress) {
		address = cAddress;
		return address;
	}
	
	public String changeCity(String cCity) {
		city = cCity;
		return city;
	}
	
	public String changeProvince(String cProvince) {
		province = cProvince;
		return province;
	}
	
	public String getAddress() {
		return address;
	}
	
	public String getCity() {
		return city;
	}
	
	public String getProvince() {
		return province;
	}
	
}