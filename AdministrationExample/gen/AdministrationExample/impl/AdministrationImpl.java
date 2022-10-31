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

public class AdministrationImpl extends SmartObject implements AdministrationExample.Administration {

    protected LinkedSmartESet<AdministrationExample.Staff> staff = new LinkedSmartESet<AdministrationExample.Staff>(this, AdministrationExamplePackage.Literals.ADMINISTRATION__STAFF);
    protected LinkedSmartESet<AdministrationExample.Patient> patient = new LinkedSmartESet<AdministrationExample.Patient>(this, AdministrationExamplePackage.Literals.ADMINISTRATION__PATIENT);
	
	protected AdministrationImpl() {
		super(AdministrationExamplePackage.Literals.ADMINISTRATION);
	}
	
    
    @Override
    public LinkedSmartESet<AdministrationExample.Staff> getStaff() {
    	return this.staff;
    }
    
    @Override
    public void setStaff(LinkedSmartESet<AdministrationExample.Staff> value) {
    	throw new UnsupportedOperationException("Set methods for SmartEMF collections are not supported.");
    }
    
    
    @Override
    public LinkedSmartESet<AdministrationExample.Patient> getPatient() {
    	return this.patient;
    }
    
    @Override
    public void setPatient(LinkedSmartESet<AdministrationExample.Patient> value) {
    	throw new UnsupportedOperationException("Set methods for SmartEMF collections are not supported.");
    }
    

    @Override
    public void eSet(EStructuralFeature eFeature, Object newValue){
    	if (AdministrationExamplePackage.Literals.ADMINISTRATION__STAFF.equals(eFeature)) {
    		setStaff((LinkedSmartESet<AdministrationExample.Staff>) newValue); 
    		return;
    	}
    	if (AdministrationExamplePackage.Literals.ADMINISTRATION__PATIENT.equals(eFeature)) {
    		setPatient((LinkedSmartESet<AdministrationExample.Patient>) newValue); 
    		return;
    	}
    	eDynamicSet(eFeature, newValue);
    }
    
    @Override
    public void eUnset(EStructuralFeature eFeature){
    	if (AdministrationExamplePackage.Literals.ADMINISTRATION__STAFF.equals(eFeature)) {
    		getStaff().clear(); 
    		return;
    	}
    	if (AdministrationExamplePackage.Literals.ADMINISTRATION__PATIENT.equals(eFeature)) {
    		getPatient().clear(); 
    		return;
    	}
    	eDynamicUnset(eFeature);
    }

    @Override
    public String toString(){
		return super.toString();
    }

 	@Override
    public Object eGet(EStructuralFeature eFeature){
    	if (AdministrationExamplePackage.Literals.ADMINISTRATION__STAFF.equals(eFeature))
    		return getStaff();
    	if (AdministrationExamplePackage.Literals.ADMINISTRATION__PATIENT.equals(eFeature))
    		return getPatient();
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
    	for(Object obj : getStaff()) {
    		setResourceCall.accept(((SmartObject) obj));
	    		}
    	for(Object obj : getPatient()) {
    		setResourceCall.accept(((SmartObject) obj));
	    		}
	    	}
	    	
	    	@Override
	    	/**
	    	* This method sets the resource and only generates REMOVING_ADAPTER notifications (no ADD messages)
	    	*/
    protected void setResourceOfContainmentsSilently(Resource r) { 		
    	for(Object obj : getStaff()) {
    		((SmartObject) obj).setResourceSilently(r);
	    		}
    	for(Object obj : getPatient()) {
    		((SmartObject) obj).setResourceSilently(r);
	    		}
	    	}
}
