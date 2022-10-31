package AdministrationExample;

import AdministrationExample.AdministrationExamplePackage;

import org.emoflon.smartemf.runtime.notification.SmartEMFNotification;
import org.emoflon.smartemf.runtime.SmartObject;
import org.emoflon.smartemf.runtime.collections.*;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;

public interface Shiftplan extends EObject {
	
    public LinkedSmartESet<AdministrationExample.Patient> getCovers();
    
    public void setCovers(LinkedSmartESet<AdministrationExample.Patient> value);
    
    public LinkedSmartESet<AdministrationExample.Shift> getShifts();
    
    public void setShifts(LinkedSmartESet<AdministrationExample.Shift> value);
    

}
