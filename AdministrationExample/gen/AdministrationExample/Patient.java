package AdministrationExample;

import AdministrationExample.AdministrationExamplePackage;

import org.emoflon.smartemf.runtime.notification.SmartEMFNotification;
import org.emoflon.smartemf.runtime.SmartObject;
import org.emoflon.smartemf.runtime.collections.*;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;

public interface Patient extends EObject, AdministrationExample.Person {
	
    public java.lang.String getFirstName();
    
    public void setFirstName(java.lang.String value);
    
    public java.lang.String getLastName();
    
    public void setLastName(java.lang.String value);
    
    public int getPatientID();
    
    public void setPatientID(int value);
    
    public AdministrationExample.Treatment getTreatment();
    
    public void setTreatment(AdministrationExample.Treatment value);
    
    public LinkedSmartESet<AdministrationExample.Shiftplan> getCoveredBy();
    
    public void setCoveredBy(LinkedSmartESet<AdministrationExample.Shiftplan> value);
    

}
