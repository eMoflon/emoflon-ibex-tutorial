package HospitalExample;

import HospitalExample.HospitalExamplePackage;

import org.emoflon.smartemf.runtime.notification.SmartEMFNotification;
import org.emoflon.smartemf.runtime.SmartObject;
import org.emoflon.smartemf.runtime.collections.*;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;

public interface Doctor extends EObject, HospitalExample.Staff {
	
    public int getStaffID();
    
    public void setStaffID(int value);
    
    public HospitalExample.Department getWorks();
    
    public void setWorks(HospitalExample.Department value);
    
    public java.lang.String getName();
    
    public void setName(java.lang.String value);
    
    public LinkedSmartESet<HospitalExample.Patient> getCaresfor();
    
    public void setCaresfor(LinkedSmartESet<HospitalExample.Patient> value);
    
    public int getPatientCapacity();
    
    public void setPatientCapacity(int value);
    

}
