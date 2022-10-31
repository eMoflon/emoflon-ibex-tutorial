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

public class StaffImpl extends SmartObject implements AdministrationExample.Staff {

    protected java.lang.String firstName = null;
    protected java.lang.String lastName = null;
    protected int staffID = 0;
    protected double salary = 0.0;
    protected AdministrationExample.Shiftplan shiftPlan = null;
    protected int dInt = 0;
    protected LinkedSmartESet<AdministrationExample.Treatment> treatment = new LinkedSmartESet<AdministrationExample.Treatment>(this, AdministrationExamplePackage.Literals.STAFF__TREATMENT);
	
	protected StaffImpl() {
		super(AdministrationExamplePackage.Literals.STAFF);
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
    public int getStaffID() {
    	return this.staffID;
    }
    
    @Override
    public void setStaffID(int value) {
    	Object oldValue = this.staffID;
    	this.staffID = value;
    	
    	        	sendNotification(SmartEMFNotification.createSetNotification(this, AdministrationExamplePackage.Literals.STAFF__STAFFID, oldValue, value, -1));
    }
    
    
    @Override
    public double getSalary() {
    	return this.salary;
    }
    
    @Override
    public void setSalary(double value) {
    	Object oldValue = this.salary;
    	this.salary = value;
    	
    	        	sendNotification(SmartEMFNotification.createSetNotification(this, AdministrationExamplePackage.Literals.STAFF__SALARY, oldValue, value, -1));
    }
    
    
    @Override
    public AdministrationExample.Shiftplan getShiftPlan() {
    	return this.shiftPlan;
    }
    
    @Override
    public void setShiftPlan(AdministrationExample.Shiftplan value) {
    	
    	Object oldValue = this.shiftPlan;
    	
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
    	
    		        this.shiftPlan = value;
    	
    	
    	if(value != null)
    		status = ((MinimalSObjectContainer) this.shiftPlan).setContainment(this, AdministrationExamplePackage.Literals.STAFF__SHIFT_PLAN);
    	
    			 	if(oldValue != null && value != null) {
    		        	setResourceWithoutChecks(resource);
    		        }
    	
    	if(status == NotifyStatus.SUCCESS_NO_NOTIFICATION || oldValue != null && value != null)
    	        	sendNotification(SmartEMFNotification.createSetNotification(this, AdministrationExamplePackage.Literals.STAFF__SHIFT_PLAN, oldValue, value, -1));
    	        	
    	        	if(AdministrationExamplePackage.Literals.STAFF__SHIFT_PLAN.getEOpposite() != null) {
    	        		if(oldValue != null) {
    	        			((SmartObject) oldValue).eInverseRemove(this, AdministrationExamplePackage.Literals.STAFF__SHIFT_PLAN.getEOpposite());
    	        		}
    	        		if(value != null) {
    	        		    ((SmartObject) value).eInverseAdd(this, AdministrationExamplePackage.Literals.STAFF__SHIFT_PLAN.getEOpposite());
    	        		}
    	        	}
    }
    
    
    @Override
    public int getDInt() {
    	return this.dInt;
    }
    
    @Override
    public void setDInt(int value) {
    	Object oldValue = this.dInt;
    	this.dInt = value;
    	
    	        	sendNotification(SmartEMFNotification.createSetNotification(this, AdministrationExamplePackage.Literals.STAFF__D_INT, oldValue, value, -1));
    }
    
    
    @Override
    public LinkedSmartESet<AdministrationExample.Treatment> getTreatment() {
    	return this.treatment;
    }
    
    @Override
    public void setTreatment(LinkedSmartESet<AdministrationExample.Treatment> value) {
    	throw new UnsupportedOperationException("Set methods for SmartEMF collections are not supported.");
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
    	if (AdministrationExamplePackage.Literals.STAFF__STAFFID.equals(eFeature)) {
    		setStaffID((int) newValue); 
    		return;
    	}
    	if (AdministrationExamplePackage.Literals.STAFF__SALARY.equals(eFeature)) {
    		setSalary((double) newValue); 
    		return;
    	}
    	if (AdministrationExamplePackage.Literals.STAFF__SHIFT_PLAN.equals(eFeature)) {
    		setShiftPlan((AdministrationExample.Shiftplan) newValue); 
    		return;
    	}
    	if (AdministrationExamplePackage.Literals.STAFF__D_INT.equals(eFeature)) {
    		setDInt((int) newValue); 
    		return;
    	}
    	if (AdministrationExamplePackage.Literals.STAFF__TREATMENT.equals(eFeature)) {
    		setTreatment((LinkedSmartESet<AdministrationExample.Treatment>) newValue); 
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
    	if (AdministrationExamplePackage.Literals.STAFF__STAFFID.equals(eFeature)) {
    		setStaffID((int)0); 
    		return;
    	}
    	if (AdministrationExamplePackage.Literals.STAFF__SALARY.equals(eFeature)) {
    		setSalary((double)0.0); 
    		return;
    	}
    	if (AdministrationExamplePackage.Literals.STAFF__SHIFT_PLAN.equals(eFeature)) {
    		setShiftPlan((AdministrationExample.Shiftplan)null); 
    		return;
    	}
    	if (AdministrationExamplePackage.Literals.STAFF__D_INT.equals(eFeature)) {
    		setDInt((int)0); 
    		return;
    	}
    	if (AdministrationExamplePackage.Literals.STAFF__TREATMENT.equals(eFeature)) {
    		getTreatment().clear(); 
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
			b.append("staffID: ");
			b.append(getStaffID());b.append(", ");
			b.append("salary: ");
			b.append(getSalary());b.append(", ");
			b.append("dInt: ");
			b.append(getDInt());
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
    	if (AdministrationExamplePackage.Literals.STAFF__STAFFID.equals(eFeature))
    		return getStaffID();
    	if (AdministrationExamplePackage.Literals.STAFF__SALARY.equals(eFeature))
    		return getSalary();
    	if (AdministrationExamplePackage.Literals.STAFF__SHIFT_PLAN.equals(eFeature))
    		return getShiftPlan();
    	if (AdministrationExamplePackage.Literals.STAFF__D_INT.equals(eFeature))
    		return getDInt();
    	if (AdministrationExamplePackage.Literals.STAFF__TREATMENT.equals(eFeature))
    		return getTreatment();
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
if(getShiftPlan() != null)
	setResourceCall.accept((SmartObject) getShiftPlan());
	    	}
	    	
	    	@Override
	    	/**
	    	* This method sets the resource and only generates REMOVING_ADAPTER notifications (no ADD messages)
	    	*/
    protected void setResourceOfContainmentsSilently(Resource r) { 		
if(getShiftPlan() != null)
    ((SmartObject) getShiftPlan()).setResourceSilently(r);
	    	}
}
