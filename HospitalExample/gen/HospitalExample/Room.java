package HospitalExample;

import HospitalExample.HospitalExamplePackage;

import org.emoflon.smartemf.runtime.notification.SmartEMFNotification;
import org.emoflon.smartemf.runtime.SmartObject;
import org.emoflon.smartemf.runtime.collections.*;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;

public interface Room extends EObject {
	
    public int getCapacity();
    
    public void setCapacity(int value);
    
    public HospitalExample.Carelevel getLevel();
    
    public void setLevel(HospitalExample.Carelevel value);
    
    public LinkedSmartESet<HospitalExample.Patient> getLies();
    
    public void setLies(LinkedSmartESet<HospitalExample.Patient> value);
    
    public LinkedSmartESet<HospitalExample.Nurse> getNurses();
    
    public void setNurses(LinkedSmartESet<HospitalExample.Nurse> value);
    

}
