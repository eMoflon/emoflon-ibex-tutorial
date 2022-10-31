package AdministrationExample;

import AdministrationExample.AdministrationExamplePackage;

import org.emoflon.smartemf.runtime.notification.SmartEMFNotification;
import org.emoflon.smartemf.runtime.SmartObject;
import org.emoflon.smartemf.runtime.collections.*;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;

public interface Staff extends EObject, AdministrationExample.Person {
	
    public java.lang.String getFirstName();
    
    public void setFirstName(java.lang.String value);
    
    public java.lang.String getLastName();
    
    public void setLastName(java.lang.String value);
    
    public int getStaffID();
    
    public void setStaffID(int value);
    
    public double getSalary();
    
    public void setSalary(double value);
    
    public AdministrationExample.Shiftplan getShiftPlan();
    
    public void setShiftPlan(AdministrationExample.Shiftplan value);
    
    public int getDInt();
    
    public void setDInt(int value);
    
    public LinkedSmartESet<AdministrationExample.Treatment> getTreatment();
    
    public void setTreatment(LinkedSmartESet<AdministrationExample.Treatment> value);
    

}
