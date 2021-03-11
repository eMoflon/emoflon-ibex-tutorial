package AdministrationTransformRule;

import AdministrationTransformRule.api.AdministrationTransformRuleAPI;

public class AdministrationRules {
	private AdministrationTransformRuleAPI api;

	public AdministrationRules() {
		api = new AdministrationValidator().initAPI();
	}

	public static void main(String[] args) {
		AdministrationRules administrationRules = new AdministrationRules();
		administrationRules.validateAdministration();
		administrationRules.createAdministration();
		administrationRules.validateAdministration();

	}

	public void createAdministration() {
		api.administration().apply();
		api.patient().apply();
		api.patient().apply();
		api.patient().apply();
		api.patient().apply();
		api.patientCovered().apply();
		api.patientCovered().apply();
		api.patientCovered().apply();
		api.patientCovered().apply();
		api.patientCovered().apply();
		api.patientCovered().apply();
		

	}

	public void validateAdministration() {

		System.out.println(api.patientCovered().countRuleApplications());

		long countpatients = api.findPatient().countMatches();
		System.out.println(countpatients + " Patients are in the hospital right now");

		System.out.println(api.findStaff().countMatches());

		long countpersons = api.findStaff().countMatches() + api.findPatient().countMatches();
		System.out.println(countpersons + " persons are in the hospital right now");

		long countnurses = api.findNurse().countMatches();
		System.out.println(countnurses + "nurses are in the hospital right now");
		long countdoc = api.findDoctor().countMatches();
		System.out.println(countdoc+ "Doctors are in the hospital right now");

		if (api.findEarlyShift().countMatches() + api.findLateShift().countMatches()
				+ api.findNightShift().countMatches() >= 3) {
			System.out.println("The Patient is covered");
		} else
			System.out.println("Shiftplan is not planned properly");

		if (api.findEarlyShift().countMatches() > 0) {
			System.out.println("We have an early shift");
		} else
			System.out.println("No early shifts assigned");

		if (api.findLateShift().countMatches() > 0) {
			System.out.println("We have a late shift");
		} else
			System.out.println("No late shifts assigned");

		if (api.findNightShift().countMatches() > 0) {
			System.out.println("We have a night shift");
		} else
			System.out.println("No night shifts assigned");

	}
}