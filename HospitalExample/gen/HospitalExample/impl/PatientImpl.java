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

public class PatientImpl extends SmartObject implements HospitalExample.Patient {

    protected int patientID = -1;
    protected java.lang.String name = null;
    protected HospitalExample.Carelevel level = HospitalExample.Carelevel.PENDING;
    protected HospitalExample.Doctor doctor = null;
	
	protected PatientImpl() {
		super(HospitalExamplePackage.Literals.PATIENT);
	}
	
    
    @Override
    public int getPatientID() {
    	return this.patientID;
    }
    
    @Override
    public void setPatientID(int value) {
    	Object oldValue = this.patientID;
    	this.patientID = value;
    	
    	        	sendNotification(SmartEMFNotification.createSetNotification(this, HospitalExamplePackage.Literals.PATIENT__PATIENTID, oldValue, value, -1));
    }
    
    
    @Override
    public java.lang.String getName() {
    	return this.name;
    }
    
    @Override
    public void setName(java.lang.String value) {
    	Object oldValue = this.name;
    	this.name = value;
    	
    	        	sendNotification(SmartEMFNotification.createSetNotification(this, HospitalExamplePackage.Literals.PATIENT__NAME, oldValue, value, -1));
    }
    
    
    @Override
    public HospitalExample.Carelevel getLevel() {
    	return this.level;
    }
    
    @Override
    public void setLevel(HospitalExample.Carelevel value) {
    	Object oldValue = this.level;
    	this.level = value;
    	
    	        	sendNotification(SmartEMFNotification.createSetNotification(this, HospitalExamplePackage.Literals.PATIENT__LEVEL, oldValue, value, -1));
    }
    
    
    @Override
    public HospitalExample.Doctor getDoctor() {
    	return this.doctor;
    }
    
    @Override
    public void setDoctor(HospitalExample.Doctor value) {
    	
    	Object oldValue = this.doctor;
    	
    	if(value == null && oldValue == null)
    		return;
    		
    	if(value != null && value.equals(oldValue))
    		return;
    		
    	
    	
    		        this.doctor = value;
    	
    	
    	        	sendNotification(SmartEMFNotification.createSetNotification(this, HospitalExamplePackage.Literals.PATIENT__DOCTOR, oldValue, value, -1));
    	        	
    	
    	        	if(oldValue != null) {
    	        		((SmartObject) oldValue).eInverseRemove(this, HospitalExamplePackage.Literals.DOCTOR__CARESFOR);
    	        	}
    	        	if(value != null) {
    	        		((SmartObject) value).eInverseAdd(this, HospitalExamplePackage.Literals.DOCTOR__CARESFOR);
    	        	}
    }
    
    private void setDoctorAsInverse(HospitalExample.Doctor value) {
			    
			    Object oldValue = this.doctor;
			    
			    if(value == null && oldValue == null)
			    	return;
			    	
			    if(value != null && value.equals(oldValue))
			    	return;
			    	
			    
			    
			    	        this.doctor = value;
			    
			    
			            	sendNotification(SmartEMFNotification.createSetNotification(this, HospitalExamplePackage.Literals.PATIENT__DOCTOR, oldValue, value, -1));
			            	
    }

    @Override
    public void eSet(EStructuralFeature eFeature, Object newValue){
    	if (HospitalExamplePackage.Literals.PATIENT__PATIENTID.equals(eFeature)) {
    		setPatientID((int) newValue); 
    		return;
    	}
    	if (HospitalExamplePackage.Literals.PATIENT__NAME.equals(eFeature)) {
    		setName((java.lang.String) newValue); 
    		return;
    	}
    	if (HospitalExamplePackage.Literals.PATIENT__LEVEL.equals(eFeature)) {
    		setLevel((HospitalExample.Carelevel) newValue); 
    		return;
    	}
    	if (HospitalExamplePackage.Literals.PATIENT__DOCTOR.equals(eFeature)) {
    		setDoctor((HospitalExample.Doctor) newValue); 
    		return;
    	}
    	eDynamicSet(eFeature, newValue);
    }
    
    @Override
    public void eUnset(EStructuralFeature eFeature){
    	if (HospitalExamplePackage.Literals.PATIENT__PATIENTID.equals(eFeature)) {
    		setPatientID((int)-1); 
    		return;
    	}
    	if (HospitalExamplePackage.Literals.PATIENT__NAME.equals(eFeature)) {
    		setName((java.lang.String)null); 
    		return;
    	}
    	if (HospitalExamplePackage.Literals.PATIENT__LEVEL.equals(eFeature)) {
    		setLevel((HospitalExample.Carelevel)HospitalExample.Carelevel.PENDING); 
    		return;
    	}
    	if (HospitalExamplePackage.Literals.PATIENT__DOCTOR.equals(eFeature)) {
    		setDoctor((HospitalExample.Doctor)null); 
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
			b.append("patientID: ");
			b.append(getPatientID());b.append(", ");
			b.append("level: ");
			b.append(getLevel());
		}
		b.append(")");
		return b.toString();
    }

 	@Override
    public Object eGet(EStructuralFeature eFeature){
    	if (HospitalExamplePackage.Literals.PATIENT__PATIENTID.equals(eFeature))
    		return getPatientID();
    	if (HospitalExamplePackage.Literals.PATIENT__NAME.equals(eFeature))
    		return getName();
    	if (HospitalExamplePackage.Literals.PATIENT__LEVEL.equals(eFeature))
    		return getLevel();
    	if (HospitalExamplePackage.Literals.PATIENT__DOCTOR.equals(eFeature))
    		return getDoctor();
    	return eDynamicGet(eFeature);
    }

    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType){
    	throw new UnsupportedOperationException("This method has been deactivated since it is not always safe to use.");
    }
    
    @Override
    public void eInverseAdd(Object otherEnd, EStructuralFeature feature) {
if (HospitalExamplePackage.Literals.PATIENT__DOCTOR.equals(feature)) {
setDoctorAsInverse((HospitalExample.Doctor) otherEnd); 
 	return;
			        }	
	    if(feature == null)
	    	return;
	    	
    	eDynamicInverseAdd(otherEnd, feature);
	    	}
    	
    @Override
	    	public void eInverseRemove(Object otherEnd, EStructuralFeature feature) {
if (HospitalExamplePackage.Literals.PATIENT__DOCTOR.equals(feature)) {
setDoctorAsInverse(null); 
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
