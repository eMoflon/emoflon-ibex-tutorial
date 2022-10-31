package AdministrationExample;

import AdministrationExample.AdministrationExamplePackage;

import org.emoflon.smartemf.runtime.notification.SmartEMFNotification;
import org.emoflon.smartemf.runtime.SmartObject;
import org.emoflon.smartemf.runtime.collections.*;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;

public interface Treatment extends EObject {
	
    public AdministrationExample.Medication getMedication();
    
    public void setMedication(AdministrationExample.Medication value);
    

}
