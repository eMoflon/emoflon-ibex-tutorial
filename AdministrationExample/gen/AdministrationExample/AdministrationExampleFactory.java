package AdministrationExample;

import AdministrationExample.Administration;
import AdministrationExample.Shift;
import AdministrationExample.Staff;
import AdministrationExample.Person;
import AdministrationExample.Treatment;
import AdministrationExample.Shiftplan;
import AdministrationExample.Patient;

import org.eclipse.emf.ecore.EFactory;

public interface AdministrationExampleFactory extends EFactory {

	AdministrationExampleFactory eINSTANCE = AdministrationExample.impl.AdministrationExampleFactoryImpl.init();
	
	Administration createAdministration();
	
	Shift createShift();
	
	Staff createStaff();
	
	Person createPerson();
	
	Treatment createTreatment();
	
	Shiftplan createShiftplan();
	
	Patient createPatient();
	
	
	AdministrationExamplePackage getAdministrationExamplePackage();

}
