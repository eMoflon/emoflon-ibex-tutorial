package HospitalTransformRules;

import java.io.IOException;

import org.eclipse.emf.ecore.EObject;
import org.emoflon.ibex.common.emf.EMFSaveUtils;
import org.emoflon.ibex.common.operational.PushoutApproach;
import org.moflon.core.utilities.eMoflonEMFUtil;

import HospitalExample.Carelevel;
import HospitalExample.Hospital;
import HospitalTransformRules.api.HospitalTransformRulesAPI;



public class HospitalRules {
	public HospitalTransformRulesAPI api;

	public HospitalRules() {
		api = new HospitalValidator().initAPI();
		
	}

	public static void main(String[] args) throws IOException {
		HospitalRules hospitalrules = new HospitalRules();
		
		HospitalSaver hospitalsave = new HospitalSaver();
	

		hospitalrules.createHospital();
		hospitalrules.validateHospital();
		try {
			hospitalrules.api.getModel().getResources().get(0).save(null);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
			
			
		
	}
	
	
	

	public void createHospital() {
		
		api.hospital().apply();
		api.reception().apply();
		api.department(4, 4).apply();
		api.department(2, 4).apply();
		api.department(3, 4).apply();
		api.room(4, Carelevel.WEAK).apply();
		api.room(3, Carelevel.MEDIUM).apply();
		api.room(4, Carelevel.STRONG).apply();
		api.room(4, Carelevel.WEAK).apply();
		api.room(4, Carelevel.WEAK).apply();
		api.room(3, Carelevel.MEDIUM).apply();
		api.room(4, Carelevel.STRONG).apply();
		api.room(4, Carelevel.WEAK).apply();
		api.room(3, Carelevel.MEDIUM).apply();
		api.room(4, Carelevel.STRONG).apply();
		api.room(4, Carelevel.WEAK).apply();
		api.nurse("James Black", 2).apply();
		api.nurse("Alisha Greenwood", 3).apply();
		api.nurse("Alex Ramirez", 20).apply();
		api.nurse("Jeffrey King", 7).apply();
		api.doctor(4,"Eliza Martinez", 3).apply();
		api.doctor(5,"Martin Jupiter", 5).apply();
		api.doctor(4,"Sven Boson", 6).apply();
		api.patient("Adam Walker", 0, Carelevel.PENDING).apply();
		api.patient("John Fitzgerald",20, Carelevel.PENDING).apply();
		api.patient("Steven Green",2, Carelevel.PENDING).apply();
		api.patient("George Stafford", 3, Carelevel.PENDING).apply();
		api.patient("Allan Mercer",4, Carelevel.PENDING).apply();
		api.patient("Adam Williams", 5, Carelevel.PENDING).apply();
		api.patient("Misha Brown",6, Carelevel.PENDING).apply();
		api.patient("Abigail Jones",7, Carelevel.PENDING).apply();
		api.patient("Robert Lewis", 8, Carelevel.PENDING).apply();
		api.patient("Bob Clark",9, Carelevel.PENDING).apply();
		api.patient("Chloe Hall", 10, Carelevel.PENDING).apply();
		api.patient("Melissa Walker",11, Carelevel.PENDING).apply();
		api.patient("Lauren Nguyen",12, Carelevel.PENDING).apply();
		api.patient("Stefanie More", 13, Carelevel.PENDING).apply();
		api.patient("Christina Taylor",14, Carelevel.PENDING).apply();
		api.patient("Amy Walker", 15, Carelevel.PENDING).apply();
		api.patient("Christina Campbell",16, Carelevel.PENDING).apply();
		api.patient("Austin Reed",17, Carelevel.PENDING).apply();
		api.patient("Ron Murphy", 18, Carelevel.PENDING).apply();
		api.patient("James Rivera",19, Carelevel.PENDING).apply();

		api.assignPatientToRoom().apply();
		api.assignPatientToRoom().apply();
		api.assignPatientToRoom().apply();
		api.assignPatientToRoom().apply();
		api.assignPatientToRoom().apply();
		api.assignPatientToRoom().apply();
		api.assignPatientToRoom().apply();
		api.assignPatientToRoom().apply();
		api.assignPatientToRoom().apply();
		api.assignPatientToRoom().apply();
		api.assignPatientToRoom().apply();
		api.assignPatientToRoom().apply();
		api.assignPatientToRoom().apply();
		api.assignPatientToRoom().apply();
		api.assignNurseToRoom().apply();
		api.assignNurseToRoom().apply();
		api.assignNurseToRoom().apply();
		
	

		try {
			api.getModel().getResources().get(0).save(null);
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void validateHospital() {

		long counthospital = api.findPatient().countMatches();
		System.out.println(counthospital + " Patients are in the hospital right now");

		long countpatientsinroom = api.findPatientInRoom().countMatches();
		System.out.println(countpatientsinroom + " Patients are in a room");
		
		System.out.println(api.findPatientWithDoc().countMatches());

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
			long busyDocCount = api.findPatientWithDoc().countMatches();
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
