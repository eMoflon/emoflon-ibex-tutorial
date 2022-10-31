package HospitalExample;

import HospitalExample.HospitalExamplePackage;

import org.emoflon.smartemf.runtime.notification.SmartEMFNotification;
import org.emoflon.smartemf.runtime.SmartObject;
import org.emoflon.smartemf.runtime.collections.*;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;

public interface Hospital extends EObject {
	
    public HospitalExample.Reception getReception();
    
    public void setReception(HospitalExample.Reception value);
    
    public SmartESet<HospitalExample.Staff> getStaff();
    
    public void setStaff(SmartESet<HospitalExample.Staff> value);
    
    public LinkedSmartESet<HospitalExample.Department> getDepartment();
    
    public void setDepartment(LinkedSmartESet<HospitalExample.Department> value);
    

}
