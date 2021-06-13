package AdministrationTransformRule;

import java.util.Random;

import AdministrationExample.Daytime;
import AdministrationTransformRule.api.AdministrationTransformRuleAPI;

public class AdministrationRules {
	private AdministrationTransformRuleAPI api;

	
	
	public AdministrationRules() { // Initializes api the Administrationrules with the model created previously
		api = new AdministrationValidator().initAPI();
	}

	public static void main(String[] args) { // main method to invoke the methods to apply and validate the ruleset
		AdministrationRules administrationRules = new AdministrationRules();
		administrationRules.createAdministration();
		administrationRules.validateAdministration();

	}

	public void createAdministration() { // Method for the application of the ruleset 
	
			
		long staffMemberNumber = api.findStaff().countMatches();
		long staffCount= 0;
		
		
		
		while(staffCount <= staffMemberNumber)
		{
		int lengthDaytime = Daytime.values().length -1;
		int lengthDaytime2 = lengthDaytime + 1;
		int randDaytimeNumber = new Random().nextInt(lengthDaytime);	
		int randDaytimeNumber2 = new Random().nextInt(lengthDaytime2);	
		api.staff(Daytime.values()[randDaytimeNumber], Daytime.values()[randDaytimeNumber2]).apply();
		staffCount++;
		}
		
		long countPatients = api.findPatient().countMatches();
		long countPatientsCovered = 0;
		
		
		while(countPatientsCovered <= countPatients) {
			api.patientCovered().apply();
			countPatientsCovered++;
			
		}
		
		api.terminate();
	}

	public void validateAdministration() { // Output to check if the ruleset has been applied properly
		
		if (api.findAdministration().countMatches() == 1) {
			System.out.println("One instance of an administration has been created");
		} else
			System.out.println("Error, the administration was not created");
		
	

		long countpatients = api.findPatient().countMatches();
		System.out.println(countpatients + " patients are in the hospital right now");

	

		long countStaff = api.findStaff().countMatches();
		System.out.println(countStaff+ " staff members are in the hospital right now");
		

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