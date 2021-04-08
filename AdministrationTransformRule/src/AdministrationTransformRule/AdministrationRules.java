package AdministrationTransformRule;

import AdministrationExample.Daytime;
import AdministrationTransformRule.api.AdministrationTransformRuleAPI;

public class AdministrationRules {
	private AdministrationTransformRuleAPI api;

	public AdministrationRules() {
		api = new AdministrationValidator().initAPI();
	}

	public static void main(String[] args) {
		AdministrationRules administrationRules = new AdministrationRules();
		administrationRules.createAdministration();
		administrationRules.validateAdministration();

	}

	public void createAdministration() {
		api.administration().apply();
		
		long countpatients = api.findPatient().countMatches();
		long countpatientscovered = 0;
		
		api.staff(Daytime.EARLY, Daytime.LATE).apply();
		api.staff(Daytime.EARLY, Daytime.LATE).apply();
		api.staff(Daytime.NIGHT, Daytime.LATE).apply();
		api.staff(Daytime.EARLY, Daytime.NIGHT).apply();
		api.staff(Daytime.NIGHT, Daytime.LATE).apply();
		api.staff(Daytime.EARLY, Daytime.LATE).apply();
		api.staff(Daytime.EARLY, Daytime.NIGHT).apply();
		api.staff(Daytime.EARLY, Daytime.LATE).apply();
		api.staff(Daytime.EARLY, Daytime.LATE).apply();
		api.staff(Daytime.NIGHT, Daytime.LATE).apply();
		api.staff(Daytime.EARLY, Daytime.LATE).apply();
		api.staff(Daytime.NIGHT, Daytime.LATE).apply();
		api.staff(Daytime.EARLY, Daytime.NIGHT).apply();
		api.staff(Daytime.EARLY, Daytime.NIGHT).apply();
		api.staff(Daytime.EARLY, Daytime.LATE).apply();
		api.staff(Daytime.EARLY, Daytime.LATE).apply();
		api.staff(Daytime.NIGHT, Daytime.LATE).apply();
		api.staff(Daytime.EARLY, Daytime.LATE).apply();
		api.staff(Daytime.NIGHT, Daytime.LATE).apply();
		api.staff(Daytime.EARLY, Daytime.LATE).apply();
		api.staff(Daytime.EARLY, Daytime.NIGHT).apply();
		
		api.patientCovered().apply();
		api.patientCovered().apply();
		api.patientCovered().apply();
		api.patientCovered().apply();
		api.patientCovered().apply();
		api.patientCovered().apply();
		api.patientCovered().apply();
		api.patientCovered().apply();
		api.patientCovered().apply();
		api.patientCovered().apply();
		
		while(countpatients <= countpatientscovered) {
			api.patientCovered().apply();
			countpatientscovered++;
			System.out.println(countpatientscovered);

		}
		
		
		api.terminate();
	}

	public void validateAdministration() {

		System.out.println(api.patientCovered().countRuleApplications());
				
		long countpatients = api.findPatient().countMatches();
		System.out.println(countpatients + " Patients are in the hospital right now");

		System.out.println(api.findStaff().countMatches());

		long countpersons = api.findStaff().countMatches() + api.findPatient().countMatches();
		System.out.println(countpersons + " persons are in the hospital right now");
				
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