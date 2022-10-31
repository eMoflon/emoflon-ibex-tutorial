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

public class NurseImpl extends SmartObject implements HospitalExample.Nurse {

    protected int staffID = -1;
    protected HospitalExample.Department works = null;
    protected java.lang.String name = null;
    protected HospitalExample.Room responsible = null;
	
	protected NurseImpl() {
		super(HospitalExamplePackage.Literals.NURSE);
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
    public HospitalExample.Room getResponsible() {
    	return this.responsible;
    }
    
    @Override
    public void setResponsible(HospitalExample.Room value) {
    	
    	Object oldValue = this.responsible;
    	
    	if(value == null && oldValue == null)
    		return;
    		
    	if(value != null && value.equals(oldValue))
    		return;
    		
    	
    	
    		        this.responsible = value;
    	
    	
    	        	sendNotification(SmartEMFNotification.createSetNotification(this, HospitalExamplePackage.Literals.NURSE__RESPONSIBLE, oldValue, value, -1));
    	        	
    	
    	        	if(oldValue != null) {
    	        		((SmartObject) oldValue).eInverseRemove(this, HospitalExamplePackage.Literals.ROOM__NURSES);
    	        	}
    	        	if(value != null) {
    	        		((SmartObject) value).eInverseAdd(this, HospitalExamplePackage.Literals.ROOM__NURSES);
    	        	}
    }
    
    private void setResponsibleAsInverse(HospitalExample.Room value) {
			    
			    Object oldValue = this.responsible;
			    
			    if(value == null && oldValue == null)
			    	return;
			    	
			    if(value != null && value.equals(oldValue))
			    	return;
			    	
			    
			    
			    	        this.responsible = value;
			    
			    
			            	sendNotification(SmartEMFNotification.createSetNotification(this, HospitalExamplePackage.Literals.NURSE__RESPONSIBLE, oldValue, value, -1));
			            	
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
    	if (HospitalExamplePackage.Literals.NURSE__RESPONSIBLE.equals(eFeature)) {
    		setResponsible((HospitalExample.Room) newValue); 
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
    	if (HospitalExamplePackage.Literals.NURSE__RESPONSIBLE.equals(eFeature)) {
    		setResponsible((HospitalExample.Room)null); 
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
			b.append(getStaffID());
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
    	if (HospitalExamplePackage.Literals.NURSE__RESPONSIBLE.equals(eFeature))
    		return getResponsible();
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
if (HospitalExamplePackage.Literals.NURSE__RESPONSIBLE.equals(feature)) {
setResponsibleAsInverse((HospitalExample.Room) otherEnd); 
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
if (HospitalExamplePackage.Literals.NURSE__RESPONSIBLE.equals(feature)) {
setResponsibleAsInverse(null); 
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
