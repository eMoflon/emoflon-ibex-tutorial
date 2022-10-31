package HospitalExample;

import HospitalExample.HospitalExamplePackage;

import org.emoflon.smartemf.runtime.notification.SmartEMFNotification;
import org.emoflon.smartemf.runtime.SmartObject;
import org.emoflon.smartemf.runtime.collections.*;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;

public interface Patient extends EObject {
	
    public int getPatientID();
    
    public void setPatientID(int value);
    
    public java.lang.String getName();
    
    public void setName(java.lang.String value);
    
    public HospitalExample.Carelevel getLevel();
    
    public void setLevel(HospitalExample.Carelevel value);
    
    public HospitalExample.Doctor getDoctor();
    
    public void setDoctor(HospitalExample.Doctor value);
    

}
