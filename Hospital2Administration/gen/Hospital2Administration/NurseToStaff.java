package Hospital2Administration;

import runtime.RuntimePackage;
import Hospital2Administration.Hospital2AdministrationPackage;

import org.emoflon.smartemf.runtime.notification.SmartEMFNotification;
import org.emoflon.smartemf.runtime.SmartObject;
import org.emoflon.smartemf.runtime.collections.*;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;

public interface NurseToStaff extends EObject, runtime.CorrespondenceNode {
	
    public HospitalExample.Nurse getSource();
    
    public void setSource(HospitalExample.Nurse value);
    
    public AdministrationExample.Staff getTarget();
    
    public void setTarget(AdministrationExample.Staff value);
    

}
