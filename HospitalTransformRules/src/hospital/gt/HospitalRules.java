package hospital.gt;

import java.io.IOException;
import java.util.Random;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import HospitalExample.Carelevel;
import hospital.gt.api.*;
import java.util.Random;

public class HospitalRules extends HospitalAbstractTest{
	public static String firstNames[] = {"James","Alisha", "Alex", "Jeffrey", "Eliza", "Martin", 
			"Sven", "Adam", "John", "Steven", "George", "Allan", "Adam", "Misha", "Abigail", "Robert", 
			"Bob", "Chloe", "Melissa", "Lauren", "Stefanie", "Christina", "Austin", "Ron", "James" };
	public static String lastNames[] = {"Black","Greenwood", "Ramirez", "King", "Martinez", "Jupiter", 
			"Boson", "Walker", "Fitzgerald", "Green", "Stafford", "Mercer", "Williams", "Brown", "Jones", "Lewis", 
			"Clark", "Hall", "Nguyen", "More", "Taylor", "Campbell", "Reed", "Murphy", "Rivera" };
	
	private Random rnd;
	
	@Test
	public void testHospital() {
		GtGtApi<?> api = this.initEmpty("HospitalTest.xmi");
		rnd = new Random(12124);
		
		
		//create Hospital
		
		assertApplicableAndApply(api.hospital());
		assertApplicableAndApply(api.reception());
		
		for(int i=0; i<4; i++) {
			assertApplicableAndApply(api.department(i+2,4));
		}
		for(int i=0; i<16; i++) {
			assertApplicableAndApply(api.room(4, Carelevel.get(rnd.nextInt(3))));
		}
		
		int staffID = 2;
		while(api.findDepartmentWithoutDoctor().countMatches() > 1) {
			assertApplicableAndApply(api.doctor(16, firstNames[rnd.nextInt(firstNames.length)]+" "+lastNames[rnd.nextInt(lastNames.length)], staffID++));
		}
		
		while(api.findRoomWithoutNurse().countMatches() > 1) {
			assertApplicableAndApply(api.assignNurseToRoom(firstNames[rnd.nextInt(firstNames.length)]+" "+lastNames[rnd.nextInt(lastNames.length)], staffID++));
		}
		
		int patientID = 2;
		for(int i=rnd.nextInt(16); i>0; i--) {
			assertApplicableAndApply(api.patient(firstNames[rnd.nextInt(firstNames.length)]+" "+lastNames[rnd.nextInt(lastNames.length)], patientID++, Carelevel.PENDING));
		}
		
		while(api.findPatientInReception().countMatches() > 1) {
			assertApplicableAndApply(api.assignPatientToRoom());
		}
		
		
		//Validate Hospital
		
		if (api.findHospital().countMatches() == 1) {
			System.out.println("One instance of a hospital has been created");
		} else
			System.out.println("Error, the hospital was not created");

		if (api.findReception().countMatches() == 1) {
			System.out.println("One instance of a reception has been created");
		} else
			System.out.println("Error, the reception was not created");

		if (api.findDepartmentWithoutDoctor().countMatches() > 0) {
			System.out.println("At least one department instance has been created");
		} else
			System.out.println("Error, there are no departments in the hospital");

		if (api.findNurseInRoom().countMatches() > 0) {
			long nursecount = api.findNurseInRoom().countMatches();
			long busyNurse = api.findNurseInRoom().countMatches();
			System.out.println(
					nursecount + " nurses are in the hospital right now and " + busyNurse + " nurses are busy");
		} else
			System.out.println("Error, there are no nurses in the hospital");

		if (api.findDoctorInDepartment().countMatches() > 0) {
			long docCount = api.findDoctorInDepartment().countMatches() + api.findOccupiedDoc().countMatches();
			long busyDocCount = api.findOccupiedDoc().countMatches();
			System.out.println(
					docCount + " doctors are in the hospital right now and " + busyDocCount + " doctors are busy");

		} else
			System.out.println("Error, there are no doctors in the hospital");

		if (api.findPatientInReception().countMatches() + api.findPatientInRoom().countMatches() > 0) {
			System.out.println("At least one patient is in the hospital");
		} else
			System.out.println("Error, there are no patients in the hospital");

		if (api.findRoomInDepartment().countMatches() > 0) {
			long patientsInHospital = api.findPatientInReception().countMatches() + api.findPatientInRoom().countMatches();;
			long patientsInRoom = api.findPatientInRoom().countMatches();
			System.out.println(patientsInHospital + " Patients are in the hospital right now and " + patientsInRoom
					+ " patients are in a room");

		} else
			System.out.println("Error, there are no rooms in the hospital");


		api.terminate();
	}

}