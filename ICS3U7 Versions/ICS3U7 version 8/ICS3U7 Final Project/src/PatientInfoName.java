/**
 * Patient Information Name
 * @author Ada
 */

public class PatientInfoName {
	
	//declare variables
    private static String firstNameOfPatient = "";
    private static String lastNameOfPatient = "";

    /**
     * Constructor for the patient info name class
     * @param firstName
     * @param lastName
     */
    public PatientInfoName(String firstName, String lastName) {
        firstNameOfPatient = firstName;
        lastNameOfPatient = lastName;
    }

    /**
     * changes the first name
     * @param firstNameChanged
     * @return changed first name
     */
    public String changeFirstName(String firstNameChanged) {
        firstNameOfPatient = firstNameChanged;
        return firstNameOfPatient;
    }

    /**
     * changes the last name
     * @param lastNameChanged
     * @return changed last name
     */
    public String changeLastName(String lastNameChanged) {
        lastNameOfPatient = lastNameChanged;
        return lastNameOfPatient;
    }
    
    /**
     * gets first name
     * @return gets first name
     */
    public String getFirstName() {
        return firstNameOfPatient;
    }

    /**
     * gets last name
     * @return get last name
     */
    public String getLastName() {
        return lastNameOfPatient;
    }
    
    /**
     * gets the full name
     * @return full name
     */
    public String getFullName() {
        return firstNameOfPatient + " " + lastNameOfPatient;
    }

}