package HospitalExample.impl;

import HospitalExample.Hospital;
import HospitalExample.Reception;
import HospitalExample.Staff;
import HospitalExample.Doctor;
import HospitalExample.Nurse;
import HospitalExample.Department;
import HospitalExample.Patient;
import HospitalExample.Room;

import HospitalExample.Carelevel;

import HospitalExample.HospitalExampleFactory;
import HospitalExample.HospitalExamplePackage;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

public class HospitalExampleFactoryImpl extends EFactoryImpl implements HospitalExample.HospitalExampleFactory {

	public static HospitalExample.HospitalExampleFactory init() {
		try {
			HospitalExampleFactory theHospitalExampleFactory = (HospitalExampleFactory) EPackage.Registry.INSTANCE
					.getEFactory(HospitalExamplePackage.eNS_URI);
			if (theHospitalExampleFactory != null) {
				return theHospitalExampleFactory;
			}
		} catch (java.lang.Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new HospitalExampleFactoryImpl();
	}

	public HospitalExampleFactoryImpl() {
		super();
	}

	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
		case HospitalExamplePackage.HOSPITAL:
			return createHospital();
		case HospitalExamplePackage.RECEPTION:
			return createReception();
		case HospitalExamplePackage.DOCTOR:
			return createDoctor();
		case HospitalExamplePackage.NURSE:
			return createNurse();
		case HospitalExamplePackage.DEPARTMENT:
			return createDepartment();
		case HospitalExamplePackage.PATIENT:
			return createPatient();
		case HospitalExamplePackage.ROOM:
			return createRoom();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}
	
		@Override
		public Object createFromString(EDataType eDataType, String initialValue) {
			switch (eDataType.getClassifierID()) {
			case HospitalExamplePackage.CARELEVEL:
				return createCarelevelFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
			}
		}

	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
		case HospitalExamplePackage.CARELEVEL:
			return convertCarelevelToString(eDataType, instanceValue);
		default:
			throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}
	
	@Override
	public HospitalExample.Hospital createHospital() {
		HospitalImpl hospital = new HospitalImpl();
		return hospital;
	}
	@Override
	public HospitalExample.Reception createReception() {
		ReceptionImpl reception = new ReceptionImpl();
		return reception;
	}
	@Override
	public HospitalExample.Doctor createDoctor() {
		DoctorImpl doctor = new DoctorImpl();
		return doctor;
	}
	@Override
	public HospitalExample.Nurse createNurse() {
		NurseImpl nurse = new NurseImpl();
		return nurse;
	}
	@Override
	public HospitalExample.Department createDepartment() {
		DepartmentImpl department = new DepartmentImpl();
		return department;
	}
	@Override
	public HospitalExample.Patient createPatient() {
		PatientImpl patient = new PatientImpl();
		return patient;
	}
	@Override
	public HospitalExample.Room createRoom() {
		RoomImpl room = new RoomImpl();
		return room;
	}
	
	public Carelevel createCarelevelFromString(EDataType eDataType, String initialValue) {
		Carelevel result = Carelevel.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
				
		return result;
	}
	
	public String convertCarelevelToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	@Override
	public HospitalExamplePackage getHospitalExamplePackage() {
	return (HospitalExamplePackage) getEPackage();
	}
} 
