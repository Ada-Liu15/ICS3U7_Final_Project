
public class CurrentIssues_Diagnosis {
	
	public static String typeOfDisease;
	public static String risksOfDisease;
	public static String treatmentOfDisease;
	
	public CurrentIssues_Diagnosis(String fTypeOfDisease, String fRisksOfDisease, String fTreatmentOfDisease) {
		typeOfDisease = fTypeOfDisease;
		risksOfDisease = fRisksOfDisease;
		treatmentOfDisease = fTreatmentOfDisease;
	}
	
	public static String changeTypeOfDisease(String cTypeOfDisease) {
		typeOfDisease = cTypeOfDisease;
		return typeOfDisease;
	}
	
	public static String changeRisksOfDisease(String cRisksOfDisease) {
		risksOfDisease = cRisksOfDisease;
		return risksOfDisease;
	}
	
	public static String changeTreatmentOfDisease(String cTreatmentOfDisease) {
		treatmentOfDisease = cTreatmentOfDisease;
		return treatmentOfDisease;
	}
	
	public static String getTypeOfDisease() {
		return typeOfDisease;
	}
	
	public static String getRisksOfDisease() {
		return risksOfDisease;
	}
	
	public static String getTreatmentOfDisease() {
		return treatmentOfDisease;
	}
	
}
