package AdministrationExample;

import AdministrationExample.AdministrationExamplePackage;

import org.emoflon.smartemf.runtime.notification.SmartEMFNotification;
import org.emoflon.smartemf.runtime.SmartObject;
import org.emoflon.smartemf.runtime.collections.*;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;

public interface Administration extends EObject {
	
    public LinkedSmartESet<AdministrationExample.Staff> getStaff();
    
    public void setStaff(LinkedSmartESet<AdministrationExample.Staff> value);
    
    public LinkedSmartESet<AdministrationExample.Patient> getPatient();
    
    public void setPatient(LinkedSmartESet<AdministrationExample.Patient> value);
    

}
