package org.emoflon.ibex.tgg.operational.csp.constraints.custom.hospital2administrationsolutions;

import java.util.HashMap;
import java.util.HashSet;			

import org.emoflon.ibex.tgg.runtime.csp.constraints.factories.RuntimeTGGAttrConstraintFactory;

import org.emoflon.ibex.tgg.operational.csp.constraints.custom.hospital2administrationsolutions.hospital2administrationlibrary.Doctorsalary;
import org.emoflon.ibex.tgg.operational.csp.constraints.custom.hospital2administrationsolutions.hospital2administrationlibrary.Nursesalary;
import org.emoflon.ibex.tgg.operational.csp.constraints.custom.hospital2administrationsolutions.hospital2administrationlibrary.CarelevelToMedication;
import org.emoflon.ibex.tgg.operational.csp.constraints.custom.hospital2administrationsolutions.hospital2administrationlibrary.Nametoname;
import org.emoflon.ibex.tgg.operational.csp.constraints.custom.hospital2administrationsolutions.hospital2administrationlibrary.IncrementingDepartmentID;
import org.emoflon.ibex.tgg.operational.csp.constraints.custom.hospital2administrationsolutions.hospital2administrationlibrary.IncrementingStaffID;
import org.emoflon.ibex.tgg.operational.csp.constraints.custom.hospital2administrationsolutions.hospital2administrationlibrary.IncrementingPatientID;
import org.emoflon.ibex.tgg.operational.csp.constraints.custom.hospital2administrationsolutions.hospital2administrationlibrary.IncrementingRoomID;
import org.emoflon.ibex.tgg.operational.csp.constraints.custom.hospital2administrationsolutions.hospital2administrationlibrary.SetDefaultNumber;

public class Hospital2AdministrationLibraryRuntimeTGGAttrConstraintFactory extends RuntimeTGGAttrConstraintFactory {

	public Hospital2AdministrationLibraryRuntimeTGGAttrConstraintFactory() {
		super();
	}
	
	@Override
	protected void initialize() {
		creators = new HashMap<>();
		creators.put("doctorsalary", () -> new Doctorsalary());
		creators.put("nursesalary", () -> new Nursesalary());
		creators.put("carelevelToMedication", () -> new CarelevelToMedication());
		creators.put("nametoname", () -> new Nametoname());
		creators.put("incrementingDepartmentID", () -> new IncrementingDepartmentID());
		creators.put("incrementingStaffID", () -> new IncrementingStaffID());
		creators.put("incrementingPatientID", () -> new IncrementingPatientID());
		creators.put("incrementingRoomID", () -> new IncrementingRoomID());
		creators.put("setDefaultNumber", () -> new SetDefaultNumber());

		constraints = new HashSet<String>();
		constraints.addAll(creators.keySet());
	}
	
	@Override
	public String getLibraryName() {
		return "Hospital2AdministrationLibrary";
	}
}
