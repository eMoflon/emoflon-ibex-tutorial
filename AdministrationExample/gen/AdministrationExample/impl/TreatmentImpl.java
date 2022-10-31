package AdministrationExample.impl;

import AdministrationExample.AdministrationExamplePackage;
import AdministrationExample.AdministrationExamplePackage;

import org.emoflon.smartemf.runtime.*;
import org.emoflon.smartemf.runtime.collections.*;
import org.emoflon.smartemf.persistence.SmartEMFResource;
import org.emoflon.smartemf.runtime.notification.SmartEMFNotification;
import org.emoflon.smartemf.runtime.notification.NotifyStatus;

import java.util.function.Consumer;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EcoreFactory;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.Resource;

public class TreatmentImpl extends SmartObject implements AdministrationExample.Treatment {

    protected AdministrationExample.Medication medication = AdministrationExample.Medication.WEAK;
	
	protected TreatmentImpl() {
		super(AdministrationExamplePackage.Literals.TREATMENT);
	}
	
    
    @Override
    public AdministrationExample.Medication getMedication() {
    	return this.medication;
    }
    
    @Override
    public void setMedication(AdministrationExample.Medication value) {
    	Object oldValue = this.medication;
    	this.medication = value;
    	
    	        	sendNotification(SmartEMFNotification.createSetNotification(this, AdministrationExamplePackage.Literals.TREATMENT__MEDICATION, oldValue, value, -1));
    }
    

    @Override
    public void eSet(EStructuralFeature eFeature, Object newValue){
    	if (AdministrationExamplePackage.Literals.TREATMENT__MEDICATION.equals(eFeature)) {
    		setMedication((AdministrationExample.Medication) newValue); 
    		return;
    	}
    	eDynamicSet(eFeature, newValue);
    }
    
    @Override
    public void eUnset(EStructuralFeature eFeature){
    	if (AdministrationExamplePackage.Literals.TREATMENT__MEDICATION.equals(eFeature)) {
    		setMedication((AdministrationExample.Medication)AdministrationExample.Medication.WEAK); 
    		return;
    	}
    	eDynamicUnset(eFeature);
    }

    @Override
    public String toString(){
		StringBuilder b = new StringBuilder();
		b.append(super.toString());
		b.append(" (");
		if (SmartEMFConfig.simpleStringRepresentations()) {
			b.append("medication: ");
			b.append(getMedication());
		} else {
			b.append("medication: ");
			b.append(getMedication());
		}
		b.append(")");
		return b.toString();
    }

 	@Override
    public Object eGet(EStructuralFeature eFeature){
    	if (AdministrationExamplePackage.Literals.TREATMENT__MEDICATION.equals(eFeature))
    		return getMedication();
    	return eDynamicGet(eFeature);
    }

    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType){
    	throw new UnsupportedOperationException("This method has been deactivated since it is not always safe to use.");
    }
    
    @Override
    public void eInverseAdd(Object otherEnd, EStructuralFeature feature) {
	    if(feature == null)
	    	return;
	    	
    	eDynamicInverseAdd(otherEnd, feature);
	    	}
    	
    @Override
	    	public void eInverseRemove(Object otherEnd, EStructuralFeature feature) {
	    if(feature == null)
	    	return;
	    		    		
    	eDynamicInverseRemove(otherEnd, feature);
	    	}
    
    @Override
    /**
    * This method sets the resource and generates REMOVING_ADAPTER and ADD notifications
    */
    protected void setResourceOfContainments(Consumer<SmartObject> setResourceCall) {
	    	}
	    	
	    	@Override
	    	/**
	    	* This method sets the resource and only generates REMOVING_ADAPTER notifications (no ADD messages)
	    	*/
    protected void setResourceOfContainmentsSilently(Resource r) { 		
	    	}
}
