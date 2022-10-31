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

public class PatientImpl extends SmartObject implements AdministrationExample.Patient {

    protected java.lang.String firstName = null;
    protected java.lang.String lastName = null;
    protected int patientID = 0;
    protected AdministrationExample.Treatment treatment = null;
    protected LinkedSmartESet<AdministrationExample.Shiftplan> coveredBy = new LinkedSmartESet<AdministrationExample.Shiftplan>(this, AdministrationExamplePackage.Literals.PATIENT__COVERED_BY);
	
	protected PatientImpl() {
		super(AdministrationExamplePackage.Literals.PATIENT);
	}
	
    
    @Override
    public java.lang.String getFirstName() {
    	return this.firstName;
    }
    
    @Override
    public void setFirstName(java.lang.String value) {
    	Object oldValue = this.firstName;
    	this.firstName = value;
    	
    	        	sendNotification(SmartEMFNotification.createSetNotification(this, AdministrationExamplePackage.Literals.PERSON__FIRST_NAME, oldValue, value, -1));
    }
    
    
    @Override
    public java.lang.String getLastName() {
    	return this.lastName;
    }
    
    @Override
    public void setLastName(java.lang.String value) {
    	Object oldValue = this.lastName;
    	this.lastName = value;
    	
    	        	sendNotification(SmartEMFNotification.createSetNotification(this, AdministrationExamplePackage.Literals.PERSON__LAST_NAME, oldValue, value, -1));
    }
    
    
    @Override
    public int getPatientID() {
    	return this.patientID;
    }
    
    @Override
    public void setPatientID(int value) {
    	Object oldValue = this.patientID;
    	this.patientID = value;
    	
    	        	sendNotification(SmartEMFNotification.createSetNotification(this, AdministrationExamplePackage.Literals.PATIENT__PATIENTID, oldValue, value, -1));
    }
    
    
    @Override
    public AdministrationExample.Treatment getTreatment() {
    	return this.treatment;
    }
    
    @Override
    public void setTreatment(AdministrationExample.Treatment value) {
    	
    	Object oldValue = this.treatment;
    	
    	if(value == null && oldValue == null)
    		return;
    		
    	if(value != null && value.equals(oldValue))
    		return;
    		
    	
    	Resource.Internal resource = (Resource.Internal) eResource();
    		        if(oldValue != null && value != null) {
    		        	setResourceWithoutChecks(null);
    		        }
    		        
    		        NotifyStatus status = NotifyStatus.SUCCESS_NO_NOTIFICATION;
    	if(oldValue != null) {
    	        		status = ((MinimalSObjectContainer) oldValue).resetContainment();
    	}	
    	
    		        this.treatment = value;
    	
    	
    	if(value != null)
    		status = ((MinimalSObjectContainer) this.treatment).setContainment(this, AdministrationExamplePackage.Literals.PATIENT__TREATMENT);
    	
    			 	if(oldValue != null && value != null) {
    		        	setResourceWithoutChecks(resource);
    		        }
    	
    	if(status == NotifyStatus.SUCCESS_NO_NOTIFICATION || oldValue != null && value != null)
    	        	sendNotification(SmartEMFNotification.createSetNotification(this, AdministrationExamplePackage.Literals.PATIENT__TREATMENT, oldValue, value, -1));
    	        	
    	        	if(AdministrationExamplePackage.Literals.PATIENT__TREATMENT.getEOpposite() != null) {
    	        		if(oldValue != null) {
    	        			((SmartObject) oldValue).eInverseRemove(this, AdministrationExamplePackage.Literals.PATIENT__TREATMENT.getEOpposite());
    	        		}
    	        		if(value != null) {
    	        		    ((SmartObject) value).eInverseAdd(this, AdministrationExamplePackage.Literals.PATIENT__TREATMENT.getEOpposite());
    	        		}
    	        	}
    }
    
    
    @Override
    public LinkedSmartESet<AdministrationExample.Shiftplan> getCoveredBy() {
    	return this.coveredBy;
    }
    
    @Override
    public void setCoveredBy(LinkedSmartESet<AdministrationExample.Shiftplan> value) {
    	throw new UnsupportedOperationException("Set methods for SmartEMF collections are not supported.");
    }
    
    private void addCoveredByAsInverse(AdministrationExample.Shiftplan value) {
    	if(this.coveredBy.addInternal(value, false) == NotifyStatus.SUCCESS_NO_NOTIFICATION) {
    sendNotification(SmartEMFNotification.createAddNotification(this, AdministrationExamplePackage.Literals.PATIENT__COVERED_BY, value, -1));
    	} 
    }
    
    private void removeCoveredByAsInverse(AdministrationExample.Shiftplan value) {
    	coveredBy.removeInternal(value, false, true);
    }

    @Override
    public void eSet(EStructuralFeature eFeature, Object newValue){
    	if (AdministrationExamplePackage.Literals.PERSON__FIRST_NAME.equals(eFeature)) {
    		setFirstName((java.lang.String) newValue); 
    		return;
    	}
    	if (AdministrationExamplePackage.Literals.PERSON__LAST_NAME.equals(eFeature)) {
    		setLastName((java.lang.String) newValue); 
    		return;
    	}
    	if (AdministrationExamplePackage.Literals.PATIENT__PATIENTID.equals(eFeature)) {
    		setPatientID((int) newValue); 
    		return;
    	}
    	if (AdministrationExamplePackage.Literals.PATIENT__TREATMENT.equals(eFeature)) {
    		setTreatment((AdministrationExample.Treatment) newValue); 
    		return;
    	}
    	if (AdministrationExamplePackage.Literals.PATIENT__COVERED_BY.equals(eFeature)) {
    		setCoveredBy((LinkedSmartESet<AdministrationExample.Shiftplan>) newValue); 
    		return;
    	}
    	eDynamicSet(eFeature, newValue);
    }
    
    @Override
    public void eUnset(EStructuralFeature eFeature){
    	if (AdministrationExamplePackage.Literals.PERSON__FIRST_NAME.equals(eFeature)) {
    		setFirstName((java.lang.String)null); 
    		return;
    	}
    	if (AdministrationExamplePackage.Literals.PERSON__LAST_NAME.equals(eFeature)) {
    		setLastName((java.lang.String)null); 
    		return;
    	}
    	if (AdministrationExamplePackage.Literals.PATIENT__PATIENTID.equals(eFeature)) {
    		setPatientID((int)0); 
    		return;
    	}
    	if (AdministrationExamplePackage.Literals.PATIENT__TREATMENT.equals(eFeature)) {
    		setTreatment((AdministrationExample.Treatment)null); 
    		return;
    	}
    	if (AdministrationExamplePackage.Literals.PATIENT__COVERED_BY.equals(eFeature)) {
    		getCoveredBy().clear(); 
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
			b.append("firstName: ");
			b.append(getFirstName());
		} else {
			b.append("firstName: ");
			b.append(getFirstName());b.append(", ");
			b.append("lastName: ");
			b.append(getLastName());b.append(", ");
			b.append("patientID: ");
			b.append(getPatientID());
		}
		b.append(")");
		return b.toString();
    }

 	@Override
    public Object eGet(EStructuralFeature eFeature){
    	if (AdministrationExamplePackage.Literals.PERSON__FIRST_NAME.equals(eFeature))
    		return getFirstName();
    	if (AdministrationExamplePackage.Literals.PERSON__LAST_NAME.equals(eFeature))
    		return getLastName();
    	if (AdministrationExamplePackage.Literals.PATIENT__PATIENTID.equals(eFeature))
    		return getPatientID();
    	if (AdministrationExamplePackage.Literals.PATIENT__TREATMENT.equals(eFeature))
    		return getTreatment();
    	if (AdministrationExamplePackage.Literals.PATIENT__COVERED_BY.equals(eFeature))
    		return getCoveredBy();
    	return eDynamicGet(eFeature);
    }

    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType){
    	throw new UnsupportedOperationException("This method has been deactivated since it is not always safe to use.");
    }
    
    @Override
    public void eInverseAdd(Object otherEnd, EStructuralFeature feature) {
if (AdministrationExamplePackage.Literals.PATIENT__COVERED_BY.equals(feature)) {
	addCoveredByAsInverse((AdministrationExample.Shiftplan) otherEnd);
 	return;
			        }	
	    if(feature == null)
	    	return;
	    	
    	eDynamicInverseAdd(otherEnd, feature);
	    	}
    	
    @Override
	    	public void eInverseRemove(Object otherEnd, EStructuralFeature feature) {
if (AdministrationExamplePackage.Literals.PATIENT__COVERED_BY.equals(feature)) {
	removeCoveredByAsInverse((AdministrationExample.Shiftplan) otherEnd);
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
if(getTreatment() != null)
	setResourceCall.accept((SmartObject) getTreatment());
	    	}
	    	
	    	@Override
	    	/**
	    	* This method sets the resource and only generates REMOVING_ADAPTER notifications (no ADD messages)
	    	*/
    protected void setResourceOfContainmentsSilently(Resource r) { 		
if(getTreatment() != null)
    ((SmartObject) getTreatment()).setResourceSilently(r);
	    	}
}
