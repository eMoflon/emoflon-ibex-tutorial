package HospitalTransformRules;

import java.io.IOException;
import java.util.Random;

import HospitalExample.Carelevel;
import HospitalTransformRules.api.HospitalTransformRulesAPI;

public class HospitalRules {
	public static String firstNames[] = {"James","Alisha", "Alex", "Jeffrey", "Eliza", "Martin", 
			"Sven", "Adam", "John", "Steven", "George", "Allan", "Adam", "Misha", "Abigail", "Robert", 
			"Bob", "Chloe", "Melissa", "Lauren", "Stefanie", "Christina", "Austin", "Ron", "James" };
	public static String lastNames[] = {"Black","Greenwood", "Ramirez", "King", "Martinez", "Jupiter", 
			"Boson", "Walker", "Fitzgerald", "Green", "Stafford", "Mercer", "Williams", "Brown", "Jones", "Lewis", 
			"Clark", "Hall", "Nguyen", "More", "Taylor", "Campbell", "Reed", "Murphy", "Rivera" };
	
	private Random rnd;
	public HospitalTransformRulesAPI api;

	public HospitalRules(final long rndSeed) {
		rnd = new Random(rndSeed);
		api = new HospitalValidator().initAPI();
	}

	public static void main(String[] args) throws IOException {
		HospitalRules hospitalrules = new HospitalRules("someSeed".hashCode());
	
		hospitalrules.createHospital();
		hospitalrules.validateHospital();
		try {
			hospitalrules.api.getModel().getResources().get(0).save(null);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		hospitalrules.api.terminate();
	}

	public void createHospital() {
		
		api.hospital().apply();
		api.reception().apply();
	
		for(int i=0; i<4; i++) {
			api.department(i+1, 4).apply();	
		}
		for(int i=0; i<16; i++) {
			api.room(4, Carelevel.get(rnd.nextInt(3))).apply();
		}
		
		int staffID = 1;
		while(api.findDepartmentWithoutDoctor().hasMatches()) {
			api.doctor(16, firstNames[rnd.nextInt(firstNames.length)]+" "+lastNames[rnd.nextInt(lastNames.length)], staffID++).apply();
		}
		
		while(api.findRoomWithoutNurse().hasMatches()) {
			api.assignNurseToRoom(firstNames[rnd.nextInt(firstNames.length)]+" "+lastNames[rnd.nextInt(lastNames.length)], staffID++).apply();
		}
		
		int patientID = 1;
		for(int i=rnd.nextInt(16); i>0; i--) {
			api.patient(firstNames[rnd.nextInt(firstNames.length)]+" "+lastNames[rnd.nextInt(lastNames.length)], patientID++, Carelevel.PENDING).apply();
		}
		
		while(api.findPatientInReception().hasMatches()) {
			api.assignPatientToRoom().apply();
		}
				

		

	}

	public void validateHospital() {

		long countPatientsInHospital = api.findPatient().countMatches();
		System.out.println(countPatientsInHospital + " Patients are in the hospital right now");

		long countPatientsInRoom = api.findPatientInRoom().countMatches();
		System.out.println(countPatientsInRoom + " Patients are in a room");
		
		
		if (api.findHospital().countMatches() == 1) {
			System.out.println("One instance of a hospital has been created");
		} else
			System.out.println("Error, the hospital was not created");

		if (api.findReception().countMatches() == 1) {
			System.out.println("One instance of a reception has been created");
		} else
			System.out.println("Error, the reception was not created");

		if (api.findDepartment().countMatches() > 0) {
			System.out.println("At least one deparment instance has been created");
		} else
			System.out.println("Error, there are no departments in the hospital");

		if (api.findNurse().countMatches() > 0) {
			long nursecount = api.findNurse().countMatches();
			long busyNurse = api.findNurseInRoom().countMatches();
			System.out.println(
					nursecount + " nurses are in the hospital right now and " + busyNurse + " nurses are busy");
		} else
			System.out.println("Error, there are no nurses in the hospital");

		if (api.findDoctor().countMatches() > 0) {
			System.out.println("At least one doctor is in the hospital");
			long docCount = api.findDoctor().countMatches();
			long busyDocCount = api.findDocWithPatient().countMatches();
			System.out.println(
					docCount + " doctors are in the hospital right now and " + busyDocCount + " doctors are busy");

		} else
			System.out.println("Error, there are no doctors in the hospital");

		if (api.findPatient().countMatches() > 0) {
			System.out.println("At least one patient is in the hospital");
		} else
			System.out.println("Error, there are no patients in the hospital");

		if (api.findRoom().countMatches() > 0) {
			System.out.println("The hospital consists of at least one room");
			long patientsInHospital = api.findPatient().countMatches();
			long patientsInRoom = api.findPatientInRoom().countMatches();
			System.out.println(patientsInHospital + " Patients are in the hospital right now and " + patientsInRoom
					+ " patients are in a room");

		} else
			System.out.println("Error, there are no rooms in the hospital");

	}

}
