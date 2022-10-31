package Hospital2Administration.impl;

import Hospital2Administration.HospitalToAdministration;
import Hospital2Administration.StaffToStaff;
import Hospital2Administration.PatientToPatient;
import Hospital2Administration.RoomToShiftplan;
import Hospital2Administration.DoctorToStaff;
import Hospital2Administration.NurseToStaff;
import Hospital2Administration.DepartmentRule__Marker;
import Hospital2Administration.DocToStaffRule__Marker;
import Hospital2Administration.DoctorShiftplanRule__Marker;
import Hospital2Administration.DoctorToPatient__Marker;
import Hospital2Administration.HospitaltoAdministrationRule__Marker;
import Hospital2Administration.NurseShiftplanRule__Marker;
import Hospital2Administration.NurseToRoomRule__Marker;
import Hospital2Administration.NurseToStaffRule__Marker;
import Hospital2Administration.PatientInReception__Marker;
import Hospital2Administration.PatientInRoom__Marker;
import Hospital2Administration.RoomRule__Marker;


import Hospital2Administration.Hospital2AdministrationFactory;
import Hospital2Administration.Hospital2AdministrationPackage;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

public class Hospital2AdministrationFactoryImpl extends EFactoryImpl implements Hospital2Administration.Hospital2AdministrationFactory {

	public static Hospital2Administration.Hospital2AdministrationFactory init() {
		try {
			Hospital2AdministrationFactory theHospital2AdministrationFactory = (Hospital2AdministrationFactory) EPackage.Registry.INSTANCE
					.getEFactory(Hospital2AdministrationPackage.eNS_URI);
			if (theHospital2AdministrationFactory != null) {
				return theHospital2AdministrationFactory;
			}
		} catch (java.lang.Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new Hospital2AdministrationFactoryImpl();
	}

	public Hospital2AdministrationFactoryImpl() {
		super();
	}

	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
		case Hospital2AdministrationPackage.HOSPITAL_TO_ADMINISTRATION:
			return createHospitalToAdministration();
		case Hospital2AdministrationPackage.STAFF_TO_STAFF:
			return createStaffToStaff();
		case Hospital2AdministrationPackage.PATIENT_TO_PATIENT:
			return createPatientToPatient();
		case Hospital2AdministrationPackage.ROOM_TO_SHIFTPLAN:
			return createRoomToShiftplan();
		case Hospital2AdministrationPackage.DOCTOR_TO_STAFF:
			return createDoctorToStaff();
		case Hospital2AdministrationPackage.NURSE_TO_STAFF:
			return createNurseToStaff();
		case Hospital2AdministrationPackage.DEPARTMENT_RULE___MARKER:
			return createDepartmentRule__Marker();
		case Hospital2AdministrationPackage.DOC_TO_STAFF_RULE___MARKER:
			return createDocToStaffRule__Marker();
		case Hospital2AdministrationPackage.DOCTOR_SHIFTPLAN_RULE___MARKER:
			return createDoctorShiftplanRule__Marker();
		case Hospital2AdministrationPackage.DOCTOR_TO_PATIENT___MARKER:
			return createDoctorToPatient__Marker();
		case Hospital2AdministrationPackage.HOSPITALTO_ADMINISTRATION_RULE___MARKER:
			return createHospitaltoAdministrationRule__Marker();
		case Hospital2AdministrationPackage.NURSE_SHIFTPLAN_RULE___MARKER:
			return createNurseShiftplanRule__Marker();
		case Hospital2AdministrationPackage.NURSE_TO_ROOM_RULE___MARKER:
			return createNurseToRoomRule__Marker();
		case Hospital2AdministrationPackage.NURSE_TO_STAFF_RULE___MARKER:
			return createNurseToStaffRule__Marker();
		case Hospital2AdministrationPackage.PATIENT_IN_RECEPTION___MARKER:
			return createPatientInReception__Marker();
		case Hospital2AdministrationPackage.PATIENT_IN_ROOM___MARKER:
			return createPatientInRoom__Marker();
		case Hospital2AdministrationPackage.ROOM_RULE___MARKER:
			return createRoomRule__Marker();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}
	
	
	@Override
	public Hospital2Administration.HospitalToAdministration createHospitalToAdministration() {
		HospitalToAdministrationImpl hospitalToAdministration = new HospitalToAdministrationImpl();
		return hospitalToAdministration;
	}
	@Override
	public Hospital2Administration.StaffToStaff createStaffToStaff() {
		StaffToStaffImpl staffToStaff = new StaffToStaffImpl();
		return staffToStaff;
	}
	@Override
	public Hospital2Administration.PatientToPatient createPatientToPatient() {
		PatientToPatientImpl patientToPatient = new PatientToPatientImpl();
		return patientToPatient;
	}
	@Override
	public Hospital2Administration.RoomToShiftplan createRoomToShiftplan() {
		RoomToShiftplanImpl roomToShiftplan = new RoomToShiftplanImpl();
		return roomToShiftplan;
	}
	@Override
	public Hospital2Administration.DoctorToStaff createDoctorToStaff() {
		DoctorToStaffImpl doctorToStaff = new DoctorToStaffImpl();
		return doctorToStaff;
	}
	@Override
	public Hospital2Administration.NurseToStaff createNurseToStaff() {
		NurseToStaffImpl nurseToStaff = new NurseToStaffImpl();
		return nurseToStaff;
	}
	@Override
	public Hospital2Administration.DepartmentRule__Marker createDepartmentRule__Marker() {
		DepartmentRule__MarkerImpl departmentRule__Marker = new DepartmentRule__MarkerImpl();
		return departmentRule__Marker;
	}
	@Override
	public Hospital2Administration.DocToStaffRule__Marker createDocToStaffRule__Marker() {
		DocToStaffRule__MarkerImpl docToStaffRule__Marker = new DocToStaffRule__MarkerImpl();
		return docToStaffRule__Marker;
	}
	@Override
	public Hospital2Administration.DoctorShiftplanRule__Marker createDoctorShiftplanRule__Marker() {
		DoctorShiftplanRule__MarkerImpl doctorShiftplanRule__Marker = new DoctorShiftplanRule__MarkerImpl();
		return doctorShiftplanRule__Marker;
	}
	@Override
	public Hospital2Administration.DoctorToPatient__Marker createDoctorToPatient__Marker() {
		DoctorToPatient__MarkerImpl doctorToPatient__Marker = new DoctorToPatient__MarkerImpl();
		return doctorToPatient__Marker;
	}
	@Override
	public Hospital2Administration.HospitaltoAdministrationRule__Marker createHospitaltoAdministrationRule__Marker() {
		HospitaltoAdministrationRule__MarkerImpl hospitaltoAdministrationRule__Marker = new HospitaltoAdministrationRule__MarkerImpl();
		return hospitaltoAdministrationRule__Marker;
	}
	@Override
	public Hospital2Administration.NurseShiftplanRule__Marker createNurseShiftplanRule__Marker() {
		NurseShiftplanRule__MarkerImpl nurseShiftplanRule__Marker = new NurseShiftplanRule__MarkerImpl();
		return nurseShiftplanRule__Marker;
	}
	@Override
	public Hospital2Administration.NurseToRoomRule__Marker createNurseToRoomRule__Marker() {
		NurseToRoomRule__MarkerImpl nurseToRoomRule__Marker = new NurseToRoomRule__MarkerImpl();
		return nurseToRoomRule__Marker;
	}
	@Override
	public Hospital2Administration.NurseToStaffRule__Marker createNurseToStaffRule__Marker() {
		NurseToStaffRule__MarkerImpl nurseToStaffRule__Marker = new NurseToStaffRule__MarkerImpl();
		return nurseToStaffRule__Marker;
	}
	@Override
	public Hospital2Administration.PatientInReception__Marker createPatientInReception__Marker() {
		PatientInReception__MarkerImpl patientInReception__Marker = new PatientInReception__MarkerImpl();
		return patientInReception__Marker;
	}
	@Override
	public Hospital2Administration.PatientInRoom__Marker createPatientInRoom__Marker() {
		PatientInRoom__MarkerImpl patientInRoom__Marker = new PatientInRoom__MarkerImpl();
		return patientInRoom__Marker;
	}
	@Override
	public Hospital2Administration.RoomRule__Marker createRoomRule__Marker() {
		RoomRule__MarkerImpl roomRule__Marker = new RoomRule__MarkerImpl();
		return roomRule__Marker;
	}
	

	@Override
	public Hospital2AdministrationPackage getHospital2AdministrationPackage() {
	return (Hospital2AdministrationPackage) getEPackage();
	}
} 
