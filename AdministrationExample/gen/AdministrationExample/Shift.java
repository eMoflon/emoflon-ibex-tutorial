package AdministrationExample;

import AdministrationExample.AdministrationExamplePackage;

import org.emoflon.smartemf.runtime.notification.SmartEMFNotification;
import org.emoflon.smartemf.runtime.SmartObject;
import org.emoflon.smartemf.runtime.collections.*;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;

public interface Shift extends EObject {
	
    public AdministrationExample.Daytime getTime();
    
    public void setTime(AdministrationExample.Daytime value);
    

}
