package HospitalExample;

import HospitalExample.Hospital;
import HospitalExample.Reception;
import HospitalExample.Staff;
import HospitalExample.Doctor;
import HospitalExample.Nurse;
import HospitalExample.Department;
import HospitalExample.Patient;
import HospitalExample.Room;

import org.eclipse.emf.ecore.EFactory;

public interface HospitalExampleFactory extends EFactory {

	HospitalExampleFactory eINSTANCE = HospitalExample.impl.HospitalExampleFactoryImpl.init();
	
	Hospital createHospital();
	
	Reception createReception();
	
	Doctor createDoctor();
	
	Nurse createNurse();
	
	Department createDepartment();
	
	Patient createPatient();
	
	Room createRoom();
	
	
	HospitalExamplePackage getHospitalExamplePackage();

}
