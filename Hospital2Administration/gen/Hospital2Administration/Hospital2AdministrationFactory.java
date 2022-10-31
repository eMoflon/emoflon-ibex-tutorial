package Hospital2Administration;

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

import org.eclipse.emf.ecore.EFactory;

public interface Hospital2AdministrationFactory extends EFactory {

	Hospital2AdministrationFactory eINSTANCE = Hospital2Administration.impl.Hospital2AdministrationFactoryImpl.init();
	
	HospitalToAdministration createHospitalToAdministration();
	
	StaffToStaff createStaffToStaff();
	
	PatientToPatient createPatientToPatient();
	
	RoomToShiftplan createRoomToShiftplan();
	
	DoctorToStaff createDoctorToStaff();
	
	NurseToStaff createNurseToStaff();
	
	DepartmentRule__Marker createDepartmentRule__Marker();
	
	DocToStaffRule__Marker createDocToStaffRule__Marker();
	
	DoctorShiftplanRule__Marker createDoctorShiftplanRule__Marker();
	
	DoctorToPatient__Marker createDoctorToPatient__Marker();
	
	HospitaltoAdministrationRule__Marker createHospitaltoAdministrationRule__Marker();
	
	NurseShiftplanRule__Marker createNurseShiftplanRule__Marker();
	
	NurseToRoomRule__Marker createNurseToRoomRule__Marker();
	
	NurseToStaffRule__Marker createNurseToStaffRule__Marker();
	
	PatientInReception__Marker createPatientInReception__Marker();
	
	PatientInRoom__Marker createPatientInRoom__Marker();
	
	RoomRule__Marker createRoomRule__Marker();
	
	
	Hospital2AdministrationPackage getHospital2AdministrationPackage();

}
