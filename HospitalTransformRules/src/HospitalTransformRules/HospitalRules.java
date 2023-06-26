package HospitalTransformRules;

import java.io.IOException;
import java.util.Random;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.emoflon.smartemf.persistence.SmartEMFResourceFactoryImpl;

import HospitalExample.Carelevel;
import HospitalTransformRules.api.HospitalTransformRulesAPI;

public class HospitalRules {
	public static String firstNames[] = {"James","Alisha", "Alex", "Jeffrey", "Eliza", "Martin", 
			"Sven", "Adam", "John", "Steven", "George", "Allan", "Adam", "Misha", "Abigail", "Robert", 
			"Bob", "Chloe", "Melissa", "Lauren", "Stefanie", "Christina", "Austin", "Ron", "James" };
	public static String lastNames[] = {"Black","Greenwood", "Ramirez", "King", "Martinez", "Jupiter", 
			"Boson", "Walker", "Fitzgerald", "Green", "Stafford", "Mercer", "Williams", "Brown", "Jones", "Lewis", 
			"Clark", "Hall", "Nguyen", "More", "Taylor", "Campbell", "Reed", "Murphy", "Rivera" };
	
	private Random rnd;
	public HospitalTransformRulesAPI api;

	public HospitalRules(final long rndSeed) { // Method to initalize a random seed and a new model 
		rnd = new Random(rndSeed);
		api = new HospitalValidator().initAPI();
	}

	public static void main(String[] args) throws IOException { // Main method to apply and validate the ruleset
		HospitalRules hospitalrules = new HospitalRules("someSeed".hashCode());
//		hospitalrules.api.trackModelStates(false);
		hospitalrules.createHospital();
		hospitalrules.validateHospital();
		persistModel(HospitalValidator.hospitalFilePath, hospitalrules.api);
		
		hospitalrules.api.terminate();
//		hospitalrules.api.displayModelStates();
	}

	public void createHospital() { // Method where hospital rules are applied step by step
		
		api.hospital().apply();
		api.reception().apply();
		
		for(int i=0; i<4; i++) {
			api.department(i+2, 4).apply();
		}
		for(int i=0; i<16; i++) {
			api.room(4, Carelevel.get(rnd.nextInt(3))).apply();
		}
		
		int staffID = 2;
		while(api.findDepartmentWithoutDoctor().hasMatches()) {
			api.doctor(16, firstNames[rnd.nextInt(firstNames.length)]+" "+lastNames[rnd.nextInt(lastNames.length)], staffID++).apply();
		}
		
		while(api.findRoomWithoutNurse().hasMatches()) {
			api.assignNurseToRoom(firstNames[rnd.nextInt(firstNames.length)]+" "+lastNames[rnd.nextInt(lastNames.length)], staffID++).apply();
		}
		
		int patientID = 2;
		for(int i=rnd.nextInt(16); i>0; i--) {
			api.patient(firstNames[rnd.nextInt(firstNames.length)]+" "+lastNames[rnd.nextInt(lastNames.length)], patientID++, Carelevel.PENDING).apply();
		}
		
		while(api.findPatientInReception().hasMatches()) {
			api.assignPatientToRoom().apply();
		}
		
		persistModel(HospitalValidator.hospitalFilePath, api);
	}

	public void validateHospital() { // Method to validate the ruleset via print outputs

		
		if (api.findHospital().countMatches() == 1) {
			System.out.println("One instance of a hospital has been created");
		} else
			System.out.println("Error, the hospital was not created");

		if (api.findReception().countMatches() == 1) {
			System.out.println("One instance of a reception has been created");
		} else
			System.out.println("Error, the reception was not created");

		if (api.findDepartment().countMatches() > 0) {
			System.out.println("At least one department instance has been created");
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
			long patientsInHospital = api.findPatient().countMatches();
			long patientsInRoom = api.findPatientInRoom().countMatches();
			System.out.println(patientsInHospital + " Patients are in the hospital right now and " + patientsInRoom
					+ " patients are in a room");

		} else
			System.out.println("Error, there are no rooms in the hospital");

	}
	
	/**
	 * Saves the model to given file path.
	 *
	 * @param path File path as string.
	 * @param api The transformation rules API (eMoflon).
	 */
	public static void persistModel(final String path, final HospitalTransformRulesAPI api) {
		// Workaround: Always use absolute path
		final URI absPath = URI.createFileURI(System.getProperty("user.dir") + "/" + path);

		// Create new model for saving
		final ResourceSet rs = new ResourceSetImpl();
		rs.getResourceFactoryRegistry().getExtensionToFactoryMap().put("xmi", new SmartEMFResourceFactoryImpl(null));
		// ^null is okay if all paths are absolute
		final Resource r = rs.createResource(absPath);
		// Fetch model contents from eMoflon API
		r.getContents().add(api.getModel().getResources().get(0).getContents().get(0));
		try {
			r.save(null);
		} catch (final IOException e) {
			e.printStackTrace();
		}
		// Hand model back to owner
		api.getModel().getResources().get(0).getContents().addAll(r.getContents());
	}

}
