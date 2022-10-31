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

public class ShiftplanImpl extends SmartObject implements AdministrationExample.Shiftplan {

    protected LinkedSmartESet<AdministrationExample.Patient> covers = new LinkedSmartESet<AdministrationExample.Patient>(this, AdministrationExamplePackage.Literals.SHIFTPLAN__COVERS);
    protected LinkedSmartESet<AdministrationExample.Shift> shifts = new LinkedSmartESet<AdministrationExample.Shift>(this, AdministrationExamplePackage.Literals.SHIFTPLAN__SHIFTS);
	
	protected ShiftplanImpl() {
		super(AdministrationExamplePackage.Literals.SHIFTPLAN);
	}
	
    
    @Override
    public LinkedSmartESet<AdministrationExample.Patient> getCovers() {
    	return this.covers;
    }
    
    @Override
    public void setCovers(LinkedSmartESet<AdministrationExample.Patient> value) {
    	throw new UnsupportedOperationException("Set methods for SmartEMF collections are not supported.");
    }
    
    private void addCoversAsInverse(AdministrationExample.Patient value) {
    	if(this.covers.addInternal(value, false) == NotifyStatus.SUCCESS_NO_NOTIFICATION) {
    sendNotification(SmartEMFNotification.createAddNotification(this, AdministrationExamplePackage.Literals.SHIFTPLAN__COVERS, value, -1));
    	} 
    }
    
    private void removeCoversAsInverse(AdministrationExample.Patient value) {
    	covers.removeInternal(value, false, true);
    }
    
    @Override
    public LinkedSmartESet<AdministrationExample.Shift> getShifts() {
    	return this.shifts;
    }
    
    @Override
    public void setShifts(LinkedSmartESet<AdministrationExample.Shift> value) {
    	throw new UnsupportedOperationException("Set methods for SmartEMF collections are not supported.");
    }
    

    @Override
    public void eSet(EStructuralFeature eFeature, Object newValue){
    	if (AdministrationExamplePackage.Literals.SHIFTPLAN__COVERS.equals(eFeature)) {
    		setCovers((LinkedSmartESet<AdministrationExample.Patient>) newValue); 
    		return;
    	}
    	if (AdministrationExamplePackage.Literals.SHIFTPLAN__SHIFTS.equals(eFeature)) {
    		setShifts((LinkedSmartESet<AdministrationExample.Shift>) newValue); 
    		return;
    	}
    	eDynamicSet(eFeature, newValue);
    }
    
    @Override
    public void eUnset(EStructuralFeature eFeature){
    	if (AdministrationExamplePackage.Literals.SHIFTPLAN__COVERS.equals(eFeature)) {
    		getCovers().clear(); 
    		return;
    	}
    	if (AdministrationExamplePackage.Literals.SHIFTPLAN__SHIFTS.equals(eFeature)) {
    		getShifts().clear(); 
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
    	if (AdministrationExamplePackage.Literals.SHIFTPLAN__COVERS.equals(eFeature))
    		return getCovers();
    	if (AdministrationExamplePackage.Literals.SHIFTPLAN__SHIFTS.equals(eFeature))
    		return getShifts();
    	return eDynamicGet(eFeature);
    }

    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType){
    	throw new UnsupportedOperationException("This method has been deactivated since it is not always safe to use.");
    }
    
    @Override
    public void eInverseAdd(Object otherEnd, EStructuralFeature feature) {
if (AdministrationExamplePackage.Literals.SHIFTPLAN__COVERS.equals(feature)) {
	addCoversAsInverse((AdministrationExample.Patient) otherEnd);
 	return;
			        }	
	    if(feature == null)
	    	return;
	    	
    	eDynamicInverseAdd(otherEnd, feature);
	    	}
    	
    @Override
	    	public void eInverseRemove(Object otherEnd, EStructuralFeature feature) {
if (AdministrationExamplePackage.Literals.SHIFTPLAN__COVERS.equals(feature)) {
	removeCoversAsInverse((AdministrationExample.Patient) otherEnd);
 	return;
			        }
	    if(feature == null)
	    	return;
	    		    		
    	eDynamicInverseRemove(otherEnd, feature);
	    	}
    
    @Override
    /**
    * This method sets the resource and generates REMOVING_ADAPTER and ADD notifications
    */
    protected void setResourceOfContainments(Consumer<SmartObject> setResourceCall) {
    	for(Object obj : getShifts()) {
    		setResourceCall.accept(((SmartObject) obj));
	    		}
	    	}
	    	
	    	@Override
	    	/**
	    	* This method sets the resource and only generates REMOVING_ADAPTER notifications (no ADD messages)
	    	*/
    protected void setResourceOfContainmentsSilently(Resource r) { 		
    	for(Object obj : getShifts()) {
    		((SmartObject) obj).setResourceSilently(r);
	    		}
	    	}
}
