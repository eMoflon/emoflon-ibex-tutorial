package HospitalTransformRules;

import java.io.IOException;

import org.emoflon.ibex.common.operational.PushoutApproach;
import org.moflon.core.utilities.eMoflonEMFUtil;

import HospitalExample.Carelevel;
import HospitalExample.Hospital;
import HospitalTransformRules.api.HospitalTransformRulesAPI;

public class HospitalRules {
	private HospitalTransformRulesAPI api;

	public HospitalRules() {
		api = new HospitalValidator().initAPI();
	}

	public static void main(String[] args) {
		HospitalRules hospitalrules = new HospitalRules();

		hospitalrules.createHospital();
		hospitalrules.validateHospital();

	}

	public void createHospital() {

		api.hospital().apply();
		api.reception().apply();
		api.department(0, 4).apply();
		api.room(4, Carelevel.WEAK).apply();
		api.nurse(1).apply();
		api.nurse(2).apply();
		api.nurse(3).apply();
		api.doctor(4).apply();
		api.doctor(5).apply();
		api.doctor(6).apply();
		api.patient().apply();
		api.patient().apply();
		api.patient().apply();
		api.patient().apply();
		api.patient().apply();

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

		long countpatientsinroom = api.findPatientinRoom().countMatches();
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
			long patientsInRoom = api.findPatientinRoom().countMatches();
			System.out.println(patientsInHospital + " Patients are in the hospital right now and " + patientsInRoom
					+ " patients are in a room");

		} else
			System.out.println("Error, there are no rooms in the hospital");

	}
	
	
}
