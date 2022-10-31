package HospitalExample.impl;

import HospitalExample.HospitalExamplePackage;
import HospitalExample.HospitalExamplePackage;

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

public class DoctorImpl extends SmartObject implements HospitalExample.Doctor {

    protected int staffID = -1;
    protected HospitalExample.Department works = null;
    protected java.lang.String name = null;
    protected LinkedSmartESet<HospitalExample.Patient> caresfor = new LinkedSmartESet<HospitalExample.Patient>(this, HospitalExamplePackage.Literals.DOCTOR__CARESFOR);
    protected int patientCapacity = 0;
	
	protected DoctorImpl() {
		super(HospitalExamplePackage.Literals.DOCTOR);
	}
	
    
    @Override
    public int getStaffID() {
    	return this.staffID;
    }
    
    @Override
    public void setStaffID(int value) {
    	Object oldValue = this.staffID;
    	this.staffID = value;
    	
    	        	sendNotification(SmartEMFNotification.createSetNotification(this, HospitalExamplePackage.Literals.STAFF__STAFFID, oldValue, value, -1));
    }
    
    
    @Override
    public HospitalExample.Department getWorks() {
    	return this.works;
    }
    
    @Override
    public void setWorks(HospitalExample.Department value) {
    	
    	Object oldValue = this.works;
    	
    	if(value == null && oldValue == null)
    		return;
    		
    	if(value != null && value.equals(oldValue))
    		return;
    		
    	
    	
    		        this.works = value;
    	
    	
    	        	sendNotification(SmartEMFNotification.createSetNotification(this, HospitalExamplePackage.Literals.STAFF__WORKS, oldValue, value, -1));
    	        	
    	
    	        	if(oldValue != null) {
    	        		((SmartObject) oldValue).eInverseRemove(this, HospitalExamplePackage.Literals.DEPARTMENT__STAFF);
    	        	}
    	        	if(value != null) {
    	        		((SmartObject) value).eInverseAdd(this, HospitalExamplePackage.Literals.DEPARTMENT__STAFF);
    	        	}
    }
    
    private void setWorksAsInverse(HospitalExample.Department value) {
			    
			    Object oldValue = this.works;
			    
			    if(value == null && oldValue == null)
			    	return;
			    	
			    if(value != null && value.equals(oldValue))
			    	return;
			    	
			    
			    
			    	        this.works = value;
			    
			    
			            	sendNotification(SmartEMFNotification.createSetNotification(this, HospitalExamplePackage.Literals.STAFF__WORKS, oldValue, value, -1));
			            	
    }
    
    @Override
    public java.lang.String getName() {
    	return this.name;
    }
    
    @Override
    public void setName(java.lang.String value) {
    	Object oldValue = this.name;
    	this.name = value;
    	
    	        	sendNotification(SmartEMFNotification.createSetNotification(this, HospitalExamplePackage.Literals.STAFF__NAME, oldValue, value, -1));
    }
    
    
    @Override
    public LinkedSmartESet<HospitalExample.Patient> getCaresfor() {
    	return this.caresfor;
    }
    
    @Override
    public void setCaresfor(LinkedSmartESet<HospitalExample.Patient> value) {
    	throw new UnsupportedOperationException("Set methods for SmartEMF collections are not supported.");
    }
    
    private void addCaresforAsInverse(HospitalExample.Patient value) {
    	if(this.caresfor.addInternal(value, false) == NotifyStatus.SUCCESS_NO_NOTIFICATION) {
    sendNotification(SmartEMFNotification.createAddNotification(this, HospitalExamplePackage.Literals.DOCTOR__CARESFOR, value, -1));
    	} 
    }
    
    private void removeCaresforAsInverse(HospitalExample.Patient value) {
    	caresfor.removeInternal(value, false, true);
    }
    
    @Override
    public int getPatientCapacity() {
    	return this.patientCapacity;
    }
    
    @Override
    public void setPatientCapacity(int value) {
    	Object oldValue = this.patientCapacity;
    	this.patientCapacity = value;
    	
    	        	sendNotification(SmartEMFNotification.createSetNotification(this, HospitalExamplePackage.Literals.DOCTOR__PATIENT_CAPACITY, oldValue, value, -1));
    }
    

    @Override
    public void eSet(EStructuralFeature eFeature, Object newValue){
    	if (HospitalExamplePackage.Literals.STAFF__STAFFID.equals(eFeature)) {
    		setStaffID((int) newValue); 
    		return;
    	}
    	if (HospitalExamplePackage.Literals.STAFF__WORKS.equals(eFeature)) {
    		setWorks((HospitalExample.Department) newValue); 
    		return;
    	}
    	if (HospitalExamplePackage.Literals.STAFF__NAME.equals(eFeature)) {
    		setName((java.lang.String) newValue); 
    		return;
    	}
    	if (HospitalExamplePackage.Literals.DOCTOR__CARESFOR.equals(eFeature)) {
    		setCaresfor((LinkedSmartESet<HospitalExample.Patient>) newValue); 
    		return;
    	}
    	if (HospitalExamplePackage.Literals.DOCTOR__PATIENT_CAPACITY.equals(eFeature)) {
    		setPatientCapacity((int) newValue); 
    		return;
    	}
    	eDynamicSet(eFeature, newValue);
    }
    
    @Override
    public void eUnset(EStructuralFeature eFeature){
    	if (HospitalExamplePackage.Literals.STAFF__STAFFID.equals(eFeature)) {
    		setStaffID((int)-1); 
    		return;
    	}
    	if (HospitalExamplePackage.Literals.STAFF__WORKS.equals(eFeature)) {
    		setWorks((HospitalExample.Department)null); 
    		return;
    	}
    	if (HospitalExamplePackage.Literals.STAFF__NAME.equals(eFeature)) {
    		setName((java.lang.String)null); 
    		return;
    	}
    	if (HospitalExamplePackage.Literals.DOCTOR__CARESFOR.equals(eFeature)) {
    		getCaresfor().clear(); 
    		return;
    	}
    	if (HospitalExamplePackage.Literals.DOCTOR__PATIENT_CAPACITY.equals(eFeature)) {
    		setPatientCapacity((int)0); 
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
			b.append(getName());
		} else {
			b.append("name: ");
			b.append(getName());
			b.append(", ");
			b.append("staffID: ");
			b.append(getStaffID());b.append(", ");
			b.append("patientCapacity: ");
			b.append(getPatientCapacity());
		}
		b.append(")");
		return b.toString();
    }

 	@Override
    public Object eGet(EStructuralFeature eFeature){
    	if (HospitalExamplePackage.Literals.STAFF__STAFFID.equals(eFeature))
    		return getStaffID();
    	if (HospitalExamplePackage.Literals.STAFF__WORKS.equals(eFeature))
    		return getWorks();
    	if (HospitalExamplePackage.Literals.STAFF__NAME.equals(eFeature))
    		return getName();
    	if (HospitalExamplePackage.Literals.DOCTOR__CARESFOR.equals(eFeature))
    		return getCaresfor();
    	if (HospitalExamplePackage.Literals.DOCTOR__PATIENT_CAPACITY.equals(eFeature))
    		return getPatientCapacity();
    	return eDynamicGet(eFeature);
    }

    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType){
    	throw new UnsupportedOperationException("This method has been deactivated since it is not always safe to use.");
    }
    
    @Override
    public void eInverseAdd(Object otherEnd, EStructuralFeature feature) {
if (HospitalExamplePackage.Literals.STAFF__WORKS.equals(feature)) {
setWorksAsInverse((HospitalExample.Department) otherEnd); 
 	return;
			        }	
if (HospitalExamplePackage.Literals.DOCTOR__CARESFOR.equals(feature)) {
	addCaresforAsInverse((HospitalExample.Patient) otherEnd);
 	return;
			        }	
	    if(feature == null)
	    	return;
	    	
    	eDynamicInverseAdd(otherEnd, feature);
	    	}
    	
    @Override
	    	public void eInverseRemove(Object otherEnd, EStructuralFeature feature) {
if (HospitalExamplePackage.Literals.STAFF__WORKS.equals(feature)) {
setWorksAsInverse(null); 
 	return;
			        }
if (HospitalExamplePackage.Literals.DOCTOR__CARESFOR.equals(feature)) {
	removeCaresforAsInverse((HospitalExample.Patient) otherEnd);
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
	    	}
	    	
	    	@Override
	    	/**
	    	* This method sets the resource and only generates REMOVING_ADAPTER notifications (no ADD messages)
	    	*/
    protected void setResourceOfContainmentsSilently(Resource r) { 		
	    	}
}
