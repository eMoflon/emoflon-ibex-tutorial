package HospitalExample;

import HospitalExample.HospitalExamplePackage;

import org.emoflon.smartemf.runtime.notification.SmartEMFNotification;
import org.emoflon.smartemf.runtime.SmartObject;
import org.emoflon.smartemf.runtime.collections.*;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;

public interface Staff extends EObject {
	
    public int getStaffID();
    
    public void setStaffID(int value);
    
    public HospitalExample.Department getWorks();
    
    public void setWorks(HospitalExample.Department value);
    
    public java.lang.String getName();
    
    public void setName(java.lang.String value);
    

}
