package HospitalExample;

import HospitalExample.HospitalExamplePackage;

import org.emoflon.smartemf.runtime.notification.SmartEMFNotification;
import org.emoflon.smartemf.runtime.SmartObject;
import org.emoflon.smartemf.runtime.collections.*;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;

public interface Department extends EObject {
	
    public LinkedSmartESet<HospitalExample.Room> getRooms();
    
    public void setRooms(LinkedSmartESet<HospitalExample.Room> value);
    
    public int getDID();
    
    public void setDID(int value);
    
    public LinkedSmartESet<HospitalExample.Staff> getStaff();
    
    public void setStaff(LinkedSmartESet<HospitalExample.Staff> value);
    
    public int getMaxRoomCount();
    
    public void setMaxRoomCount(int value);
    

}
