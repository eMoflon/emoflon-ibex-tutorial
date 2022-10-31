package AdministrationExample.impl;

import AdministrationExample.Administration;
import AdministrationExample.Shift;
import AdministrationExample.Staff;
import AdministrationExample.Person;
import AdministrationExample.Treatment;
import AdministrationExample.Shiftplan;
import AdministrationExample.Patient;

import AdministrationExample.Medication;
import AdministrationExample.Daytime;

import AdministrationExample.AdministrationExampleFactory;
import AdministrationExample.AdministrationExamplePackage;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

public class AdministrationExampleFactoryImpl extends EFactoryImpl implements AdministrationExample.AdministrationExampleFactory {

	public static AdministrationExample.AdministrationExampleFactory init() {
		try {
			AdministrationExampleFactory theAdministrationExampleFactory = (AdministrationExampleFactory) EPackage.Registry.INSTANCE
					.getEFactory(AdministrationExamplePackage.eNS_URI);
			if (theAdministrationExampleFactory != null) {
				return theAdministrationExampleFactory;
			}
		} catch (java.lang.Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new AdministrationExampleFactoryImpl();
	}

	public AdministrationExampleFactoryImpl() {
		super();
	}

	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
		case AdministrationExamplePackage.ADMINISTRATION:
			return createAdministration();
		case AdministrationExamplePackage.SHIFT:
			return createShift();
		case AdministrationExamplePackage.STAFF:
			return createStaff();
		case AdministrationExamplePackage.PERSON:
			return createPerson();
		case AdministrationExamplePackage.TREATMENT:
			return createTreatment();
		case AdministrationExamplePackage.SHIFTPLAN:
			return createShiftplan();
		case AdministrationExamplePackage.PATIENT:
			return createPatient();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}
	
		@Override
		public Object createFromString(EDataType eDataType, String initialValue) {
			switch (eDataType.getClassifierID()) {
			case AdministrationExamplePackage.MEDICATION:
				return createMedicationFromString(eDataType, initialValue);
			case AdministrationExamplePackage.DAYTIME:
				return createDaytimeFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
			}
		}

	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
		case AdministrationExamplePackage.MEDICATION:
			return convertMedicationToString(eDataType, instanceValue);
		case AdministrationExamplePackage.DAYTIME:
			return convertDaytimeToString(eDataType, instanceValue);
		default:
			throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}
	
	@Override
	public AdministrationExample.Administration createAdministration() {
		AdministrationImpl administration = new AdministrationImpl();
		return administration;
	}
	@Override
	public AdministrationExample.Shift createShift() {
		ShiftImpl shift = new ShiftImpl();
		return shift;
	}
	@Override
	public AdministrationExample.Staff createStaff() {
		StaffImpl staff = new StaffImpl();
		return staff;
	}
	@Override
	public AdministrationExample.Person createPerson() {
		PersonImpl person = new PersonImpl();
		return person;
	}
	@Override
	public AdministrationExample.Treatment createTreatment() {
		TreatmentImpl treatment = new TreatmentImpl();
		return treatment;
	}
	@Override
	public AdministrationExample.Shiftplan createShiftplan() {
		ShiftplanImpl shiftplan = new ShiftplanImpl();
		return shiftplan;
	}
	@Override
	public AdministrationExample.Patient createPatient() {
		PatientImpl patient = new PatientImpl();
		return patient;
	}
	
	public Medication createMedicationFromString(EDataType eDataType, String initialValue) {
		Medication result = Medication.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
				
		return result;
	}
	
	public String convertMedicationToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}
	public Daytime createDaytimeFromString(EDataType eDataType, String initialValue) {
		Daytime result = Daytime.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
				
		return result;
	}
	
	public String convertDaytimeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	@Override
	public AdministrationExamplePackage getAdministrationExamplePackage() {
	return (AdministrationExamplePackage) getEPackage();
	}
} 
