package HospitalTransformRules.util;

import java.io.IOException;
import java.util.Random;

import org.eclipse.emf.common.util.URI;

import HospitalExample.Carelevel;
import HospitalTransformRules.gt.api.GtHiPEGtApi;

public class HospitalRules {
	public static String firstNames[] = {"James","Alisha", "Alex", "Jeffrey", "Eliza", "Martin", 
			"Sven", "Adam", "John", "Steven", "George", "Allan", "Adam", "Misha", "Abigail", "Robert", 
			"Bob", "Chloe", "Melissa", "Lauren", "Stefanie", "Christina", "Austin", "Ron", "James" };
	public static String lastNames[] = {"Black","Greenwood", "Ramirez", "King", "Martinez", "Jupiter", 
			"Boson", "Walker", "Fitzgerald", "Green", "Stafford", "Mercer", "Williams", "Brown", "Jones", "Lewis", 
			"Clark", "Hall", "Nguyen", "More", "Taylor", "Campbell", "Reed", "Murphy", "Rivera" };
	
	private Random rnd;
	public GtHiPEGtApi api;

	public HospitalRules(final long rndSeed) { // Method to initalize a random seed and a new model 
		rnd = new Random(rndSeed);
		api = new GtHiPEGtApi();
		try {
			api.addModel(URI.createURI("hospital.xmi"));
		} catch (Exception e) {
			e.printStackTrace();
		}
		api.initializeEngine();
//		api.trackModelStates(false);
	}

	public static void main(String[] args) throws IOException { // Main method to apply and validate the ruleset
		HospitalRules hospitalrules = new HospitalRules("someSeed".hashCode());
	
		hospitalrules.createHospital();
		hospitalrules.validateHospital();
//		hospitalrules.api.displayModelStates();
		hospitalrules.api.terminate();
	}

	public void createHospital() { // Method where hospital rules are applied step by step
		
		api.hospital().applyAny(true);
		api.reception().applyAny(true);
		
		for(int i=0; i<4; i++) {
			api.department(i+2, 4).applyAny(true);
		}
		for(int i=0; i<16; i++) {
			api.room(4, Carelevel.get(rnd.nextInt(3))).applyAny(true);
		}
		
		int staffID = 2;
		while(api.findDepartmentWithoutDoctor().hasMatches(true)) {
			api.doctor(16, firstNames[rnd.nextInt(firstNames.length)]+" "+lastNames[rnd.nextInt(lastNames.length)], staffID++).applyAny();
		}
		
		while(api.findRoomWithoutNurse().hasMatches(true)) {
			api.assignNurseToRoom(firstNames[rnd.nextInt(firstNames.length)]+" "+lastNames[rnd.nextInt(lastNames.length)], staffID++).applyAny();
		}
		
		int patientID = 2;
		for(int i=rnd.nextInt(16); i>0; i--) {
			api.patient(firstNames[rnd.nextInt(firstNames.length)]+" "+lastNames[rnd.nextInt(lastNames.length)], patientID++, Carelevel.PENDING).applyAny();
		}
	
		while(api.findPatientInReception().hasMatches(true)) {
			api.assignPatientToRoom().applyAny();
		}		

	}

	public void validateHospital() { // Method to validate the ruleset via print outputs

		
		if (api.findHospital().countMatches(true) == 1) {
			System.out.println("One instance of a hospital has been created");
		} else
			System.out.println("Error, the hospital was not created");

		if (api.findReception().countMatches(false) == 1) {
			System.out.println("One instance of a reception has been created");
		} else
			System.out.println("Error, the reception was not created");

		if (api.findDepartment().countMatches(false) > 0) {
			System.out.println("At least one department instance has been created");
		} else
			System.out.println("Error, there are no departments in the hospital");

		if (api.findNurse().countMatches(false) > 0) {
			long nursecount = api.findNurse().countMatches(false);
			long busyNurse = api.findNurseInRoom().countMatches(false);
			System.out.println(
					nursecount + " nurses are in the hospital right now and " + busyNurse + " nurses are busy");
		} else
			System.out.println("Error, there are no nurses in the hospital");

		if (api.findDoctor().countMatches(false) > 0) {
			long docCount = api.findDoctor().countMatches(false);
			long busyDocCount = api.findDocWithPatient().countMatches(false);
			System.out.println(
					docCount + " doctors are in the hospital right now and " + busyDocCount + " doctors are busy");

		} else
			System.out.println("Error, there are no doctors in the hospital");

		if (api.findPatient().countMatches(false) > 0) {
			System.out.println("At least one patient is in the hospital");
		} else
			System.out.println("Error, there are no patients in the hospital");

		if (api.findRoom().countMatches(false) > 0) {
			long patientsInHospital = api.findPatient().countMatches(false);
			long patientsInRoom = api.findPatientInRoom().countMatches(false);
			System.out.println(patientsInHospital + " Patients are in the hospital right now and " + patientsInRoom
					+ " patients are in a room");

		} else
			System.out.println("Error, there are no rooms in the hospital");

	}

}
